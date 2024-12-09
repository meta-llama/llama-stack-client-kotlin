package com.llama.llamastack.core.http

import com.llama.llamastack.core.closeWhenPhantomReachable

internal class PhantomReachableClosingStreamResponse<T>(
    private val streamResponse: StreamResponse<T>
) : StreamResponse<T> {
    init {
        closeWhenPhantomReachable(this, streamResponse)
    }

    override fun asSequence(): Sequence<T> = streamResponse.asSequence()

    override fun close() = streamResponse.close()
}
