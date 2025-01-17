// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.llama.llamastack.core.JsonValue
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
                            .content(InterleavedContent.ofString("string"))
                            .role(UserMessage.Role.USER)
                            .context(InterleavedContent.ofString("string"))
                            .build()
                    )
                )
            )
            .modelId("model_id")
            .logprobs(InferenceChatCompletionParams.Logprobs.builder().topK(0L).build())
            .responseFormat(
                InferenceChatCompletionParams.ResponseFormat.ofUnionMember0(
                    InferenceChatCompletionParams.ResponseFormat.UnionMember0.builder()
                        .jsonSchema(
                            InferenceChatCompletionParams.ResponseFormat.UnionMember0.JsonSchema
                                .builder()
                                .putAdditionalProperty("foo", JsonValue.from(true))
                                .build()
                        )
                        .type(
                            InferenceChatCompletionParams.ResponseFormat.UnionMember0.Type
                                .JSON_SCHEMA
                        )
                        .build()
                )
            )
            .samplingParams(
                SamplingParams.builder()
                    .strategy(
                        SamplingParams.Strategy.ofGreedySamplingStrategy(
                            SamplingParams.Strategy.GreedySamplingStrategy.builder()
                                .type(SamplingParams.Strategy.GreedySamplingStrategy.Type.GREEDY)
                                .build()
                        )
                    )
                    .maxTokens(0L)
                    .repetitionPenalty(0.0)
                    .build()
            )
            .toolChoice(InferenceChatCompletionParams.ToolChoice.AUTO)
            .toolPromptFormat(InferenceChatCompletionParams.ToolPromptFormat.JSON)
            .tools(
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
                                    )
                                )
                                .build()
                        )
                        .build()
                )
            )
            .xLlamaStackClientVersion("X-LlamaStack-Client-Version")
            .xLlamaStackProviderData("X-LlamaStack-Provider-Data")
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
                                .content(InterleavedContent.ofString("string"))
                                .role(UserMessage.Role.USER)
                                .context(InterleavedContent.ofString("string"))
                                .build()
                        )
                    )
                )
                .modelId("model_id")
                .logprobs(InferenceChatCompletionParams.Logprobs.builder().topK(0L).build())
                .responseFormat(
                    InferenceChatCompletionParams.ResponseFormat.ofUnionMember0(
                        InferenceChatCompletionParams.ResponseFormat.UnionMember0.builder()
                            .jsonSchema(
                                InferenceChatCompletionParams.ResponseFormat.UnionMember0.JsonSchema
                                    .builder()
                                    .putAdditionalProperty("foo", JsonValue.from(true))
                                    .build()
                            )
                            .type(
                                InferenceChatCompletionParams.ResponseFormat.UnionMember0.Type
                                    .JSON_SCHEMA
                            )
                            .build()
                    )
                )
                .samplingParams(
                    SamplingParams.builder()
                        .strategy(
                            SamplingParams.Strategy.ofGreedySamplingStrategy(
                                SamplingParams.Strategy.GreedySamplingStrategy.builder()
                                    .type(
                                        SamplingParams.Strategy.GreedySamplingStrategy.Type.GREEDY
                                    )
                                    .build()
                            )
                        )
                        .maxTokens(0L)
                        .repetitionPenalty(0.0)
                        .build()
                )
                .toolChoice(InferenceChatCompletionParams.ToolChoice.AUTO)
                .toolPromptFormat(InferenceChatCompletionParams.ToolPromptFormat.JSON)
                .tools(
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
                                        )
                                    )
                                    .build()
                            )
                            .build()
                    )
                )
                .xLlamaStackClientVersion("X-LlamaStack-Client-Version")
                .xLlamaStackProviderData("X-LlamaStack-Provider-Data")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.messages())
            .isEqualTo(
                listOf(
                    InferenceChatCompletionParams.Message.ofUserMessage(
                        UserMessage.builder()
                            .content(InterleavedContent.ofString("string"))
                            .role(UserMessage.Role.USER)
                            .context(InterleavedContent.ofString("string"))
                            .build()
                    )
                )
            )
        assertThat(body.modelId()).isEqualTo("model_id")
        assertThat(body.logprobs())
            .isEqualTo(InferenceChatCompletionParams.Logprobs.builder().topK(0L).build())
        assertThat(body.responseFormat())
            .isEqualTo(
                InferenceChatCompletionParams.ResponseFormat.ofUnionMember0(
                    InferenceChatCompletionParams.ResponseFormat.UnionMember0.builder()
                        .jsonSchema(
                            InferenceChatCompletionParams.ResponseFormat.UnionMember0.JsonSchema
                                .builder()
                                .putAdditionalProperty("foo", JsonValue.from(true))
                                .build()
                        )
                        .type(
                            InferenceChatCompletionParams.ResponseFormat.UnionMember0.Type
                                .JSON_SCHEMA
                        )
                        .build()
                )
            )
        assertThat(body.samplingParams())
            .isEqualTo(
                SamplingParams.builder()
                    .strategy(
                        SamplingParams.Strategy.ofGreedySamplingStrategy(
                            SamplingParams.Strategy.GreedySamplingStrategy.builder()
                                .type(SamplingParams.Strategy.GreedySamplingStrategy.Type.GREEDY)
                                .build()
                        )
                    )
                    .maxTokens(0L)
                    .repetitionPenalty(0.0)
                    .build()
            )
        assertThat(body.toolChoice()).isEqualTo(InferenceChatCompletionParams.ToolChoice.AUTO)
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
                                    )
                                )
                                .build()
                        )
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
                                .content(InterleavedContent.ofString("string"))
                                .role(UserMessage.Role.USER)
                                .build()
                        )
                    )
                )
                .modelId("model_id")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.messages())
            .isEqualTo(
                listOf(
                    InferenceChatCompletionParams.Message.ofUserMessage(
                        UserMessage.builder()
                            .content(InterleavedContent.ofString("string"))
                            .role(UserMessage.Role.USER)
                            .build()
                    )
                )
            )
        assertThat(body.modelId()).isEqualTo("model_id")
    }
}
