// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.llama_stack_client.api.services.blocking

import com.llama_stack_client.api.core.RequestOptions
import com.llama_stack_client.api.models.ModelGetParams
import com.llama_stack_client.api.models.ModelListParams
import com.llama_stack_client.api.models.ModelServingSpec

interface ModelService {

    fun list(
        params: ModelListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): ModelServingSpec

    fun get(
        params: ModelGetParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): ModelServingSpec?
}
