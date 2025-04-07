// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.async.agents

import com.llama.llamastack.TestServerExtension
import com.llama.llamastack.client.okhttp.LlamaStackClientOkHttpClientAsync
import com.llama.llamastack.models.AgentSessionCreateParams
import com.llama.llamastack.models.AgentSessionDeleteParams
import com.llama.llamastack.models.AgentSessionRetrieveParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class SessionServiceAsyncTest {

    @Test
    suspend fun create() {
        val client =
            LlamaStackClientOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .build()
        val sessionServiceAsync = client.agents().session()

        val session =
            sessionServiceAsync.create(
                AgentSessionCreateParams.builder()
                    .agentId("agent_id")
                    .sessionName("session_name")
                    .build()
            )

        session.validate()
    }

    @Test
    suspend fun retrieve() {
        val client =
            LlamaStackClientOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .build()
        val sessionServiceAsync = client.agents().session()

        val session =
            sessionServiceAsync.retrieve(
                AgentSessionRetrieveParams.builder()
                    .agentId("agent_id")
                    .sessionId("session_id")
                    .addTurnId("string")
                    .build()
            )

        session.validate()
    }

    @Test
    suspend fun delete() {
        val client =
            LlamaStackClientOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .build()
        val sessionServiceAsync = client.agents().session()

        sessionServiceAsync.delete(
            AgentSessionDeleteParams.builder().agentId("agent_id").sessionId("session_id").build()
        )
    }
}
