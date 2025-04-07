// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CompletionResponseTest {

    @Test
    fun create() {
        val completionResponse =
            CompletionResponse.builder()
                .content("content")
                .stopReason(CompletionResponse.StopReason.END_OF_TURN)
                .addLogprob(
                    TokenLogProbs.builder()
                        .logprobsByToken(
                            TokenLogProbs.LogprobsByToken.builder()
                                .putAdditionalProperty("foo", JsonValue.from(0))
                                .build()
                        )
                        .build()
                )
                .addMetric(
                    CompletionResponse.Metric.builder()
                        .metric("metric")
                        .value(0.0)
                        .unit("unit")
                        .build()
                )
                .build()

        assertThat(completionResponse.content()).isEqualTo("content")
        assertThat(completionResponse.stopReason())
            .isEqualTo(CompletionResponse.StopReason.END_OF_TURN)
        assertThat(completionResponse.logprobs())
            .containsExactly(
                TokenLogProbs.builder()
                    .logprobsByToken(
                        TokenLogProbs.LogprobsByToken.builder()
                            .putAdditionalProperty("foo", JsonValue.from(0))
                            .build()
                    )
                    .build()
            )
        assertThat(completionResponse.metrics())
            .containsExactly(
                CompletionResponse.Metric.builder().metric("metric").value(0.0).unit("unit").build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val completionResponse =
            CompletionResponse.builder()
                .content("content")
                .stopReason(CompletionResponse.StopReason.END_OF_TURN)
                .addLogprob(
                    TokenLogProbs.builder()
                        .logprobsByToken(
                            TokenLogProbs.LogprobsByToken.builder()
                                .putAdditionalProperty("foo", JsonValue.from(0))
                                .build()
                        )
                        .build()
                )
                .addMetric(
                    CompletionResponse.Metric.builder()
                        .metric("metric")
                        .value(0.0)
                        .unit("unit")
                        .build()
                )
                .build()

        val roundtrippedCompletionResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(completionResponse),
                jacksonTypeRef<CompletionResponse>(),
            )

        assertThat(roundtrippedCompletionResponse).isEqualTo(completionResponse)
    }
}
