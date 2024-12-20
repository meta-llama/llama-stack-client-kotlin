// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.blocking

import com.llama.llamastack.TestServerExtension
import com.llama.llamastack.client.okhttp.LlamaStackClientOkHttpClient
import com.llama.llamastack.models.*
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
                    .inputRows(listOf(EvalEvaluateRowsParams.InputRow.builder().build()))
                    .scoringFunctions(listOf("string"))
                    .taskConfig(
                        EvalEvaluateRowsParams.TaskConfig.ofBenchmarkEvalTaskConfig(
                            EvalEvaluateRowsParams.TaskConfig.BenchmarkEvalTaskConfig.builder()
                                .evalCandidate(
                                    EvalEvaluateRowsParams.TaskConfig.BenchmarkEvalTaskConfig
                                        .EvalCandidate
                                        .ofModelCandidate(
                                            EvalEvaluateRowsParams.TaskConfig
                                                .BenchmarkEvalTaskConfig
                                                .EvalCandidate
                                                .ModelCandidate
                                                .builder()
                                                .model("model")
                                                .samplingParams(
                                                    SamplingParams.builder()
                                                        .strategy(SamplingParams.Strategy.GREEDY)
                                                        .maxTokens(0L)
                                                        .repetitionPenalty(0.0)
                                                        .temperature(0.0)
                                                        .topK(0L)
                                                        .topP(0.0)
                                                        .build()
                                                )
                                                .type(
                                                    EvalEvaluateRowsParams.TaskConfig
                                                        .BenchmarkEvalTaskConfig
                                                        .EvalCandidate
                                                        .ModelCandidate
                                                        .Type
                                                        .MODEL
                                                )
                                                .systemMessage(
                                                    SystemMessage.builder()
                                                        .content(
                                                            SystemMessage.Content.ofString("string")
                                                        )
                                                        .role(SystemMessage.Role.SYSTEM)
                                                        .build()
                                                )
                                                .build()
                                        )
                                )
                                .type(
                                    EvalEvaluateRowsParams.TaskConfig.BenchmarkEvalTaskConfig.Type
                                        .BENCHMARK
                                )
                                .numExamples(0L)
                                .build()
                        )
                    )
                    .taskId("task_id")
                    .xLlamaStackProviderData("X-LlamaStack-ProviderData")
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
                    .taskConfig(
                        EvalRunEvalParams.TaskConfig.ofBenchmarkEvalTaskConfig(
                            EvalRunEvalParams.TaskConfig.BenchmarkEvalTaskConfig.builder()
                                .evalCandidate(
                                    EvalRunEvalParams.TaskConfig.BenchmarkEvalTaskConfig
                                        .EvalCandidate
                                        .ofModelCandidate(
                                            EvalRunEvalParams.TaskConfig.BenchmarkEvalTaskConfig
                                                .EvalCandidate
                                                .ModelCandidate
                                                .builder()
                                                .model("model")
                                                .samplingParams(
                                                    SamplingParams.builder()
                                                        .strategy(SamplingParams.Strategy.GREEDY)
                                                        .maxTokens(0L)
                                                        .repetitionPenalty(0.0)
                                                        .temperature(0.0)
                                                        .topK(0L)
                                                        .topP(0.0)
                                                        .build()
                                                )
                                                .type(
                                                    EvalRunEvalParams.TaskConfig
                                                        .BenchmarkEvalTaskConfig
                                                        .EvalCandidate
                                                        .ModelCandidate
                                                        .Type
                                                        .MODEL
                                                )
                                                .systemMessage(
                                                    SystemMessage.builder()
                                                        .content(
                                                            SystemMessage.Content.ofString("string")
                                                        )
                                                        .role(SystemMessage.Role.SYSTEM)
                                                        .build()
                                                )
                                                .build()
                                        )
                                )
                                .type(
                                    EvalRunEvalParams.TaskConfig.BenchmarkEvalTaskConfig.Type
                                        .BENCHMARK
                                )
                                .numExamples(0L)
                                .build()
                        )
                    )
                    .taskId("task_id")
                    .xLlamaStackProviderData("X-LlamaStack-ProviderData")
                    .build()
            )
        println(job)
        job.validate()
    }
}
