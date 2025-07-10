// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.llama.llamastack.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EvalRunEvalAlphaParamsTest {

    @Test
    fun create() {
        EvalRunEvalAlphaParams.builder()
            .benchmarkId("benchmark_id")
            .benchmarkConfig(
                BenchmarkConfig.builder()
                    .evalCandidate(
                        EvalCandidate.Model.builder()
                            .model("model")
                            .samplingParams(
                                SamplingParams.builder()
                                    .strategyGreedy()
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
                    .numExamples(0L)
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            EvalRunEvalAlphaParams.builder()
                .benchmarkId("benchmark_id")
                .benchmarkConfig(
                    BenchmarkConfig.builder()
                        .evalCandidate(
                            EvalCandidate.Model.builder()
                                .model("model")
                                .samplingParams(SamplingParams.builder().strategyGreedy().build())
                                .build()
                        )
                        .scoringParams(
                            BenchmarkConfig.ScoringParams.builder()
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
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("benchmark_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            EvalRunEvalAlphaParams.builder()
                .benchmarkId("benchmark_id")
                .benchmarkConfig(
                    BenchmarkConfig.builder()
                        .evalCandidate(
                            EvalCandidate.Model.builder()
                                .model("model")
                                .samplingParams(
                                    SamplingParams.builder()
                                        .strategyGreedy()
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
                        .numExamples(0L)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.benchmarkConfig())
            .isEqualTo(
                BenchmarkConfig.builder()
                    .evalCandidate(
                        EvalCandidate.Model.builder()
                            .model("model")
                            .samplingParams(
                                SamplingParams.builder()
                                    .strategyGreedy()
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
                    .numExamples(0L)
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            EvalRunEvalAlphaParams.builder()
                .benchmarkId("benchmark_id")
                .benchmarkConfig(
                    BenchmarkConfig.builder()
                        .evalCandidate(
                            EvalCandidate.Model.builder()
                                .model("model")
                                .samplingParams(SamplingParams.builder().strategyGreedy().build())
                                .build()
                        )
                        .scoringParams(
                            BenchmarkConfig.ScoringParams.builder()
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
                )
                .build()

        val body = params._body()

        assertThat(body.benchmarkConfig())
            .isEqualTo(
                BenchmarkConfig.builder()
                    .evalCandidate(
                        EvalCandidate.Model.builder()
                            .model("model")
                            .samplingParams(SamplingParams.builder().strategyGreedy().build())
                            .build()
                    )
                    .scoringParams(
                        BenchmarkConfig.ScoringParams.builder()
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
            )
    }
}
