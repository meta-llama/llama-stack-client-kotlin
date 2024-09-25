// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.llama_stack_client.api.services.blocking.memory

import com.llama_stack_client.api.core.RequestOptions
import com.llama_stack_client.api.models.MemoryDocumentDeleteParams
import com.llama_stack_client.api.models.MemoryDocumentRetrieveParams
import com.llama_stack_client.api.models.MemoryDocumentRetrieveResponse

interface DocumentService {

    fun retrieve(
        params: MemoryDocumentRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): MemoryDocumentRetrieveResponse

    fun delete(
        params: MemoryDocumentDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none()
    )
}
