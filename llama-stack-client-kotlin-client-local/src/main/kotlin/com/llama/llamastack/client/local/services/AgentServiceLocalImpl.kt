package com.llama.llamastack.client.local.services

import com.llama.llamastack.client.local.LocalClientOptions
import com.llama.llamastack.core.RequestOptions
import com.llama.llamastack.models.AgentCreateParams
import com.llama.llamastack.models.AgentCreateResponse
import com.llama.llamastack.models.AgentDeleteParams
import com.llama.llamastack.services.blocking.AgentService
import com.llama.llamastack.services.blocking.agents.SessionService
import com.llama.llamastack.services.blocking.agents.StepService
import com.llama.llamastack.services.blocking.agents.TurnService

class AgentServiceLocalImpl constructor(private val clientOptions: LocalClientOptions) :
    AgentService {
    override fun session(): SessionService {
        TODO("Not yet implemented")
    }

    override fun steps(): StepService {
        TODO("Not yet implemented")
    }

    override fun turn(): TurnService {
        TODO("Not yet implemented")
    }

    override fun create(
        params: AgentCreateParams,
        requestOptions: RequestOptions
    ): AgentCreateResponse {
        // retrieve initial metadata (modelPath, tokenizerPath, prompt..etc.)
        var agentConfig = params.agentConfig();



    }

    override fun delete(params: AgentDeleteParams, requestOptions: RequestOptions) {
        TODO("Not yet implemented")
    }
}