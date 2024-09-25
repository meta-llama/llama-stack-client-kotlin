// File generated from our OpenAPI spec by Stainless.

package com.llama_stack_client.api.services.blocking.agents

import com.llama_stack_client.api.TestServerExtension
import com.llama_stack_client.api.client.okhttp.LlamaStackClientOkHttpClient
import com.llama_stack_client.api.models.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class TurnServiceTest {

    @Test
    fun callCreate() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val turnService = client.agents().turns()
        val agentsTurnStreamChunk =
            turnService.create(
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
            )
        println(agentsTurnStreamChunk)
        agentsTurnStreamChunk.validate()
    }

    @Test
    fun callRetrieve() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val turnService = client.agents().turns()
        val turn =
            turnService.retrieve(
                AgentTurnRetrieveParams.builder().agentId("agent_id").turnId("turn_id").build()
            )
        println(turn)
        turn.validate()
    }
}
