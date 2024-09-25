// File generated from our OpenAPI spec by Stainless.

package com.llama_stack_client.api.models

import com.llama_stack_client.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class BatchInferenceCompletionParamsTest {

    @Test
    fun createBatchInferenceCompletionParams() {
        BatchInferenceCompletionParams.builder()
            .contentBatch(listOf(BatchInferenceCompletionParams.ContentBatch.ofString("string")))
            .model("model")
            .logprobs(BatchInferenceCompletionParams.Logprobs.builder().topK(123L).build())
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
            .build()
    }

    @Test
    fun getBody() {
        val params =
            BatchInferenceCompletionParams.builder()
                .contentBatch(
                    listOf(BatchInferenceCompletionParams.ContentBatch.ofString("string"))
                )
                .model("model")
                .logprobs(BatchInferenceCompletionParams.Logprobs.builder().topK(123L).build())
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
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.contentBatch())
            .isEqualTo(listOf(BatchInferenceCompletionParams.ContentBatch.ofString("string")))
        assertThat(body.model()).isEqualTo("model")
        assertThat(body.logprobs())
            .isEqualTo(BatchInferenceCompletionParams.Logprobs.builder().topK(123L).build())
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
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            BatchInferenceCompletionParams.builder()
                .contentBatch(
                    listOf(BatchInferenceCompletionParams.ContentBatch.ofString("string"))
                )
                .model("model")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.contentBatch())
            .isEqualTo(listOf(BatchInferenceCompletionParams.ContentBatch.ofString("string")))
        assertThat(body.model()).isEqualTo("model")
    }
}
