package com.llama.llamastack.errors

import com.llama.llamastack.core.http.Headers

class InternalServerException(
    statusCode: Int,
    headers: Headers,
    body: String,
    error: LlamaStackClientError,
) : LlamaStackClientServiceException(statusCode, headers, body, error)
