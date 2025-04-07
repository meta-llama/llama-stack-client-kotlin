// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DatasetIterrowsResponseTest {

    @Test
    fun create() {
        val datasetIterrowsResponse =
            DatasetIterrowsResponse.builder()
                .addData(
                    DatasetIterrowsResponse.Data.builder()
                        .putAdditionalProperty("foo", JsonValue.from(true))
                        .build()
                )
                .hasMore(true)
                .build()

        assertThat(datasetIterrowsResponse.data())
            .containsExactly(
                DatasetIterrowsResponse.Data.builder()
                    .putAdditionalProperty("foo", JsonValue.from(true))
                    .build()
            )
        assertThat(datasetIterrowsResponse.hasMore()).isEqualTo(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val datasetIterrowsResponse =
            DatasetIterrowsResponse.builder()
                .addData(
                    DatasetIterrowsResponse.Data.builder()
                        .putAdditionalProperty("foo", JsonValue.from(true))
                        .build()
                )
                .hasMore(true)
                .build()

        val roundtrippedDatasetIterrowsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(datasetIterrowsResponse),
                jacksonTypeRef<DatasetIterrowsResponse>(),
            )

        assertThat(roundtrippedDatasetIterrowsResponse).isEqualTo(datasetIterrowsResponse)
    }
}
