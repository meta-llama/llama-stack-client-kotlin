// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.llama.llamastack.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class InferenceCompletionParamsTest {

    @Test
    fun createInferenceCompletionParams() {
        InferenceCompletionParams.builder()
            .content(InterleavedContent.ofString("string"))
            .modelId("model_id")
            .logprobs(InferenceCompletionParams.Logprobs.builder().topK(0L).build())
            .responseFormat(
                InferenceCompletionParams.ResponseFormat.ofUnionMember0(
                    InferenceCompletionParams.ResponseFormat.UnionMember0.builder()
                        .jsonSchema(
                            InferenceCompletionParams.ResponseFormat.UnionMember0.JsonSchema
                                .builder()
                                .putAdditionalProperty("foo", JsonValue.from(true))
                                .build()
                        )
                        .type(
                            InferenceCompletionParams.ResponseFormat.UnionMember0.Type.JSON_SCHEMA
                        )
                        .build()
                )
            )
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
            .xLlamaStackClientVersion("X-LlamaStack-Client-Version")
            .xLlamaStackProviderData("X-LlamaStack-Provider-Data")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            InferenceCompletionParams.builder()
                .content(InterleavedContent.ofString("string"))
                .modelId("model_id")
                .logprobs(InferenceCompletionParams.Logprobs.builder().topK(0L).build())
                .responseFormat(
                    InferenceCompletionParams.ResponseFormat.ofUnionMember0(
                        InferenceCompletionParams.ResponseFormat.UnionMember0.builder()
                            .jsonSchema(
                                InferenceCompletionParams.ResponseFormat.UnionMember0.JsonSchema
                                    .builder()
                                    .putAdditionalProperty("foo", JsonValue.from(true))
                                    .build()
                            )
                            .type(
                                InferenceCompletionParams.ResponseFormat.UnionMember0.Type
                                    .JSON_SCHEMA
                            )
                            .build()
                    )
                )
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
                .xLlamaStackClientVersion("X-LlamaStack-Client-Version")
                .xLlamaStackProviderData("X-LlamaStack-Provider-Data")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.content()).isEqualTo(InterleavedContent.ofString("string"))
        assertThat(body.modelId()).isEqualTo("model_id")
        assertThat(body.logprobs())
            .isEqualTo(InferenceCompletionParams.Logprobs.builder().topK(0L).build())
        assertThat(body.responseFormat())
            .isEqualTo(
                InferenceCompletionParams.ResponseFormat.ofUnionMember0(
                    InferenceCompletionParams.ResponseFormat.UnionMember0.builder()
                        .jsonSchema(
                            InferenceCompletionParams.ResponseFormat.UnionMember0.JsonSchema
                                .builder()
                                .putAdditionalProperty("foo", JsonValue.from(true))
                                .build()
                        )
                        .type(
                            InferenceCompletionParams.ResponseFormat.UnionMember0.Type.JSON_SCHEMA
                        )
                        .build()
                )
            )
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
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            InferenceCompletionParams.builder()
                .content(InterleavedContent.ofString("string"))
                .modelId("model_id")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.content()).isEqualTo(InterleavedContent.ofString("string"))
        assertThat(body.modelId()).isEqualTo("model_id")
    }
}
