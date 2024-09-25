// File generated from our OpenAPI spec by Stainless.

package com.llama_stack_client.api.models

import com.llama_stack_client.api.models.*
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class TelemetryLogParamsTest {

    @Test
    fun createTelemetryLogParams() {
        TelemetryLogParams.builder()
            .event(
                TelemetryLogParams.Event.ofUnstructuredLogEvent(
                    TelemetryLogParams.Event.UnstructuredLogEvent.builder()
                        .message("message")
                        .severity(TelemetryLogParams.Event.UnstructuredLogEvent.Severity.VERBOSE)
                        .spanId("span_id")
                        .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .traceId("trace_id")
                        .type(TelemetryLogParams.Event.UnstructuredLogEvent.Type.UNSTRUCTURED_LOG)
                        .attributes(
                            TelemetryLogParams.Event.UnstructuredLogEvent.Attributes.builder()
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
            TelemetryLogParams.builder()
                .event(
                    TelemetryLogParams.Event.ofUnstructuredLogEvent(
                        TelemetryLogParams.Event.UnstructuredLogEvent.builder()
                            .message("message")
                            .severity(
                                TelemetryLogParams.Event.UnstructuredLogEvent.Severity.VERBOSE
                            )
                            .spanId("span_id")
                            .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .traceId("trace_id")
                            .type(
                                TelemetryLogParams.Event.UnstructuredLogEvent.Type.UNSTRUCTURED_LOG
                            )
                            .attributes(
                                TelemetryLogParams.Event.UnstructuredLogEvent.Attributes.builder()
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
                TelemetryLogParams.Event.ofUnstructuredLogEvent(
                    TelemetryLogParams.Event.UnstructuredLogEvent.builder()
                        .message("message")
                        .severity(TelemetryLogParams.Event.UnstructuredLogEvent.Severity.VERBOSE)
                        .spanId("span_id")
                        .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .traceId("trace_id")
                        .type(TelemetryLogParams.Event.UnstructuredLogEvent.Type.UNSTRUCTURED_LOG)
                        .attributes(
                            TelemetryLogParams.Event.UnstructuredLogEvent.Attributes.builder()
                                .build()
                        )
                        .build()
                )
            )
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            TelemetryLogParams.builder()
                .event(
                    TelemetryLogParams.Event.ofUnstructuredLogEvent(
                        TelemetryLogParams.Event.UnstructuredLogEvent.builder()
                            .message("message")
                            .severity(
                                TelemetryLogParams.Event.UnstructuredLogEvent.Severity.VERBOSE
                            )
                            .spanId("span_id")
                            .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .traceId("trace_id")
                            .type(
                                TelemetryLogParams.Event.UnstructuredLogEvent.Type.UNSTRUCTURED_LOG
                            )
                            .build()
                    )
                )
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.event())
            .isEqualTo(
                TelemetryLogParams.Event.ofUnstructuredLogEvent(
                    TelemetryLogParams.Event.UnstructuredLogEvent.builder()
                        .message("message")
                        .severity(TelemetryLogParams.Event.UnstructuredLogEvent.Severity.VERBOSE)
                        .spanId("span_id")
                        .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .traceId("trace_id")
                        .type(TelemetryLogParams.Event.UnstructuredLogEvent.Type.UNSTRUCTURED_LOG)
                        .build()
                )
            )
    }
}
