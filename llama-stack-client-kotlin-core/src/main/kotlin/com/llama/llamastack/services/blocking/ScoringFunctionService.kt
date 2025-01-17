// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.blocking

import com.llama.llamastack.core.RequestOptions
import com.llama.llamastack.models.ScoringFn
import com.llama.llamastack.models.ScoringFunctionListParams
import com.llama.llamastack.models.ScoringFunctionListResponse
import com.llama.llamastack.models.ScoringFunctionRegisterParams
import com.llama.llamastack.models.ScoringFunctionRetrieveParams

interface ScoringFunctionService {

    fun retrieve(
        params: ScoringFunctionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): ScoringFn?

    fun list(
        params: ScoringFunctionListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): ScoringFunctionListResponse

    fun register(
        params: ScoringFunctionRegisterParams,
        requestOptions: RequestOptions = RequestOptions.none()
    )
}
