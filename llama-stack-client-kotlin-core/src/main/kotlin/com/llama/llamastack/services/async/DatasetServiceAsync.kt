// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.async

import com.llama.llamastack.core.RequestOptions
import com.llama.llamastack.models.DatasetListParams
import com.llama.llamastack.models.DatasetRegisterParams
import com.llama.llamastack.models.DatasetRetrieveParams
import com.llama.llamastack.models.DatasetRetrieveResponse
import com.llama.llamastack.models.DatasetUnregisterParams
import com.llama.llamastack.models.ListDatasetsResponse

interface DatasetServiceAsync {

    suspend fun retrieve(
        params: DatasetRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): DatasetRetrieveResponse?

    suspend fun list(
        params: DatasetListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): List<ListDatasetsResponse.Data>

    suspend fun register(
        params: DatasetRegisterParams,
        requestOptions: RequestOptions = RequestOptions.none()
    )

    suspend fun unregister(
        params: DatasetUnregisterParams,
        requestOptions: RequestOptions = RequestOptions.none()
    )
}
