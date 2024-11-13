// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.llama.llamastack.models.*
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class TelemetryLogEventParamsTest {

    @Test
    fun createTelemetryLogEventParams() {
        TelemetryLogEventParams.builder()
            .event(
                TelemetryLogEventParams.Event.ofUnstructuredLogEvent(
                    TelemetryLogEventParams.Event.UnstructuredLogEvent.builder()
                        .message("message")
                        .severity(
                            TelemetryLogEventParams.Event.UnstructuredLogEvent.Severity.VERBOSE
                        )
                        .spanId("span_id")
                        .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .traceId("trace_id")
                        .type(
                            TelemetryLogEventParams.Event.UnstructuredLogEvent.Type.UNSTRUCTURED_LOG
                        )
                        .attributes(
                            TelemetryLogEventParams.Event.UnstructuredLogEvent.Attributes.builder()
                                .build()
                        )
                        .build()
                )
            )
            .build()
    }

    @Test
    fun getBody() {
        val params =
            TelemetryLogEventParams.builder()
                .event(
                    TelemetryLogEventParams.Event.ofUnstructuredLogEvent(
                        TelemetryLogEventParams.Event.UnstructuredLogEvent.builder()
                            .message("message")
                            .severity(
                                TelemetryLogEventParams.Event.UnstructuredLogEvent.Severity.VERBOSE
                            )
                            .spanId("span_id")
                            .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .traceId("trace_id")
                            .type(
                                TelemetryLogEventParams.Event.UnstructuredLogEvent.Type
                                    .UNSTRUCTURED_LOG
                            )
                            .attributes(
                                TelemetryLogEventParams.Event.UnstructuredLogEvent.Attributes
                                    .builder()
                                    .build()
                            )
                            .build()
                    )
                )
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.event())
            .isEqualTo(
                TelemetryLogEventParams.Event.ofUnstructuredLogEvent(
                    TelemetryLogEventParams.Event.UnstructuredLogEvent.builder()
                        .message("message")
                        .severity(
                            TelemetryLogEventParams.Event.UnstructuredLogEvent.Severity.VERBOSE
                        )
                        .spanId("span_id")
                        .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .traceId("trace_id")
                        .type(
                            TelemetryLogEventParams.Event.UnstructuredLogEvent.Type.UNSTRUCTURED_LOG
                        )
                        .attributes(
                            TelemetryLogEventParams.Event.UnstructuredLogEvent.Attributes.builder()
                                .build()
                        )
                        .build()
                )
            )
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            TelemetryLogEventParams.builder()
                .event(
                    TelemetryLogEventParams.Event.ofUnstructuredLogEvent(
                        TelemetryLogEventParams.Event.UnstructuredLogEvent.builder()
                            .message("message")
                            .severity(
                                TelemetryLogEventParams.Event.UnstructuredLogEvent.Severity.VERBOSE
                            )
                            .spanId("span_id")
                            .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .traceId("trace_id")
                            .type(
                                TelemetryLogEventParams.Event.UnstructuredLogEvent.Type
                                    .UNSTRUCTURED_LOG
                            )
                            .build()
                    )
                )
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.event())
            .isEqualTo(
                TelemetryLogEventParams.Event.ofUnstructuredLogEvent(
                    TelemetryLogEventParams.Event.UnstructuredLogEvent.builder()
                        .message("message")
                        .severity(
                            TelemetryLogEventParams.Event.UnstructuredLogEvent.Severity.VERBOSE
                        )
                        .spanId("span_id")
                        .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .traceId("trace_id")
                        .type(
                            TelemetryLogEventParams.Event.UnstructuredLogEvent.Type.UNSTRUCTURED_LOG
                        )
                        .build()
                )
            )
    }
}
