// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ScoringResultTest {

    @Test
    fun create() {
        val scoringResult =
            ScoringResult.builder()
                .aggregatedResults(
                    ScoringResult.AggregatedResults.builder()
                        .putAdditionalProperty("foo", JsonValue.from(true))
                        .build()
                )
                .addScoreRow(
                    ScoringResult.ScoreRow.builder()
                        .putAdditionalProperty("foo", JsonValue.from(true))
                        .build()
                )
                .build()

        assertThat(scoringResult.aggregatedResults())
            .isEqualTo(
                ScoringResult.AggregatedResults.builder()
                    .putAdditionalProperty("foo", JsonValue.from(true))
                    .build()
            )
        assertThat(scoringResult.scoreRows())
            .containsExactly(
                ScoringResult.ScoreRow.builder()
                    .putAdditionalProperty("foo", JsonValue.from(true))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val scoringResult =
            ScoringResult.builder()
                .aggregatedResults(
                    ScoringResult.AggregatedResults.builder()
                        .putAdditionalProperty("foo", JsonValue.from(true))
                        .build()
                )
                .addScoreRow(
                    ScoringResult.ScoreRow.builder()
                        .putAdditionalProperty("foo", JsonValue.from(true))
                        .build()
                )
                .build()

        val roundtrippedScoringResult =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(scoringResult),
                jacksonTypeRef<ScoringResult>(),
            )

        assertThat(roundtrippedScoringResult).isEqualTo(scoringResult)
    }
}
