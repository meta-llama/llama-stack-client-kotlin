// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.blocking

import com.llama.llamastack.TestServerExtension
import com.llama.llamastack.client.okhttp.LlamaStackClientOkHttpClient
import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.models.Event
import com.llama.llamastack.models.QueryCondition
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
import org.junit.jupiter.api.Disabled
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
                TelemetryGetSpanParams.builder().traceId("trace_id").spanId("span_id").build()
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
                    .addAttributesToReturn("string")
                    .maxDepth(0L)
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
            telemetryService.getTrace(TelemetryGetTraceParams.builder().traceId("trace_id").build())
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
                    Event.UnstructuredLogEvent.builder()
                        .message("message")
                        .severity(Event.UnstructuredLogEvent.Severity.VERBOSE)
                        .spanId("span_id")
                        .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .traceId("trace_id")
                        .attributes(
                            Event.UnstructuredLogEvent.Attributes.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .build()
                )
                .ttlSeconds(0L)
                .build()
        )
    }

    @Disabled("unsupported query params in java / kotlin")
    @Test
    fun callQuerySpans() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val telemetryService = client.telemetry()
        val querySpansResponse =
            telemetryService.querySpans(
                TelemetryQuerySpansParams.builder()
                    .addAttributeFilter(
                        QueryCondition.builder()
                            .key("key")
                            .op(QueryCondition.Op.EQ)
                            .value(QueryCondition.Value.ofBoolean(true))
                            .build()
                    )
                    .addAttributesToReturn("string")
                    .maxDepth(0L)
                    .build()
            )
        println(querySpansResponse)
        for (span: QuerySpansResponse.Data in querySpansResponse) {
            span.validate()
        }
    }

    @Disabled("unsupported query params in java / kotlin")
    @Test
    fun callQueryTraces() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val telemetryService = client.telemetry()
        val queryTracesResponse =
            telemetryService.queryTraces(
                TelemetryQueryTracesParams.builder()
                    .addAttributeFilter(
                        QueryCondition.builder()
                            .key("key")
                            .op(QueryCondition.Op.EQ)
                            .value(QueryCondition.Value.ofBoolean(true))
                            .build()
                    )
                    .limit(0L)
                    .offset(0L)
                    .addOrderBy("string")
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
                .addAttributeFilter(
                    QueryCondition.builder()
                        .key("key")
                        .op(QueryCondition.Op.EQ)
                        .value(QueryCondition.Value.ofBoolean(true))
                        .build()
                )
                .addAttributesToSave("string")
                .datasetId("dataset_id")
                .maxDepth(0L)
                .build()
        )
    }
}
