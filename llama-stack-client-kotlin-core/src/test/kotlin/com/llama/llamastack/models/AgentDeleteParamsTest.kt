// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AgentDeleteParamsTest {

    @Test
    fun createAgentDeleteParams() {
        AgentDeleteParams.builder()
            .agentId("agent_id")
            .xLlamaStackClientVersion("X-LlamaStack-Client-Version")
            .xLlamaStackProviderData("X-LlamaStack-Provider-Data")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            AgentDeleteParams.builder()
                .agentId("agent_id")
                .xLlamaStackClientVersion("X-LlamaStack-Client-Version")
                .xLlamaStackProviderData("X-LlamaStack-Provider-Data")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.agentId()).isEqualTo("agent_id")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params = AgentDeleteParams.builder().agentId("agent_id").build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.agentId()).isEqualTo("agent_id")
    }
}
