// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.async

import com.llama.llamastack.core.RequestOptions
import com.llama.llamastack.models.AgentCreateParams
import com.llama.llamastack.models.AgentCreateResponse
import com.llama.llamastack.models.AgentDeleteParams
import com.llama.llamastack.services.async.agents.SessionServiceAsync
import com.llama.llamastack.services.async.agents.StepServiceAsync
import com.llama.llamastack.services.async.agents.TurnServiceAsync

interface AgentServiceAsync {

    fun session(): SessionServiceAsync

    fun steps(): StepServiceAsync

    fun turn(): TurnServiceAsync

    suspend fun create(
        params: AgentCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AgentCreateResponse

    suspend fun delete(
        params: AgentDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )
}
