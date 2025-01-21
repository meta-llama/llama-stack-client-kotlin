// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

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
                            .content(InterleavedContent.ofString("string"))
                            .role(UserMessage.Role.USER)
                            .context(InterleavedContent.ofString("string"))
                            .build()
                    )
                )
            )
            .sessionId("session_id")
            .documents(
                listOf(
                    AgentTurnCreateParams.Document.builder()
                        .content(AgentTurnCreateParams.Document.Content.ofString("string"))
                        .mimeType("mime_type")
                        .build()
                )
            )
            .toolgroups(listOf(AgentTurnCreateParams.Toolgroup.ofString("string")))
            .xLlamaStackClientVersion("X-LlamaStack-Client-Version")
            .xLlamaStackProviderData("X-LlamaStack-Provider-Data")
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
                                .content(InterleavedContent.ofString("string"))
                                .role(UserMessage.Role.USER)
                                .context(InterleavedContent.ofString("string"))
                                .build()
                        )
                    )
                )
                .sessionId("session_id")
                .documents(
                    listOf(
                        AgentTurnCreateParams.Document.builder()
                            .content(AgentTurnCreateParams.Document.Content.ofString("string"))
                            .mimeType("mime_type")
                            .build()
                    )
                )
                .toolgroups(listOf(AgentTurnCreateParams.Toolgroup.ofString("string")))
                .xLlamaStackClientVersion("X-LlamaStack-Client-Version")
                .xLlamaStackProviderData("X-LlamaStack-Provider-Data")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.agentId()).isEqualTo("agent_id")
        assertThat(body.messages())
            .isEqualTo(
                listOf(
                    AgentTurnCreateParams.Message.ofUserMessage(
                        UserMessage.builder()
                            .content(InterleavedContent.ofString("string"))
                            .role(UserMessage.Role.USER)
                            .context(InterleavedContent.ofString("string"))
                            .build()
                    )
                )
            )
        assertThat(body.sessionId()).isEqualTo("session_id")
        assertThat(body.documents())
            .isEqualTo(
                listOf(
                    AgentTurnCreateParams.Document.builder()
                        .content(AgentTurnCreateParams.Document.Content.ofString("string"))
                        .mimeType("mime_type")
                        .build()
                )
            )
        assertThat(body.toolgroups())
            .isEqualTo(listOf(AgentTurnCreateParams.Toolgroup.ofString("string")))
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
                                .content(InterleavedContent.ofString("string"))
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
                            .content(InterleavedContent.ofString("string"))
                            .role(UserMessage.Role.USER)
                            .build()
                    )
                )
            )
        assertThat(body.sessionId()).isEqualTo("session_id")
    }
}
