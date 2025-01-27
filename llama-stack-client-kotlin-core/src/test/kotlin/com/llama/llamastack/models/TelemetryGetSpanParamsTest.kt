// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class TelemetryGetSpanParamsTest {

    @Test
    fun createTelemetryGetSpanParams() {
        TelemetryGetSpanParams.builder()
            .traceId("trace_id")
            .spanId("span_id")
            .xLlamaStackClientVersion("X-LlamaStack-Client-Version")
            .xLlamaStackProviderData("X-LlamaStack-Provider-Data")
            .build()
    }

    @Test
    fun getPathParam() {
        val params = TelemetryGetSpanParams.builder().traceId("trace_id").spanId("span_id").build()
        assertThat(params).isNotNull
        // path param "traceId"
        assertThat(params.getPathParam(0)).isEqualTo("trace_id")
        // path param "spanId"
        assertThat(params.getPathParam(1)).isEqualTo("span_id")
        // out-of-bound path param
        assertThat(params.getPathParam(2)).isEqualTo("")
    }
}
