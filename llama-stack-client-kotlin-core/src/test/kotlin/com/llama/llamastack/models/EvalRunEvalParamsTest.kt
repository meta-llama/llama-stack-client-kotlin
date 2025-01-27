// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class EvalRunEvalParamsTest {

    @Test
    fun createEvalRunEvalParams() {
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
                            .systemMessage(SystemMessage.builder().content("string").build())
                            .build()
                    )
                    .numExamples(0L)
                    .build()
            )
            .xLlamaStackClientVersion("X-LlamaStack-Client-Version")
            .xLlamaStackProviderData("X-LlamaStack-Provider-Data")
            .build()
    }

    @Test
    fun getBody() {
        val params =
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
                                .systemMessage(SystemMessage.builder().content("string").build())
                                .build()
                        )
                        .numExamples(0L)
                        .build()
                )
                .xLlamaStackClientVersion("X-LlamaStack-Client-Version")
                .xLlamaStackProviderData("X-LlamaStack-Provider-Data")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.taskConfig())
            .isEqualTo(
                EvalTaskConfig.ofBenchmark(
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
                                .systemMessage(SystemMessage.builder().content("string").build())
                                .build()
                        )
                        .numExamples(0L)
                        .build()
                )
            )
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            EvalRunEvalParams.builder()
                .taskId("task_id")
                .taskConfig(
                    EvalTaskConfig.BenchmarkEvalTaskConfig.builder()
                        .evalCandidate(
                            EvalCandidate.ModelCandidate.builder()
                                .model("model")
                                .samplingParams(
                                    SamplingParams.builder().strategyGreedySampling().build()
                                )
                                .build()
                        )
                        .build()
                )
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.taskConfig())
            .isEqualTo(
                EvalTaskConfig.ofBenchmark(
                    EvalTaskConfig.BenchmarkEvalTaskConfig.builder()
                        .evalCandidate(
                            EvalCandidate.ModelCandidate.builder()
                                .model("model")
                                .samplingParams(
                                    SamplingParams.builder().strategyGreedySampling().build()
                                )
                                .build()
                        )
                        .build()
                )
            )
    }

    @Test
    fun getPathParam() {
        val params =
            EvalRunEvalParams.builder()
                .taskId("task_id")
                .taskConfig(
                    EvalTaskConfig.BenchmarkEvalTaskConfig.builder()
                        .evalCandidate(
                            EvalCandidate.ModelCandidate.builder()
                                .model("model")
                                .samplingParams(
                                    SamplingParams.builder().strategyGreedySampling().build()
                                )
                                .build()
                        )
                        .build()
                )
                .build()
        assertThat(params).isNotNull
        // path param "taskId"
        assertThat(params.getPathParam(0)).isEqualTo("task_id")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
