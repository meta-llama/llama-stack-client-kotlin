// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SamplingParamsTest {

    @Test
    fun createSamplingParams() {
        val samplingParams =
            SamplingParams.builder()
                .strategy(
                    SamplingParams.Strategy.GreedySamplingStrategy.builder()
                        .type(SamplingParams.Strategy.GreedySamplingStrategy.Type.GREEDY)
                        .build()
                )
                .maxTokens(0L)
                .repetitionPenalty(0.0)
                .build()
        assertThat(samplingParams).isNotNull
        assertThat(samplingParams.strategy())
            .isEqualTo(
                SamplingParams.Strategy.ofGreedySamplingStrategy(
                    SamplingParams.Strategy.GreedySamplingStrategy.builder()
                        .type(SamplingParams.Strategy.GreedySamplingStrategy.Type.GREEDY)
                        .build()
                )
            )
        assertThat(samplingParams.maxTokens()).isEqualTo(0L)
        assertThat(samplingParams.repetitionPenalty()).isEqualTo(0.0)
    }
}
