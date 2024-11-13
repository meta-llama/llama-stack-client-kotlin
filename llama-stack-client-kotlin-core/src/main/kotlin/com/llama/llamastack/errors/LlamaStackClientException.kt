package com.llama.llamastack.errors

open class LlamaStackClientException(message: String? = null, cause: Throwable? = null) :
    RuntimeException(message, cause)
