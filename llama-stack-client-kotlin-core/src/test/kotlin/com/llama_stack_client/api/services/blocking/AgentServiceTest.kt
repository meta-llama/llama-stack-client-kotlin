// File generated from our OpenAPI spec by Stainless.

package com.llama_stack_client.api.services.blocking

import com.llama_stack_client.api.TestServerExtension
import com.llama_stack_client.api.client.okhttp.LlamaStackClientOkHttpClient
import com.llama_stack_client.api.models.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

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
                        AgentCreateParams.AgentConfig.builder()
                            .enableSessionPersistence(true)
                            .instructions("instructions")
                            .maxInferIters(123L)
                            .model("model")
                            .inputShields(listOf("string"))
                            .outputShields(listOf("string"))
                            .samplingParams(
                                SamplingParams.builder()
                                    .strategy(SamplingParams.Strategy.GREEDY)
                                    .maxTokens(123L)
                                    .repetitionPenalty(42.23)
                                    .temperature(42.23)
                                    .topK(123L)
                                    .topP(42.23)
                                    .build()
                            )
                            .toolChoice(AgentCreateParams.AgentConfig.ToolChoice.AUTO)
                            .toolPromptFormat(AgentCreateParams.AgentConfig.ToolPromptFormat.JSON)
                            .tools(
                                listOf(
                                    AgentCreateParams.AgentConfig.Tool.ofSearchToolDefinition(
                                        AgentCreateParams.AgentConfig.Tool.SearchToolDefinition
                                            .builder()
                                            .apiKey("api_key")
                                            .engine(
                                                AgentCreateParams.AgentConfig.Tool
                                                    .SearchToolDefinition
                                                    .Engine
                                                    .BING
                                            )
                                            .type(
                                                AgentCreateParams.AgentConfig.Tool
                                                    .SearchToolDefinition
                                                    .Type
                                                    .BRAVE_SEARCH
                                            )
                                            .inputShields(listOf("string"))
                                            .outputShields(listOf("string"))
                                            .remoteExecution(
                                                RestApiExecutionConfig.builder()
                                                    .method(RestApiExecutionConfig.Method.GET)
                                                    .url("https://example.com")
                                                    .body(
                                                        RestApiExecutionConfig.Body.builder()
                                                            .build()
                                                    )
                                                    .headers(
                                                        RestApiExecutionConfig.Headers.builder()
                                                            .build()
                                                    )
                                                    .params(
                                                        RestApiExecutionConfig.Params.builder()
                                                            .build()
                                                    )
                                                    .build()
                                            )
                                            .build()
                                    )
                                )
                            )
                            .build()
                    )
                    .build()
            )
        println(agentCreateResponse)
        agentCreateResponse.validate()
    }

    @Test
    fun callDelete() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val agentService = client.agents()
        agentService.delete(AgentDeleteParams.builder().agentId("agent_id").build())
    }
}
