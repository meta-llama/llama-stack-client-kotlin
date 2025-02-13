// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.llama.llamastack.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class DatasetRegisterParamsTest {

    @Test
    fun create() {
        DatasetRegisterParams.builder()
            .datasetId("dataset_id")
            .datasetSchema(
                DatasetRegisterParams.DatasetSchema.builder()
                    .putAdditionalProperty("foo", JsonValue.from(mapOf("type" to "string")))
                    .build()
            )
            .url(DatasetRegisterParams.Url.builder().uri("uri").build())
            .metadata(
                DatasetRegisterParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from(true))
                    .build()
            )
            .providerDatasetId("provider_dataset_id")
            .providerId("provider_id")
            .build()
    }

    @Test
    fun body() {
        val params =
            DatasetRegisterParams.builder()
                .datasetId("dataset_id")
                .datasetSchema(
                    DatasetRegisterParams.DatasetSchema.builder()
                        .putAdditionalProperty("foo", JsonValue.from(mapOf("type" to "string")))
                        .build()
                )
                .url(DatasetRegisterParams.Url.builder().uri("uri").build())
                .metadata(
                    DatasetRegisterParams.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from(true))
                        .build()
                )
                .providerDatasetId("provider_dataset_id")
                .providerId("provider_id")
                .build()
        val body = params._body()
        assertThat(body).isNotNull
        assertThat(body.datasetId()).isEqualTo("dataset_id")
        assertThat(body.datasetSchema())
            .isEqualTo(
                DatasetRegisterParams.DatasetSchema.builder()
                    .putAdditionalProperty("foo", JsonValue.from(mapOf("type" to "string")))
                    .build()
            )
        assertThat(body.url()).isEqualTo(DatasetRegisterParams.Url.builder().uri("uri").build())
        assertThat(body.metadata())
            .isEqualTo(
                DatasetRegisterParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from(true))
                    .build()
            )
        assertThat(body.providerDatasetId()).isEqualTo("provider_dataset_id")
        assertThat(body.providerId()).isEqualTo("provider_id")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            DatasetRegisterParams.builder()
                .datasetId("dataset_id")
                .datasetSchema(
                    DatasetRegisterParams.DatasetSchema.builder()
                        .putAdditionalProperty("foo", JsonValue.from(mapOf("type" to "string")))
                        .build()
                )
                .url(DatasetRegisterParams.Url.builder().uri("uri").build())
                .build()
        val body = params._body()
        assertThat(body).isNotNull
        assertThat(body.datasetId()).isEqualTo("dataset_id")
        assertThat(body.datasetSchema())
            .isEqualTo(
                DatasetRegisterParams.DatasetSchema.builder()
                    .putAdditionalProperty("foo", JsonValue.from(mapOf("type" to "string")))
                    .build()
            )
        assertThat(body.url()).isEqualTo(DatasetRegisterParams.Url.builder().uri("uri").build())
    }
}
