// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.llama.llamastack.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ScoringScoreResponseTest {

    @Test
    fun createScoringScoreResponse() {
        val scoringScoreResponse =
            ScoringScoreResponse.builder()
                .results(
                    ScoringScoreResponse.Results.builder()
                        .putAdditionalProperty(
                            "foo",
                            JsonValue.from(
                                mapOf(
                                    "aggregated_results" to mapOf("foo" to true),
                                    "score_rows" to listOf(mapOf("foo" to true))
                                )
                            )
                        )
                        .build()
                )
                .build()
        assertThat(scoringScoreResponse).isNotNull
        assertThat(scoringScoreResponse.results())
            .isEqualTo(
                ScoringScoreResponse.Results.builder()
                    .putAdditionalProperty(
                        "foo",
                        JsonValue.from(
                            mapOf(
                                "aggregated_results" to mapOf("foo" to true),
                                "score_rows" to listOf(mapOf("foo" to true))
                            )
                        )
                    )
                    .build()
            )
    }
}
