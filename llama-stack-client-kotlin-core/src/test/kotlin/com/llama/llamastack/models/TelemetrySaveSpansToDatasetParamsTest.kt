// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TelemetrySaveSpansToDatasetParamsTest {

    @Test
    fun create() {
        TelemetrySaveSpansToDatasetParams.builder()
            .addAttributeFilter(
                QueryCondition.builder().key("key").op(QueryCondition.Op.EQ).value(true).build()
            )
            .addAttributesToSave("string")
            .datasetId("dataset_id")
            .maxDepth(0L)
            .build()
    }

    @Test
    fun body() {
        val params =
            TelemetrySaveSpansToDatasetParams.builder()
                .addAttributeFilter(
                    QueryCondition.builder().key("key").op(QueryCondition.Op.EQ).value(true).build()
                )
                .addAttributesToSave("string")
                .datasetId("dataset_id")
                .maxDepth(0L)
                .build()

        val body = params._body()

        assertThat(body.attributeFilters())
            .containsExactly(
                QueryCondition.builder().key("key").op(QueryCondition.Op.EQ).value(true).build()
            )
        assertThat(body.attributesToSave()).containsExactly("string")
        assertThat(body.datasetId()).isEqualTo("dataset_id")
        assertThat(body.maxDepth()).isEqualTo(0L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            TelemetrySaveSpansToDatasetParams.builder()
                .addAttributeFilter(
                    QueryCondition.builder().key("key").op(QueryCondition.Op.EQ).value(true).build()
                )
                .addAttributesToSave("string")
                .datasetId("dataset_id")
                .build()

        val body = params._body()

        assertThat(body.attributeFilters())
            .containsExactly(
                QueryCondition.builder().key("key").op(QueryCondition.Op.EQ).value(true).build()
            )
        assertThat(body.attributesToSave()).containsExactly("string")
        assertThat(body.datasetId()).isEqualTo("dataset_id")
    }
}
