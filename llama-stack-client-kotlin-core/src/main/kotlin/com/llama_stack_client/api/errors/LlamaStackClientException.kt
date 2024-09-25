package com.llama_stack_client.api.errors

open class LlamaStackClientException(message: String? = null, cause: Throwable? = null) :
    RuntimeException(message, cause)
