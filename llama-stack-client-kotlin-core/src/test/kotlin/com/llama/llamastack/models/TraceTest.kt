// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class TraceTest {

    @Test
    fun createTrace() {
        val trace =
            Trace.builder()
                .rootSpanId("root_span_id")
                .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .traceId("trace_id")
                .endTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()
        assertThat(trace).isNotNull
        assertThat(trace.rootSpanId()).isEqualTo("root_span_id")
        assertThat(trace.startTime()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(trace.traceId()).isEqualTo("trace_id")
        assertThat(trace.endTime()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }
}
