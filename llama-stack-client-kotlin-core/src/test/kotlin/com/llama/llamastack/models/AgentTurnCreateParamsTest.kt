// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AgentTurnCreateParamsTest {

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

        assertNotNull(body)
        assertThat(body.messages())
            .isEqualTo(
                listOf(
                    AgentTurnCreateParams.Message.ofUser(
                        UserMessage.builder().content("string").context("string").build()
                    )
                )
            )
        assertThat(body.documents())
            .isEqualTo(
                listOf(
                    AgentTurnCreateParams.Document.builder()
                        .content("string")
                        .mimeType("mime_type")
                        .build()
                )
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
            .isEqualTo(listOf(AgentTurnCreateParams.Toolgroup.ofString("string")))
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

        assertNotNull(body)
        assertThat(body.messages())
            .isEqualTo(
                listOf(
                    AgentTurnCreateParams.Message.ofUser(
                        UserMessage.builder().content("string").build()
                    )
                )
            )
    }

    @Test
    fun getPathParam() {
        val params =
            AgentTurnCreateParams.builder()
                .agentId("agent_id")
                .sessionId("session_id")
                .addMessage(UserMessage.builder().content("string").build())
                .build()
        assertThat(params).isNotNull
        // path param "agentId"
        assertThat(params.getPathParam(0)).isEqualTo("agent_id")
        // path param "sessionId"
        assertThat(params.getPathParam(1)).isEqualTo("session_id")
        // out-of-bound path param
        assertThat(params.getPathParam(2)).isEqualTo("")
    }
}
