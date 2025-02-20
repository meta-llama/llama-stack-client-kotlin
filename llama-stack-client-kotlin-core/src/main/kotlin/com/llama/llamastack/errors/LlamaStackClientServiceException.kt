package com.llama.llamastack.errors

import com.llama.llamastack.core.http.Headers

abstract class LlamaStackClientServiceException(
    private val statusCode: Int,
    private val headers: Headers,
    private val body: String,
    private val error: LlamaStackClientError,
    message: String = "$statusCode: $error",
    cause: Throwable? = null,
) : LlamaStackClientException(message, cause) {

    fun statusCode(): Int = statusCode

    fun headers(): Headers = headers

    fun body(): String = body

    fun error(): LlamaStackClientError = error
}
