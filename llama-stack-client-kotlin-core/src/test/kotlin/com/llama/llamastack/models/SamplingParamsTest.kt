// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SamplingParamsTest {

    @Test
    fun createSamplingParams() {
        val samplingParams =
            SamplingParams.builder()
                .strategy(SamplingParams.Strategy.GREEDY)
                .maxTokens(123L)
                .repetitionPenalty(42.23)
                .temperature(42.23)
                .topK(123L)
                .topP(42.23)
                .build()
        assertThat(samplingParams).isNotNull
        assertThat(samplingParams.strategy()).isEqualTo(SamplingParams.Strategy.GREEDY)
        assertThat(samplingParams.maxTokens()).isEqualTo(123L)
        assertThat(samplingParams.repetitionPenalty()).isEqualTo(42.23)
        assertThat(samplingParams.temperature()).isEqualTo(42.23)
        assertThat(samplingParams.topK()).isEqualTo(123L)
        assertThat(samplingParams.topP()).isEqualTo(42.23)
    }
}
