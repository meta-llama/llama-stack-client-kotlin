// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.blocking

import com.llama.llamastack.core.RequestOptions
import com.llama.llamastack.models.Model
import com.llama.llamastack.models.ModelListParams
import com.llama.llamastack.models.ModelRegisterParams
import com.llama.llamastack.models.ModelRetrieveParams
import com.llama.llamastack.models.ModelUnregisterParams

interface ModelService {

    fun retrieve(
        params: ModelRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): Model?

    fun list(
        params: ModelListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): List<Model>

    fun register(
        params: ModelRegisterParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): Model

    fun unregister(
        params: ModelUnregisterParams,
        requestOptions: RequestOptions = RequestOptions.none()
    )
}
