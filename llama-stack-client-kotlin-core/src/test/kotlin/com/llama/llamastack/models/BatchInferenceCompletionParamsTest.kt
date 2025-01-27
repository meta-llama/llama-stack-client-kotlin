// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class BatchInferenceCompletionParamsTest {

    @Test
    fun createBatchInferenceCompletionParams() {
        BatchInferenceCompletionParams.builder()
            .addContentBatch("string")
            .model("model")
            .logprobs(BatchInferenceCompletionParams.Logprobs.builder().topK(0L).build())
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
            BatchInferenceCompletionParams.builder()
                .addContentBatch("string")
                .model("model")
                .logprobs(BatchInferenceCompletionParams.Logprobs.builder().topK(0L).build())
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
        assertThat(body.contentBatch()).isEqualTo(listOf(InterleavedContent.ofString("string")))
        assertThat(body.model()).isEqualTo("model")
        assertThat(body.logprobs())
            .isEqualTo(BatchInferenceCompletionParams.Logprobs.builder().topK(0L).build())
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
            BatchInferenceCompletionParams.builder()
                .addContentBatch("string")
                .model("model")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.contentBatch()).isEqualTo(listOf(InterleavedContent.ofString("string")))
        assertThat(body.model()).isEqualTo("model")
    }
}
