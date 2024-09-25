// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.llama_stack_client.api.services.async.agents

import com.llama_stack_client.api.core.RequestOptions
import com.llama_stack_client.api.models.AgentSessionCreateParams
import com.llama_stack_client.api.models.AgentSessionCreateResponse
import com.llama_stack_client.api.models.AgentSessionDeleteParams
import com.llama_stack_client.api.models.AgentSessionRetrieveParams
import com.llama_stack_client.api.models.Session

interface SessionServiceAsync {

    suspend fun create(
        params: AgentSessionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): AgentSessionCreateResponse

    suspend fun retrieve(
        params: AgentSessionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): Session

    suspend fun delete(
        params: AgentSessionDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none()
    )
}
