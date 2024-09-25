package com.llama_stack_client.api.errors

import com.google.common.collect.ListMultimap

class PermissionDeniedException(
    headers: ListMultimap<String, String>,
    body: String,
    error: LlamaStackClientError,
) : LlamaStackClientServiceException(403, headers, body, error)
