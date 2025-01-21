// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.llama.llamastack.core.JsonValue
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class TelemetryQuerySpansResponseTest {

    @Test
    fun createTelemetryQuerySpansResponse() {
        val telemetryQuerySpansResponse =
            TelemetryQuerySpansResponse.builder()
                .name("name")
                .spanId("span_id")
                .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .traceId("trace_id")
                .attributes(
                    TelemetryQuerySpansResponse.Attributes.builder()
                        .putAdditionalProperty("foo", JsonValue.from(true))
                        .build()
                )
                .endTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .parentSpanId("parent_span_id")
                .build()
        assertThat(telemetryQuerySpansResponse).isNotNull
        assertThat(telemetryQuerySpansResponse.name()).isEqualTo("name")
        assertThat(telemetryQuerySpansResponse.spanId()).isEqualTo("span_id")
        assertThat(telemetryQuerySpansResponse.startTime())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(telemetryQuerySpansResponse.traceId()).isEqualTo("trace_id")
        assertThat(telemetryQuerySpansResponse.attributes())
            .isEqualTo(
                TelemetryQuerySpansResponse.Attributes.builder()
                    .putAdditionalProperty("foo", JsonValue.from(true))
                    .build()
            )
        assertThat(telemetryQuerySpansResponse.endTime())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(telemetryQuerySpansResponse.parentSpanId()).isEqualTo("parent_span_id")
    }
}
