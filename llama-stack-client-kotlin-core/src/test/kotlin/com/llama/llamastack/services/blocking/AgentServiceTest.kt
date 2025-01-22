// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.blocking

import com.llama.llamastack.TestServerExtension
import com.llama.llamastack.client.okhttp.LlamaStackClientOkHttpClient
import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.models.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

interface InferenceStreamingCallback {
    fun onStreamReceived(message: String)
    fun onStatStreamReceived(tps: Float)
}

@ExtendWith(TestServerExtension::class)
class AgentServiceTest {

    @Test
    fun callCreate() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val agentService = client.agents()
        val agentCreateResponse =
            agentService.create(
                AgentCreateParams.builder()
                    .agentConfig(
                        AgentConfig.builder()
                            .enableSessionPersistence(true)
                            .instructions("you are a help full assitant")
                            .maxInferIters(10)
                            .model("meta-llama/Llama-3.1-70B-Instruct")
                            .addToolgroup("builtin::websearch")
                            .build()
                    )
                    .build()
            )
        println(agentCreateResponse)
        agentCreateResponse.validate()
        val agentId = agentCreateResponse.agentId()
        val sessionService = agentService.session()
        val agentSessionCreateResponse = sessionService.create(
            AgentSessionCreateParams.builder()
                .agentId(agentId)
                .sessionName("test-session")
                .build()
        )
        val sessionId = agentSessionCreateResponse.sessionId()
        val turnService = agentService.turn()
        val agentTurnCreateResponseStream =
            turnService.createStreaming(
                AgentTurnCreateParams.builder()
                    .agentId(agentId)
                    .messages(
                        listOf(
                            AgentTurnCreateParams.Message.ofUserMessage(
                                UserMessage.builder()
                                    .content(InterleavedContent.ofString("who is the ceo of Meta?"))
                                    .role(UserMessage.Role.USER)
                                    .build()
                            )
                        )
                    )
                    .sessionId(sessionId)
                    .build()
            )
        val callback = object : InferenceStreamingCallback {
            override fun onStreamReceived(message: String) {
                println(message)
            }

            override fun onStatStreamReceived(tps: Float) {
                println(tps)
            }
        }
        agentTurnCreateResponseStream.use {
            agentTurnCreateResponseStream.asSequence().forEach {
                val agentResponsePayload = it.agentTurnResponseStreamChunk()?.event()?.payload()
                if (agentResponsePayload != null) {
                    when {
                        agentResponsePayload.isAgentTurnResponseTurnStartPayload() -> {
                            // Handle Turn Start Payload
                        }

                        agentResponsePayload.isAgentTurnResponseStepStartPayload() -> {
                            // Handle Step Start Payload

                            //Need-To-Fix: AgentTurnResponseStepStartPayload type mismatch bug.
                            val result = agentResponsePayload.agentTurnResponseStepStartPayload()?._additionalProperties()?.get("delta")?.asObject()?.get("text")
                            //We shouldn't need to do this if the payload is been correctly setup on the server side as StepProgressPayload
                            val toolcallJson = agentResponsePayload.agentTurnResponseStepStartPayload()?._additionalProperties()?.get("delta")?.asObject()?.get("content")
                            if (toolcallJson != null) {
                                val call_id = toolcallJson.asObject()?.get("call_id")
                                val tool_name = toolcallJson.asObject()?.get("tool_name")
                                val arguments = toolcallJson.asObject()?.get("arguments")
                                println("call_id: $call_id, tool_name: $tool_name, arguments: $arguments")

                            }
                            if (result != null) {
                                callback.onStreamReceived(result.toString())
                            }
                        }

                        agentResponsePayload.isAgentTurnResponseStepProgressPayload() -> {
                            // Handle Step Progress Payload
                            //                        val result = agentResponsePayload.agentTurnResponseStepProgressPayload()?.delta().toolCallDelta()?.content().toolCall()
                        }

                        agentResponsePayload.isAgentTurnResponseStepCompletePayload() -> {
                            // Handle Step Complete Payload
                        }

                        agentResponsePayload.isAgentTurnResponseTurnCompletePayload() -> {
                            // Handle Turn Complete Payload
                        }
                    }
                }
            }
        }

    }


    @Test
    fun callDelete() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val agentService = client.agents()
        agentService.delete(
            AgentDeleteParams.builder()
                .agentId("agent_id")
                .xLlamaStackClientVersion("X-LlamaStack-Client-Version")
                .xLlamaStackProviderData("X-LlamaStack-Provider-Data")
                .build()
        )
    }
}
