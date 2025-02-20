// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.llama.llamastack.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ScoringScoreParamsTest {

    @Test
    fun create() {
        ScoringScoreParams.builder()
            .addInputRow(
                ScoringScoreParams.InputRow.builder()
                    .putAdditionalProperty("foo", JsonValue.from(true))
                    .build()
            )
            .scoringFunctions(
                ScoringScoreParams.ScoringFunctions.builder()
                    .putAdditionalProperty(
                        "foo",
                        JsonValue.from(
                            mapOf(
                                "judge_model" to "judge_model",
                                "type" to "llm_as_judge",
                                "aggregation_functions" to listOf("average"),
                                "judge_score_regexes" to listOf("string"),
                                "prompt_template" to "prompt_template",
                            )
                        ),
                    )
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            ScoringScoreParams.builder()
                .addInputRow(
                    ScoringScoreParams.InputRow.builder()
                        .putAdditionalProperty("foo", JsonValue.from(true))
                        .build()
                )
                .scoringFunctions(
                    ScoringScoreParams.ScoringFunctions.builder()
                        .putAdditionalProperty(
                            "foo",
                            JsonValue.from(
                                mapOf(
                                    "judge_model" to "judge_model",
                                    "type" to "llm_as_judge",
                                    "aggregation_functions" to listOf("average"),
                                    "judge_score_regexes" to listOf("string"),
                                    "prompt_template" to "prompt_template",
                                )
                            ),
                        )
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body).isNotNull
        assertThat(body.inputRows())
            .isEqualTo(
                listOf(
                    ScoringScoreParams.InputRow.builder()
                        .putAdditionalProperty("foo", JsonValue.from(true))
                        .build()
                )
            )
        assertThat(body.scoringFunctions())
            .isEqualTo(
                ScoringScoreParams.ScoringFunctions.builder()
                    .putAdditionalProperty(
                        "foo",
                        JsonValue.from(
                            mapOf(
                                "judge_model" to "judge_model",
                                "type" to "llm_as_judge",
                                "aggregation_functions" to listOf("average"),
                                "judge_score_regexes" to listOf("string"),
                                "prompt_template" to "prompt_template",
                            )
                        ),
                    )
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ScoringScoreParams.builder()
                .addInputRow(
                    ScoringScoreParams.InputRow.builder()
                        .putAdditionalProperty("foo", JsonValue.from(true))
                        .build()
                )
                .scoringFunctions(
                    ScoringScoreParams.ScoringFunctions.builder()
                        .putAdditionalProperty(
                            "foo",
                            JsonValue.from(
                                mapOf("judge_model" to "judge_model", "type" to "llm_as_judge")
                            ),
                        )
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body).isNotNull
        assertThat(body.inputRows())
            .isEqualTo(
                listOf(
                    ScoringScoreParams.InputRow.builder()
                        .putAdditionalProperty("foo", JsonValue.from(true))
                        .build()
                )
            )
        assertThat(body.scoringFunctions())
            .isEqualTo(
                ScoringScoreParams.ScoringFunctions.builder()
                    .putAdditionalProperty(
                        "foo",
                        JsonValue.from(
                            mapOf("judge_model" to "judge_model", "type" to "llm_as_judge")
                        ),
                    )
                    .build()
            )
    }
}
