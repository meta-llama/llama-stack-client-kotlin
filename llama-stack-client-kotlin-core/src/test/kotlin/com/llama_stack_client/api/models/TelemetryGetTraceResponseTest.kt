// File generated from our OpenAPI spec by Stainless.

package com.llama_stack_client.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class TelemetryGetTraceResponseTest {

    @Test
    fun createTelemetryGetTraceResponse() {
        val telemetryGetTraceResponse =
            TelemetryGetTraceResponse.builder()
                .rootSpanId("root_span_id")
                .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .traceId("trace_id")
                .endTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()
        assertThat(telemetryGetTraceResponse).isNotNull
        assertThat(telemetryGetTraceResponse.rootSpanId()).isEqualTo("root_span_id")
        assertThat(telemetryGetTraceResponse.startTime())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(telemetryGetTraceResponse.traceId()).isEqualTo("trace_id")
        assertThat(telemetryGetTraceResponse.endTime())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }
}
