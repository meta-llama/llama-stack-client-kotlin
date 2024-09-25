package com.llama_stack_client.api.errors

import com.google.common.collect.ListMultimap

class RateLimitException(
    headers: ListMultimap<String, String>,
    body: String,
    error: LlamaStackClientError,
) : LlamaStackClientServiceException(429, headers, body, error)
