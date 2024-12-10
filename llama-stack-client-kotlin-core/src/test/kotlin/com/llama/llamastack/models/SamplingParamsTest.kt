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
                .maxTokens(0L)
                .repetitionPenalty(0.0)
                .temperature(0.0)
                .topK(0L)
                .topP(0.0)
                .build()
        assertThat(samplingParams).isNotNull
        assertThat(samplingParams.strategy()).isEqualTo(SamplingParams.Strategy.GREEDY)
        assertThat(samplingParams.maxTokens()).isEqualTo(0L)
        assertThat(samplingParams.repetitionPenalty()).isEqualTo(0.0)
        assertThat(samplingParams.temperature()).isEqualTo(0.0)
        assertThat(samplingParams.topK()).isEqualTo(0L)
        assertThat(samplingParams.topP()).isEqualTo(0.0)
    }
}
