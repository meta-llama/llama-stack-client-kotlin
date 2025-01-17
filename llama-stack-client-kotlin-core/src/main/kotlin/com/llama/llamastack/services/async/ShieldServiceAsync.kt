// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.async

import com.llama.llamastack.core.RequestOptions
import com.llama.llamastack.models.Shield
import com.llama.llamastack.models.ShieldListParams
import com.llama.llamastack.models.ShieldListResponse
import com.llama.llamastack.models.ShieldRegisterParams
import com.llama.llamastack.models.ShieldRetrieveParams

interface ShieldServiceAsync {

    suspend fun retrieve(
        params: ShieldRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): Shield?

    suspend fun list(
        params: ShieldListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): ShieldListResponse

    suspend fun register(
        params: ShieldRegisterParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): Shield
}
