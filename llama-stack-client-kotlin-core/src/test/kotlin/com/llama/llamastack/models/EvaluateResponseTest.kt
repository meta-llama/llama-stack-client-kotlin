// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EvaluateResponseTest {

    @Test
    fun create() {
        val evaluateResponse =
            EvaluateResponse.builder()
                .addGeneration(
                    EvaluateResponse.Generation.builder()
                        .putAdditionalProperty("foo", JsonValue.from(true))
                        .build()
                )
                .scores(
                    EvaluateResponse.Scores.builder()
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

        assertThat(evaluateResponse.generations())
            .containsExactly(
                EvaluateResponse.Generation.builder()
                    .putAdditionalProperty("foo", JsonValue.from(true))
                    .build()
            )
        assertThat(evaluateResponse.scores())
            .isEqualTo(
                EvaluateResponse.Scores.builder()
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
        val evaluateResponse =
            EvaluateResponse.builder()
                .addGeneration(
                    EvaluateResponse.Generation.builder()
                        .putAdditionalProperty("foo", JsonValue.from(true))
                        .build()
                )
                .scores(
                    EvaluateResponse.Scores.builder()
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

        val roundtrippedEvaluateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(evaluateResponse),
                jacksonTypeRef<EvaluateResponse>(),
            )

        assertThat(roundtrippedEvaluateResponse).isEqualTo(evaluateResponse)
    }
}
