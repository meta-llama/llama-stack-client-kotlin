// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.blocking.agents

import com.llama.llamastack.TestServerExtension
import com.llama.llamastack.client.okhttp.LlamaStackClientOkHttpClient
import com.llama.llamastack.models.AgentTurnCreateParams
import com.llama.llamastack.models.AgentTurnResumeParams
import com.llama.llamastack.models.AgentTurnRetrieveParams
import com.llama.llamastack.models.ToolResponseMessage
import com.llama.llamastack.models.UserMessage
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class TurnServiceTest {

    @Test
    fun callCreate() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val turnService = client.agents().turn()
        val turn =
            turnService.create(
                AgentTurnCreateParams.builder()
                    .agentId("agent_id")
                    .sessionId("session_id")
                    .addMessage(UserMessage.builder().content("string").context("string").build())
                    .allowTurnResume(true)
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
        println(turn)
        turn.validate()
    }

    @Test
    fun callCreateStreaming() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val turnService = client.agents().turn()

        val turnStream =
            turnService.createStreaming(
                AgentTurnCreateParams.builder()
                    .agentId("agent_id")
                    .sessionId("session_id")
                    .addMessage(UserMessage.builder().content("string").context("string").build())
                    .allowTurnResume(true)
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

        turnStream.use {
            turnStream.asSequence().forEach {
                println(it)
                it.validate()
            }
        }
    }

    @Test
    fun callRetrieve() {
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
        println(turn)
        turn.validate()
    }

    @Test
    fun callResume() {
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
                        ToolResponseMessage.builder()
                            .callId("call_id")
                            .content("string")
                            .toolName(ToolResponseMessage.ToolName.BRAVE_SEARCH)
                            .build()
                    )
                    .build()
            )
        println(turn)
        turn.validate()
    }

    @Test
    fun callResumeStreaming() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val turnService = client.agents().turn()

        val turnStream =
            turnService.resumeStreaming(
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
            )

        turnStream.use {
            turnStream.asSequence().forEach {
                println(it)
                it.validate()
            }
        }
    }
}
