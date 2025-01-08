// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.llama.llamastack.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class EvaluateResponseTest {

    @Test
    fun createEvaluateResponse() {
        val evaluateResponse =
            EvaluateResponse.builder()
                .generations(
                    listOf(
                        EvaluateResponse.Generation.builder()
                            .putAdditionalProperty("foo", JsonValue.from(true))
                            .build()
                    )
                )
                .scores(
                    EvaluateResponse.Scores.builder()
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
        assertThat(evaluateResponse).isNotNull
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
                                "score_rows" to listOf(mapOf("foo" to true))
                            )
                        )
                    )
                    .build()
            )
    }
}
