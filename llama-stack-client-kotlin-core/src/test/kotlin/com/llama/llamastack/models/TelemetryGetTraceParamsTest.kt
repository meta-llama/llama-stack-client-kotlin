// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class TelemetryGetTraceParamsTest {

    @Test
    fun create() {
        TelemetryGetTraceParams.builder().traceId("trace_id").build()
    }

    @Test
    fun getPathParam() {
        val params = TelemetryGetTraceParams.builder().traceId("trace_id").build()
        assertThat(params).isNotNull
        // path param "traceId"
        assertThat(params.getPathParam(0)).isEqualTo("trace_id")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
