// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.blocking.agents

import com.google.errorprone.annotations.MustBeClosed
import com.llama.llamastack.core.RequestOptions
import com.llama.llamastack.core.http.StreamResponse
import com.llama.llamastack.models.AgentTurnCreateParams
import com.llama.llamastack.models.AgentTurnResponseStreamChunk
import com.llama.llamastack.models.AgentTurnRetrieveParams
import com.llama.llamastack.models.Turn

interface TurnService {

    fun create(
        params: AgentTurnCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): Turn

    @MustBeClosed
    fun createStreaming(
        params: AgentTurnCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): StreamResponse<AgentTurnResponseStreamChunk>

    fun retrieve(
        params: AgentTurnRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): Turn
}
