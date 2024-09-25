// File generated from our OpenAPI spec by Stainless.

package com.llama_stack_client.api.models

import com.llama_stack_client.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class InferenceCompletionParamsTest {

    @Test
    fun createInferenceCompletionParams() {
        InferenceCompletionParams.builder()
            .content(InferenceCompletionParams.Content.ofString("string"))
            .model("model")
            .logprobs(InferenceCompletionParams.Logprobs.builder().topK(123L).build())
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
            .stream(true)
            .build()
    }

    @Test
    fun getBody() {
        val params =
            InferenceCompletionParams.builder()
                .content(InferenceCompletionParams.Content.ofString("string"))
                .model("model")
                .logprobs(InferenceCompletionParams.Logprobs.builder().topK(123L).build())
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
                .stream(true)
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.content()).isEqualTo(InferenceCompletionParams.Content.ofString("string"))
        assertThat(body.model()).isEqualTo("model")
        assertThat(body.logprobs())
            .isEqualTo(InferenceCompletionParams.Logprobs.builder().topK(123L).build())
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
        assertThat(body.stream()).isEqualTo(true)
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            InferenceCompletionParams.builder()
                .content(InferenceCompletionParams.Content.ofString("string"))
                .model("model")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.content()).isEqualTo(InferenceCompletionParams.Content.ofString("string"))
        assertThat(body.model()).isEqualTo("model")
    }
}
