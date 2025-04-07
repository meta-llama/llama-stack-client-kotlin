// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AgentSessionDeleteParamsTest {

    @Test
    fun create() {
        AgentSessionDeleteParams.builder().agentId("agent_id").sessionId("session_id").build()
    }

    @Test
    fun pathParams() {
        val params =
            AgentSessionDeleteParams.builder().agentId("agent_id").sessionId("session_id").build()

        assertThat(params._pathParam(0)).isEqualTo("agent_id")
        assertThat(params._pathParam(1)).isEqualTo("session_id")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }
}
