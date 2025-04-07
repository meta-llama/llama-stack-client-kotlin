// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.llama.llamastack.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AgentTurnResumeParamsTest {

    @Test
    fun create() {
        AgentTurnResumeParams.builder()
            .agentId("agent_id")
            .sessionId("session_id")
            .turnId("turn_id")
            .addToolResponse(
                ToolResponse.builder()
                    .callId("call_id")
                    .content("string")
                    .toolName(ToolResponse.ToolName.BRAVE_SEARCH)
                    .metadata(
                        ToolResponse.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from(true))
                            .build()
                    )
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            AgentTurnResumeParams.builder()
                .agentId("agent_id")
                .sessionId("session_id")
                .turnId("turn_id")
                .addToolResponse(
                    ToolResponse.builder()
                        .callId("call_id")
                        .content("string")
                        .toolName(ToolResponse.ToolName.BRAVE_SEARCH)
                        .build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("agent_id")
        assertThat(params._pathParam(1)).isEqualTo("session_id")
        assertThat(params._pathParam(2)).isEqualTo("turn_id")
        // out-of-bound path param
        assertThat(params._pathParam(3)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            AgentTurnResumeParams.builder()
                .agentId("agent_id")
                .sessionId("session_id")
                .turnId("turn_id")
                .addToolResponse(
                    ToolResponse.builder()
                        .callId("call_id")
                        .content("string")
                        .toolName(ToolResponse.ToolName.BRAVE_SEARCH)
                        .metadata(
                            ToolResponse.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from(true))
                                .build()
                        )
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.toolResponses())
            .containsExactly(
                ToolResponse.builder()
                    .callId("call_id")
                    .content("string")
                    .toolName(ToolResponse.ToolName.BRAVE_SEARCH)
                    .metadata(
                        ToolResponse.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from(true))
                            .build()
                    )
                    .build()
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
                    ToolResponse.builder()
                        .callId("call_id")
                        .content("string")
                        .toolName(ToolResponse.ToolName.BRAVE_SEARCH)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.toolResponses())
            .containsExactly(
                ToolResponse.builder()
                    .callId("call_id")
                    .content("string")
                    .toolName(ToolResponse.ToolName.BRAVE_SEARCH)
                    .build()
            )
    }
}
