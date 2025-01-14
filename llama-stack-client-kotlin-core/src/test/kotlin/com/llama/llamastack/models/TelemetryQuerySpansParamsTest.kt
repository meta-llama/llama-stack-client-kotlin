// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import org.assertj.core.api.Assertions.assertThat
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
    fun getBody() {
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
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.attributeFilters())
            .isEqualTo(
                listOf(
                    TelemetryQuerySpansParams.AttributeFilter.builder()
                        .key("key")
                        .op(TelemetryQuerySpansParams.AttributeFilter.Op.EQ)
                        .value(TelemetryQuerySpansParams.AttributeFilter.Value.ofBoolean(true))
                        .build()
                )
            )
        assertThat(body.attributesToReturn()).isEqualTo(listOf("string"))
        assertThat(body.maxDepth()).isEqualTo(0L)
    }

    @Test
    fun getBodyWithoutOptionalFields() {
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
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.attributeFilters())
            .isEqualTo(
                listOf(
                    TelemetryQuerySpansParams.AttributeFilter.builder()
                        .key("key")
                        .op(TelemetryQuerySpansParams.AttributeFilter.Op.EQ)
                        .value(TelemetryQuerySpansParams.AttributeFilter.Value.ofBoolean(true))
                        .build()
                )
            )
        assertThat(body.attributesToReturn()).isEqualTo(listOf("string"))
    }
}
