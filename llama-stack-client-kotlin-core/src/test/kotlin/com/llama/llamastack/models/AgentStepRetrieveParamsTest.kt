// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.llama.llamastack.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AgentStepRetrieveParamsTest {

    @Test
    fun createAgentStepRetrieveParams() {
        AgentStepRetrieveParams.builder()
            .agentId("agent_id")
            .sessionId("session_id")
            .stepId("step_id")
            .turnId("turn_id")
            .xLlamaStackProviderData("X-LlamaStack-ProviderData")
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            AgentStepRetrieveParams.builder()
                .agentId("agent_id")
                .sessionId("session_id")
                .stepId("step_id")
                .turnId("turn_id")
                .xLlamaStackProviderData("X-LlamaStack-ProviderData")
                .build()
        val expected = QueryParams.builder()
        expected.put("agent_id", "agent_id")
        expected.put("session_id", "session_id")
        expected.put("step_id", "step_id")
        expected.put("turn_id", "turn_id")
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params =
            AgentStepRetrieveParams.builder()
                .agentId("agent_id")
                .sessionId("session_id")
                .stepId("step_id")
                .turnId("turn_id")
                .build()
        val expected = QueryParams.builder()
        expected.put("agent_id", "agent_id")
        expected.put("session_id", "session_id")
        expected.put("step_id", "step_id")
        expected.put("turn_id", "turn_id")
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }
}
