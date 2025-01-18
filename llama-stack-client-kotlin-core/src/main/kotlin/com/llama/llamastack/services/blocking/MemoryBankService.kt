// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.blocking

import com.llama.llamastack.core.RequestOptions
import com.llama.llamastack.models.ListMemoryBanksResponse
import com.llama.llamastack.models.MemoryBankListParams
import com.llama.llamastack.models.MemoryBankRegisterParams
import com.llama.llamastack.models.MemoryBankRegisterResponse
import com.llama.llamastack.models.MemoryBankRetrieveParams
import com.llama.llamastack.models.MemoryBankRetrieveResponse
import com.llama.llamastack.models.MemoryBankUnregisterParams

interface MemoryBankService {

    fun retrieve(
        params: MemoryBankRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): MemoryBankRetrieveResponse?

    fun list(
        params: MemoryBankListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): List<ListMemoryBanksResponse.Data>

    fun register(
        params: MemoryBankRegisterParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): MemoryBankRegisterResponse

    fun unregister(
        params: MemoryBankUnregisterParams,
        requestOptions: RequestOptions = RequestOptions.none()
    )
}
