// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TelemetryGetSpanTreeParamsTest {

    @Test
    fun create() {
        TelemetryGetSpanTreeParams.builder()
            .spanId("span_id")
            .addAttributesToReturn("string")
            .maxDepth(0L)
            .build()
    }

    @Test
    fun pathParams() {
        val params = TelemetryGetSpanTreeParams.builder().spanId("span_id").build()

        assertThat(params._pathParam(0)).isEqualTo("span_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            TelemetryGetSpanTreeParams.builder()
                .spanId("span_id")
                .addAttributesToReturn("string")
                .maxDepth(0L)
                .build()

        val body = params._body()

        assertThat(body.attributesToReturn()).containsExactly("string")
        assertThat(body.maxDepth()).isEqualTo(0L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = TelemetryGetSpanTreeParams.builder().spanId("span_id").build()

        val body = params._body()
    }
}
