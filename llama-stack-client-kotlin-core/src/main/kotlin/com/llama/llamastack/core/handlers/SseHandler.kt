@file:JvmName("SseHandler")

package com.llama.llamastack.core.handlers

import com.fasterxml.jackson.databind.json.JsonMapper
import com.llama.llamastack.core.http.HttpResponse
import com.llama.llamastack.core.http.HttpResponse.Handler
import com.llama.llamastack.core.http.PhantomReachableClosingStreamResponse
import com.llama.llamastack.core.http.SseMessage
import com.llama.llamastack.core.http.StreamResponse
import com.llama.llamastack.errors.LlamaStackClientException

internal fun sseHandler(jsonMapper: JsonMapper): Handler<StreamResponse<SseMessage>> =
    object : Handler<StreamResponse<SseMessage>> {

        override fun handle(response: HttpResponse): StreamResponse<SseMessage> {
            val reader = response.body().bufferedReader()
            val sequence =
                sequence {
                        reader.useLines { lines ->
                            val state = SseState(jsonMapper)
                            for (line in lines) {
                                val message = state.decode(line) ?: continue
                                yield(message)
                            }
                        }
                    }
                    .constrainOnce()

            return PhantomReachableClosingStreamResponse(
                object : StreamResponse<SseMessage> {
                    override fun asSequence(): Sequence<SseMessage> = sequence

                    override fun close() {
                        reader.close()
                        response.close()
                    }
                }
            )
        }
    }

private class SseState(
    val jsonMapper: JsonMapper,
    var event: String? = null,
    val data: MutableList<String> = mutableListOf(),
    var lastId: String? = null,
    var retry: Int? = null
) {
    // https://html.spec.whatwg.org/multipage/server-sent-events.html#event-stream-interpretation
    fun decode(line: String): SseMessage? {
        if (line.isEmpty()) {
            return flush()
        }

        if (line.startsWith(':')) {
            return null
        }

        val fieldName: String
        var value: String

        val colonIndex = line.indexOf(':')
        if (colonIndex == -1) {
            fieldName = line
            value = ""
        } else {
            fieldName = line.substring(0, colonIndex)
            value = line.substring(colonIndex + 1)
        }

        if (value.startsWith(' ')) {
            value = value.substring(1)
        }

        when (fieldName) {
            "event" -> event = value
            "data" -> data.add(value)
            "id" -> {
                if (!value.contains('\u0000')) {
                    lastId = value
                }
            }
            "retry" -> value.toIntOrNull()?.let { retry = it }
        }

        return null
    }

    private fun flush(): SseMessage? {
        if (isEmpty()) {
            return null
        }

        val message =
            SseMessage.builder()
                .jsonMapper(jsonMapper)
                .event(event)
                .data(data.joinToString("\n"))
                .id(lastId)
                .retry(retry)
                .build()

        // NOTE: Per the SSE spec, do not reset lastId.
        event = null
        data.clear()
        retry = null

        return message
    }

    private fun isEmpty(): Boolean =
        event.isNullOrEmpty() && data.isEmpty() && lastId.isNullOrEmpty() && retry == null
}

internal inline fun <reified T> Handler<StreamResponse<SseMessage>>.mapJson():
    Handler<StreamResponse<T>> =
    object : Handler<StreamResponse<T>> {
        override fun handle(response: HttpResponse): StreamResponse<T> =
            this@mapJson.handle(response).map {
                try {
                    it.json<T>()
                } catch (e: Exception) {
                    throw LlamaStackClientException("Error reading response", e)
                }
            }
    }

internal fun <T, R> StreamResponse<T>.map(transform: (T) -> R): StreamResponse<R> =
    object : StreamResponse<R> {
        override fun asSequence(): Sequence<R> = this@map.asSequence().map(transform)

        override fun close() = this@map.close()
    }
