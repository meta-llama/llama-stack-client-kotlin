// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.llama_stack_client.api.services.blocking

import com.llama_stack_client.api.core.RequestOptions
import com.llama_stack_client.api.models.MemoryCreateParams
import com.llama_stack_client.api.models.MemoryCreateResponse
import com.llama_stack_client.api.models.MemoryDropParams
import com.llama_stack_client.api.models.MemoryInsertParams
import com.llama_stack_client.api.models.MemoryListParams
import com.llama_stack_client.api.models.MemoryListResponse
import com.llama_stack_client.api.models.MemoryQueryParams
import com.llama_stack_client.api.models.MemoryRetrieveParams
import com.llama_stack_client.api.models.MemoryRetrieveResponse
import com.llama_stack_client.api.models.MemoryUpdateParams
import com.llama_stack_client.api.models.QueryDocuments
import com.llama_stack_client.api.services.blocking.memory.DocumentService

interface MemoryService {

    fun documents(): DocumentService

    fun create(
        params: MemoryCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): MemoryCreateResponse

    fun retrieve(
        params: MemoryRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): MemoryRetrieveResponse?

    fun update(params: MemoryUpdateParams, requestOptions: RequestOptions = RequestOptions.none())

    fun list(
        params: MemoryListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): MemoryListResponse

    fun drop(
        params: MemoryDropParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): String

    fun insert(params: MemoryInsertParams, requestOptions: RequestOptions = RequestOptions.none())

    fun query(
        params: MemoryQueryParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): QueryDocuments
}
