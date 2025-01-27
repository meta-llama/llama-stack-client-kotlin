// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.async

import com.llama.llamastack.core.RequestOptions
import com.llama.llamastack.models.ScoringFn
import com.llama.llamastack.models.ScoringFunctionListParams
import com.llama.llamastack.models.ScoringFunctionRegisterParams
import com.llama.llamastack.models.ScoringFunctionRetrieveParams

interface ScoringFunctionServiceAsync {

    suspend fun retrieve(
        params: ScoringFunctionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): ScoringFn?

    suspend fun list(
        params: ScoringFunctionListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): List<ScoringFn>

    suspend fun register(
        params: ScoringFunctionRegisterParams,
        requestOptions: RequestOptions = RequestOptions.none()
    )
}
