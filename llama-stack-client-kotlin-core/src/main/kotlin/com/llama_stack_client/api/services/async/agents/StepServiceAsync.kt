// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.llama_stack_client.api.services.async.agents

import com.llama_stack_client.api.core.RequestOptions
import com.llama_stack_client.api.models.AgentStepRetrieveParams
import com.llama_stack_client.api.models.AgentsStep

interface StepServiceAsync {

    suspend fun retrieve(
        params: AgentStepRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): AgentsStep
}
