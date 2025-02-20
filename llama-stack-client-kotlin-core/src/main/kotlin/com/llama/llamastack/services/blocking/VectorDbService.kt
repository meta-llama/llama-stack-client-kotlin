// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.blocking

import com.llama.llamastack.core.RequestOptions
import com.llama.llamastack.models.ListVectorDbsResponse
import com.llama.llamastack.models.VectorDbListParams
import com.llama.llamastack.models.VectorDbRegisterParams
import com.llama.llamastack.models.VectorDbRegisterResponse
import com.llama.llamastack.models.VectorDbRetrieveParams
import com.llama.llamastack.models.VectorDbRetrieveResponse
import com.llama.llamastack.models.VectorDbUnregisterParams

interface VectorDbService {

    fun retrieve(
        params: VectorDbRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VectorDbRetrieveResponse?

    fun list(
        params: VectorDbListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<ListVectorDbsResponse.Data>

    fun register(
        params: VectorDbRegisterParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VectorDbRegisterResponse

    fun unregister(
        params: VectorDbUnregisterParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )
}
