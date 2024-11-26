// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class DatasetRetrieveResponseTest {

    @Test
    fun createDatasetRetrieveResponse() {
        val datasetRetrieveResponse =
            DatasetRetrieveResponse.builder()
                .datasetSchema(DatasetRetrieveResponse.DatasetSchema.builder().build())
                .identifier("identifier")
                .metadata(DatasetRetrieveResponse.Metadata.builder().build())
                .providerId("provider_id")
                .providerResourceId("provider_resource_id")
                .type(DatasetRetrieveResponse.Type.DATASET)
                .url("https://example.com")
                .build()
        assertThat(datasetRetrieveResponse).isNotNull
        assertThat(datasetRetrieveResponse.datasetSchema())
            .isEqualTo(DatasetRetrieveResponse.DatasetSchema.builder().build())
        assertThat(datasetRetrieveResponse.identifier()).isEqualTo("identifier")
        assertThat(datasetRetrieveResponse.metadata())
            .isEqualTo(DatasetRetrieveResponse.Metadata.builder().build())
        assertThat(datasetRetrieveResponse.providerId()).isEqualTo("provider_id")
        assertThat(datasetRetrieveResponse.providerResourceId()).isEqualTo("provider_resource_id")
        assertThat(datasetRetrieveResponse.type()).isEqualTo(DatasetRetrieveResponse.Type.DATASET)
        assertThat(datasetRetrieveResponse.url()).isEqualTo("https://example.com")
    }
}
