// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class TelemetryGetSpanTreeParamsTest {

    @Test
    fun createTelemetryGetSpanTreeParams() {
        TelemetryGetSpanTreeParams.builder()
            .spanId("span_id")
            .attributesToReturn(listOf("string"))
            .maxDepth(0L)
            .xLlamaStackClientVersion("X-LlamaStack-Client-Version")
            .xLlamaStackProviderData("X-LlamaStack-Provider-Data")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            TelemetryGetSpanTreeParams.builder()
                .spanId("span_id")
                .attributesToReturn(listOf("string"))
                .maxDepth(0L)
                .xLlamaStackClientVersion("X-LlamaStack-Client-Version")
                .xLlamaStackProviderData("X-LlamaStack-Provider-Data")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.spanId()).isEqualTo("span_id")
        assertThat(body.attributesToReturn()).isEqualTo(listOf("string"))
        assertThat(body.maxDepth()).isEqualTo(0L)
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params = TelemetryGetSpanTreeParams.builder().spanId("span_id").build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.spanId()).isEqualTo("span_id")
    }
}
