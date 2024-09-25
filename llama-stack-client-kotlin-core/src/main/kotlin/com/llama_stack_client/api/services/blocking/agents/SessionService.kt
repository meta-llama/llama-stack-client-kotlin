// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.llama_stack_client.api.services.blocking.agents

import com.llama_stack_client.api.core.RequestOptions
import com.llama_stack_client.api.models.AgentSessionCreateParams
import com.llama_stack_client.api.models.AgentSessionCreateResponse
import com.llama_stack_client.api.models.AgentSessionDeleteParams
import com.llama_stack_client.api.models.AgentSessionRetrieveParams
import com.llama_stack_client.api.models.Session

interface SessionService {

    fun create(
        params: AgentSessionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): AgentSessionCreateResponse

    fun retrieve(
        params: AgentSessionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): Session

    fun delete(
        params: AgentSessionDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none()
    )
}
