// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ListBenchmarksResponseTest {

    @Test
    fun create() {
        val listBenchmarksResponse =
            ListBenchmarksResponse.builder()
                .addData(
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
                )
                .build()

        assertThat(listBenchmarksResponse.data())
            .containsExactly(
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
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val listBenchmarksResponse =
            ListBenchmarksResponse.builder()
                .addData(
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
                )
                .build()

        val roundtrippedListBenchmarksResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(listBenchmarksResponse),
                jacksonTypeRef<ListBenchmarksResponse>(),
            )

        assertThat(roundtrippedListBenchmarksResponse).isEqualTo(listBenchmarksResponse)
    }
}
