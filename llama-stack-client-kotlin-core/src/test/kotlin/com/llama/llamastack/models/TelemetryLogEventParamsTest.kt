// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.llama.llamastack.core.JsonValue
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class TelemetryLogEventParamsTest {

    @Test
    fun createTelemetryLogEventParams() {
        TelemetryLogEventParams.builder()
            .event(
                TelemetryLogEventParams.Event.UnstructuredLog.builder()
                    .message("message")
                    .severity(TelemetryLogEventParams.Event.UnstructuredLog.Severity.VERBOSE)
                    .spanId("span_id")
                    .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .traceId("trace_id")
                    .type(TelemetryLogEventParams.Event.UnstructuredLog.Type.UNSTRUCTURED_LOG)
                    .attributes(
                        TelemetryLogEventParams.Event.UnstructuredLog.Attributes.builder()
                            .putAdditionalProperty("foo", JsonValue.from(true))
                            .build()
                    )
                    .build()
            )
            .ttlSeconds(0L)
            .xLlamaStackClientVersion("X-LlamaStack-Client-Version")
            .xLlamaStackProviderData("X-LlamaStack-Provider-Data")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            TelemetryLogEventParams.builder()
                .event(
                    TelemetryLogEventParams.Event.UnstructuredLog.builder()
                        .message("message")
                        .severity(TelemetryLogEventParams.Event.UnstructuredLog.Severity.VERBOSE)
                        .spanId("span_id")
                        .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .traceId("trace_id")
                        .type(TelemetryLogEventParams.Event.UnstructuredLog.Type.UNSTRUCTURED_LOG)
                        .attributes(
                            TelemetryLogEventParams.Event.UnstructuredLog.Attributes.builder()
                                .putAdditionalProperty("foo", JsonValue.from(true))
                                .build()
                        )
                        .build()
                )
                .ttlSeconds(0L)
                .xLlamaStackClientVersion("X-LlamaStack-Client-Version")
                .xLlamaStackProviderData("X-LlamaStack-Provider-Data")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.event())
            .isEqualTo(
                TelemetryLogEventParams.Event.ofUnstructuredLog(
                    TelemetryLogEventParams.Event.UnstructuredLog.builder()
                        .message("message")
                        .severity(TelemetryLogEventParams.Event.UnstructuredLog.Severity.VERBOSE)
                        .spanId("span_id")
                        .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .traceId("trace_id")
                        .type(TelemetryLogEventParams.Event.UnstructuredLog.Type.UNSTRUCTURED_LOG)
                        .attributes(
                            TelemetryLogEventParams.Event.UnstructuredLog.Attributes.builder()
                                .putAdditionalProperty("foo", JsonValue.from(true))
                                .build()
                        )
                        .build()
                )
            )
        assertThat(body.ttlSeconds()).isEqualTo(0L)
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            TelemetryLogEventParams.builder()
                .event(
                    TelemetryLogEventParams.Event.UnstructuredLog.builder()
                        .message("message")
                        .severity(TelemetryLogEventParams.Event.UnstructuredLog.Severity.VERBOSE)
                        .spanId("span_id")
                        .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .traceId("trace_id")
                        .type(TelemetryLogEventParams.Event.UnstructuredLog.Type.UNSTRUCTURED_LOG)
                        .build()
                )
                .ttlSeconds(0L)
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.event())
            .isEqualTo(
                TelemetryLogEventParams.Event.ofUnstructuredLog(
                    TelemetryLogEventParams.Event.UnstructuredLog.builder()
                        .message("message")
                        .severity(TelemetryLogEventParams.Event.UnstructuredLog.Severity.VERBOSE)
                        .spanId("span_id")
                        .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .traceId("trace_id")
                        .type(TelemetryLogEventParams.Event.UnstructuredLog.Type.UNSTRUCTURED_LOG)
                        .build()
                )
            )
        assertThat(body.ttlSeconds()).isEqualTo(0L)
    }
}
