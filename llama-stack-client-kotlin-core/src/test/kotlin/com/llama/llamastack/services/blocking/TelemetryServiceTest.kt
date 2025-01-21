// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.blocking

import com.llama.llamastack.TestServerExtension
import com.llama.llamastack.client.okhttp.LlamaStackClientOkHttpClient
import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.models.TelemetryGetSpanTreeParams
import com.llama.llamastack.models.TelemetryLogEventParams
import com.llama.llamastack.models.TelemetryQuerySpansParams
import com.llama.llamastack.models.TelemetryQueryTracesParams
import com.llama.llamastack.models.TelemetrySaveSpansToDatasetParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class TelemetryServiceTest {

    @Test
    fun callGetSpanTree() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val telemetryService = client.telemetry()
        val telemetryGetSpanTreeResponse =
            telemetryService.getSpanTree(
                TelemetryGetSpanTreeParams.builder()
                    .spanId("span_id")
                    .maxDepth(0L)
                    .attributesToReturn(listOf("string"))
                    .xLlamaStackClientVersion("X-LlamaStack-Client-Version")
                    .xLlamaStackProviderData("X-LlamaStack-Provider-Data")
                    .build()
            )
        println(telemetryGetSpanTreeResponse)
        telemetryGetSpanTreeResponse.validate()
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

    @Disabled(
        "skipped: currently no good way to test endpoints with content type application/jsonl, Prism mock server will fail"
    )
    @Test
    fun callQuerySpans() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val telemetryService = client.telemetry()
        val telemetryQuerySpansResponse =
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
        println(telemetryQuerySpansResponse)
        telemetryQuerySpansResponse.validate()
    }

    @Disabled(
        "skipped: currently no good way to test endpoints with content type application/jsonl, Prism mock server will fail"
    )
    @Test
    fun callQueryTraces() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val telemetryService = client.telemetry()
        val trace =
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
        println(trace)
        trace.validate()
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
