// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.llama.llamastack.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AgentSessionCreateParamsTest {

    @Test
    fun createAgentSessionCreateParams() {
        AgentSessionCreateParams.builder().agentId("agent_id").sessionName("session_name").build()
    }

    @Test
    fun getBody() {
        val params =
            AgentSessionCreateParams.builder()
                .agentId("agent_id")
                .sessionName("session_name")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.agentId()).isEqualTo("agent_id")
        assertThat(body.sessionName()).isEqualTo("session_name")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            AgentSessionCreateParams.builder()
                .agentId("agent_id")
                .sessionName("session_name")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.agentId()).isEqualTo("agent_id")
        assertThat(body.sessionName()).isEqualTo("session_name")
    }
}
