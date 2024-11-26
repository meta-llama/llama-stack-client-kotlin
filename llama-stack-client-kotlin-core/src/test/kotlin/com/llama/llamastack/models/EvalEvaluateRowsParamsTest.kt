// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.llama.llamastack.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class EvalEvaluateRowsParamsTest {

    @Test
    fun createEvalEvaluateRowsParams() {
        EvalEvaluateRowsParams.builder()
            .inputRows(listOf(EvalEvaluateRowsParams.InputRow.builder().build()))
            .scoringFunctions(listOf("string"))
            .taskConfig(
                EvalEvaluateRowsParams.TaskConfig.ofBenchmarkEvalTaskConfig(
                    EvalEvaluateRowsParams.TaskConfig.BenchmarkEvalTaskConfig.builder()
                        .evalCandidate(
                            EvalEvaluateRowsParams.TaskConfig.BenchmarkEvalTaskConfig.EvalCandidate
                                .ofModelCandidate(
                                    EvalEvaluateRowsParams.TaskConfig.BenchmarkEvalTaskConfig
                                        .EvalCandidate
                                        .ModelCandidate
                                        .builder()
                                        .model("model")
                                        .samplingParams(
                                            SamplingParams.builder()
                                                .strategy(SamplingParams.Strategy.GREEDY)
                                                .maxTokens(123L)
                                                .repetitionPenalty(42.23)
                                                .temperature(42.23)
                                                .topK(123L)
                                                .topP(42.23)
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
                                                .content(SystemMessage.Content.ofString("string"))
                                                .role(SystemMessage.Role.SYSTEM)
                                                .build()
                                        )
                                        .build()
                                )
                        )
                        .type(
                            EvalEvaluateRowsParams.TaskConfig.BenchmarkEvalTaskConfig.Type.BENCHMARK
                        )
                        .numExamples(123L)
                        .build()
                )
            )
            .taskId("task_id")
            .xLlamaStackProviderData("X-LlamaStack-ProviderData")
            .build()
    }

    @Test
    fun getBody() {
        val params =
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
                                        EvalEvaluateRowsParams.TaskConfig.BenchmarkEvalTaskConfig
                                            .EvalCandidate
                                            .ModelCandidate
                                            .builder()
                                            .model("model")
                                            .samplingParams(
                                                SamplingParams.builder()
                                                    .strategy(SamplingParams.Strategy.GREEDY)
                                                    .maxTokens(123L)
                                                    .repetitionPenalty(42.23)
                                                    .temperature(42.23)
                                                    .topK(123L)
                                                    .topP(42.23)
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
                            .numExamples(123L)
                            .build()
                    )
                )
                .taskId("task_id")
                .xLlamaStackProviderData("X-LlamaStack-ProviderData")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.inputRows())
            .isEqualTo(listOf(EvalEvaluateRowsParams.InputRow.builder().build()))
        assertThat(body.scoringFunctions()).isEqualTo(listOf("string"))
        assertThat(body.taskConfig())
            .isEqualTo(
                EvalEvaluateRowsParams.TaskConfig.ofBenchmarkEvalTaskConfig(
                    EvalEvaluateRowsParams.TaskConfig.BenchmarkEvalTaskConfig.builder()
                        .evalCandidate(
                            EvalEvaluateRowsParams.TaskConfig.BenchmarkEvalTaskConfig.EvalCandidate
                                .ofModelCandidate(
                                    EvalEvaluateRowsParams.TaskConfig.BenchmarkEvalTaskConfig
                                        .EvalCandidate
                                        .ModelCandidate
                                        .builder()
                                        .model("model")
                                        .samplingParams(
                                            SamplingParams.builder()
                                                .strategy(SamplingParams.Strategy.GREEDY)
                                                .maxTokens(123L)
                                                .repetitionPenalty(42.23)
                                                .temperature(42.23)
                                                .topK(123L)
                                                .topP(42.23)
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
                                                .content(SystemMessage.Content.ofString("string"))
                                                .role(SystemMessage.Role.SYSTEM)
                                                .build()
                                        )
                                        .build()
                                )
                        )
                        .type(
                            EvalEvaluateRowsParams.TaskConfig.BenchmarkEvalTaskConfig.Type.BENCHMARK
                        )
                        .numExamples(123L)
                        .build()
                )
            )
        assertThat(body.taskId()).isEqualTo("task_id")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
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
                                        EvalEvaluateRowsParams.TaskConfig.BenchmarkEvalTaskConfig
                                            .EvalCandidate
                                            .ModelCandidate
                                            .builder()
                                            .model("model")
                                            .samplingParams(
                                                SamplingParams.builder()
                                                    .strategy(SamplingParams.Strategy.GREEDY)
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
                                            .build()
                                    )
                            )
                            .type(
                                EvalEvaluateRowsParams.TaskConfig.BenchmarkEvalTaskConfig.Type
                                    .BENCHMARK
                            )
                            .build()
                    )
                )
                .taskId("task_id")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.inputRows())
            .isEqualTo(listOf(EvalEvaluateRowsParams.InputRow.builder().build()))
        assertThat(body.scoringFunctions()).isEqualTo(listOf("string"))
        assertThat(body.taskConfig())
            .isEqualTo(
                EvalEvaluateRowsParams.TaskConfig.ofBenchmarkEvalTaskConfig(
                    EvalEvaluateRowsParams.TaskConfig.BenchmarkEvalTaskConfig.builder()
                        .evalCandidate(
                            EvalEvaluateRowsParams.TaskConfig.BenchmarkEvalTaskConfig.EvalCandidate
                                .ofModelCandidate(
                                    EvalEvaluateRowsParams.TaskConfig.BenchmarkEvalTaskConfig
                                        .EvalCandidate
                                        .ModelCandidate
                                        .builder()
                                        .model("model")
                                        .samplingParams(
                                            SamplingParams.builder()
                                                .strategy(SamplingParams.Strategy.GREEDY)
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
                                        .build()
                                )
                        )
                        .type(
                            EvalEvaluateRowsParams.TaskConfig.BenchmarkEvalTaskConfig.Type.BENCHMARK
                        )
                        .build()
                )
            )
        assertThat(body.taskId()).isEqualTo("task_id")
    }
}
