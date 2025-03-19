package com.llama.llamastack.client.local.services

import com.llama.llamastack.client.local.LocalClientOptions
import com.llama.llamastack.client.local.services.agents.SessionServiceLocalImpl
import com.llama.llamastack.client.local.services.agents.TurnServiceLocalImpl
import com.llama.llamastack.client.local.util.createETLlamaModule
import com.llama.llamastack.core.JsonString
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

    private val session: SessionService by lazy { SessionServiceLocalImpl(clientOptions) }

    override fun session(): SessionService = session

    override fun steps(): StepService {
        TODO("Not yet implemented")
    }

    private val turn: TurnService by lazy { TurnServiceLocalImpl(clientOptions) }

    override fun turn(): TurnService = turn

    private var agentCreateResponse: AgentCreateResponse? = null

    override fun create(
        params: AgentCreateParams,
        requestOptions: RequestOptions,
    ): AgentCreateResponse {
        // retrieve initial metadata (modelPath, tokenizerPath, prompt..etc.)
        val agentConfig = params.agentConfig()

        // set clientOptions just for record
        clientOptions.modelPath =
            (agentConfig._additionalProperties()["modelPath"] as JsonString).value
        clientOptions.tokenizerPath =
            (agentConfig._additionalProperties()["tokenizerPath"] as JsonString).value
        checkNotNull(clientOptions.modelPath) { "`modelPath` is required but not set" }
        checkNotNull(clientOptions.tokenizerPath) { "`tokenizerPath` is required but not set" }
        clientOptions.llamaModule =
            createETLlamaModule(clientOptions.modelPath, clientOptions.tokenizerPath, 0.0F)

        val agentID = UUID.randomUUID()
        agentCreateResponse = AgentCreateResponse.builder().agentId(agentID.toString()).build()

        // TODO: cmodiii Place in DB including the modelName since that is later used in turnservice
        clientOptions.setAgent(this)
        clientOptions.setModelName(agentConfig.model())
        clientOptions.setInstruction(agentConfig.instructions())

        return agentCreateResponse as AgentCreateResponse
    }

    override fun delete(params: AgentDeleteParams, requestOptions: RequestOptions) {
        TODO("Not yet implemented")
    }
}
