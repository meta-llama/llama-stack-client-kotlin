// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.llama.llamastack.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AgentSessionRetrieveParamsTest {

    @Test
    fun create() {
        AgentSessionRetrieveParams.builder()
            .agentId("agent_id")
            .sessionId("session_id")
            .addTurnId("string")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            AgentSessionRetrieveParams.builder()
                .agentId("agent_id")
                .sessionId("session_id")
                .addTurnId("string")
                .build()
        val expected = QueryParams.builder()
        expected.put("turn_ids", "string")
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            AgentSessionRetrieveParams.builder().agentId("agent_id").sessionId("session_id").build()
        val expected = QueryParams.builder()
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun getPathParam() {
        val params =
            AgentSessionRetrieveParams.builder().agentId("agent_id").sessionId("session_id").build()
        assertThat(params).isNotNull
        // path param "agentId"
        assertThat(params.getPathParam(0)).isEqualTo("agent_id")
        // path param "sessionId"
        assertThat(params.getPathParam(1)).isEqualTo("session_id")
        // out-of-bound path param
        assertThat(params.getPathParam(2)).isEqualTo("")
    }
}
