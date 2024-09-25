// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.llama_stack_client.api.services.blocking.agents

import com.llama_stack_client.api.core.RequestOptions
import com.llama_stack_client.api.models.AgentStepRetrieveParams
import com.llama_stack_client.api.models.AgentsStep

interface StepService {

    fun retrieve(
        params: AgentStepRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): AgentsStep
}
