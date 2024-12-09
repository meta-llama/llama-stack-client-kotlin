// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AgentConfigTest {

    @Test
    fun createAgentConfig() {
        val agentConfig =
            AgentConfig.builder()
                .enableSessionPersistence(true)
                .instructions("instructions")
                .maxInferIters(0L)
                .model("model")
                .inputShields(listOf("string"))
                .outputShields(listOf("string"))
                .samplingParams(
                    SamplingParams.builder()
                        .strategy(SamplingParams.Strategy.GREEDY)
                        .maxTokens(0L)
                        .repetitionPenalty(0.0)
                        .temperature(0.0)
                        .topK(0L)
                        .topP(0.0)
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
                                        .headers(RestApiExecutionConfig.Headers.builder().build())
                                        .params(RestApiExecutionConfig.Params.builder().build())
                                        .build()
                                )
                                .build()
                        )
                    )
                )
                .build()
        assertThat(agentConfig).isNotNull
        assertThat(agentConfig.enableSessionPersistence()).isEqualTo(true)
        assertThat(agentConfig.instructions()).isEqualTo("instructions")
        assertThat(agentConfig.maxInferIters()).isEqualTo(0L)
        assertThat(agentConfig.model()).isEqualTo("model")
        assertThat(agentConfig.inputShields()).containsExactly("string")
        assertThat(agentConfig.outputShields()).containsExactly("string")
        assertThat(agentConfig.samplingParams())
            .isEqualTo(
                SamplingParams.builder()
                    .strategy(SamplingParams.Strategy.GREEDY)
                    .maxTokens(0L)
                    .repetitionPenalty(0.0)
                    .temperature(0.0)
                    .topK(0L)
                    .topP(0.0)
                    .build()
            )
        assertThat(agentConfig.toolChoice()).isEqualTo(AgentConfig.ToolChoice.AUTO)
        assertThat(agentConfig.toolPromptFormat()).isEqualTo(AgentConfig.ToolPromptFormat.JSON)
        assertThat(agentConfig.tools())
            .containsExactly(
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
                                .headers(RestApiExecutionConfig.Headers.builder().build())
                                .params(RestApiExecutionConfig.Params.builder().build())
                                .build()
                        )
                        .build()
                )
            )
    }
}
