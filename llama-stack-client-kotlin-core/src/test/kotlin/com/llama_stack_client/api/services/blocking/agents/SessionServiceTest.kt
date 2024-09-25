// File generated from our OpenAPI spec by Stainless.

package com.llama_stack_client.api.services.blocking.agents

import com.llama_stack_client.api.TestServerExtension
import com.llama_stack_client.api.client.okhttp.LlamaStackClientOkHttpClient
import com.llama_stack_client.api.models.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class SessionServiceTest {

    @Test
    fun callCreate() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val sessionService = client.agents().sessions()
        val agentSessionCreateResponse =
            sessionService.create(
                AgentSessionCreateParams.builder()
                    .agentId("agent_id")
                    .sessionName("session_name")
                    .build()
            )
        println(agentSessionCreateResponse)
        agentSessionCreateResponse.validate()
    }

    @Test
    fun callRetrieve() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val sessionService = client.agents().sessions()
        val session =
            sessionService.retrieve(
                AgentSessionRetrieveParams.builder()
                    .turnIds(listOf("string"))
                    .agentId("agent_id")
                    .sessionId("session_id")
                    .build()
            )
        println(session)
        session.validate()
    }

    @Test
    fun callDelete() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val sessionService = client.agents().sessions()
        sessionService.delete(
            AgentSessionDeleteParams.builder().agentId("agent_id").sessionId("session_id").build()
        )
    }
}
