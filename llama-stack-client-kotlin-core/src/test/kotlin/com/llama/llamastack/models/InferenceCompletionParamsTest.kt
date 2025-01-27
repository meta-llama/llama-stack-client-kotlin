// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.llama.llamastack.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class InferenceCompletionParamsTest {

    @Test
    fun createInferenceCompletionParams() {
        InferenceCompletionParams.builder()
            .content("string")
            .modelId("model_id")
            .logprobs(InferenceCompletionParams.Logprobs.builder().topK(0L).build())
            .responseFormat(
                ResponseFormat.JsonSchemaResponseFormat.builder()
                    .jsonSchema(
                        ResponseFormat.JsonSchemaResponseFormat.JsonSchema.builder()
                            .putAdditionalProperty("foo", JsonValue.from(true))
                            .build()
                    )
                    .build()
            )
            .samplingParams(
                SamplingParams.builder()
                    .strategyGreedySampling()
                    .maxTokens(0L)
                    .repetitionPenalty(0.0)
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
                .content("string")
                .modelId("model_id")
                .logprobs(InferenceCompletionParams.Logprobs.builder().topK(0L).build())
                .responseFormat(
                    ResponseFormat.JsonSchemaResponseFormat.builder()
                        .jsonSchema(
                            ResponseFormat.JsonSchemaResponseFormat.JsonSchema.builder()
                                .putAdditionalProperty("foo", JsonValue.from(true))
                                .build()
                        )
                        .build()
                )
                .samplingParams(
                    SamplingParams.builder()
                        .strategyGreedySampling()
                        .maxTokens(0L)
                        .repetitionPenalty(0.0)
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
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            InferenceCompletionParams.builder().content("string").modelId("model_id").build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.content()).isEqualTo(InterleavedContent.ofString("string"))
        assertThat(body.modelId()).isEqualTo("model_id")
    }
}
