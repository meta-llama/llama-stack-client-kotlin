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
            val sequence =
                // Wrap in a `CloseableSequence` to avoid performing a read on the `reader`
                // after it has been closed, which would throw an `IOException`.
                CloseableSequence(sequence { reader.useLines { block(it) } }.constrainOnce())

            return PhantomReachableClosingStreamResponse(
                object : StreamResponse<T> {
                    override fun asSequence(): Sequence<T> = sequence

                    override fun close() {
                        sequence.close()
                        reader.close()
                        response.close()
                    }
                }
            )
        }
    }

/**
 * A sequence that can be closed.
 *
 * Once [close] is called, it will not yield more elements. It will also no longer consult the
 * underlying [Iterator.hasNext] method.
 */
private class CloseableSequence<T>(private val sequence: Sequence<T>) : Sequence<T> {
    private var isClosed: Boolean = false

    override fun iterator(): Iterator<T> {
        val iterator = sequence.iterator()
        return object : Iterator<T> {
            override fun next(): T = iterator.next()

            override fun hasNext(): Boolean = !isClosed && iterator.hasNext()
        }
    }

    fun close() {
        isClosed = true
    }
}
