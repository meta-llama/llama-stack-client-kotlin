// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.blocking

import com.llama.llamastack.core.RequestOptions
import com.llama.llamastack.models.MemoryBankListParams
import com.llama.llamastack.models.MemoryBankListResponse
import com.llama.llamastack.models.MemoryBankRegisterParams
import com.llama.llamastack.models.MemoryBankRetrieveParams
import com.llama.llamastack.models.MemoryBankRetrieveResponse

interface MemoryBankService {

    fun retrieve(
        params: MemoryBankRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): MemoryBankRetrieveResponse?

    fun list(
        params: MemoryBankListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): MemoryBankListResponse

    fun register(
        params: MemoryBankRegisterParams,
        requestOptions: RequestOptions = RequestOptions.none()
    )
}
