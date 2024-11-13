// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ScoringResultTest {

    @Test
    fun createScoringResult() {
        val scoringResult =
            ScoringResult.builder()
                .aggregatedResults(ScoringResult.AggregatedResults.builder().build())
                .scoreRows(listOf(ScoringResult.ScoreRow.builder().build()))
                .build()
        assertThat(scoringResult).isNotNull
        assertThat(scoringResult.aggregatedResults())
            .isEqualTo(ScoringResult.AggregatedResults.builder().build())
        assertThat(scoringResult.scoreRows())
            .containsExactly(ScoringResult.ScoreRow.builder().build())
    }
}
