// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.llama.llamastack.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class InferenceChatCompletionParamsTest {

    @Test
    fun create() {
        InferenceChatCompletionParams.builder()
            .addMessage(UserMessage.builder().content("string").context("string").build())
            .modelId("model_id")
            .logprobs(InferenceChatCompletionParams.Logprobs.builder().topK(0L).build())
            .jsonSchemaResponseFormat(
                ResponseFormat.JsonSchemaResponseFormat.JsonSchema.builder()
                    .putAdditionalProperty("foo", JsonValue.from(true))
                    .build()
            )
            .samplingParams(
                SamplingParams.builder()
                    .strategyGreedySampling()
                    .maxTokens(0L)
                    .repetitionPenalty(0.0)
                    .build()
            )
            .toolChoice(InferenceChatCompletionParams.ToolChoice.AUTO)
            .toolConfig(
                InferenceChatCompletionParams.ToolConfig.builder()
                    .systemMessageBehavior(
                        InferenceChatCompletionParams.ToolConfig.SystemMessageBehavior.APPEND
                    )
                    .toolChoice(InferenceChatCompletionParams.ToolConfig.ToolChoice.AUTO)
                    .toolPromptFormat(
                        InferenceChatCompletionParams.ToolConfig.ToolPromptFormat.JSON
                    )
                    .build()
            )
            .toolPromptFormat(InferenceChatCompletionParams.ToolPromptFormat.JSON)
            .addTool(
                InferenceChatCompletionParams.Tool.builder()
                    .toolName(InferenceChatCompletionParams.Tool.ToolName.BRAVE_SEARCH)
                    .description("description")
                    .parameters(
                        InferenceChatCompletionParams.Tool.Parameters.builder()
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
            InferenceChatCompletionParams.builder()
                .addMessage(UserMessage.builder().content("string").context("string").build())
                .modelId("model_id")
                .logprobs(InferenceChatCompletionParams.Logprobs.builder().topK(0L).build())
                .jsonSchemaResponseFormat(
                    ResponseFormat.JsonSchemaResponseFormat.JsonSchema.builder()
                        .putAdditionalProperty("foo", JsonValue.from(true))
                        .build()
                )
                .samplingParams(
                    SamplingParams.builder()
                        .strategyGreedySampling()
                        .maxTokens(0L)
                        .repetitionPenalty(0.0)
                        .build()
                )
                .toolChoice(InferenceChatCompletionParams.ToolChoice.AUTO)
                .toolConfig(
                    InferenceChatCompletionParams.ToolConfig.builder()
                        .systemMessageBehavior(
                            InferenceChatCompletionParams.ToolConfig.SystemMessageBehavior.APPEND
                        )
                        .toolChoice(InferenceChatCompletionParams.ToolConfig.ToolChoice.AUTO)
                        .toolPromptFormat(
                            InferenceChatCompletionParams.ToolConfig.ToolPromptFormat.JSON
                        )
                        .build()
                )
                .toolPromptFormat(InferenceChatCompletionParams.ToolPromptFormat.JSON)
                .addTool(
                    InferenceChatCompletionParams.Tool.builder()
                        .toolName(InferenceChatCompletionParams.Tool.ToolName.BRAVE_SEARCH)
                        .description("description")
                        .parameters(
                            InferenceChatCompletionParams.Tool.Parameters.builder()
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

        assertThat(body).isNotNull
        assertThat(body.messages())
            .isEqualTo(
                listOf(
                    Message.ofUser(
                        UserMessage.builder().content("string").context("string").build()
                    )
                )
            )
        assertThat(body.modelId()).isEqualTo("model_id")
        assertThat(body.logprobs())
            .isEqualTo(InferenceChatCompletionParams.Logprobs.builder().topK(0L).build())
        assertThat(body.responseFormat())
            .isEqualTo(
                ResponseFormat.ofJsonSchema(
                    ResponseFormat.JsonSchemaResponseFormat.builder()
                        .jsonSchema(
                            ResponseFormat.JsonSchemaResponseFormat.JsonSchema.builder()
                                .putAdditionalProperty("foo", JsonValue.from(true))
                                .build()
                        )
                        .build()
                )
            )
        assertThat(body.samplingParams())
            .isEqualTo(
                SamplingParams.builder()
                    .strategyGreedySampling()
                    .maxTokens(0L)
                    .repetitionPenalty(0.0)
                    .build()
            )
        assertThat(body.toolChoice()).isEqualTo(InferenceChatCompletionParams.ToolChoice.AUTO)
        assertThat(body.toolConfig())
            .isEqualTo(
                InferenceChatCompletionParams.ToolConfig.builder()
                    .systemMessageBehavior(
                        InferenceChatCompletionParams.ToolConfig.SystemMessageBehavior.APPEND
                    )
                    .toolChoice(InferenceChatCompletionParams.ToolConfig.ToolChoice.AUTO)
                    .toolPromptFormat(
                        InferenceChatCompletionParams.ToolConfig.ToolPromptFormat.JSON
                    )
                    .build()
            )
        assertThat(body.toolPromptFormat())
            .isEqualTo(InferenceChatCompletionParams.ToolPromptFormat.JSON)
        assertThat(body.tools())
            .isEqualTo(
                listOf(
                    InferenceChatCompletionParams.Tool.builder()
                        .toolName(InferenceChatCompletionParams.Tool.ToolName.BRAVE_SEARCH)
                        .description("description")
                        .parameters(
                            InferenceChatCompletionParams.Tool.Parameters.builder()
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
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            InferenceChatCompletionParams.builder()
                .addUserMessage("string")
                .modelId("model_id")
                .build()

        val body = params._body()

        assertThat(body).isNotNull
        assertThat(body.messages())
            .isEqualTo(listOf(Message.ofUser(UserMessage.builder().content("string").build())))
        assertThat(body.modelId()).isEqualTo("model_id")
    }
}
