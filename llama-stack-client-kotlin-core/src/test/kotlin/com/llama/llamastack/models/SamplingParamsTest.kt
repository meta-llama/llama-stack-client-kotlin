// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llama.llamastack.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SamplingParamsTest {

    @Test
    fun create() {
        val samplingParams =
            SamplingParams.builder()
                .strategyGreedy()
                .maxTokens(0L)
                .repetitionPenalty(0.0)
                .addStop("string")
                .build()

        assertThat(samplingParams.strategy()).isEqualTo(SamplingParams.Strategy.ofGreedy())
        assertThat(samplingParams.maxTokens()).isEqualTo(0L)
        assertThat(samplingParams.repetitionPenalty()).isEqualTo(0.0)
        assertThat(samplingParams.stop()).containsExactly("string")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val samplingParams =
            SamplingParams.builder()
                .strategyGreedy()
                .maxTokens(0L)
                .repetitionPenalty(0.0)
                .addStop("string")
                .build()

        val roundtrippedSamplingParams =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(samplingParams),
                jacksonTypeRef<SamplingParams>(),
            )

        assertThat(roundtrippedSamplingParams).isEqualTo(samplingParams)
    }
}
