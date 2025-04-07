// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ScoringScoreBatchResponseTest {

    @Test
    fun create() {
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

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
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

        val roundtrippedScoringScoreBatchResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(scoringScoreBatchResponse),
                jacksonTypeRef<ScoringScoreBatchResponse>(),
            )

        assertThat(roundtrippedScoringScoreBatchResponse).isEqualTo(scoringScoreBatchResponse)
    }
}
