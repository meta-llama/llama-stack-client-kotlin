package com.llama.llamastack.client.local.services

import com.llama.llamastack.client.local.LocalClientOptions
import com.llama.llamastack.client.local.services.agents.SessionServiceLocalImpl
import com.llama.llamastack.client.local.services.agents.TurnServiceLocalImpl
import com.llama.llamastack.core.RequestOptions
import com.llama.llamastack.models.AgentCreateParams
import com.llama.llamastack.models.AgentCreateResponse
import com.llama.llamastack.models.AgentDeleteParams
import com.llama.llamastack.services.blocking.AgentService
import com.llama.llamastack.services.blocking.agents.SessionService
import com.llama.llamastack.services.blocking.agents.StepService
import com.llama.llamastack.services.blocking.agents.TurnService
import java.util.UUID

class AgentServiceLocalImpl constructor(private var clientOptions: LocalClientOptions) :
    AgentService {

    lateinit var agentId: String
    private var agentCreateParams: AgentCreateParams? = null
    private var agentCreateResponse: AgentCreateResponse? = null

    fun getAgentCreateParams(): AgentCreateParams? {
        return agentCreateParams
    }

    fun getAgentCreateResponse(): AgentCreateResponse? {
        return agentCreateResponse
    }

    override fun withRawResponse(): AgentService.WithRawResponse {
        TODO("Not yet implemented")
    }

    private val session: SessionService by lazy { SessionServiceLocalImpl(clientOptions) }

    override fun session(): SessionService = session

    override fun steps(): StepService {
        TODO("Not yet implemented")
    }

    private val turn: TurnService by lazy { TurnServiceLocalImpl(clientOptions) }

    override fun turn(): TurnService = turn

    override fun create(
        params: AgentCreateParams,
        requestOptions: RequestOptions,
    ): AgentCreateResponse {
        // retrieve initial metadata (modelPath, tokenizerPath, prompt..etc.)
        this.agentCreateParams = params
        try {
            val agentConfig = this.agentCreateParams!!.agentConfig()
            clientOptions.overrideModelConfigsFromAgent(agentConfig)
            clientOptions.initializeLlamaModule()

            agentId = UUID.randomUUID().toString()
            clientOptions.setAgent(this)
            agentCreateResponse = AgentCreateResponse.builder().agentId(agentId).build()
        } catch (e: Exception) {
            println(
                "AgentCreateLocalImpl.create(): agentCreateParams is probably null or " +
                    "issue with LlamaModule initialization. Exception is $e"
            )
        }
        return agentCreateResponse as AgentCreateResponse
    }

    override fun delete(params: AgentDeleteParams, requestOptions: RequestOptions) {
        TODO("Not yet implemented")
    }
}
