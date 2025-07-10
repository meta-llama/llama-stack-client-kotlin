// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BenchmarkTest {

    @Test
    fun create() {
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
                .addScoringFunction("string")
                .providerResourceId("provider_resource_id")
                .build()

        assertThat(benchmark.datasetId()).isEqualTo("dataset_id")
        assertThat(benchmark.identifier()).isEqualTo("identifier")
        assertThat(benchmark.metadata())
            .isEqualTo(
                Benchmark.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from(true))
                    .build()
            )
        assertThat(benchmark.providerId()).isEqualTo("provider_id")
        assertThat(benchmark.scoringFunctions()).containsExactly("string")
        assertThat(benchmark.providerResourceId()).isEqualTo("provider_resource_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
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
                .addScoringFunction("string")
                .providerResourceId("provider_resource_id")
                .build()

        val roundtrippedBenchmark =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(benchmark),
                jacksonTypeRef<Benchmark>(),
            )

        assertThat(roundtrippedBenchmark).isEqualTo(benchmark)
    }
}
