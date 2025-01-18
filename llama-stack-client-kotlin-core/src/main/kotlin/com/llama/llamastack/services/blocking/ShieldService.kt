// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.blocking

import com.llama.llamastack.core.RequestOptions
import com.llama.llamastack.models.Shield
import com.llama.llamastack.models.ShieldListParams
import com.llama.llamastack.models.ShieldRegisterParams
import com.llama.llamastack.models.ShieldRetrieveParams

interface ShieldService {

    fun retrieve(
        params: ShieldRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): Shield?

    fun list(
        params: ShieldListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): List<Shield>

    fun register(
        params: ShieldRegisterParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): Shield
}
