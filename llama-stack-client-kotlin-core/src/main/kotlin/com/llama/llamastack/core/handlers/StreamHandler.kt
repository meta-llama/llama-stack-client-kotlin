@file:JvmName("StreamHandler")

package com.llama.llamastack.core.handlers

import com.llama.llamastack.core.http.HttpResponse
import com.llama.llamastack.core.http.HttpResponse.Handler
import com.llama.llamastack.core.http.PhantomReachableClosingStreamResponse
import com.llama.llamastack.core.http.StreamResponse

internal fun <T> streamHandler(
    block: suspend SequenceScope<T>.(lines: Sequence<String>) -> Unit
): Handler<StreamResponse<T>> =
    object : Handler<StreamResponse<T>> {
        override fun handle(response: HttpResponse): StreamResponse<T> {
            val reader = response.body().bufferedReader()
            val sequence = sequence { reader.useLines { block(it) } }.constrainOnce()

            return PhantomReachableClosingStreamResponse(
                object : StreamResponse<T> {
                    override fun asSequence(): Sequence<T> = sequence

                    override fun close() {
                        reader.close()
                        response.close()
                    }
                }
            )
        }
    }
