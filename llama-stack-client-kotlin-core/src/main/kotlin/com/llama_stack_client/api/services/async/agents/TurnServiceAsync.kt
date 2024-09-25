// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.llama_stack_client.api.services.async.agents

import com.llama_stack_client.api.core.RequestOptions
import com.llama_stack_client.api.models.AgentTurnCreateParams
import com.llama_stack_client.api.models.AgentTurnRetrieveParams
import com.llama_stack_client.api.models.AgentsTurnStreamChunk
import com.llama_stack_client.api.models.Turn

interface TurnServiceAsync {

    suspend fun create(
        params: AgentTurnCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): AgentsTurnStreamChunk

    suspend fun retrieve(
        params: AgentTurnRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): Turn
}
