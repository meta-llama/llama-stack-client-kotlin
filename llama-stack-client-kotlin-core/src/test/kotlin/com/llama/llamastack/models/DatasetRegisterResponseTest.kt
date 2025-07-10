// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DatasetRegisterResponseTest {

    @Test
    fun create() {
        val datasetRegisterResponse =
            DatasetRegisterResponse.builder()
                .identifier("identifier")
                .metadata(
                    DatasetRegisterResponse.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from(true))
                        .build()
                )
                .providerId("provider_id")
                .purpose(DatasetRegisterResponse.Purpose.POST_TRAINING_MESSAGES)
                .uriSource("uri")
                .providerResourceId("provider_resource_id")
                .build()

        assertThat(datasetRegisterResponse.identifier()).isEqualTo("identifier")
        assertThat(datasetRegisterResponse.metadata())
            .isEqualTo(
                DatasetRegisterResponse.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from(true))
                    .build()
            )
        assertThat(datasetRegisterResponse.providerId()).isEqualTo("provider_id")
        assertThat(datasetRegisterResponse.purpose())
            .isEqualTo(DatasetRegisterResponse.Purpose.POST_TRAINING_MESSAGES)
        assertThat(datasetRegisterResponse.source())
            .isEqualTo(
                DatasetRegisterResponse.Source.ofUri(
                    DatasetRegisterResponse.Source.Uri.builder().uri("uri").build()
                )
            )
        assertThat(datasetRegisterResponse.providerResourceId()).isEqualTo("provider_resource_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val datasetRegisterResponse =
            DatasetRegisterResponse.builder()
                .identifier("identifier")
                .metadata(
                    DatasetRegisterResponse.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from(true))
                        .build()
                )
                .providerId("provider_id")
                .purpose(DatasetRegisterResponse.Purpose.POST_TRAINING_MESSAGES)
                .uriSource("uri")
                .providerResourceId("provider_resource_id")
                .build()

        val roundtrippedDatasetRegisterResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(datasetRegisterResponse),
                jacksonTypeRef<DatasetRegisterResponse>(),
            )

        assertThat(roundtrippedDatasetRegisterResponse).isEqualTo(datasetRegisterResponse)
    }
}
