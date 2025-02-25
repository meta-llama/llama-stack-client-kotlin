package com.llama.llamastack.errors

import com.llama.llamastack.core.http.Headers

class BadRequestException(headers: Headers, body: String, error: LlamaStackClientError) :
    LlamaStackClientServiceException(400, headers, body, error)
