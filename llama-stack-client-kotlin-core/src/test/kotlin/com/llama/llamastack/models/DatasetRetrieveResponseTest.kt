// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.llama.llamastack.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class DatasetRetrieveResponseTest {

    @Test
    fun createDatasetRetrieveResponse() {
        val datasetRetrieveResponse =
            DatasetRetrieveResponse.builder()
                .datasetSchema(
                    DatasetRetrieveResponse.DatasetSchema.builder()
                        .putAdditionalProperty("foo", JsonValue.from(mapOf("type" to "string")))
                        .build()
                )
                .identifier("identifier")
                .metadata(
                    DatasetRetrieveResponse.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from(true))
                        .build()
                )
                .providerId("provider_id")
                .providerResourceId("provider_resource_id")
                .url(DatasetRetrieveResponse.Url.builder().uri("uri").build())
                .build()
        assertThat(datasetRetrieveResponse).isNotNull
        assertThat(datasetRetrieveResponse.datasetSchema())
            .isEqualTo(
                DatasetRetrieveResponse.DatasetSchema.builder()
                    .putAdditionalProperty("foo", JsonValue.from(mapOf("type" to "string")))
                    .build()
            )
        assertThat(datasetRetrieveResponse.identifier()).isEqualTo("identifier")
        assertThat(datasetRetrieveResponse.metadata())
            .isEqualTo(
                DatasetRetrieveResponse.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from(true))
                    .build()
            )
        assertThat(datasetRetrieveResponse.providerId()).isEqualTo("provider_id")
        assertThat(datasetRetrieveResponse.providerResourceId()).isEqualTo("provider_resource_id")
        assertThat(datasetRetrieveResponse.url())
            .isEqualTo(DatasetRetrieveResponse.Url.builder().uri("uri").build())
    }
}
