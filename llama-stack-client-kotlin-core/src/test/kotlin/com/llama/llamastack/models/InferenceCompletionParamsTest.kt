// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.llama.llamastack.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class InferenceCompletionParamsTest {

    @Test
    fun createInferenceCompletionParams() {
        InferenceCompletionParams.builder()
            .content(InferenceCompletionParams.Content.ofString("string"))
            .modelId("model_id")
            .logprobs(InferenceCompletionParams.Logprobs.builder().topK(0L).build())
            .responseFormat(
                InferenceCompletionParams.ResponseFormat.ofJsonSchemaFormat(
                    InferenceCompletionParams.ResponseFormat.JsonSchemaFormat.builder()
                        .jsonSchema(
                            InferenceCompletionParams.ResponseFormat.JsonSchemaFormat.JsonSchema
                                .builder()
                                .build()
                        )
                        .type(
                            InferenceCompletionParams.ResponseFormat.JsonSchemaFormat.Type
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
            .xLlamaStackProviderData("X-LlamaStack-ProviderData")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            InferenceCompletionParams.builder()
                .content(InferenceCompletionParams.Content.ofString("string"))
                .modelId("model_id")
                .logprobs(InferenceCompletionParams.Logprobs.builder().topK(0L).build())
                .responseFormat(
                    InferenceCompletionParams.ResponseFormat.ofJsonSchemaFormat(
                        InferenceCompletionParams.ResponseFormat.JsonSchemaFormat.builder()
                            .jsonSchema(
                                InferenceCompletionParams.ResponseFormat.JsonSchemaFormat.JsonSchema
                                    .builder()
                                    .build()
                            )
                            .type(
                                InferenceCompletionParams.ResponseFormat.JsonSchemaFormat.Type
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
                .xLlamaStackProviderData("X-LlamaStack-ProviderData")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.content()).isEqualTo(InferenceCompletionParams.Content.ofString("string"))
        assertThat(body.modelId()).isEqualTo("model_id")
        assertThat(body.logprobs())
            .isEqualTo(InferenceCompletionParams.Logprobs.builder().topK(0L).build())
        assertThat(body.responseFormat())
            .isEqualTo(
                InferenceCompletionParams.ResponseFormat.ofJsonSchemaFormat(
                    InferenceCompletionParams.ResponseFormat.JsonSchemaFormat.builder()
                        .jsonSchema(
                            InferenceCompletionParams.ResponseFormat.JsonSchemaFormat.JsonSchema
                                .builder()
                                .build()
                        )
                        .type(
                            InferenceCompletionParams.ResponseFormat.JsonSchemaFormat.Type
                                .JSON_SCHEMA
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
                .content(InferenceCompletionParams.Content.ofString("string"))
                .modelId("model_id")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.content()).isEqualTo(InferenceCompletionParams.Content.ofString("string"))
        assertThat(body.modelId()).isEqualTo("model_id")
    }
}
