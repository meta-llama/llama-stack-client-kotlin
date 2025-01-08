// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.llama.llamastack.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class DatasetListResponseTest {

    @Test
    fun createDatasetListResponse() {
        val datasetListResponse =
            DatasetListResponse.builder()
                .datasetSchema(
                    DatasetListResponse.DatasetSchema.builder()
                        .putAdditionalProperty("foo", JsonValue.from(mapOf("type" to "string")))
                        .build()
                )
                .identifier("identifier")
                .metadata(
                    DatasetListResponse.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from(true))
                        .build()
                )
                .providerId("provider_id")
                .providerResourceId("provider_resource_id")
                .type(DatasetListResponse.Type.DATASET)
                .url(Url.builder().uri("uri").build())
                .build()
        assertThat(datasetListResponse).isNotNull
        assertThat(datasetListResponse.datasetSchema())
            .isEqualTo(
                DatasetListResponse.DatasetSchema.builder()
                    .putAdditionalProperty("foo", JsonValue.from(mapOf("type" to "string")))
                    .build()
            )
        assertThat(datasetListResponse.identifier()).isEqualTo("identifier")
        assertThat(datasetListResponse.metadata())
            .isEqualTo(
                DatasetListResponse.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from(true))
                    .build()
            )
        assertThat(datasetListResponse.providerId()).isEqualTo("provider_id")
        assertThat(datasetListResponse.providerResourceId()).isEqualTo("provider_resource_id")
        assertThat(datasetListResponse.type()).isEqualTo(DatasetListResponse.Type.DATASET)
        assertThat(datasetListResponse.url()).isEqualTo(Url.builder().uri("uri").build())
    }
}
