// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.llama.llamastack.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AgentCreateParamsTest {

    @Test
    fun createAgentCreateParams() {
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
                                            .body(RestApiExecutionConfig.Body.builder().build())
                                            .headers(
                                                RestApiExecutionConfig.Headers.builder().build()
                                            )
                                            .params(RestApiExecutionConfig.Params.builder().build())
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
    }

    @Test
    fun getBody() {
        val params =
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
                                                .body(RestApiExecutionConfig.Body.builder().build())
                                                .headers(
                                                    RestApiExecutionConfig.Headers.builder().build()
                                                )
                                                .params(
                                                    RestApiExecutionConfig.Params.builder().build()
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
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.agentConfig())
            .isEqualTo(
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
                                            .body(RestApiExecutionConfig.Body.builder().build())
                                            .headers(
                                                RestApiExecutionConfig.Headers.builder().build()
                                            )
                                            .params(RestApiExecutionConfig.Params.builder().build())
                                            .build()
                                    )
                                    .build()
                            )
                        )
                    )
                    .build()
            )
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            AgentCreateParams.builder()
                .agentConfig(
                    AgentConfig.builder()
                        .enableSessionPersistence(true)
                        .instructions("instructions")
                        .maxInferIters(123L)
                        .model("model")
                        .build()
                )
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.agentConfig())
            .isEqualTo(
                AgentConfig.builder()
                    .enableSessionPersistence(true)
                    .instructions("instructions")
                    .maxInferIters(123L)
                    .model("model")
                    .build()
            )
    }
}
