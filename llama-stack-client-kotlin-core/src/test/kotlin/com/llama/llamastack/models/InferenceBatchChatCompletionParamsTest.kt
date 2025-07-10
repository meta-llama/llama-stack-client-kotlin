// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.llama.llamastack.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InferenceBatchChatCompletionParamsTest {

    @Test
    fun create() {
        InferenceBatchChatCompletionParams.builder()
            .addMessagesBatch(
                listOf(
                    Message.ofUser(
                        UserMessage.builder().content("string").context("string").build()
                    )
                )
            )
            .modelId("model_id")
            .logprobs(InferenceBatchChatCompletionParams.Logprobs.builder().topK(0L).build())
            .jsonSchemaResponseFormat(
                ResponseFormat.JsonSchema.InnerJsonSchema.builder()
                    .putAdditionalProperty("foo", JsonValue.from(true))
                    .build()
            )
            .samplingParams(
                SamplingParams.builder()
                    .strategyGreedy()
                    .maxTokens(0L)
                    .repetitionPenalty(0.0)
                    .addStop("string")
                    .build()
            )
            .toolConfig(
                InferenceBatchChatCompletionParams.ToolConfig.builder()
                    .systemMessageBehavior(
                        InferenceBatchChatCompletionParams.ToolConfig.SystemMessageBehavior.APPEND
                    )
                    .toolChoice(InferenceBatchChatCompletionParams.ToolConfig.ToolChoice.AUTO)
                    .toolPromptFormat(
                        InferenceBatchChatCompletionParams.ToolConfig.ToolPromptFormat.JSON
                    )
                    .build()
            )
            .addTool(
                InferenceBatchChatCompletionParams.Tool.builder()
                    .toolName(InferenceBatchChatCompletionParams.Tool.ToolName.BRAVE_SEARCH)
                    .description("description")
                    .parameters(
                        InferenceBatchChatCompletionParams.Tool.Parameters.builder()
                            .putAdditionalProperty(
                                "foo",
                                JsonValue.from(
                                    mapOf(
                                        "param_type" to "param_type",
                                        "default" to true,
                                        "description" to "description",
                                        "required" to true,
                                    )
                                ),
                            )
                            .build()
                    )
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            InferenceBatchChatCompletionParams.builder()
                .addMessagesBatch(
                    listOf(
                        Message.ofUser(
                            UserMessage.builder().content("string").context("string").build()
                        )
                    )
                )
                .modelId("model_id")
                .logprobs(InferenceBatchChatCompletionParams.Logprobs.builder().topK(0L).build())
                .jsonSchemaResponseFormat(
                    ResponseFormat.JsonSchema.InnerJsonSchema.builder()
                        .putAdditionalProperty("foo", JsonValue.from(true))
                        .build()
                )
                .samplingParams(
                    SamplingParams.builder()
                        .strategyGreedy()
                        .maxTokens(0L)
                        .repetitionPenalty(0.0)
                        .addStop("string")
                        .build()
                )
                .toolConfig(
                    InferenceBatchChatCompletionParams.ToolConfig.builder()
                        .systemMessageBehavior(
                            InferenceBatchChatCompletionParams.ToolConfig.SystemMessageBehavior
                                .APPEND
                        )
                        .toolChoice(InferenceBatchChatCompletionParams.ToolConfig.ToolChoice.AUTO)
                        .toolPromptFormat(
                            InferenceBatchChatCompletionParams.ToolConfig.ToolPromptFormat.JSON
                        )
                        .build()
                )
                .addTool(
                    InferenceBatchChatCompletionParams.Tool.builder()
                        .toolName(InferenceBatchChatCompletionParams.Tool.ToolName.BRAVE_SEARCH)
                        .description("description")
                        .parameters(
                            InferenceBatchChatCompletionParams.Tool.Parameters.builder()
                                .putAdditionalProperty(
                                    "foo",
                                    JsonValue.from(
                                        mapOf(
                                            "param_type" to "param_type",
                                            "default" to true,
                                            "description" to "description",
                                            "required" to true,
                                        )
                                    ),
                                )
                                .build()
                        )
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.messagesBatch())
            .containsExactly(
                listOf(
                    Message.ofUser(
                        UserMessage.builder().content("string").context("string").build()
                    )
                )
            )
        assertThat(body.modelId()).isEqualTo("model_id")
        assertThat(body.logprobs())
            .isEqualTo(InferenceBatchChatCompletionParams.Logprobs.builder().topK(0L).build())
        assertThat(body.responseFormat())
            .isEqualTo(
                ResponseFormat.ofJsonSchema(
                    ResponseFormat.JsonSchema.builder()
                        .jsonSchema(
                            ResponseFormat.JsonSchema.InnerJsonSchema.builder()
                                .putAdditionalProperty("foo", JsonValue.from(true))
                                .build()
                        )
                        .build()
                )
            )
        assertThat(body.samplingParams())
            .isEqualTo(
                SamplingParams.builder()
                    .strategyGreedy()
                    .maxTokens(0L)
                    .repetitionPenalty(0.0)
                    .addStop("string")
                    .build()
            )
        assertThat(body.toolConfig())
            .isEqualTo(
                InferenceBatchChatCompletionParams.ToolConfig.builder()
                    .systemMessageBehavior(
                        InferenceBatchChatCompletionParams.ToolConfig.SystemMessageBehavior.APPEND
                    )
                    .toolChoice(InferenceBatchChatCompletionParams.ToolConfig.ToolChoice.AUTO)
                    .toolPromptFormat(
                        InferenceBatchChatCompletionParams.ToolConfig.ToolPromptFormat.JSON
                    )
                    .build()
            )
        assertThat(body.tools())
            .containsExactly(
                InferenceBatchChatCompletionParams.Tool.builder()
                    .toolName(InferenceBatchChatCompletionParams.Tool.ToolName.BRAVE_SEARCH)
                    .description("description")
                    .parameters(
                        InferenceBatchChatCompletionParams.Tool.Parameters.builder()
                            .putAdditionalProperty(
                                "foo",
                                JsonValue.from(
                                    mapOf(
                                        "param_type" to "param_type",
                                        "default" to true,
                                        "description" to "description",
                                        "required" to true,
                                    )
                                ),
                            )
                            .build()
                    )
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            InferenceBatchChatCompletionParams.builder()
                .addMessagesBatch(
                    listOf(Message.ofUser(UserMessage.builder().content("string").build()))
                )
                .modelId("model_id")
                .build()

        val body = params._body()

        assertThat(body.messagesBatch())
            .containsExactly(
                listOf(Message.ofUser(UserMessage.builder().content("string").build()))
            )
        assertThat(body.modelId()).isEqualTo("model_id")
    }
}
