// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import org.junit.jupiter.api.Test

class TelemetryQuerySpansParamsTest {

    @Test
    fun createTelemetryQuerySpansParams() {
        TelemetryQuerySpansParams.builder()
            .addAttributeFilter(
                TelemetryQuerySpansParams.AttributeFilter.builder()
                    .key("key")
                    .op(TelemetryQuerySpansParams.AttributeFilter.Op.EQ)
                    .value(true)
                    .build()
            )
            .addAttributesToReturn("string")
            .maxDepth(0L)
            .xLlamaStackClientVersion("X-LlamaStack-Client-Version")
            .xLlamaStackProviderData("X-LlamaStack-Provider-Data")
            .build()
    }

    //    @Test
    //    @Disabled
    //    fun getQueryParams() {
    //        val params =
    //            TelemetryQuerySpansParams.builder()
    //                .addAttributeFilter(
    //                    TelemetryQuerySpansParams.AttributeFilter.builder()
    //                        .key("key")
    //                        .op(TelemetryQuerySpansParams.AttributeFilter.Op.EQ)
    //                        .value(true)
    //                        .build()
    //                )
    //                .addAttributesToReturn("string")
    //                .maxDepth(0L)
    //                .xLlamaStackClientVersion("X-LlamaStack-Client-Version")
    //                .xLlamaStackProviderData("X-LlamaStack-Provider-Data")
    //                .build()
    //        val expected = QueryParams.builder()
    //        expected.put(
    //            "attribute_filters",
    //            TelemetryQuerySpansParams.AttributeFilter.builder()
    //                .key("key")
    //                .op(TelemetryQuerySpansParams.AttributeFilter.Op.EQ.toString())
    //                .value("true")
    //                .build()
    //        )
    //        expected.put("attributes_to_return", "string")
    //        expected.put("max_depth", "0")
    //        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    //    }

    //    @Test
    //    @Disabled
    //    fun getQueryParamsWithoutOptionalFields() {
    //        val params =
    //            TelemetryQuerySpansParams.builder()
    //                .addAttributeFilter(
    //                    TelemetryQuerySpansParams.AttributeFilter.builder()
    //                        .key("key")
    //                        .op(TelemetryQuerySpansParams.AttributeFilter.Op.EQ)
    //                        .value(true)
    //                        .build()
    //                )
    //                .addAttributesToReturn("string")
    //                .build()
    //        val expected = QueryParams.builder()
    //        expected.put(
    //            "attribute_filters",
    //            TelemetryQuerySpansParams.AttributeFilter.builder()
    //                .key("key")
    //                .op(TelemetryQuerySpansParams.AttributeFilter.Op.EQ.toString())
    //                .value("true")
    //                .build()
    //        )
    //        expected.put("attributes_to_return", "string")
    //        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    //    }
}
