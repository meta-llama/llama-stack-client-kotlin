// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.blocking.agents

import com.llama.llamastack.TestServerExtension
import com.llama.llamastack.client.okhttp.LlamaStackClientOkHttpClient
import com.llama.llamastack.models.AgentSessionCreateParams
import com.llama.llamastack.models.AgentSessionDeleteParams
import com.llama.llamastack.models.AgentSessionRetrieveParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class SessionServiceTest {

    @Test
    fun callCreate() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val sessionService = client.agents().session()
        val agentSessionCreateResponse =
            sessionService.create(
                AgentSessionCreateParams.builder()
                    .agentId("agent_id")
                    .sessionName("session_name")
                    .xLlamaStackProviderData("X-LlamaStack-ProviderData")
                    .build()
            )
        println(agentSessionCreateResponse)
        agentSessionCreateResponse.validate()
    }

    @Test
    fun callRetrieve() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val sessionService = client.agents().session()
        val session =
            sessionService.retrieve(
                AgentSessionRetrieveParams.builder()
                    .agentId("agent_id")
                    .sessionId("session_id")
                    .turnIds(listOf("string"))
                    .xLlamaStackProviderData("X-LlamaStack-ProviderData")
                    .build()
            )
        println(session)
        session.validate()
    }

    @Test
    fun callDelete() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val sessionService = client.agents().session()
        sessionService.delete(
            AgentSessionDeleteParams.builder()
                .agentId("agent_id")
                .sessionId("session_id")
                .xLlamaStackProviderData("X-LlamaStack-ProviderData")
                .build()
        )
    }
}
