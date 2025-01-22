// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.blocking.agents

import com.llama.llamastack.TestServerExtension
import com.llama.llamastack.client.okhttp.LlamaStackClientOkHttpClient
import com.llama.llamastack.models.AgentTurnCreateParams
import com.llama.llamastack.models.AgentTurnRetrieveParams
import com.llama.llamastack.models.UserMessage
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
                    .sessionId("session_id")
                    .addMessage(
                        UserMessage.builder()
                            .content("string")
                            .role(UserMessage.Role.USER)
                            .context("string")
                            .build()
                    )
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
            )
        println(agentTurnCreateResponse)
    }

    @Disabled(
        "skipped: currently no good way to test endpoints with content type text/event-stream, Prism mock server will fail"
    )
    @Test
    fun callCreateStreaming() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val turnService = client.agents().turn()

        val agentTurnCreateResponseStream =
            turnService.createStreaming(
                AgentTurnCreateParams.builder()
                    .agentId("agent_id")
                    .sessionId("session_id")
                    .addMessage(
                        UserMessage.builder()
                            .content("string")
                            .role(UserMessage.Role.USER)
                            .context("string")
                            .build()
                    )
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
            )

        agentTurnCreateResponseStream.use {
            agentTurnCreateResponseStream.asSequence().forEach { println(it) }
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
                    .xLlamaStackClientVersion("X-LlamaStack-Client-Version")
                    .xLlamaStackProviderData("X-LlamaStack-Provider-Data")
                    .build()
            )
        println(turn)
        turn.validate()
    }
}
