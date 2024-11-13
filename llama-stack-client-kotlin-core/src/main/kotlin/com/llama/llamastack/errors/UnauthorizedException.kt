package com.llama.llamastack.errors

import com.llama.llamastack.core.http.Headers

class UnauthorizedException(
    headers: Headers,
    body: String,
    error: LlamaStackClientError,
) : LlamaStackClientServiceException(401, headers, body, error)
