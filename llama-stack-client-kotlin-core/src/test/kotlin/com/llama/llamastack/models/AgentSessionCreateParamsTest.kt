// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AgentSessionCreateParamsTest {

    @Test
    fun create() {
        AgentSessionCreateParams.builder().agentId("agent_id").sessionName("session_name").build()
    }

    @Test
    fun body() {
        val params =
            AgentSessionCreateParams.builder()
                .agentId("agent_id")
                .sessionName("session_name")
                .build()
        val body = params._body()
        assertThat(body).isNotNull
        assertThat(body.sessionName()).isEqualTo("session_name")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            AgentSessionCreateParams.builder()
                .agentId("agent_id")
                .sessionName("session_name")
                .build()
        val body = params._body()
        assertThat(body).isNotNull
        assertThat(body.sessionName()).isEqualTo("session_name")
    }

    @Test
    fun getPathParam() {
        val params =
            AgentSessionCreateParams.builder()
                .agentId("agent_id")
                .sessionName("session_name")
                .build()
        assertThat(params).isNotNull
        // path param "agentId"
        assertThat(params.getPathParam(0)).isEqualTo("agent_id")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
