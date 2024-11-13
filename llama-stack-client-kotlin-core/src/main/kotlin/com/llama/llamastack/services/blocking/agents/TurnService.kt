// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.blocking.agents

import com.llama.llamastack.core.RequestOptions
import com.llama.llamastack.models.AgentTurnCreateParams
import com.llama.llamastack.models.AgentTurnCreateResponse
import com.llama.llamastack.models.AgentTurnRetrieveParams
import com.llama.llamastack.models.Turn

interface TurnService {

    fun create(
        params: AgentTurnCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): AgentTurnCreateResponse

    fun retrieve(
        params: AgentTurnRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): Turn
}
