// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.llama.llamastack.core.JsonValue
import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class EvalRunEvalParamsTest {

    @Test
    fun create() {
        EvalRunEvalParams.builder()
            .benchmarkId("benchmark_id")
            .benchmarkConfig(
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
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            EvalRunEvalParams.builder()
                .benchmarkId("benchmark_id")
                .benchmarkConfig(
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
                )
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.benchmarkConfig())
            .isEqualTo(
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
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            EvalRunEvalParams.builder()
                .benchmarkId("benchmark_id")
                .benchmarkConfig(
                    BenchmarkConfig.builder()
                        .evalCandidate(
                            EvalCandidate.ModelCandidate.builder()
                                .model("model")
                                .samplingParams(
                                    SamplingParams.builder().strategyGreedySampling().build()
                                )
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
                                        )
                                    ),
                                )
                                .build()
                        )
                        .build()
                )
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.benchmarkConfig())
            .isEqualTo(
                BenchmarkConfig.builder()
                    .evalCandidate(
                        EvalCandidate.ModelCandidate.builder()
                            .model("model")
                            .samplingParams(
                                SamplingParams.builder().strategyGreedySampling().build()
                            )
                            .build()
                    )
                    .scoringParams(
                        BenchmarkConfig.ScoringParams.builder()
                            .putAdditionalProperty(
                                "foo",
                                JsonValue.from(
                                    mapOf("judge_model" to "judge_model", "type" to "llm_as_judge")
                                ),
                            )
                            .build()
                    )
                    .build()
            )
    }

    @Test
    fun getPathParam() {
        val params =
            EvalRunEvalParams.builder()
                .benchmarkId("benchmark_id")
                .benchmarkConfig(
                    BenchmarkConfig.builder()
                        .evalCandidate(
                            EvalCandidate.ModelCandidate.builder()
                                .model("model")
                                .samplingParams(
                                    SamplingParams.builder().strategyGreedySampling().build()
                                )
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
                                        )
                                    ),
                                )
                                .build()
                        )
                        .build()
                )
                .build()
        assertThat(params).isNotNull
        // path param "benchmarkId"
        assertThat(params.getPathParam(0)).isEqualTo("benchmark_id")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
