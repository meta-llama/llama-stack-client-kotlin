// File generated from our OpenAPI spec by Stainless.

package com.llama_stack_client.api.models

import com.llama_stack_client.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class InferenceChatCompletionParamsTest {

    @Test
    fun createInferenceChatCompletionParams() {
        InferenceChatCompletionParams.builder()
            .messages(
                listOf(
                    InferenceChatCompletionParams.Message.ofUserMessage(
                        UserMessage.builder()
                            .content(UserMessage.Content.ofString("string"))
                            .role(UserMessage.Role.USER)
                            .context(UserMessage.Context.ofString("string"))
                            .build()
                    )
                )
            )
            .model("model")
            .logprobs(InferenceChatCompletionParams.Logprobs.builder().topK(123L).build())
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
            .stream(true)
            .toolChoice(InferenceChatCompletionParams.ToolChoice.AUTO)
            .toolPromptFormat(InferenceChatCompletionParams.ToolPromptFormat.JSON)
            .tools(
                listOf(
                    InferenceChatCompletionParams.Tool.builder()
                        .toolName(
                            InferenceChatCompletionParams.Tool.ToolName.ofBuiltinTool(
                                InferenceChatCompletionParams.Tool.ToolName.BuiltinTool.BRAVE_SEARCH
                            )
                        )
                        .description("description")
                        .parameters(InferenceChatCompletionParams.Tool.Parameters.builder().build())
                        .build()
                )
            )
            .build()
    }

    @Test
    fun getBody() {
        val params =
            InferenceChatCompletionParams.builder()
                .messages(
                    listOf(
                        InferenceChatCompletionParams.Message.ofUserMessage(
                            UserMessage.builder()
                                .content(UserMessage.Content.ofString("string"))
                                .role(UserMessage.Role.USER)
                                .context(UserMessage.Context.ofString("string"))
                                .build()
                        )
                    )
                )
                .model("model")
                .logprobs(InferenceChatCompletionParams.Logprobs.builder().topK(123L).build())
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
                .stream(true)
                .toolChoice(InferenceChatCompletionParams.ToolChoice.AUTO)
                .toolPromptFormat(InferenceChatCompletionParams.ToolPromptFormat.JSON)
                .tools(
                    listOf(
                        InferenceChatCompletionParams.Tool.builder()
                            .toolName(
                                InferenceChatCompletionParams.Tool.ToolName.ofBuiltinTool(
                                    InferenceChatCompletionParams.Tool.ToolName.BuiltinTool
                                        .BRAVE_SEARCH
                                )
                            )
                            .description("description")
                            .parameters(
                                InferenceChatCompletionParams.Tool.Parameters.builder().build()
                            )
                            .build()
                    )
                )
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.messages())
            .isEqualTo(
                listOf(
                    InferenceChatCompletionParams.Message.ofUserMessage(
                        UserMessage.builder()
                            .content(UserMessage.Content.ofString("string"))
                            .role(UserMessage.Role.USER)
                            .context(UserMessage.Context.ofString("string"))
                            .build()
                    )
                )
            )
        assertThat(body.model()).isEqualTo("model")
        assertThat(body.logprobs())
            .isEqualTo(InferenceChatCompletionParams.Logprobs.builder().topK(123L).build())
        assertThat(body.samplingParams())
            .isEqualTo(
                SamplingParams.builder()
                    .strategy(SamplingParams.Strategy.GREEDY)
                    .maxTokens(123L)
                    .repetitionPenalty(42.23)
                    .temperature(42.23)
                    .topK(123L)
                    .topP(42.23)
                    .build()
            )
        assertThat(body.stream()).isEqualTo(true)
        assertThat(body.toolChoice()).isEqualTo(InferenceChatCompletionParams.ToolChoice.AUTO)
        assertThat(body.toolPromptFormat())
            .isEqualTo(InferenceChatCompletionParams.ToolPromptFormat.JSON)
        assertThat(body.tools())
            .isEqualTo(
                listOf(
                    InferenceChatCompletionParams.Tool.builder()
                        .toolName(
                            InferenceChatCompletionParams.Tool.ToolName.ofBuiltinTool(
                                InferenceChatCompletionParams.Tool.ToolName.BuiltinTool.BRAVE_SEARCH
                            )
                        )
                        .description("description")
                        .parameters(InferenceChatCompletionParams.Tool.Parameters.builder().build())
                        .build()
                )
            )
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            InferenceChatCompletionParams.builder()
                .messages(
                    listOf(
                        InferenceChatCompletionParams.Message.ofUserMessage(
                            UserMessage.builder()
                                .content(UserMessage.Content.ofString("string"))
                                .role(UserMessage.Role.USER)
                                .build()
                        )
                    )
                )
                .model("model")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.messages())
            .isEqualTo(
                listOf(
                    InferenceChatCompletionParams.Message.ofUserMessage(
                        UserMessage.builder()
                            .content(UserMessage.Content.ofString("string"))
                            .role(UserMessage.Role.USER)
                            .build()
                    )
                )
            )
        assertThat(body.model()).isEqualTo("model")
    }
}
