// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class TelemetryGetSpanTreeParamsTest {

    @Test
    fun create() {
        TelemetryGetSpanTreeParams.builder()
            .spanId("span_id")
            .addAttributesToReturn("string")
            .maxDepth(0L)
            .build()
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

        assertNotNull(body)
        assertThat(body.attributesToReturn()).isEqualTo(listOf("string"))
        assertThat(body.maxDepth()).isEqualTo(0L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = TelemetryGetSpanTreeParams.builder().spanId("span_id").build()

        val body = params._body()

        assertNotNull(body)
    }

    @Test
    fun getPathParam() {
        val params = TelemetryGetSpanTreeParams.builder().spanId("span_id").build()
        assertThat(params).isNotNull
        // path param "spanId"
        assertThat(params.getPathParam(0)).isEqualTo("span_id")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
