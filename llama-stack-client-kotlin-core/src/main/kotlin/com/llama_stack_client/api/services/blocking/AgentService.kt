// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.llama_stack_client.api.services.blocking

import com.llama_stack_client.api.core.RequestOptions
import com.llama_stack_client.api.models.AgentCreateParams
import com.llama_stack_client.api.models.AgentCreateResponse
import com.llama_stack_client.api.models.AgentDeleteParams
import com.llama_stack_client.api.services.blocking.agents.SessionService
import com.llama_stack_client.api.services.blocking.agents.StepService
import com.llama_stack_client.api.services.blocking.agents.TurnService

interface AgentService {

    fun sessions(): SessionService

    fun steps(): StepService

    fun turns(): TurnService

    fun create(
        params: AgentCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): AgentCreateResponse

    fun delete(params: AgentDeleteParams, requestOptions: RequestOptions = RequestOptions.none())
}
