// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.llama.llamastack.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

class TelemetryQuerySpansParamsTest {

    @Test
    fun createTelemetryQuerySpansParams() {
        TelemetryQuerySpansParams.builder()
            .attributeFilters(
                listOf(
                    TelemetryQuerySpansParams.AttributeFilter.builder()
                        .key("key")
                        .op(TelemetryQuerySpansParams.AttributeFilter.Op.EQ)
                        .value(TelemetryQuerySpansParams.AttributeFilter.Value.ofBoolean(true))
                        .build()
                )
            )
            .attributesToReturn(listOf("string"))
            .maxDepth(0L)
            .xLlamaStackClientVersion("X-LlamaStack-Client-Version")
            .xLlamaStackProviderData("X-LlamaStack-Provider-Data")
            .build()
    }

    @Test
    @Disabled
    fun getQueryParams() {
        val params =
            TelemetryQuerySpansParams.builder()
                .attributeFilters(
                    listOf(
                        TelemetryQuerySpansParams.AttributeFilter.builder()
                            .key("key")
                            .op(TelemetryQuerySpansParams.AttributeFilter.Op.EQ)
                            .value(TelemetryQuerySpansParams.AttributeFilter.Value.ofBoolean(true))
                            .build()
                    )
                )
                .attributesToReturn(listOf("string"))
                .maxDepth(0L)
                .xLlamaStackClientVersion("X-LlamaStack-Client-Version")
                .xLlamaStackProviderData("X-LlamaStack-Provider-Data")
                .build()
        val expected = QueryParams.builder()
        expected.put(
            "attribute_filters",
            TelemetryQuerySpansParams.AttributeFilter.builder()
                .key("key")
                .op(TelemetryQuerySpansParams.AttributeFilter.Op.EQ)
                .value(TelemetryQuerySpansParams.AttributeFilter.Value.ofBoolean(true).toString())
                .build()
                .toString()
        )
        expected.put("attributes_to_return", "string")
        expected.put("max_depth", "0")
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }

    @Test
    @Disabled
    fun getQueryParamsWithoutOptionalFields() {
        val params =
            TelemetryQuerySpansParams.builder()
                .attributeFilters(
                    listOf(
                        TelemetryQuerySpansParams.AttributeFilter.builder()
                            .key("key")
                            .op(TelemetryQuerySpansParams.AttributeFilter.Op.EQ)
                            .value(TelemetryQuerySpansParams.AttributeFilter.Value.ofBoolean(true))
                            .build()
                    )
                )
                .attributesToReturn(listOf("string"))
                .build()
        val expected = QueryParams.builder()
        expected.put(
            "attribute_filters",
            TelemetryQuerySpansParams.AttributeFilter.builder()
                .key("key")
                .op(TelemetryQuerySpansParams.AttributeFilter.Op.EQ)
                .value(TelemetryQuerySpansParams.AttributeFilter.Value.ofBoolean(true).toString())
                .build()
                .toString()
        )
        expected.put("attributes_to_return", "string")
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }
}
