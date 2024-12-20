// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.llama.llamastack.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AgentSessionDeleteParamsTest {

    @Test
    fun createAgentSessionDeleteParams() {
        AgentSessionDeleteParams.builder()
            .agentId("agent_id")
            .sessionId("session_id")
            .xLlamaStackProviderData("X-LlamaStack-ProviderData")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            AgentSessionDeleteParams.builder()
                .agentId("agent_id")
                .sessionId("session_id")
                .xLlamaStackProviderData("X-LlamaStack-ProviderData")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.agentId()).isEqualTo("agent_id")
        assertThat(body.sessionId()).isEqualTo("session_id")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            AgentSessionDeleteParams.builder().agentId("agent_id").sessionId("session_id").build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.agentId()).isEqualTo("agent_id")
        assertThat(body.sessionId()).isEqualTo("session_id")
    }
}
