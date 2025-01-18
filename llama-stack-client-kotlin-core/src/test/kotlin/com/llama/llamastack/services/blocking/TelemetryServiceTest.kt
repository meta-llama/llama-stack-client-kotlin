// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.blocking

import com.llama.llamastack.TestServerExtension
import com.llama.llamastack.client.okhttp.LlamaStackClientOkHttpClient
import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.models.QuerySpansResponse
import com.llama.llamastack.models.TelemetryGetSpanParams
import com.llama.llamastack.models.TelemetryGetSpanTreeParams
import com.llama.llamastack.models.TelemetryGetTraceParams
import com.llama.llamastack.models.TelemetryLogEventParams
import com.llama.llamastack.models.TelemetryQuerySpansParams
import com.llama.llamastack.models.TelemetryQueryTracesParams
import com.llama.llamastack.models.TelemetrySaveSpansToDatasetParams
import com.llama.llamastack.models.Trace
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class TelemetryServiceTest {

    @Test
    fun callGetSpan() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val telemetryService = client.telemetry()
        val telemetryGetSpanResponse =
            telemetryService.getSpan(
                TelemetryGetSpanParams.builder()
                    .traceId("trace_id")
                    .spanId("span_id")
                    .xLlamaStackClientVersion("X-LlamaStack-Client-Version")
                    .xLlamaStackProviderData("X-LlamaStack-Provider-Data")
                    .build()
            )
        println(telemetryGetSpanResponse)
        telemetryGetSpanResponse.validate()
    }

    @Test
    fun callGetSpanTree() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val telemetryService = client.telemetry()
        val querySpanTreeResponse =
            telemetryService.getSpanTree(
                TelemetryGetSpanTreeParams.builder()
                    .spanId("span_id")
                    .attributesToReturn(listOf("string"))
                    .maxDepth(0L)
                    .xLlamaStackClientVersion("X-LlamaStack-Client-Version")
                    .xLlamaStackProviderData("X-LlamaStack-Provider-Data")
                    .build()
            )
        println(querySpanTreeResponse)
        querySpanTreeResponse.validate()
    }

    @Test
    fun callGetTrace() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val telemetryService = client.telemetry()
        val trace =
            telemetryService.getTrace(
                TelemetryGetTraceParams.builder()
                    .traceId("trace_id")
                    .xLlamaStackClientVersion("X-LlamaStack-Client-Version")
                    .xLlamaStackProviderData("X-LlamaStack-Provider-Data")
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
                                    .putAdditionalProperty("foo", JsonValue.from(true))
                                    .build()
                            )
                            .build()
                    )
                )
                .ttlSeconds(0L)
                .xLlamaStackClientVersion("X-LlamaStack-Client-Version")
                .xLlamaStackProviderData("X-LlamaStack-Provider-Data")
                .build()
        )
    }

    @Test
    fun callQuerySpans() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val telemetryService = client.telemetry()
        val querySpansResponse =
            telemetryService.querySpans(
                TelemetryQuerySpansParams.builder()
                    .attributeFilters(
                        listOf(
                            TelemetryQuerySpansParams.AttributeFilter.builder()
                                .key("key")
                                .op(TelemetryQuerySpansParams.AttributeFilter.Op.EQ)
                                .value(
                                    TelemetryQuerySpansParams.AttributeFilter.Value.ofBoolean(true)
                                )
                                .build()
                        )
                    )
                    .attributesToReturn(listOf("string"))
                    .maxDepth(0L)
                    .xLlamaStackClientVersion("X-LlamaStack-Client-Version")
                    .xLlamaStackProviderData("X-LlamaStack-Provider-Data")
                    .build()
            )
        println(querySpansResponse)
        for (span: QuerySpansResponse.Data in querySpansResponse) {
            span.validate()
        }
    }

    @Test
    fun callQueryTraces() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val telemetryService = client.telemetry()
        val queryTracesResponse =
            telemetryService.queryTraces(
                TelemetryQueryTracesParams.builder()
                    .attributeFilters(
                        listOf(
                            TelemetryQueryTracesParams.AttributeFilter.builder()
                                .key("key")
                                .op(TelemetryQueryTracesParams.AttributeFilter.Op.EQ)
                                .value(
                                    TelemetryQueryTracesParams.AttributeFilter.Value.ofBoolean(true)
                                )
                                .build()
                        )
                    )
                    .limit(0L)
                    .offset(0L)
                    .orderBy(listOf("string"))
                    .xLlamaStackClientVersion("X-LlamaStack-Client-Version")
                    .xLlamaStackProviderData("X-LlamaStack-Provider-Data")
                    .build()
            )
        println(queryTracesResponse)
        for (trace: Trace in queryTracesResponse) {
            trace.validate()
        }
    }

    @Test
    fun callSaveSpansToDataset() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val telemetryService = client.telemetry()
        telemetryService.saveSpansToDataset(
            TelemetrySaveSpansToDatasetParams.builder()
                .attributeFilters(
                    listOf(
                        TelemetrySaveSpansToDatasetParams.AttributeFilter.builder()
                            .key("key")
                            .op(TelemetrySaveSpansToDatasetParams.AttributeFilter.Op.EQ)
                            .value(
                                TelemetrySaveSpansToDatasetParams.AttributeFilter.Value.ofBoolean(
                                    true
                                )
                            )
                            .build()
                    )
                )
                .attributesToSave(listOf("string"))
                .datasetId("dataset_id")
                .maxDepth(0L)
                .xLlamaStackClientVersion("X-LlamaStack-Client-Version")
                .xLlamaStackProviderData("X-LlamaStack-Provider-Data")
                .build()
        )
    }
}
