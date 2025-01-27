// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AgentTurnCreateParamsTest {

    @Test
    fun createAgentTurnCreateParams() {
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
            .addToolgroup("string")
            .xLlamaStackClientVersion("X-LlamaStack-Client-Version")
            .xLlamaStackProviderData("X-LlamaStack-Provider-Data")
            .build()
    }

    @Test
    fun getBody() {
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
                .addToolgroup("string")
                .xLlamaStackClientVersion("X-LlamaStack-Client-Version")
                .xLlamaStackProviderData("X-LlamaStack-Provider-Data")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
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
        assertThat(body.toolgroups())
            .isEqualTo(listOf(AgentTurnCreateParams.Toolgroup.ofString("string")))
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            AgentTurnCreateParams.builder()
                .agentId("agent_id")
                .sessionId("session_id")
                .addMessage(UserMessage.builder().content("string").build())
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
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
