// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.llama.llamastack.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class TelemetryQueryTracesParamsTest {

    @Test
    fun createTelemetryQueryTracesParams() {
        TelemetryQueryTracesParams.builder()
            .attributeFilters(
                listOf(
                    TelemetryQueryTracesParams.AttributeFilter.builder()
                        .key("key")
                        .op(TelemetryQueryTracesParams.AttributeFilter.Op.EQ)
                        .value(TelemetryQueryTracesParams.AttributeFilter.Value.ofBoolean(true))
                        .build()
                )
            )
            .limit(0L)
            .offset(0L)
            .orderBy(listOf("string"))
            .xLlamaStackClientVersion("X-LlamaStack-Client-Version")
            .xLlamaStackProviderData("X-LlamaStack-Provider-Data")
            .build()
    }

    @Test
    //    @Disabled
    fun getQueryParams() {
        val params =
            TelemetryQueryTracesParams.builder()
                .attributeFilters(
                    listOf(
                        TelemetryQueryTracesParams.AttributeFilter.builder()
                            .key("key")
                            .op(TelemetryQueryTracesParams.AttributeFilter.Op.EQ)
                            .value(TelemetryQueryTracesParams.AttributeFilter.Value.ofBoolean(true))
                            .build()
                    )
                )
                .limit(0L)
                .offset(0L)
                .orderBy(listOf("string"))
                .xLlamaStackClientVersion("X-LlamaStack-Client-Version")
                .xLlamaStackProviderData("X-LlamaStack-Provider-Data")
                .build()
        val expected = QueryParams.builder()
        expected.put(
            "attribute_filters",
            TelemetryQueryTracesParams.AttributeFilter.builder()
                .key("key")
                .op(TelemetryQueryTracesParams.AttributeFilter.Op.EQ)
                .value(TelemetryQueryTracesParams.AttributeFilter.Value.ofBoolean(true).toString())
                .build()
                .toString()
        )
        expected.put("limit", "0")
        expected.put("offset", "0")
        expected.put("order_by", "string")
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = TelemetryQueryTracesParams.builder().build()
        val expected = QueryParams.builder()
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }
}
