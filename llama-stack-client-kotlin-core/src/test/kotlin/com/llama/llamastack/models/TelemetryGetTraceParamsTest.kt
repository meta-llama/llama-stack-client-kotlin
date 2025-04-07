// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TelemetryGetTraceParamsTest {

    @Test
    fun create() {
        TelemetryGetTraceParams.builder().traceId("trace_id").build()
    }

    @Test
    fun pathParams() {
        val params = TelemetryGetTraceParams.builder().traceId("trace_id").build()

        assertThat(params._pathParam(0)).isEqualTo("trace_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
