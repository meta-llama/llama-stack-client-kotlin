// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AgentTurnResumeParamsTest {

    @Test
    fun create() {
        AgentTurnResumeParams.builder()
            .agentId("agent_id")
            .sessionId("session_id")
            .turnId("turn_id")
            .addToolResponse(
                ToolResponseMessage.builder()
                    .callId("call_id")
                    .content("string")
                    .toolName(ToolResponseMessage.ToolName.BRAVE_SEARCH)
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            AgentTurnResumeParams.builder()
                .agentId("agent_id")
                .sessionId("session_id")
                .turnId("turn_id")
                .addToolResponse(
                    ToolResponseMessage.builder()
                        .callId("call_id")
                        .content("string")
                        .toolName(ToolResponseMessage.ToolName.BRAVE_SEARCH)
                        .build()
                )
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.toolResponses())
            .isEqualTo(
                listOf(
                    ToolResponseMessage.builder()
                        .callId("call_id")
                        .content("string")
                        .toolName(ToolResponseMessage.ToolName.BRAVE_SEARCH)
                        .build()
                )
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            AgentTurnResumeParams.builder()
                .agentId("agent_id")
                .sessionId("session_id")
                .turnId("turn_id")
                .addToolResponse(
                    ToolResponseMessage.builder()
                        .callId("call_id")
                        .content("string")
                        .toolName(ToolResponseMessage.ToolName.BRAVE_SEARCH)
                        .build()
                )
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.toolResponses())
            .isEqualTo(
                listOf(
                    ToolResponseMessage.builder()
                        .callId("call_id")
                        .content("string")
                        .toolName(ToolResponseMessage.ToolName.BRAVE_SEARCH)
                        .build()
                )
            )
    }

    @Test
    fun getPathParam() {
        val params =
            AgentTurnResumeParams.builder()
                .agentId("agent_id")
                .sessionId("session_id")
                .turnId("turn_id")
                .addToolResponse(
                    ToolResponseMessage.builder()
                        .callId("call_id")
                        .content("string")
                        .toolName(ToolResponseMessage.ToolName.BRAVE_SEARCH)
                        .build()
                )
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
