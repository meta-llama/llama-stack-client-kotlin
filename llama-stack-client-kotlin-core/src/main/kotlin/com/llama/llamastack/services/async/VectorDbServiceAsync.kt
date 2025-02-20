// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.async

import com.llama.llamastack.core.RequestOptions
import com.llama.llamastack.models.ListVectorDbsResponse
import com.llama.llamastack.models.VectorDbListParams
import com.llama.llamastack.models.VectorDbRegisterParams
import com.llama.llamastack.models.VectorDbRegisterResponse
import com.llama.llamastack.models.VectorDbRetrieveParams
import com.llama.llamastack.models.VectorDbRetrieveResponse
import com.llama.llamastack.models.VectorDbUnregisterParams

interface VectorDbServiceAsync {

    suspend fun retrieve(
        params: VectorDbRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VectorDbRetrieveResponse?

    suspend fun list(
        params: VectorDbListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<ListVectorDbsResponse.Data>

    suspend fun register(
        params: VectorDbRegisterParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VectorDbRegisterResponse

    suspend fun unregister(
        params: VectorDbUnregisterParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )
}
