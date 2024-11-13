// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.llama.llamastack.core.http.QueryParams
import com.llama.llamastack.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AgentSessionRetrieveParamsTest {

    @Test
    fun createAgentSessionRetrieveParams() {
        AgentSessionRetrieveParams.builder()
            .turnIds(listOf("string"))
            .agentId("agent_id")
            .sessionId("session_id")
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            AgentSessionRetrieveParams.builder()
                .turnIds(listOf("string"))
                .agentId("agent_id")
                .sessionId("session_id")
                .build()
        val expected = QueryParams.builder()
        expected.put("agent_id", "agent_id")
        expected.put("session_id", "session_id")
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params =
            AgentSessionRetrieveParams.builder().agentId("agent_id").sessionId("session_id").build()
        val expected = QueryParams.builder()
        expected.put("agent_id", "agent_id")
        expected.put("session_id", "session_id")
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }

    @Test
    fun getBody() {
        val params =
            AgentSessionRetrieveParams.builder()
                .turnIds(listOf("string"))
                .agentId("agent_id")
                .sessionId("session_id")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.turnIds()).isEqualTo(listOf("string"))
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            AgentSessionRetrieveParams.builder().agentId("agent_id").sessionId("session_id").build()
        val body = params.getBody()
        assertThat(body).isNotNull
    }
}
