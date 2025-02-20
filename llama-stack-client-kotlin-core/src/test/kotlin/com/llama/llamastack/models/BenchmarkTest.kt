// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.llama.llamastack.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class BenchmarkTest {

    @Test
    fun createBenchmark() {
        val benchmark =
            Benchmark.builder()
                .datasetId("dataset_id")
                .identifier("identifier")
                .metadata(
                    Benchmark.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from(true))
                        .build()
                )
                .providerId("provider_id")
                .providerResourceId("provider_resource_id")
                .addScoringFunction("string")
                .build()
        assertThat(benchmark).isNotNull
        assertThat(benchmark.datasetId()).isEqualTo("dataset_id")
        assertThat(benchmark.identifier()).isEqualTo("identifier")
        assertThat(benchmark.metadata())
            .isEqualTo(
                Benchmark.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from(true))
                    .build()
            )
        assertThat(benchmark.providerId()).isEqualTo("provider_id")
        assertThat(benchmark.providerResourceId()).isEqualTo("provider_resource_id")
        assertThat(benchmark.scoringFunctions()).containsExactly("string")
    }
}
