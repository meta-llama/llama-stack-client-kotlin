// File generated from our OpenAPI spec by Stainless.

package com.llama_stack_client.api.models

import com.llama_stack_client.api.models.*
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
        val expected = mutableMapOf<String, List<String>>()
        expected.put("agent_id", listOf("agent_id"))
        expected.put("session_id", listOf("session_id"))
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params =
            AgentSessionRetrieveParams.builder().agentId("agent_id").sessionId("session_id").build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("agent_id", listOf("agent_id"))
        expected.put("session_id", listOf("session_id"))
        assertThat(params.getQueryParams()).isEqualTo(expected)
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
