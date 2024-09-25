package com.llama_stack_client.api.errors

import com.google.common.collect.ListMultimap

class UnprocessableEntityException(
    headers: ListMultimap<String, String>,
    body: String,
    error: LlamaStackClientError,
) : LlamaStackClientServiceException(422, headers, body, error)
