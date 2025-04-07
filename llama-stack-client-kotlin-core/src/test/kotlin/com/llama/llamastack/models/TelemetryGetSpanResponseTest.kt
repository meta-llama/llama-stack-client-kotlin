// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TelemetryGetSpanResponseTest {

    @Test
    fun create() {
        val telemetryGetSpanResponse =
            TelemetryGetSpanResponse.builder()
                .name("name")
                .spanId("span_id")
                .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .traceId("trace_id")
                .attributes(
                    TelemetryGetSpanResponse.Attributes.builder()
                        .putAdditionalProperty("foo", JsonValue.from(true))
                        .build()
                )
                .endTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .parentSpanId("parent_span_id")
                .build()

        assertThat(telemetryGetSpanResponse.name()).isEqualTo("name")
        assertThat(telemetryGetSpanResponse.spanId()).isEqualTo("span_id")
        assertThat(telemetryGetSpanResponse.startTime())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(telemetryGetSpanResponse.traceId()).isEqualTo("trace_id")
        assertThat(telemetryGetSpanResponse.attributes())
            .isEqualTo(
                TelemetryGetSpanResponse.Attributes.builder()
                    .putAdditionalProperty("foo", JsonValue.from(true))
                    .build()
            )
        assertThat(telemetryGetSpanResponse.endTime())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(telemetryGetSpanResponse.parentSpanId()).isEqualTo("parent_span_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val telemetryGetSpanResponse =
            TelemetryGetSpanResponse.builder()
                .name("name")
                .spanId("span_id")
                .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .traceId("trace_id")
                .attributes(
                    TelemetryGetSpanResponse.Attributes.builder()
                        .putAdditionalProperty("foo", JsonValue.from(true))
                        .build()
                )
                .endTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .parentSpanId("parent_span_id")
                .build()

        val roundtrippedTelemetryGetSpanResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(telemetryGetSpanResponse),
                jacksonTypeRef<TelemetryGetSpanResponse>(),
            )

        assertThat(roundtrippedTelemetryGetSpanResponse).isEqualTo(telemetryGetSpanResponse)
    }
}
