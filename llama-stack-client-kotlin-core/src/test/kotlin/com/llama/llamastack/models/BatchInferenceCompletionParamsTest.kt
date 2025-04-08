// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.llama.llamastack.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BatchInferenceCompletionParamsTest {

    @Test
    fun create() {
        BatchInferenceCompletionParams.builder()
            .addContentBatch("string")
            .model("model")
            .logprobs(BatchInferenceCompletionParams.Logprobs.builder().topK(0L).build())
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
                    .addStop("string")
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            BatchInferenceCompletionParams.builder()
                .addContentBatch("string")
                .model("model")
                .logprobs(BatchInferenceCompletionParams.Logprobs.builder().topK(0L).build())
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
                        .addStop("string")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.contentBatch()).containsExactly(InterleavedContent.ofString("string"))
        assertThat(body.model()).isEqualTo("model")
        assertThat(body.logprobs())
            .isEqualTo(BatchInferenceCompletionParams.Logprobs.builder().topK(0L).build())
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
                    .addStop("string")
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            BatchInferenceCompletionParams.builder()
                .addContentBatch("string")
                .model("model")
                .build()

        val body = params._body()

        assertThat(body.contentBatch()).containsExactly(InterleavedContent.ofString("string"))
        assertThat(body.model()).isEqualTo("model")
    }
}
