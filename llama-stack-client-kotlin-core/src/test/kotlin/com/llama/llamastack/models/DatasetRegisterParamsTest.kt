// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.llama.llamastack.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class DatasetRegisterParamsTest {

    @Test
    fun createDatasetRegisterParams() {
        DatasetRegisterParams.builder()
            .datasetId("dataset_id")
            .datasetSchema(
                DatasetRegisterParams.DatasetSchema.builder()
                    .putAdditionalProperty("foo", JsonValue.from(mapOf("type" to "string")))
                    .build()
            )
            .url(Url.builder().uri("uri").build())
            .metadata(
                DatasetRegisterParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from(true))
                    .build()
            )
            .providerDatasetId("provider_dataset_id")
            .providerId("provider_id")
            .xLlamaStackClientVersion("X-LlamaStack-Client-Version")
            .xLlamaStackProviderData("X-LlamaStack-Provider-Data")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            DatasetRegisterParams.builder()
                .datasetId("dataset_id")
                .datasetSchema(
                    DatasetRegisterParams.DatasetSchema.builder()
                        .putAdditionalProperty("foo", JsonValue.from(mapOf("type" to "string")))
                        .build()
                )
                .url(Url.builder().uri("uri").build())
                .metadata(
                    DatasetRegisterParams.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from(true))
                        .build()
                )
                .providerDatasetId("provider_dataset_id")
                .providerId("provider_id")
                .xLlamaStackClientVersion("X-LlamaStack-Client-Version")
                .xLlamaStackProviderData("X-LlamaStack-Provider-Data")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.datasetId()).isEqualTo("dataset_id")
        assertThat(body.datasetSchema())
            .isEqualTo(
                DatasetRegisterParams.DatasetSchema.builder()
                    .putAdditionalProperty("foo", JsonValue.from(mapOf("type" to "string")))
                    .build()
            )
        assertThat(body.url()).isEqualTo(Url.builder().uri("uri").build())
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
    fun getBodyWithoutOptionalFields() {
        val params =
            DatasetRegisterParams.builder()
                .datasetId("dataset_id")
                .datasetSchema(
                    DatasetRegisterParams.DatasetSchema.builder()
                        .putAdditionalProperty("foo", JsonValue.from(mapOf("type" to "string")))
                        .build()
                )
                .url(Url.builder().uri("uri").build())
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.datasetId()).isEqualTo("dataset_id")
        assertThat(body.datasetSchema())
            .isEqualTo(
                DatasetRegisterParams.DatasetSchema.builder()
                    .putAdditionalProperty("foo", JsonValue.from(mapOf("type" to "string")))
                    .build()
            )
        assertThat(body.url()).isEqualTo(Url.builder().uri("uri").build())
    }
}
