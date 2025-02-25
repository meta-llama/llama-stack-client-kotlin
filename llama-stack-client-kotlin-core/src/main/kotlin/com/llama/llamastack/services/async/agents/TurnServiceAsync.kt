// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.async.agents

import com.llama.llamastack.core.RequestOptions
import com.llama.llamastack.models.AgentTurnCreateParams
import com.llama.llamastack.models.AgentTurnResumeParams
import com.llama.llamastack.models.AgentTurnRetrieveParams
import com.llama.llamastack.models.Turn

interface TurnServiceAsync {

    suspend fun create(
        params: AgentTurnCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Turn

    suspend fun retrieve(
        params: AgentTurnRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Turn

    /**
     * Resume an agent turn with executed tool call responses. When a Turn has the status
     * `awaiting_input` due to pending input from client side tool calls, this endpoint can be used
     * to submit the outputs from the tool calls once they are ready.
     */
    suspend fun resume(
        params: AgentTurnResumeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Turn
}
