package com.llama.llamastack.errors

import com.llama.llamastack.core.http.Headers

class PermissionDeniedException(
    headers: Headers,
    body: String,
    error: LlamaStackClientError,
) : LlamaStackClientServiceException(403, headers, body, error)
