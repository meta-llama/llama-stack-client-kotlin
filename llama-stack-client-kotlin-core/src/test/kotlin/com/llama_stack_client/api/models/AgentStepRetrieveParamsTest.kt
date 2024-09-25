// File generated from our OpenAPI spec by Stainless.

package com.llama_stack_client.api.models

import com.llama_stack_client.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AgentStepRetrieveParamsTest {

    @Test
    fun createAgentStepRetrieveParams() {
        AgentStepRetrieveParams.builder()
            .agentId("agent_id")
            .stepId("step_id")
            .turnId("turn_id")
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            AgentStepRetrieveParams.builder()
                .agentId("agent_id")
                .stepId("step_id")
                .turnId("turn_id")
                .build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("agent_id", listOf("agent_id"))
        expected.put("step_id", listOf("step_id"))
        expected.put("turn_id", listOf("turn_id"))
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params =
            AgentStepRetrieveParams.builder()
                .agentId("agent_id")
                .stepId("step_id")
                .turnId("turn_id")
                .build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("agent_id", listOf("agent_id"))
        expected.put("step_id", listOf("step_id"))
        expected.put("turn_id", listOf("turn_id"))
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }
}
