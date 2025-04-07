@file:JvmName("StreamHandler")

package com.llama.llamastack.core.handlers

import com.llama.llamastack.core.http.HttpResponse
import com.llama.llamastack.core.http.HttpResponse.Handler
import com.llama.llamastack.core.http.PhantomReachableClosingStreamResponse
import com.llama.llamastack.core.http.StreamResponse
import com.llama.llamastack.errors.LlamaStackClientIoException
import java.io.IOException

internal fun <T> streamHandler(
    block: suspend SequenceScope<T>.(response: HttpResponse, lines: Sequence<String>) -> Unit
): Handler<StreamResponse<T>> =
    object : Handler<StreamResponse<T>> {

        override fun handle(response: HttpResponse): StreamResponse<T> {
            val reader = response.body().bufferedReader()
            val sequence =
                // Wrap in a `CloseableSequence` to avoid performing a read on the `reader`
                // after it has been closed, which would throw an `IOException`.
                CloseableSequence(
                    sequence {
                            reader.useLines { lines ->
                                block(
                                    response,
                                    // We wrap the `lines` instead of the top-level sequence because
                                    // we only want to catch `IOException` from the reader; not from
                                    // the user's own code.
                                    IOExceptionWrappingSequence(lines),
                                )
                            }
                        }
                        .constrainOnce()
                )

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

/** A sequence that catches, wraps, and rethrows [IOException] as [LlamaStackClientIoException]. */
private class IOExceptionWrappingSequence<T>(private val sequence: Sequence<T>) : Sequence<T> {

    override fun iterator(): Iterator<T> {
        val iterator = sequence.iterator()
        return object : Iterator<T> {

            override fun next(): T =
                try {
                    iterator.next()
                } catch (e: IOException) {
                    throw LlamaStackClientIoException("Stream failed", e)
                }

            override fun hasNext(): Boolean =
                try {
                    iterator.hasNext()
                } catch (e: IOException) {
                    throw LlamaStackClientIoException("Stream failed", e)
                }
        }
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
