// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.llama.llamastack.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class DatasetioAppendRowsParamsTest {

    @Test
    fun createDatasetioAppendRowsParams() {
        DatasetioAppendRowsParams.builder()
            .datasetId("dataset_id")
            .addRow(
                DatasetioAppendRowsParams.Row.builder()
                    .putAdditionalProperty("foo", JsonValue.from(true))
                    .build()
            )
            .xLlamaStackClientVersion("X-LlamaStack-Client-Version")
            .xLlamaStackProviderData("X-LlamaStack-Provider-Data")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            DatasetioAppendRowsParams.builder()
                .datasetId("dataset_id")
                .addRow(
                    DatasetioAppendRowsParams.Row.builder()
                        .putAdditionalProperty("foo", JsonValue.from(true))
                        .build()
                )
                .xLlamaStackClientVersion("X-LlamaStack-Client-Version")
                .xLlamaStackProviderData("X-LlamaStack-Provider-Data")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.datasetId()).isEqualTo("dataset_id")
        assertThat(body.rows())
            .isEqualTo(
                listOf(
                    DatasetioAppendRowsParams.Row.builder()
                        .putAdditionalProperty("foo", JsonValue.from(true))
                        .build()
                )
            )
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            DatasetioAppendRowsParams.builder()
                .datasetId("dataset_id")
                .addRow(
                    DatasetioAppendRowsParams.Row.builder()
                        .putAdditionalProperty("foo", JsonValue.from(true))
                        .build()
                )
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.datasetId()).isEqualTo("dataset_id")
        assertThat(body.rows())
            .isEqualTo(
                listOf(
                    DatasetioAppendRowsParams.Row.builder()
                        .putAdditionalProperty("foo", JsonValue.from(true))
                        .build()
                )
            )
    }
}
