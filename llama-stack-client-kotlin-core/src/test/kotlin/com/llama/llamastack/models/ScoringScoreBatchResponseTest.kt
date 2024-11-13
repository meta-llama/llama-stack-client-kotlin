// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ScoringScoreBatchResponseTest {

    @Test
    fun createScoringScoreBatchResponse() {
        val scoringScoreBatchResponse =
            ScoringScoreBatchResponse.builder()
                .results(ScoringScoreBatchResponse.Results.builder().build())
                .datasetId("dataset_id")
                .build()
        assertThat(scoringScoreBatchResponse).isNotNull
        assertThat(scoringScoreBatchResponse.results())
            .isEqualTo(ScoringScoreBatchResponse.Results.builder().build())
        assertThat(scoringScoreBatchResponse.datasetId()).isEqualTo("dataset_id")
    }
}
