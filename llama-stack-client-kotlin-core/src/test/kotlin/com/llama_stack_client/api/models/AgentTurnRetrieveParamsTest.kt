// File generated from our OpenAPI spec by Stainless.

package com.llama_stack_client.api.models

import com.llama_stack_client.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AgentTurnRetrieveParamsTest {

    @Test
    fun createAgentTurnRetrieveParams() {
        AgentTurnRetrieveParams.builder().agentId("agent_id").turnId("turn_id").build()
    }

    @Test
    fun getQueryParams() {
        val params = AgentTurnRetrieveParams.builder().agentId("agent_id").turnId("turn_id").build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("agent_id", listOf("agent_id"))
        expected.put("turn_id", listOf("turn_id"))
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = AgentTurnRetrieveParams.builder().agentId("agent_id").turnId("turn_id").build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("agent_id", listOf("agent_id"))
        expected.put("turn_id", listOf("turn_id"))
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }
}
