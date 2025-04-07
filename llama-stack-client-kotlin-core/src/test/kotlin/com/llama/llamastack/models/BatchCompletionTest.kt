// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BatchCompletionTest {

    @Test
    fun create() {
        val batchCompletion =
            BatchCompletion.builder()
                .addBatch(
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
                )
                .build()

        assertThat(batchCompletion.batch())
            .containsExactly(
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
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val batchCompletion =
            BatchCompletion.builder()
                .addBatch(
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
                )
                .build()

        val roundtrippedBatchCompletion =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(batchCompletion),
                jacksonTypeRef<BatchCompletion>(),
            )

        assertThat(roundtrippedBatchCompletion).isEqualTo(batchCompletion)
    }
}
