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
    fun create() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val sessionService = client.agents().session()

        val session =
            sessionService.create(
                AgentSessionCreateParams.builder()
                    .agentId("agent_id")
                    .sessionName("session_name")
                    .build()
            )

        session.validate()
    }

    @Test
    fun retrieve() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val sessionService = client.agents().session()

        val session =
            sessionService.retrieve(
                AgentSessionRetrieveParams.builder()
                    .agentId("agent_id")
                    .sessionId("session_id")
                    .addTurnId("string")
                    .build()
            )

        session.validate()
    }

    @Test
    fun delete() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val sessionService = client.agents().session()

        sessionService.delete(
            AgentSessionDeleteParams.builder().agentId("agent_id").sessionId("session_id").build()
        )
    }
}
