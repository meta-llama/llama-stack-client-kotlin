// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.llama.llamastack.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BenchmarkRegisterParamsTest {

    @Test
    fun create() {
        BenchmarkRegisterParams.builder()
            .benchmarkId("benchmark_id")
            .datasetId("dataset_id")
            .addScoringFunction("string")
            .metadata(
                BenchmarkRegisterParams.Metadata.builder()
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
            BenchmarkRegisterParams.builder()
                .benchmarkId("benchmark_id")
                .datasetId("dataset_id")
                .addScoringFunction("string")
                .metadata(
                    BenchmarkRegisterParams.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from(true))
                        .build()
                )
                .providerBenchmarkId("provider_benchmark_id")
                .providerId("provider_id")
                .build()

        val body = params._body()

        assertThat(body.benchmarkId()).isEqualTo("benchmark_id")
        assertThat(body.datasetId()).isEqualTo("dataset_id")
        assertThat(body.scoringFunctions()).containsExactly("string")
        assertThat(body.metadata())
            .isEqualTo(
                BenchmarkRegisterParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from(true))
                    .build()
            )
        assertThat(body.providerBenchmarkId()).isEqualTo("provider_benchmark_id")
        assertThat(body.providerId()).isEqualTo("provider_id")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            BenchmarkRegisterParams.builder()
                .benchmarkId("benchmark_id")
                .datasetId("dataset_id")
                .addScoringFunction("string")
                .build()

        val body = params._body()

        assertThat(body.benchmarkId()).isEqualTo("benchmark_id")
        assertThat(body.datasetId()).isEqualTo("dataset_id")
        assertThat(body.scoringFunctions()).containsExactly("string")
    }
}
