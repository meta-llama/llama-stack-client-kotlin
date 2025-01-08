// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

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
            .xLlamaStackProviderData("X-LlamaStack-ProviderData")
            .build()
    }

    @Test
    fun getBody() {
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
                .xLlamaStackProviderData("X-LlamaStack-ProviderData")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.attributeFilters())
            .isEqualTo(
                listOf(
                    TelemetryQueryTracesParams.AttributeFilter.builder()
                        .key("key")
                        .op(TelemetryQueryTracesParams.AttributeFilter.Op.EQ)
                        .value(TelemetryQueryTracesParams.AttributeFilter.Value.ofBoolean(true))
                        .build()
                )
            )
        assertThat(body.limit()).isEqualTo(0L)
        assertThat(body.offset()).isEqualTo(0L)
        assertThat(body.orderBy()).isEqualTo(listOf("string"))
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params = TelemetryQueryTracesParams.builder().build()
        val body = params.getBody()
        assertThat(body).isNotNull
    }
}
