// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class DatasetListResponseTest {

    @Test
    fun createDatasetListResponse() {
        val datasetListResponse =
            DatasetListResponse.builder()
                .datasetSchema(DatasetListResponse.DatasetSchema.builder().build())
                .identifier("identifier")
                .metadata(DatasetListResponse.Metadata.builder().build())
                .providerId("provider_id")
                .providerResourceId("provider_resource_id")
                .type(DatasetListResponse.Type.DATASET)
                .url("https://example.com")
                .build()
        assertThat(datasetListResponse).isNotNull
        assertThat(datasetListResponse.datasetSchema())
            .isEqualTo(DatasetListResponse.DatasetSchema.builder().build())
        assertThat(datasetListResponse.identifier()).isEqualTo("identifier")
        assertThat(datasetListResponse.metadata())
            .isEqualTo(DatasetListResponse.Metadata.builder().build())
        assertThat(datasetListResponse.providerId()).isEqualTo("provider_id")
        assertThat(datasetListResponse.providerResourceId()).isEqualTo("provider_resource_id")
        assertThat(datasetListResponse.type()).isEqualTo(DatasetListResponse.Type.DATASET)
        assertThat(datasetListResponse.url()).isEqualTo("https://example.com")
    }
}
