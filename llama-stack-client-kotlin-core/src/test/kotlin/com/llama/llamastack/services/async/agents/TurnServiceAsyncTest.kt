// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.async.agents

import com.llama.llamastack.TestServerExtension
import com.llama.llamastack.client.okhttp.LlamaStackClientOkHttpClientAsync
import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.models.AgentTurnCreateParams
import com.llama.llamastack.models.AgentTurnResumeParams
import com.llama.llamastack.models.AgentTurnRetrieveParams
import com.llama.llamastack.models.ToolResponse
import com.llama.llamastack.models.UserMessage
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class TurnServiceAsyncTest {

    @Test
    suspend fun create() {
        val client =
            LlamaStackClientOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .build()
        val turnServiceAsync = client.agents().turn()

        val turn =
            turnServiceAsync.create(
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
    suspend fun retrieve() {
        val client =
            LlamaStackClientOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .build()
        val turnServiceAsync = client.agents().turn()

        val turn =
            turnServiceAsync.retrieve(
                AgentTurnRetrieveParams.builder()
                    .agentId("agent_id")
                    .sessionId("session_id")
                    .turnId("turn_id")
                    .build()
            )

        turn.validate()
    }

    @Test
    suspend fun resume() {
        val client =
            LlamaStackClientOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .build()
        val turnServiceAsync = client.agents().turn()

        val turn =
            turnServiceAsync.resume(
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
}
