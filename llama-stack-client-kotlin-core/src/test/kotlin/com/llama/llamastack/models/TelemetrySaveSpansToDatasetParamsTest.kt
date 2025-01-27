// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class TelemetrySaveSpansToDatasetParamsTest {

    @Test
    fun createTelemetrySaveSpansToDatasetParams() {
        TelemetrySaveSpansToDatasetParams.builder()
            .addAttributeFilter(
                QueryCondition.builder()
                    .key("key")
                    .op(QueryCondition.Op.EQ)
                    .value(QueryCondition.Value.ofBoolean(true))
                    .build()
            )
            .addAttributesToSave("string")
            .datasetId("dataset_id")
            .maxDepth(0L)
            .xLlamaStackClientVersion("X-LlamaStack-Client-Version")
            .xLlamaStackProviderData("X-LlamaStack-Provider-Data")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            TelemetrySaveSpansToDatasetParams.builder()
                .addAttributeFilter(
                    QueryCondition.builder()
                        .key("key")
                        .op(QueryCondition.Op.EQ)
                        .value(QueryCondition.Value.ofBoolean(true))
                        .build()
                )
                .addAttributesToSave("string")
                .datasetId("dataset_id")
                .maxDepth(0L)
                .xLlamaStackClientVersion("X-LlamaStack-Client-Version")
                .xLlamaStackProviderData("X-LlamaStack-Provider-Data")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.attributeFilters())
            .isEqualTo(
                listOf(
                    QueryCondition.builder()
                        .key("key")
                        .op(QueryCondition.Op.EQ)
                        .value(QueryCondition.Value.ofBoolean(true))
                        .build()
                )
            )
        assertThat(body.attributesToSave()).isEqualTo(listOf("string"))
        assertThat(body.datasetId()).isEqualTo("dataset_id")
        assertThat(body.maxDepth()).isEqualTo(0L)
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            TelemetrySaveSpansToDatasetParams.builder()
                .addAttributeFilter(
                    QueryCondition.builder()
                        .key("key")
                        .op(QueryCondition.Op.EQ)
                        .value(QueryCondition.Value.ofBoolean(true))
                        .build()
                )
                .addAttributesToSave("string")
                .datasetId("dataset_id")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.attributeFilters())
            .isEqualTo(
                listOf(
                    QueryCondition.builder()
                        .key("key")
                        .op(QueryCondition.Op.EQ)
                        .value(QueryCondition.Value.ofBoolean(true))
                        .build()
                )
            )
        assertThat(body.attributesToSave()).isEqualTo(listOf("string"))
        assertThat(body.datasetId()).isEqualTo("dataset_id")
    }
}
