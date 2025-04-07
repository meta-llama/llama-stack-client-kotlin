// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AgentSessionCreateParamsTest {

    @Test
    fun create() {
        AgentSessionCreateParams.builder().agentId("agent_id").sessionName("session_name").build()
    }

    @Test
    fun pathParams() {
        val params =
            AgentSessionCreateParams.builder()
                .agentId("agent_id")
                .sessionName("session_name")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("agent_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            AgentSessionCreateParams.builder()
                .agentId("agent_id")
                .sessionName("session_name")
                .build()

        val body = params._body()

        assertThat(body.sessionName()).isEqualTo("session_name")
    }
}
