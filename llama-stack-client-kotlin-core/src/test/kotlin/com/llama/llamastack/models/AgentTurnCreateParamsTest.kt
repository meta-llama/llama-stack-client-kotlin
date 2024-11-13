// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.llama.llamastack.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AgentTurnCreateParamsTest {

    @Test
    fun createAgentTurnCreateParams() {
        AgentTurnCreateParams.builder()
            .agentId("agent_id")
            .messages(
                listOf(
                    AgentTurnCreateParams.Message.ofUserMessage(
                        UserMessage.builder()
                            .content(UserMessage.Content.ofString("string"))
                            .role(UserMessage.Role.USER)
                            .context(UserMessage.Context.ofString("string"))
                            .build()
                    )
                )
            )
            .sessionId("session_id")
            .attachments(
                listOf(
                    Attachment.builder()
                        .content(Attachment.Content.ofString("string"))
                        .mimeType("mime_type")
                        .build()
                )
            )
            .stream(true)
            .build()
    }

    @Test
    fun getBody() {
        val params =
            AgentTurnCreateParams.builder()
                .agentId("agent_id")
                .messages(
                    listOf(
                        AgentTurnCreateParams.Message.ofUserMessage(
                            UserMessage.builder()
                                .content(UserMessage.Content.ofString("string"))
                                .role(UserMessage.Role.USER)
                                .context(UserMessage.Context.ofString("string"))
                                .build()
                        )
                    )
                )
                .sessionId("session_id")
                .attachments(
                    listOf(
                        Attachment.builder()
                            .content(Attachment.Content.ofString("string"))
                            .mimeType("mime_type")
                            .build()
                    )
                )
                .stream(true)
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.agentId()).isEqualTo("agent_id")
        assertThat(body.messages())
            .isEqualTo(
                listOf(
                    AgentTurnCreateParams.Message.ofUserMessage(
                        UserMessage.builder()
                            .content(UserMessage.Content.ofString("string"))
                            .role(UserMessage.Role.USER)
                            .context(UserMessage.Context.ofString("string"))
                            .build()
                    )
                )
            )
        assertThat(body.sessionId()).isEqualTo("session_id")
        assertThat(body.attachments())
            .isEqualTo(
                listOf(
                    Attachment.builder()
                        .content(Attachment.Content.ofString("string"))
                        .mimeType("mime_type")
                        .build()
                )
            )
        assertThat(body.stream()).isEqualTo(true)
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            AgentTurnCreateParams.builder()
                .agentId("agent_id")
                .messages(
                    listOf(
                        AgentTurnCreateParams.Message.ofUserMessage(
                            UserMessage.builder()
                                .content(UserMessage.Content.ofString("string"))
                                .role(UserMessage.Role.USER)
                                .build()
                        )
                    )
                )
                .sessionId("session_id")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.agentId()).isEqualTo("agent_id")
        assertThat(body.messages())
            .isEqualTo(
                listOf(
                    AgentTurnCreateParams.Message.ofUserMessage(
                        UserMessage.builder()
                            .content(UserMessage.Content.ofString("string"))
                            .role(UserMessage.Role.USER)
                            .build()
                    )
                )
            )
        assertThat(body.sessionId()).isEqualTo("session_id")
    }
}
