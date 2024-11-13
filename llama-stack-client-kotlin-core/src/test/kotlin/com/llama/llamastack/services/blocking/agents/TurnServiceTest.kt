// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.blocking.agents

import com.llama.llamastack.TestServerExtension
import com.llama.llamastack.client.okhttp.LlamaStackClientOkHttpClient
import com.llama.llamastack.models.*
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class TurnServiceTest {

    @Disabled(
        "skipped: currently no good way to test endpoints with content type text/event-stream, Prism mock server will fail"
    )
    @Test
    fun callCreate() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val turnService = client.agents().turn()
        val agentTurnCreateResponse =
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
        println(agentTurnCreateResponse)
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
}
