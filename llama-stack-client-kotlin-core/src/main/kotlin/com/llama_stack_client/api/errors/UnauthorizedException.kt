package com.llama_stack_client.api.errors

import com.google.common.collect.ListMultimap

class UnauthorizedException(
    headers: ListMultimap<String, String>,
    body: String,
    error: LlamaStackClientError,
) : LlamaStackClientServiceException(401, headers, body, error)
