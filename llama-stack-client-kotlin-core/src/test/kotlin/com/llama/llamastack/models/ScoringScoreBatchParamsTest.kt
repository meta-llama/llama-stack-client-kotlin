// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.llama.llamastack.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ScoringScoreBatchParamsTest {

    @Test
    fun create() {
        ScoringScoreBatchParams.builder()
            .datasetId("dataset_id")
            .saveResultsDataset(true)
            .scoringFunctions(
                ScoringScoreBatchParams.ScoringFunctions.builder()
                    .putAdditionalProperty(
                        "foo",
                        JsonValue.from(
                            mapOf(
                                "aggregation_functions" to listOf("average"),
                                "judge_model" to "judge_model",
                                "judge_score_regexes" to listOf("string"),
                                "type" to "llm_as_judge",
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
            ScoringScoreBatchParams.builder()
                .datasetId("dataset_id")
                .saveResultsDataset(true)
                .scoringFunctions(
                    ScoringScoreBatchParams.ScoringFunctions.builder()
                        .putAdditionalProperty(
                            "foo",
                            JsonValue.from(
                                mapOf(
                                    "aggregation_functions" to listOf("average"),
                                    "judge_model" to "judge_model",
                                    "judge_score_regexes" to listOf("string"),
                                    "type" to "llm_as_judge",
                                    "prompt_template" to "prompt_template",
                                )
                            ),
                        )
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.datasetId()).isEqualTo("dataset_id")
        assertThat(body.saveResultsDataset()).isEqualTo(true)
        assertThat(body.scoringFunctions())
            .isEqualTo(
                ScoringScoreBatchParams.ScoringFunctions.builder()
                    .putAdditionalProperty(
                        "foo",
                        JsonValue.from(
                            mapOf(
                                "aggregation_functions" to listOf("average"),
                                "judge_model" to "judge_model",
                                "judge_score_regexes" to listOf("string"),
                                "type" to "llm_as_judge",
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
            ScoringScoreBatchParams.builder()
                .datasetId("dataset_id")
                .saveResultsDataset(true)
                .scoringFunctions(
                    ScoringScoreBatchParams.ScoringFunctions.builder()
                        .putAdditionalProperty(
                            "foo",
                            JsonValue.from(
                                mapOf(
                                    "aggregation_functions" to listOf("average"),
                                    "judge_model" to "judge_model",
                                    "judge_score_regexes" to listOf("string"),
                                    "type" to "llm_as_judge",
                                )
                            ),
                        )
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.datasetId()).isEqualTo("dataset_id")
        assertThat(body.saveResultsDataset()).isEqualTo(true)
        assertThat(body.scoringFunctions())
            .isEqualTo(
                ScoringScoreBatchParams.ScoringFunctions.builder()
                    .putAdditionalProperty(
                        "foo",
                        JsonValue.from(
                            mapOf(
                                "aggregation_functions" to listOf("average"),
                                "judge_model" to "judge_model",
                                "judge_score_regexes" to listOf("string"),
                                "type" to "llm_as_judge",
                            )
                        ),
                    )
                    .build()
            )
    }
}
