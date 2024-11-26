// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.blocking

import com.llama.llamastack.TestServerExtension
import com.llama.llamastack.client.okhttp.LlamaStackClientOkHttpClient
import com.llama.llamastack.models.*
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class TelemetryServiceTest {

    @Test
    fun callGetTrace() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val telemetryService = client.telemetry()
        val trace =
            telemetryService.getTrace(
                TelemetryGetTraceParams.builder()
                    .xLlamaStackProviderData("X-LlamaStack-ProviderData")
                    .traceId("trace_id")
                    .build()
            )
        println(trace)
        trace.validate()
    }

    @Test
    fun callLogEvent() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val telemetryService = client.telemetry()
        telemetryService.logEvent(
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
                .xLlamaStackProviderData("X-LlamaStack-ProviderData")
                .build()
        )
    }
}
