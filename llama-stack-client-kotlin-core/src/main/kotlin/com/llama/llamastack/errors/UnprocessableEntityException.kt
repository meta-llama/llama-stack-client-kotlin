package com.llama.llamastack.errors

import com.llama.llamastack.core.http.Headers

class UnprocessableEntityException(
    headers: Headers,
    body: String,
    error: LlamaStackClientError,
) : LlamaStackClientServiceException(422, headers, body, error)
