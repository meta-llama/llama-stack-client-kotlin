// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.llama.llamastack.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class BatchInferenceChatCompletionParamsTest {

    @Test
    fun createBatchInferenceChatCompletionParams() {
        BatchInferenceChatCompletionParams.builder()
            .messagesBatch(
                listOf(
                    listOf(
                        BatchInferenceChatCompletionParams.MessagesBatch.ofUserMessage(
                            UserMessage.builder()
                                .content(UserMessage.Content.ofString("string"))
                                .role(UserMessage.Role.USER)
                                .context(UserMessage.Context.ofString("string"))
                                .build()
                        )
                    )
                )
            )
            .model("model")
            .logprobs(BatchInferenceChatCompletionParams.Logprobs.builder().topK(0L).build())
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
            .toolChoice(BatchInferenceChatCompletionParams.ToolChoice.AUTO)
            .toolPromptFormat(BatchInferenceChatCompletionParams.ToolPromptFormat.JSON)
            .tools(
                listOf(
                    BatchInferenceChatCompletionParams.Tool.builder()
                        .toolName(BatchInferenceChatCompletionParams.Tool.ToolName.BRAVE_SEARCH)
                        .description("description")
                        .parameters(
                            BatchInferenceChatCompletionParams.Tool.Parameters.builder().build()
                        )
                        .build()
                )
            )
            .xLlamaStackProviderData("X-LlamaStack-ProviderData")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            BatchInferenceChatCompletionParams.builder()
                .messagesBatch(
                    listOf(
                        listOf(
                            BatchInferenceChatCompletionParams.MessagesBatch.ofUserMessage(
                                UserMessage.builder()
                                    .content(UserMessage.Content.ofString("string"))
                                    .role(UserMessage.Role.USER)
                                    .context(UserMessage.Context.ofString("string"))
                                    .build()
                            )
                        )
                    )
                )
                .model("model")
                .logprobs(BatchInferenceChatCompletionParams.Logprobs.builder().topK(0L).build())
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
                .toolChoice(BatchInferenceChatCompletionParams.ToolChoice.AUTO)
                .toolPromptFormat(BatchInferenceChatCompletionParams.ToolPromptFormat.JSON)
                .tools(
                    listOf(
                        BatchInferenceChatCompletionParams.Tool.builder()
                            .toolName(BatchInferenceChatCompletionParams.Tool.ToolName.BRAVE_SEARCH)
                            .description("description")
                            .parameters(
                                BatchInferenceChatCompletionParams.Tool.Parameters.builder().build()
                            )
                            .build()
                    )
                )
                .xLlamaStackProviderData("X-LlamaStack-ProviderData")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.messagesBatch())
            .isEqualTo(
                listOf(
                    listOf(
                        BatchInferenceChatCompletionParams.MessagesBatch.ofUserMessage(
                            UserMessage.builder()
                                .content(UserMessage.Content.ofString("string"))
                                .role(UserMessage.Role.USER)
                                .context(UserMessage.Context.ofString("string"))
                                .build()
                        )
                    )
                )
            )
        assertThat(body.model()).isEqualTo("model")
        assertThat(body.logprobs())
            .isEqualTo(BatchInferenceChatCompletionParams.Logprobs.builder().topK(0L).build())
        assertThat(body.samplingParams())
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
        assertThat(body.toolChoice()).isEqualTo(BatchInferenceChatCompletionParams.ToolChoice.AUTO)
        assertThat(body.toolPromptFormat())
            .isEqualTo(BatchInferenceChatCompletionParams.ToolPromptFormat.JSON)
        assertThat(body.tools())
            .isEqualTo(
                listOf(
                    BatchInferenceChatCompletionParams.Tool.builder()
                        .toolName(BatchInferenceChatCompletionParams.Tool.ToolName.BRAVE_SEARCH)
                        .description("description")
                        .parameters(
                            BatchInferenceChatCompletionParams.Tool.Parameters.builder().build()
                        )
                        .build()
                )
            )
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            BatchInferenceChatCompletionParams.builder()
                .messagesBatch(
                    listOf(
                        listOf(
                            BatchInferenceChatCompletionParams.MessagesBatch.ofUserMessage(
                                UserMessage.builder()
                                    .content(UserMessage.Content.ofString("string"))
                                    .role(UserMessage.Role.USER)
                                    .build()
                            )
                        )
                    )
                )
                .model("model")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.messagesBatch())
            .isEqualTo(
                listOf(
                    listOf(
                        BatchInferenceChatCompletionParams.MessagesBatch.ofUserMessage(
                            UserMessage.builder()
                                .content(UserMessage.Content.ofString("string"))
                                .role(UserMessage.Role.USER)
                                .build()
                        )
                    )
                )
            )
        assertThat(body.model()).isEqualTo("model")
    }
}
