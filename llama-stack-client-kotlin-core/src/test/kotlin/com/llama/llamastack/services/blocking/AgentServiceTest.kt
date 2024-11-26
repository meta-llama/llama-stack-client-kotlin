// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.blocking

import com.llama.llamastack.TestServerExtension
import com.llama.llamastack.client.okhttp.LlamaStackClientOkHttpClient
import com.llama.llamastack.models.*
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
                        AgentConfig.builder()
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
                            .toolChoice(AgentConfig.ToolChoice.AUTO)
                            .toolPromptFormat(AgentConfig.ToolPromptFormat.JSON)
                            .tools(
                                listOf(
                                    AgentConfig.Tool.ofSearchToolDefinition(
                                        SearchToolDefinition.builder()
                                            .apiKey("api_key")
                                            .engine(SearchToolDefinition.Engine.BING)
                                            .type(SearchToolDefinition.Type.BRAVE_SEARCH)
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
                    .xLlamaStackProviderData("X-LlamaStack-ProviderData")
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
        agentService.delete(
            AgentDeleteParams.builder()
                .agentId("agent_id")
                .xLlamaStackProviderData("X-LlamaStack-ProviderData")
                .build()
        )
    }
}
