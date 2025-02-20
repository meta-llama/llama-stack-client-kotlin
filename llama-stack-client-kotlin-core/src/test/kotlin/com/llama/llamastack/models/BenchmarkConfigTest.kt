// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.llama.llamastack.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class BenchmarkConfigTest {

    @Test
    fun createBenchmarkConfig() {
        val benchmarkConfig =
            BenchmarkConfig.builder()
                .evalCandidate(
                    EvalCandidate.ModelCandidate.builder()
                        .model("model")
                        .samplingParams(
                            SamplingParams.builder()
                                .strategyGreedySampling()
                                .maxTokens(0L)
                                .repetitionPenalty(0.0)
                                .build()
                        )
                        .systemMessage(SystemMessage.builder().content("string").build())
                        .build()
                )
                .scoringParams(
                    BenchmarkConfig.ScoringParams.builder()
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
                .numExamples(0L)
                .build()
        assertThat(benchmarkConfig).isNotNull
        assertThat(benchmarkConfig.evalCandidate())
            .isEqualTo(
                EvalCandidate.ofModel(
                    EvalCandidate.ModelCandidate.builder()
                        .model("model")
                        .samplingParams(
                            SamplingParams.builder()
                                .strategyGreedySampling()
                                .maxTokens(0L)
                                .repetitionPenalty(0.0)
                                .build()
                        )
                        .systemMessage(SystemMessage.builder().content("string").build())
                        .build()
                )
            )
        assertThat(benchmarkConfig.scoringParams())
            .isEqualTo(
                BenchmarkConfig.ScoringParams.builder()
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
        assertThat(benchmarkConfig.numExamples()).isEqualTo(0L)
    }
}
