// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.async

import com.llama.llamastack.core.RequestOptions
import com.llama.llamastack.models.MemoryBankListParams
import com.llama.llamastack.models.MemoryBankListResponse
import com.llama.llamastack.models.MemoryBankRegisterParams
import com.llama.llamastack.models.MemoryBankRetrieveParams
import com.llama.llamastack.models.MemoryBankRetrieveResponse
import com.llama.llamastack.models.MemoryBankUnregisterParams

interface MemoryBankServiceAsync {

    suspend fun retrieve(
        params: MemoryBankRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): MemoryBankRetrieveResponse?

    suspend fun list(
        params: MemoryBankListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): MemoryBankListResponse

    suspend fun register(
        params: MemoryBankRegisterParams,
        requestOptions: RequestOptions = RequestOptions.none()
    )

    suspend fun unregister(
        params: MemoryBankUnregisterParams,
        requestOptions: RequestOptions = RequestOptions.none()
    )
}
