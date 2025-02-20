// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.llama.llamastack.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class EvalTaskRegisterParamsTest {

    @Test
    fun create() {
        EvalTaskRegisterParams.builder()
            .datasetId("dataset_id")
            .evalTaskId("eval_task_id")
            .addScoringFunction("string")
            .metadata(
                EvalTaskRegisterParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from(true))
                    .build()
            )
            .providerBenchmarkId("provider_benchmark_id")
            .providerId("provider_id")
            .build()
    }

    @Test
    fun body() {
        val params =
            EvalTaskRegisterParams.builder()
                .datasetId("dataset_id")
                .evalTaskId("eval_task_id")
                .addScoringFunction("string")
                .metadata(
                    EvalTaskRegisterParams.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from(true))
                        .build()
                )
                .providerBenchmarkId("provider_benchmark_id")
                .providerId("provider_id")
                .build()

        val body = params._body()

        assertThat(body).isNotNull
        assertThat(body.datasetId()).isEqualTo("dataset_id")
        assertThat(body.evalTaskId()).isEqualTo("eval_task_id")
        assertThat(body.scoringFunctions()).isEqualTo(listOf("string"))
        assertThat(body.metadata())
            .isEqualTo(
                EvalTaskRegisterParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from(true))
                    .build()
            )
        assertThat(body.providerBenchmarkId()).isEqualTo("provider_benchmark_id")
        assertThat(body.providerId()).isEqualTo("provider_id")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            EvalTaskRegisterParams.builder()
                .datasetId("dataset_id")
                .evalTaskId("eval_task_id")
                .addScoringFunction("string")
                .build()

        val body = params._body()

        assertThat(body).isNotNull
        assertThat(body.datasetId()).isEqualTo("dataset_id")
        assertThat(body.evalTaskId()).isEqualTo("eval_task_id")
        assertThat(body.scoringFunctions()).isEqualTo(listOf("string"))
    }
}
