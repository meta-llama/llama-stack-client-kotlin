// File generated from our OpenAPI spec by Stainless.

package com.llama_stack_client.api.models

import com.llama_stack_client.api.models.*
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
        val expected = mutableMapOf<String, List<String>>()
        expected.put("trace_id", listOf("trace_id"))
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = TelemetryGetTraceParams.builder().traceId("trace_id").build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("trace_id", listOf("trace_id"))
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }
}
