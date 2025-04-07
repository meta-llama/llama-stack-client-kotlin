// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AgentTurnCreateParamsTest {

    @Test
    fun create() {
        AgentTurnCreateParams.builder()
            .agentId("agent_id")
            .sessionId("session_id")
            .addMessage(UserMessage.builder().content("string").context("string").build())
            .addDocument(
                AgentTurnCreateParams.Document.builder()
                    .content("string")
                    .mimeType("mime_type")
                    .build()
            )
            .toolConfig(
                AgentTurnCreateParams.ToolConfig.builder()
                    .systemMessageBehavior(
                        AgentTurnCreateParams.ToolConfig.SystemMessageBehavior.APPEND
                    )
                    .toolChoice(AgentTurnCreateParams.ToolConfig.ToolChoice.AUTO)
                    .toolPromptFormat(AgentTurnCreateParams.ToolConfig.ToolPromptFormat.JSON)
                    .build()
            )
            .addToolgroup("string")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            AgentTurnCreateParams.builder()
                .agentId("agent_id")
                .sessionId("session_id")
                .addMessage(UserMessage.builder().content("string").build())
                .build()

        assertThat(params._pathParam(0)).isEqualTo("agent_id")
        assertThat(params._pathParam(1)).isEqualTo("session_id")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            AgentTurnCreateParams.builder()
                .agentId("agent_id")
                .sessionId("session_id")
                .addMessage(UserMessage.builder().content("string").context("string").build())
                .addDocument(
                    AgentTurnCreateParams.Document.builder()
                        .content("string")
                        .mimeType("mime_type")
                        .build()
                )
                .toolConfig(
                    AgentTurnCreateParams.ToolConfig.builder()
                        .systemMessageBehavior(
                            AgentTurnCreateParams.ToolConfig.SystemMessageBehavior.APPEND
                        )
                        .toolChoice(AgentTurnCreateParams.ToolConfig.ToolChoice.AUTO)
                        .toolPromptFormat(AgentTurnCreateParams.ToolConfig.ToolPromptFormat.JSON)
                        .build()
                )
                .addToolgroup("string")
                .build()

        val body = params._body()

        assertThat(body.messages())
            .containsExactly(
                AgentTurnCreateParams.Message.ofUser(
                    UserMessage.builder().content("string").context("string").build()
                )
            )
        assertThat(body.documents())
            .containsExactly(
                AgentTurnCreateParams.Document.builder()
                    .content("string")
                    .mimeType("mime_type")
                    .build()
            )
        assertThat(body.toolConfig())
            .isEqualTo(
                AgentTurnCreateParams.ToolConfig.builder()
                    .systemMessageBehavior(
                        AgentTurnCreateParams.ToolConfig.SystemMessageBehavior.APPEND
                    )
                    .toolChoice(AgentTurnCreateParams.ToolConfig.ToolChoice.AUTO)
                    .toolPromptFormat(AgentTurnCreateParams.ToolConfig.ToolPromptFormat.JSON)
                    .build()
            )
        assertThat(body.toolgroups())
            .containsExactly(AgentTurnCreateParams.Toolgroup.ofString("string"))
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            AgentTurnCreateParams.builder()
                .agentId("agent_id")
                .sessionId("session_id")
                .addMessage(UserMessage.builder().content("string").build())
                .build()

        val body = params._body()

        assertThat(body.messages())
            .containsExactly(
                AgentTurnCreateParams.Message.ofUser(
                    UserMessage.builder().content("string").build()
                )
            )
    }
}
