// File generated from our OpenAPI spec by Stainless.

package com.llama_stack_client.api.services.blocking

import com.llama_stack_client.api.TestServerExtension
import com.llama_stack_client.api.client.okhttp.LlamaStackClientOkHttpClient
import com.llama_stack_client.api.models.*
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
        val telemetryGetTraceResponse =
            telemetryService.getTrace(TelemetryGetTraceParams.builder().traceId("trace_id").build())
        println(telemetryGetTraceResponse)
        telemetryGetTraceResponse.validate()
    }

    @Test
    fun callLog() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val telemetryService = client.telemetry()
        telemetryService.log(
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
        )
    }
}
