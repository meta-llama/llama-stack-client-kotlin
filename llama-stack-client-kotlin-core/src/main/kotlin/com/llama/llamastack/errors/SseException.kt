// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.errors

import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.core.checkRequired
import com.llama.llamastack.core.http.Headers

class SseException
private constructor(
    private val statusCode: Int,
    private val headers: Headers,
    private val body: JsonValue,
    cause: Throwable?,
) : LlamaStackClientServiceException("$statusCode: $body", cause) {

    override fun statusCode(): Int = statusCode

    override fun headers(): Headers = headers

    override fun body(): JsonValue = body

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [SseException].
         *
         * The following fields are required:
         * ```kotlin
         * .statusCode()
         * .headers()
         * .body()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [SseException]. */
    class Builder internal constructor() {

        private var statusCode: Int? = null
        private var headers: Headers? = null
        private var body: JsonValue? = null
        private var cause: Throwable? = null

        internal fun from(sseException: SseException) = apply {
            statusCode = sseException.statusCode
            headers = sseException.headers
            body = sseException.body
            cause = sseException.cause
        }

        fun statusCode(statusCode: Int) = apply { this.statusCode = statusCode }

        fun headers(headers: Headers) = apply { this.headers = headers }

        fun body(body: JsonValue) = apply { this.body = body }

        fun cause(cause: Throwable?) = apply { this.cause = cause }

        /**
         * Returns an immutable instance of [SseException].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .statusCode()
         * .headers()
         * .body()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): SseException =
            SseException(
                checkRequired("statusCode", statusCode),
                checkRequired("headers", headers),
                checkRequired("body", body),
                cause,
            )
    }
}
