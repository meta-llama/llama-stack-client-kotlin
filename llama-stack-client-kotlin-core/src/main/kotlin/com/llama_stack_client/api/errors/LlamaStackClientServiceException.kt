package com.llama_stack_client.api.errors

import com.google.common.collect.ListMultimap

abstract class LlamaStackClientServiceException(
    private val statusCode: Int,
    private val headers: ListMultimap<String, String>,
    private val body: String,
    private val error: LlamaStackClientError,
    message: String = "$statusCode: $error",
    cause: Throwable? = null
) : LlamaStackClientException(message, cause) {

    fun statusCode(): Int = statusCode

    fun headers(): ListMultimap<String, String> = headers

    fun body(): String = body

    fun error(): LlamaStackClientError = error
}
