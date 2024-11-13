// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.blocking

import com.llama.llamastack.core.RequestOptions
import com.llama.llamastack.models.DatasetListParams
import com.llama.llamastack.models.DatasetListResponse
import com.llama.llamastack.models.DatasetRegisterParams
import com.llama.llamastack.models.DatasetRetrieveParams
import com.llama.llamastack.models.DatasetRetrieveResponse

interface DatasetService {

    fun retrieve(
        params: DatasetRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): DatasetRetrieveResponse?

    fun list(
        params: DatasetListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): DatasetListResponse

    fun register(
        params: DatasetRegisterParams,
        requestOptions: RequestOptions = RequestOptions.none()
    )
}
