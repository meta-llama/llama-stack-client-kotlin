// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.llama.llamastack.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DatasetRegisterParamsTest {

    @Test
    fun create() {
        DatasetRegisterParams.builder()
            .purpose(DatasetRegisterParams.Purpose.POST_TRAINING_MESSAGES)
            .uriSource("uri")
            .datasetId("dataset_id")
            .metadata(
                DatasetRegisterParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from(true))
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            DatasetRegisterParams.builder()
                .purpose(DatasetRegisterParams.Purpose.POST_TRAINING_MESSAGES)
                .uriSource("uri")
                .datasetId("dataset_id")
                .metadata(
                    DatasetRegisterParams.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from(true))
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.purpose()).isEqualTo(DatasetRegisterParams.Purpose.POST_TRAINING_MESSAGES)
        assertThat(body.source())
            .isEqualTo(
                DatasetRegisterParams.Source.ofUri(
                    DatasetRegisterParams.Source.Uri.builder().uri("uri").build()
                )
            )
        assertThat(body.datasetId()).isEqualTo("dataset_id")
        assertThat(body.metadata())
            .isEqualTo(
                DatasetRegisterParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from(true))
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            DatasetRegisterParams.builder()
                .purpose(DatasetRegisterParams.Purpose.POST_TRAINING_MESSAGES)
                .uriSource("uri")
                .build()

        val body = params._body()

        assertThat(body.purpose()).isEqualTo(DatasetRegisterParams.Purpose.POST_TRAINING_MESSAGES)
        assertThat(body.source())
            .isEqualTo(
                DatasetRegisterParams.Source.ofUri(
                    DatasetRegisterParams.Source.Uri.builder().uri("uri").build()
                )
            )
    }
}
