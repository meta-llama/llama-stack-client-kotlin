// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BenchmarkConfigTest {

    @Test
    fun create() {
        val benchmarkConfig =
            BenchmarkConfig.builder()
                .evalCandidate(
                    EvalCandidate.ModelCandidate.builder()
                        .model("model")
                        .samplingParams(
                            SamplingParams.builder()
                                .strategyObject()
                                .maxTokens(0L)
                                .repetitionPenalty(0.0)
                                .addStop("string")
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

        assertThat(benchmarkConfig.evalCandidate())
            .isEqualTo(
                EvalCandidate.ofModel(
                    EvalCandidate.ModelCandidate.builder()
                        .model("model")
                        .samplingParams(
                            SamplingParams.builder()
                                .strategyObject()
                                .maxTokens(0L)
                                .repetitionPenalty(0.0)
                                .addStop("string")
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

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val benchmarkConfig =
            BenchmarkConfig.builder()
                .evalCandidate(
                    EvalCandidate.ModelCandidate.builder()
                        .model("model")
                        .samplingParams(
                            SamplingParams.builder()
                                .strategyObject()
                                .maxTokens(0L)
                                .repetitionPenalty(0.0)
                                .addStop("string")
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

        val roundtrippedBenchmarkConfig =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(benchmarkConfig),
                jacksonTypeRef<BenchmarkConfig>(),
            )

        assertThat(roundtrippedBenchmarkConfig).isEqualTo(benchmarkConfig)
    }
}
