package com.llama.llamastack.errors

import com.llama.llamastack.core.http.Headers

class UnexpectedStatusCodeException(
    statusCode: Int,
    headers: Headers,
    body: String,
    error: LlamaStackClientError,
) : LlamaStackClientServiceException(statusCode, headers, body, error)
