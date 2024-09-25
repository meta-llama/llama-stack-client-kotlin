// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.llama_stack_client.api.services.blocking

import com.llama_stack_client.api.core.RequestOptions
import com.llama_stack_client.api.models.MemoryBankGetParams
import com.llama_stack_client.api.models.MemoryBankListParams
import com.llama_stack_client.api.models.MemoryBankSpec

interface MemoryBankService {

    fun list(
        params: MemoryBankListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): MemoryBankSpec

    fun get(
        params: MemoryBankGetParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): MemoryBankSpec?
}
