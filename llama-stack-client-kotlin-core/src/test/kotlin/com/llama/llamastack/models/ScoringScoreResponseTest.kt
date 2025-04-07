// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ScoringScoreResponseTest {

    @Test
    fun create() {
        val scoringScoreResponse =
            ScoringScoreResponse.builder()
                .results(
                    ScoringScoreResponse.Results.builder()
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
                .build()

        assertThat(scoringScoreResponse.results())
            .isEqualTo(
                ScoringScoreResponse.Results.builder()
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
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val scoringScoreResponse =
            ScoringScoreResponse.builder()
                .results(
                    ScoringScoreResponse.Results.builder()
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
                .build()

        val roundtrippedScoringScoreResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(scoringScoreResponse),
                jacksonTypeRef<ScoringScoreResponse>(),
            )

        assertThat(roundtrippedScoringScoreResponse).isEqualTo(scoringScoreResponse)
    }
}
