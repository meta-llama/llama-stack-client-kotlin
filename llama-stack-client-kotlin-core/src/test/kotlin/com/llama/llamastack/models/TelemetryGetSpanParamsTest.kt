// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TelemetryGetSpanParamsTest {

    @Test
    fun create() {
        TelemetryGetSpanParams.builder().traceId("trace_id").spanId("span_id").build()
    }

    @Test
    fun pathParams() {
        val params = TelemetryGetSpanParams.builder().traceId("trace_id").spanId("span_id").build()

        assertThat(params._pathParam(0)).isEqualTo("trace_id")
        assertThat(params._pathParam(1)).isEqualTo("span_id")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }
}
