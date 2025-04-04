package com.llama.llamastack.client.local.services.agents

import com.llama.llamastack.client.local.LocalClientOptions
import com.llama.llamastack.core.RequestOptions
import com.llama.llamastack.models.AgentSessionCreateParams
import com.llama.llamastack.models.AgentSessionCreateResponse
import com.llama.llamastack.models.AgentSessionDeleteParams
import com.llama.llamastack.models.AgentSessionRetrieveParams
import com.llama.llamastack.models.Session
import com.llama.llamastack.services.blocking.agents.SessionService

class SessionServiceLocalImpl constructor(private val clientOptions: LocalClientOptions) :
    SessionService {
    override fun withRawResponse(): SessionService.WithRawResponse {
        TODO("Not yet implemented")
    }

    override fun create(
        params: AgentSessionCreateParams,
        requestOptions: RequestOptions,
    ): AgentSessionCreateResponse {
        // TODO: Add a session id with the agent id with copying all the other metadata from the
        // initial agentID row that was populated in the AgentService
        return AgentSessionCreateResponse.builder().sessionId(params.sessionName()).build()
    }

    override fun retrieve(
        params: AgentSessionRetrieveParams,
        requestOptions: RequestOptions,
    ): Session {
        TODO("Not yet implemented")
    }

    override fun delete(params: AgentSessionDeleteParams, requestOptions: RequestOptions) {
        TODO("Not yet implemented")
    }
}
