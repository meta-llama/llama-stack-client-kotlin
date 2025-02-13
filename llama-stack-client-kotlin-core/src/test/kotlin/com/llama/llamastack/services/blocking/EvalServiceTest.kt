// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.blocking

import com.llama.llamastack.TestServerExtension
import com.llama.llamastack.client.okhttp.LlamaStackClientOkHttpClient
import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.models.EvalCandidate
import com.llama.llamastack.models.EvalEvaluateRowsParams
import com.llama.llamastack.models.EvalRunEvalParams
import com.llama.llamastack.models.EvalTaskConfig
import com.llama.llamastack.models.SamplingParams
import com.llama.llamastack.models.SystemMessage
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class EvalServiceTest {

    @Test
    fun callEvaluateRows() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val evalService = client.eval()
        val evaluateResponse =
            evalService.evaluateRows(
                EvalEvaluateRowsParams.builder()
                    .taskId("task_id")
                    .addInputRow(
                        EvalEvaluateRowsParams.InputRow.builder()
                            .putAdditionalProperty("foo", JsonValue.from(true))
                            .build()
                    )
                    .addScoringFunction("string")
                    .taskConfig(
                        EvalTaskConfig.BenchmarkEvalTaskConfig.builder()
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
                                    .systemMessage(
                                        SystemMessage.builder().content("string").build()
                                    )
                                    .build()
                            )
                            .numExamples(0L)
                            .build()
                    )
                    .build()
            )
        println(evaluateResponse)
        evaluateResponse.validate()
    }

    @Test
    fun callRunEval() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val evalService = client.eval()
        val job =
            evalService.runEval(
                EvalRunEvalParams.builder()
                    .taskId("task_id")
                    .taskConfig(
                        EvalTaskConfig.BenchmarkEvalTaskConfig.builder()
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
                                    .systemMessage(
                                        SystemMessage.builder().content("string").build()
                                    )
                                    .build()
                            )
                            .numExamples(0L)
                            .build()
                    )
                    .build()
            )
        println(job)
        job.validate()
    }
}
