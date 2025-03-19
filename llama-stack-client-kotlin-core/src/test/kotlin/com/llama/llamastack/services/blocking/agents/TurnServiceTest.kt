// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.blocking.agents

import com.llama.llamastack.TestServerExtension
import com.llama.llamastack.client.okhttp.LlamaStackClientOkHttpClient
import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.models.AgentTurnCreateParams
import com.llama.llamastack.models.AgentTurnResumeParams
import com.llama.llamastack.models.AgentTurnRetrieveParams
import com.llama.llamastack.models.ToolResponse
import com.llama.llamastack.models.UserMessage
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class TurnServiceTest {

    @Test
    fun create() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val turnService = client.agents().turn()

        val turn =
            turnService.create(
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
                            .toolPromptFormat(
                                AgentTurnCreateParams.ToolConfig.ToolPromptFormat.JSON
                            )
                            .build()
                    )
                    .addToolgroup("string")
                    .build()
            )

        turn.validate()
    }

    @Test
    fun createStreaming() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val turnService = client.agents().turn()

        val turnStreamResponse =
            turnService.createStreaming(
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
                            .toolPromptFormat(
                                AgentTurnCreateParams.ToolConfig.ToolPromptFormat.JSON
                            )
                            .build()
                    )
                    .addToolgroup("string")
                    .build()
            )

        turnStreamResponse.use {
            turnStreamResponse.asSequence().forEach { turn -> turn.validate() }
        }
    }

    @Test
    fun retrieve() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val turnService = client.agents().turn()

        val turn =
            turnService.retrieve(
                AgentTurnRetrieveParams.builder()
                    .agentId("agent_id")
                    .sessionId("session_id")
                    .turnId("turn_id")
                    .build()
            )

        turn.validate()
    }

    @Test
    fun resume() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val turnService = client.agents().turn()

        val turn =
            turnService.resume(
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
            )

        turn.validate()
    }

    @Test
    fun resumeStreaming() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val turnService = client.agents().turn()

        val turnStreamResponse =
            turnService.resumeStreaming(
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
            )

        turnStreamResponse.use {
            turnStreamResponse.asSequence().forEach { turn -> turn.validate() }
        }
    }
}
