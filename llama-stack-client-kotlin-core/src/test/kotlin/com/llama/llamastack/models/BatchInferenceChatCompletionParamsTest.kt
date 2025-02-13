// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.llama.llamastack.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class BatchInferenceChatCompletionParamsTest {

    @Test
    fun create() {
        BatchInferenceChatCompletionParams.builder()
            .addMessagesBatch(
                listOf(
                    Message.ofUser(
                        UserMessage.builder().content("string").context("string").build()
                    )
                )
            )
            .model("model")
            .logprobs(BatchInferenceChatCompletionParams.Logprobs.builder().topK(0L).build())
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
            .toolChoice(BatchInferenceChatCompletionParams.ToolChoice.AUTO)
            .toolPromptFormat(BatchInferenceChatCompletionParams.ToolPromptFormat.JSON)
            .addTool(
                BatchInferenceChatCompletionParams.Tool.builder()
                    .toolName(BatchInferenceChatCompletionParams.Tool.ToolName.BRAVE_SEARCH)
                    .description("description")
                    .parameters(
                        BatchInferenceChatCompletionParams.Tool.Parameters.builder()
                            .putAdditionalProperty(
                                "foo",
                                JsonValue.from(
                                    mapOf(
                                        "param_type" to "param_type",
                                        "default" to true,
                                        "description" to "description",
                                        "required" to true,
                                    )
                                )
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
            BatchInferenceChatCompletionParams.builder()
                .addMessagesBatch(
                    listOf(
                        Message.ofUser(
                            UserMessage.builder().content("string").context("string").build()
                        )
                    )
                )
                .model("model")
                .logprobs(BatchInferenceChatCompletionParams.Logprobs.builder().topK(0L).build())
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
                .toolChoice(BatchInferenceChatCompletionParams.ToolChoice.AUTO)
                .toolPromptFormat(BatchInferenceChatCompletionParams.ToolPromptFormat.JSON)
                .addTool(
                    BatchInferenceChatCompletionParams.Tool.builder()
                        .toolName(BatchInferenceChatCompletionParams.Tool.ToolName.BRAVE_SEARCH)
                        .description("description")
                        .parameters(
                            BatchInferenceChatCompletionParams.Tool.Parameters.builder()
                                .putAdditionalProperty(
                                    "foo",
                                    JsonValue.from(
                                        mapOf(
                                            "param_type" to "param_type",
                                            "default" to true,
                                            "description" to "description",
                                            "required" to true,
                                        )
                                    )
                                )
                                .build()
                        )
                        .build()
                )
                .build()
        val body = params._body()
        assertThat(body).isNotNull
        assertThat(body.messagesBatch())
            .isEqualTo(
                listOf(
                    listOf(
                        Message.ofUser(
                            UserMessage.builder().content("string").context("string").build()
                        )
                    )
                )
            )
        assertThat(body.model()).isEqualTo("model")
        assertThat(body.logprobs())
            .isEqualTo(BatchInferenceChatCompletionParams.Logprobs.builder().topK(0L).build())
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
                            BatchInferenceChatCompletionParams.Tool.Parameters.builder()
                                .putAdditionalProperty(
                                    "foo",
                                    JsonValue.from(
                                        mapOf(
                                            "param_type" to "param_type",
                                            "default" to true,
                                            "description" to "description",
                                            "required" to true,
                                        )
                                    )
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
            BatchInferenceChatCompletionParams.builder()
                .addMessagesBatch(
                    listOf(Message.ofUser(UserMessage.builder().content("string").build()))
                )
                .model("model")
                .build()
        val body = params._body()
        assertThat(body).isNotNull
        assertThat(body.messagesBatch())
            .isEqualTo(
                listOf(listOf(Message.ofUser(UserMessage.builder().content("string").build())))
            )
        assertThat(body.model()).isEqualTo("model")
    }
}
