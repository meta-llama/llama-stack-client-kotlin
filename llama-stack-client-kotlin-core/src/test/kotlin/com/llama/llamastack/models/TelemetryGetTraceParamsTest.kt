// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.llama.llamastack.core.http.QueryParams
import com.llama.llamastack.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class TelemetryGetTraceParamsTest {

    @Test
    fun createTelemetryGetTraceParams() {
        TelemetryGetTraceParams.builder().traceId("trace_id").build()
    }

    @Test
    fun getQueryParams() {
        val params = TelemetryGetTraceParams.builder().traceId("trace_id").build()
        val expected = QueryParams.builder()
        expected.put("trace_id", "trace_id")
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = TelemetryGetTraceParams.builder().traceId("trace_id").build()
        val expected = QueryParams.builder()
        expected.put("trace_id", "trace_id")
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }
}
