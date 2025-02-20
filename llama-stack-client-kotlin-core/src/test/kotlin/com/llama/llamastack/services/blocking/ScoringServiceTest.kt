// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.blocking

import com.llama.llamastack.TestServerExtension
import com.llama.llamastack.client.okhttp.LlamaStackClientOkHttpClient
import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.models.ScoringScoreBatchParams
import com.llama.llamastack.models.ScoringScoreParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class ScoringServiceTest {

    @Test
    fun callScore() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val scoringService = client.scoring()
        val scoringScoreResponse =
            scoringService.score(
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
            )
        println(scoringScoreResponse)
        scoringScoreResponse.validate()
    }

    @Test
    fun callScoreBatch() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val scoringService = client.scoring()
        val scoringScoreBatchResponse =
            scoringService.scoreBatch(
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
                                ),
                            )
                            .build()
                    )
                    .build()
            )
        println(scoringScoreBatchResponse)
        scoringScoreBatchResponse.validate()
    }
}
