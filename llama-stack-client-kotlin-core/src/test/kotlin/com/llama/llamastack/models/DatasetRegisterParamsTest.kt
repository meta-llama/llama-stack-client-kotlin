// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.llama.llamastack.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class DatasetRegisterParamsTest {

    @Test
    fun createDatasetRegisterParams() {
        DatasetRegisterParams.builder()
            .datasetId("dataset_id")
            .schema(DatasetRegisterParams.Schema.builder().build())
            .url("https://example.com")
            .metadata(DatasetRegisterParams.Metadata.builder().build())
            .providerDatasetId("provider_dataset_id")
            .providerId("provider_id")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            DatasetRegisterParams.builder()
                .datasetId("dataset_id")
                .schema(DatasetRegisterParams.Schema.builder().build())
                .url("https://example.com")
                .metadata(DatasetRegisterParams.Metadata.builder().build())
                .providerDatasetId("provider_dataset_id")
                .providerId("provider_id")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.datasetId()).isEqualTo("dataset_id")
        assertThat(body.schema()).isEqualTo(DatasetRegisterParams.Schema.builder().build())
        assertThat(body.url()).isEqualTo("https://example.com")
        assertThat(body.metadata()).isEqualTo(DatasetRegisterParams.Metadata.builder().build())
        assertThat(body.providerDatasetId()).isEqualTo("provider_dataset_id")
        assertThat(body.providerId()).isEqualTo("provider_id")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            DatasetRegisterParams.builder()
                .datasetId("dataset_id")
                .schema(DatasetRegisterParams.Schema.builder().build())
                .url("https://example.com")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.datasetId()).isEqualTo("dataset_id")
        assertThat(body.schema()).isEqualTo(DatasetRegisterParams.Schema.builder().build())
        assertThat(body.url()).isEqualTo("https://example.com")
    }
}
