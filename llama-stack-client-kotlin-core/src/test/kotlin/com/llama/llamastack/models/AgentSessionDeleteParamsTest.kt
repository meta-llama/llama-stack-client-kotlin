// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AgentSessionDeleteParamsTest {

    @Test
    fun create() {
        AgentSessionDeleteParams.builder().agentId("agent_id").sessionId("session_id").build()
    }

    @Test
    fun getPathParam() {
        val params =
            AgentSessionDeleteParams.builder().agentId("agent_id").sessionId("session_id").build()
        assertThat(params).isNotNull
        // path param "agentId"
        assertThat(params.getPathParam(0)).isEqualTo("agent_id")
        // path param "sessionId"
        assertThat(params.getPathParam(1)).isEqualTo("session_id")
        // out-of-bound path param
        assertThat(params.getPathParam(2)).isEqualTo("")
    }
}
