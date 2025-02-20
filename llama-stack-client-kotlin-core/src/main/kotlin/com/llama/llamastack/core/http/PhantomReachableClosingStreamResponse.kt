package com.llama.llamastack.core.http

import com.llama.llamastack.core.closeWhenPhantomReachable

/**
 * A delegating wrapper around a `StreamResponse` that closes it once it's only phantom reachable.
 *
 * This class ensures the `StreamResponse` is closed even if the user forgets to close it.
 */
internal class PhantomReachableClosingStreamResponse<T>(
    private val streamResponse: StreamResponse<T>
) : StreamResponse<T> {
    init {
        closeWhenPhantomReachable(this, streamResponse)
    }

    override fun asSequence(): Sequence<T> = streamResponse.asSequence()

    override fun close() = streamResponse.close()
}
