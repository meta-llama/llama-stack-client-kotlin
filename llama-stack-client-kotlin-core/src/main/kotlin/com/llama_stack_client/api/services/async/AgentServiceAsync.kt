// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.llama_stack_client.api.services.async

import com.llama_stack_client.api.core.RequestOptions
import com.llama_stack_client.api.models.AgentCreateParams
import com.llama_stack_client.api.models.AgentCreateResponse
import com.llama_stack_client.api.models.AgentDeleteParams
import com.llama_stack_client.api.services.async.agents.SessionServiceAsync
import com.llama_stack_client.api.services.async.agents.StepServiceAsync
import com.llama_stack_client.api.services.async.agents.TurnServiceAsync

interface AgentServiceAsync {

    fun sessions(): SessionServiceAsync

    fun steps(): StepServiceAsync

    fun turns(): TurnServiceAsync

    suspend fun create(
        params: AgentCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): AgentCreateResponse

    suspend fun delete(
        params: AgentDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none()
    )
}
