// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.llama.llamastack.core.http.QueryParams
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
    fun queryParams() {
        val params =
            TelemetryGetSpanTreeParams.builder()
                .spanId("span_id")
                .addAttributesToReturn("string")
                .maxDepth(0L)
                .build()
        val expected = QueryParams.builder()
        expected.put("attributes_to_return", "string")
        expected.put("max_depth", "0")
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = TelemetryGetSpanTreeParams.builder().spanId("span_id").build()
        val expected = QueryParams.builder()
        assertThat(params._queryParams()).isEqualTo(expected.build())
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
