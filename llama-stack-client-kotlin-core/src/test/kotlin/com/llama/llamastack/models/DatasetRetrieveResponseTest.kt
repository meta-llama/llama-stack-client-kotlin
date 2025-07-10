// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DatasetRetrieveResponseTest {

    @Test
    fun create() {
        val datasetRetrieveResponse =
            DatasetRetrieveResponse.builder()
                .identifier("identifier")
                .metadata(
                    DatasetRetrieveResponse.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from(true))
                        .build()
                )
                .providerId("provider_id")
                .purpose(DatasetRetrieveResponse.Purpose.POST_TRAINING_MESSAGES)
                .uriSource("uri")
                .providerResourceId("provider_resource_id")
                .build()

        assertThat(datasetRetrieveResponse.identifier()).isEqualTo("identifier")
        assertThat(datasetRetrieveResponse.metadata())
            .isEqualTo(
                DatasetRetrieveResponse.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from(true))
                    .build()
            )
        assertThat(datasetRetrieveResponse.providerId()).isEqualTo("provider_id")
        assertThat(datasetRetrieveResponse.purpose())
            .isEqualTo(DatasetRetrieveResponse.Purpose.POST_TRAINING_MESSAGES)
        assertThat(datasetRetrieveResponse.source())
            .isEqualTo(
                DatasetRetrieveResponse.Source.ofUri(
                    DatasetRetrieveResponse.Source.Uri.builder().uri("uri").build()
                )
            )
        assertThat(datasetRetrieveResponse.providerResourceId()).isEqualTo("provider_resource_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val datasetRetrieveResponse =
            DatasetRetrieveResponse.builder()
                .identifier("identifier")
                .metadata(
                    DatasetRetrieveResponse.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from(true))
                        .build()
                )
                .providerId("provider_id")
                .purpose(DatasetRetrieveResponse.Purpose.POST_TRAINING_MESSAGES)
                .uriSource("uri")
                .providerResourceId("provider_resource_id")
                .build()

        val roundtrippedDatasetRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(datasetRetrieveResponse),
                jacksonTypeRef<DatasetRetrieveResponse>(),
            )

        assertThat(roundtrippedDatasetRetrieveResponse).isEqualTo(datasetRetrieveResponse)
    }
}
