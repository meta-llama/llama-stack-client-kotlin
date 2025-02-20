// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.blocking.agents

import com.llama.llamastack.core.RequestOptions
import com.llama.llamastack.models.AgentStepRetrieveParams
import com.llama.llamastack.models.AgentStepRetrieveResponse

interface StepService {

    fun retrieve(
        params: AgentStepRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AgentStepRetrieveResponse
}
