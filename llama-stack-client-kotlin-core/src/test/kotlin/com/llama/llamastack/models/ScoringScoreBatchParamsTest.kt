// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.llama.llamastack.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ScoringScoreBatchParamsTest {

    @Test
    fun createScoringScoreBatchParams() {
        ScoringScoreBatchParams.builder()
            .datasetId("dataset_id")
            .saveResultsDataset(true)
            .scoringFunctions(
                ScoringScoreBatchParams.ScoringFunctions.builder()
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
                        )
                    )
                    .build()
            )
            .xLlamaStackProviderData("X-LlamaStack-ProviderData")
            .build()
    }

    @Test
    fun getBody() {
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
                                    "judge_model" to "judge_model",
                                    "type" to "llm_as_judge",
                                    "aggregation_functions" to listOf("average"),
                                    "judge_score_regexes" to listOf("string"),
                                    "prompt_template" to "prompt_template",
                                )
                            )
                        )
                        .build()
                )
                .xLlamaStackProviderData("X-LlamaStack-ProviderData")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.datasetId()).isEqualTo("dataset_id")
        assertThat(body.saveResultsDataset()).isEqualTo(true)
        assertThat(body.scoringFunctions())
            .isEqualTo(
                ScoringScoreBatchParams.ScoringFunctions.builder()
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
                        )
                    )
                    .build()
            )
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            ScoringScoreBatchParams.builder()
                .datasetId("dataset_id")
                .saveResultsDataset(true)
                .scoringFunctions(
                    ScoringScoreBatchParams.ScoringFunctions.builder()
                        .putAdditionalProperty(
                            "foo",
                            JsonValue.from(
                                mapOf("judge_model" to "judge_model", "type" to "llm_as_judge")
                            )
                        )
                        .build()
                )
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.datasetId()).isEqualTo("dataset_id")
        assertThat(body.saveResultsDataset()).isEqualTo(true)
        assertThat(body.scoringFunctions())
            .isEqualTo(
                ScoringScoreBatchParams.ScoringFunctions.builder()
                    .putAdditionalProperty(
                        "foo",
                        JsonValue.from(
                            mapOf("judge_model" to "judge_model", "type" to "llm_as_judge")
                        )
                    )
                    .build()
            )
    }
}
