// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.llama.llamastack.core.JsonValue
import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class DatasetioAppendRowsParamsTest {

    @Test
    fun create() {
        DatasetioAppendRowsParams.builder()
            .datasetId("dataset_id")
            .addRow(
                DatasetioAppendRowsParams.Row.builder()
                    .putAdditionalProperty("foo", JsonValue.from(true))
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            DatasetioAppendRowsParams.builder()
                .datasetId("dataset_id")
                .addRow(
                    DatasetioAppendRowsParams.Row.builder()
                        .putAdditionalProperty("foo", JsonValue.from(true))
                        .build()
                )
                .build()

        val body = params._body()

        assertNotNull(body)
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
    fun bodyWithoutOptionalFields() {
        val params =
            DatasetioAppendRowsParams.builder()
                .datasetId("dataset_id")
                .addRow(
                    DatasetioAppendRowsParams.Row.builder()
                        .putAdditionalProperty("foo", JsonValue.from(true))
                        .build()
                )
                .build()

        val body = params._body()

        assertNotNull(body)
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
