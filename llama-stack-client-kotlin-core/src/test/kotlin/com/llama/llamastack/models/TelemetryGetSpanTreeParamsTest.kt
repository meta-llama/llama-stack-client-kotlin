// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.llama.llamastack.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class TelemetryGetSpanTreeParamsTest {

    @Test
    fun createTelemetryGetSpanTreeParams() {
        TelemetryGetSpanTreeParams.builder()
            .spanId("span_id")
            .maxDepth(0L)
            .attributesToReturn(listOf("string"))
            .xLlamaStackClientVersion("X-LlamaStack-Client-Version")
            .xLlamaStackProviderData("X-LlamaStack-Provider-Data")
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            TelemetryGetSpanTreeParams.builder()
                .spanId("span_id")
                .maxDepth(0L)
                .attributesToReturn(listOf("string"))
                .xLlamaStackClientVersion("X-LlamaStack-Client-Version")
                .xLlamaStackProviderData("X-LlamaStack-Provider-Data")
                .build()
        val expected = QueryParams.builder()
        expected.put("span_id", "span_id")
        expected.put("max_depth", "0")
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = TelemetryGetSpanTreeParams.builder().spanId("span_id").build()
        val expected = QueryParams.builder()
        expected.put("span_id", "span_id")
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }

    @Test
    fun getBody() {
        val params =
            TelemetryGetSpanTreeParams.builder()
                .spanId("span_id")
                .maxDepth(0L)
                .attributesToReturn(listOf("string"))
                .xLlamaStackClientVersion("X-LlamaStack-Client-Version")
                .xLlamaStackProviderData("X-LlamaStack-Provider-Data")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.attributesToReturn()).isEqualTo(listOf("string"))
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params = TelemetryGetSpanTreeParams.builder().spanId("span_id").build()
        val body = params.getBody()
        assertThat(body).isNotNull
    }
}
