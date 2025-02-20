// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.llama.llamastack.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ListBenchmarksResponseTest {

    @Test
    fun createListBenchmarksResponse() {
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
                        .providerResourceId("provider_resource_id")
                        .addScoringFunction("string")
                        .build()
                )
                .build()
        assertThat(listBenchmarksResponse).isNotNull
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
                    .providerResourceId("provider_resource_id")
                    .addScoringFunction("string")
                    .build()
            )
    }
}
