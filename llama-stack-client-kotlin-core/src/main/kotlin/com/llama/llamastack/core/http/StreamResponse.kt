package com.llama.llamastack.core.http

interface StreamResponse<T> : AutoCloseable {

    fun asSequence(): Sequence<T>
}

internal fun <T, R> StreamResponse<T>.map(transform: (T) -> R): StreamResponse<R> =
    object : StreamResponse<R> {
        override fun asSequence(): Sequence<R> = this@map.asSequence().map(transform)

        override fun close() = this@map.close()
    }
