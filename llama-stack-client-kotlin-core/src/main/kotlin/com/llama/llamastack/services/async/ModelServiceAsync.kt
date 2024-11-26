// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.async

import com.llama.llamastack.core.RequestOptions
import com.llama.llamastack.models.Model
import com.llama.llamastack.models.ModelListParams
import com.llama.llamastack.models.ModelRegisterParams
import com.llama.llamastack.models.ModelRetrieveParams
import com.llama.llamastack.models.ModelUnregisterParams

interface ModelServiceAsync {

    suspend fun retrieve(
        params: ModelRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): Model?

    suspend fun list(
        params: ModelListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): Model

    suspend fun register(
        params: ModelRegisterParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): Model

    suspend fun unregister(
        params: ModelUnregisterParams,
        requestOptions: RequestOptions = RequestOptions.none()
    )
}
