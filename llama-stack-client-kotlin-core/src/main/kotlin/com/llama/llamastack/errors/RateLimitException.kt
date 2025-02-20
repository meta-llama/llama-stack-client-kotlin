package com.llama.llamastack.errors

import com.llama.llamastack.core.http.Headers

class RateLimitException(headers: Headers, body: String, error: LlamaStackClientError) :
    LlamaStackClientServiceException(429, headers, body, error)
