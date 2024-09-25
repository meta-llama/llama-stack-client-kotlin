// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.llama_stack_client.api.services.blocking

import com.llama_stack_client.api.core.RequestOptions
import com.llama_stack_client.api.models.ShieldGetParams
import com.llama_stack_client.api.models.ShieldListParams
import com.llama_stack_client.api.models.ShieldSpec

interface ShieldService {

    fun list(
        params: ShieldListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): ShieldSpec

    fun get(
        params: ShieldGetParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): ShieldSpec?
}
