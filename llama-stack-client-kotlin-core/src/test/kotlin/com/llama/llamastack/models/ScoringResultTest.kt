// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.llama.llamastack.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ScoringResultTest {

    @Test
    fun createScoringResult() {
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
        assertThat(scoringResult).isNotNull
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
}
