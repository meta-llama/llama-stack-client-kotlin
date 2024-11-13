// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ScoringScoreResponseTest {

    @Test
    fun createScoringScoreResponse() {
        val scoringScoreResponse =
            ScoringScoreResponse.builder()
                .results(ScoringScoreResponse.Results.builder().build())
                .build()
        assertThat(scoringScoreResponse).isNotNull
        assertThat(scoringScoreResponse.results())
            .isEqualTo(ScoringScoreResponse.Results.builder().build())
    }
}
