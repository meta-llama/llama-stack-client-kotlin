// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class TelemetrySaveSpansToDatasetParamsTest {

    @Test
    fun createTelemetrySaveSpansToDatasetParams() {
        TelemetrySaveSpansToDatasetParams.builder()
            .attributeFilters(
                listOf(
                    TelemetrySaveSpansToDatasetParams.AttributeFilter.builder()
                        .key("key")
                        .op(TelemetrySaveSpansToDatasetParams.AttributeFilter.Op.EQ)
                        .value(
                            TelemetrySaveSpansToDatasetParams.AttributeFilter.Value.ofBoolean(true)
                        )
                        .build()
                )
            )
            .attributesToSave(listOf("string"))
            .datasetId("dataset_id")
            .maxDepth(0L)
            .xLlamaStackProviderData("X-LlamaStack-ProviderData")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            TelemetrySaveSpansToDatasetParams.builder()
                .attributeFilters(
                    listOf(
                        TelemetrySaveSpansToDatasetParams.AttributeFilter.builder()
                            .key("key")
                            .op(TelemetrySaveSpansToDatasetParams.AttributeFilter.Op.EQ)
                            .value(
                                TelemetrySaveSpansToDatasetParams.AttributeFilter.Value.ofBoolean(
                                    true
                                )
                            )
                            .build()
                    )
                )
                .attributesToSave(listOf("string"))
                .datasetId("dataset_id")
                .maxDepth(0L)
                .xLlamaStackProviderData("X-LlamaStack-ProviderData")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.attributeFilters())
            .isEqualTo(
                listOf(
                    TelemetrySaveSpansToDatasetParams.AttributeFilter.builder()
                        .key("key")
                        .op(TelemetrySaveSpansToDatasetParams.AttributeFilter.Op.EQ)
                        .value(
                            TelemetrySaveSpansToDatasetParams.AttributeFilter.Value.ofBoolean(true)
                        )
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
                .attributeFilters(
                    listOf(
                        TelemetrySaveSpansToDatasetParams.AttributeFilter.builder()
                            .key("key")
                            .op(TelemetrySaveSpansToDatasetParams.AttributeFilter.Op.EQ)
                            .value(
                                TelemetrySaveSpansToDatasetParams.AttributeFilter.Value.ofBoolean(
                                    true
                                )
                            )
                            .build()
                    )
                )
                .attributesToSave(listOf("string"))
                .datasetId("dataset_id")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.attributeFilters())
            .isEqualTo(
                listOf(
                    TelemetrySaveSpansToDatasetParams.AttributeFilter.builder()
                        .key("key")
                        .op(TelemetrySaveSpansToDatasetParams.AttributeFilter.Op.EQ)
                        .value(
                            TelemetrySaveSpansToDatasetParams.AttributeFilter.Value.ofBoolean(true)
                        )
                        .build()
                )
            )
        assertThat(body.attributesToSave()).isEqualTo(listOf("string"))
        assertThat(body.datasetId()).isEqualTo("dataset_id")
    }
}
