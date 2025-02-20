// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.llama.llamastack.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ScoringScoreBatchResponseTest {

    @Test
    fun createScoringScoreBatchResponse() {
        val scoringScoreBatchResponse =
            ScoringScoreBatchResponse.builder()
                .results(
                    ScoringScoreBatchResponse.Results.builder()
                        .putAdditionalProperty(
                            "foo",
                            JsonValue.from(
                                mapOf(
                                    "aggregated_results" to mapOf("foo" to true),
                                    "score_rows" to listOf(mapOf("foo" to true)),
                                )
                            ),
                        )
                        .build()
                )
                .datasetId("dataset_id")
                .build()
        assertThat(scoringScoreBatchResponse).isNotNull
        assertThat(scoringScoreBatchResponse.results())
            .isEqualTo(
                ScoringScoreBatchResponse.Results.builder()
                    .putAdditionalProperty(
                        "foo",
                        JsonValue.from(
                            mapOf(
                                "aggregated_results" to mapOf("foo" to true),
                                "score_rows" to listOf(mapOf("foo" to true)),
                            )
                        ),
                    )
                    .build()
            )
        assertThat(scoringScoreBatchResponse.datasetId()).isEqualTo("dataset_id")
    }
}
