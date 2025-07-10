// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.llama.llamastack.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InferenceBatchCompletionParamsTest {

    @Test
    fun create() {
        InferenceBatchCompletionParams.builder()
            .addContentBatch("string")
            .modelId("model_id")
            .logprobs(InferenceBatchCompletionParams.Logprobs.builder().topK(0L).build())
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
            .build()
    }

    @Test
    fun body() {
        val params =
            InferenceBatchCompletionParams.builder()
                .addContentBatch("string")
                .modelId("model_id")
                .logprobs(InferenceBatchCompletionParams.Logprobs.builder().topK(0L).build())
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
                .build()

        val body = params._body()

        assertThat(body.contentBatch()).containsExactly(InterleavedContent.ofString("string"))
        assertThat(body.modelId()).isEqualTo("model_id")
        assertThat(body.logprobs())
            .isEqualTo(InferenceBatchCompletionParams.Logprobs.builder().topK(0L).build())
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
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            InferenceBatchCompletionParams.builder()
                .addContentBatch("string")
                .modelId("model_id")
                .build()

        val body = params._body()

        assertThat(body.contentBatch()).containsExactly(InterleavedContent.ofString("string"))
        assertThat(body.modelId()).isEqualTo("model_id")
    }
}
