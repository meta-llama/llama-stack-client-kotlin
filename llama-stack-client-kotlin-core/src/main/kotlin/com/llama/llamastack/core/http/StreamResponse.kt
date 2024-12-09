package com.llama.llamastack.core.http

interface StreamResponse<T> : AutoCloseable {

    fun asSequence(): Sequence<T>
}
