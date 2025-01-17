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
    fun getPathParam() {
        val params = AgentDeleteParams.builder().agentId("agent_id").build()
        assertThat(params).isNotNull
        // path param "agentId"
        assertThat(params.getPathParam(0)).isEqualTo("agent_id")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
