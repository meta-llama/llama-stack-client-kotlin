package com.llama.llamastack.errors

import com.llama.llamastack.core.http.Headers

class NotFoundException(headers: Headers, body: String, error: LlamaStackClientError) :
    LlamaStackClientServiceException(404, headers, body, error)
