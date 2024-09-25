package com.llama_stack_client.api.errors

import com.google.common.collect.ListMultimap

class UnexpectedStatusCodeException(
    statusCode: Int,
    headers: ListMultimap<String, String>,
    body: String,
    error: LlamaStackClientError,
) : LlamaStackClientServiceException(statusCode, headers, body, error)
