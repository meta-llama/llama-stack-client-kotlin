// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AgentTurnRetrieveParamsTest {

    @Test
    fun create() {
        AgentTurnRetrieveParams.builder()
            .agentId("agent_id")
            .sessionId("session_id")
            .turnId("turn_id")
            .build()
    }

    @Test
    fun getPathParam() {
        val params =
            AgentTurnRetrieveParams.builder()
                .agentId("agent_id")
                .sessionId("session_id")
                .turnId("turn_id")
                .build()
        assertThat(params).isNotNull
        // path param "agentId"
        assertThat(params.getPathParam(0)).isEqualTo("agent_id")
        // path param "sessionId"
        assertThat(params.getPathParam(1)).isEqualTo("session_id")
        // path param "turnId"
        assertThat(params.getPathParam(2)).isEqualTo("turn_id")
        // out-of-bound path param
        assertThat(params.getPathParam(3)).isEqualTo("")
    }
}
