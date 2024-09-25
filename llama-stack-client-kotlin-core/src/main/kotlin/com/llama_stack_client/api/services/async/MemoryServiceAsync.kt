// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.llama_stack_client.api.services.async

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
import com.llama_stack_client.api.services.async.memory.DocumentServiceAsync

interface MemoryServiceAsync {

    fun documents(): DocumentServiceAsync

    suspend fun create(
        params: MemoryCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): MemoryCreateResponse

    suspend fun retrieve(
        params: MemoryRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): MemoryRetrieveResponse?

    suspend fun update(
        params: MemoryUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    )

    suspend fun list(
        params: MemoryListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): MemoryListResponse

    suspend fun drop(
        params: MemoryDropParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): String

    suspend fun insert(
        params: MemoryInsertParams,
        requestOptions: RequestOptions = RequestOptions.none()
    )

    suspend fun query(
        params: MemoryQueryParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): QueryDocuments
}
