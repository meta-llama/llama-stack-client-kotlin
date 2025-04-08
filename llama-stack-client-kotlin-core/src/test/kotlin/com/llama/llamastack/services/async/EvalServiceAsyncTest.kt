// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.async

import com.llama.llamastack.TestServerExtension
import com.llama.llamastack.client.okhttp.LlamaStackClientOkHttpClientAsync
import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.models.BenchmarkConfig
import com.llama.llamastack.models.EvalCandidate
import com.llama.llamastack.models.EvalEvaluateRowsAlphaParams
import com.llama.llamastack.models.EvalEvaluateRowsParams
import com.llama.llamastack.models.EvalRunEvalAlphaParams
import com.llama.llamastack.models.EvalRunEvalParams
import com.llama.llamastack.models.SamplingParams
import com.llama.llamastack.models.SystemMessage
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class EvalServiceAsyncTest {

    @Test
    suspend fun evaluateRows() {
        val client =
            LlamaStackClientOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .build()
        val evalServiceAsync = client.eval()

        val evaluateResponse =
            evalServiceAsync.evaluateRows(
                EvalEvaluateRowsParams.builder()
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
                                            .addStop("string")
                                            .build()
                                    )
                                    .systemMessage(
                                        SystemMessage.builder().content("string").build()
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
                    .addInputRow(
                        EvalEvaluateRowsParams.InputRow.builder()
                            .putAdditionalProperty("foo", JsonValue.from(true))
                            .build()
                    )
                    .addScoringFunction("string")
                    .build()
            )

        evaluateResponse.validate()
    }

    @Test
    suspend fun evaluateRowsAlpha() {
        val client =
            LlamaStackClientOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .build()
        val evalServiceAsync = client.eval()

        val evaluateResponse =
            evalServiceAsync.evaluateRowsAlpha(
                EvalEvaluateRowsAlphaParams.builder()
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
                                            .addStop("string")
                                            .build()
                                    )
                                    .systemMessage(
                                        SystemMessage.builder().content("string").build()
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
                    .addInputRow(
                        EvalEvaluateRowsAlphaParams.InputRow.builder()
                            .putAdditionalProperty("foo", JsonValue.from(true))
                            .build()
                    )
                    .addScoringFunction("string")
                    .build()
            )

        evaluateResponse.validate()
    }

    @Test
    suspend fun runEval() {
        val client =
            LlamaStackClientOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .build()
        val evalServiceAsync = client.eval()

        val job =
            evalServiceAsync.runEval(
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
                                            .addStop("string")
                                            .build()
                                    )
                                    .systemMessage(
                                        SystemMessage.builder().content("string").build()
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
            )

        job.validate()
    }

    @Test
    suspend fun runEvalAlpha() {
        val client =
            LlamaStackClientOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .build()
        val evalServiceAsync = client.eval()

        val job =
            evalServiceAsync.runEvalAlpha(
                EvalRunEvalAlphaParams.builder()
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
                                            .addStop("string")
                                            .build()
                                    )
                                    .systemMessage(
                                        SystemMessage.builder().content("string").build()
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
            )

        job.validate()
    }
}
