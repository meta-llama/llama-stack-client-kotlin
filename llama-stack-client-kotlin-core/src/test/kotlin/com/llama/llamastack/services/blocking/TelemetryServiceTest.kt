// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.blocking

import com.llama.llamastack.TestServerExtension
import com.llama.llamastack.client.okhttp.LlamaStackClientOkHttpClient
import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.models.Event
import com.llama.llamastack.models.QueryCondition
import com.llama.llamastack.models.TelemetryGetSpanParams
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
internal class TelemetryServiceTest {

    @Test
    fun getSpan() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val telemetryService = client.telemetry()

        val response =
            telemetryService.getSpan(
                TelemetryGetSpanParams.builder().traceId("trace_id").spanId("span_id").build()
            )

        response.validate()
    }

    @Test
    fun getSpanTree() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val telemetryService = client.telemetry()

        val response =
            telemetryService.getSpanTree(
                TelemetryGetSpanTreeParams.builder()
                    .spanId("span_id")
                    .addAttributesToReturn("string")
                    .maxDepth(0L)
                    .build()
            )

        response.validate()
    }

    @Test
    fun getTrace() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val telemetryService = client.telemetry()

        val trace = telemetryService.getTrace("trace_id")

        trace.validate()
    }

    @Test
    fun logEvent() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val telemetryService = client.telemetry()

        telemetryService.logEvent(
            TelemetryLogEventParams.builder()
                .event(
                    Event.UnstructuredLog.builder()
                        .message("message")
                        .severity(Event.UnstructuredLog.Severity.VERBOSE)
                        .spanId("span_id")
                        .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .traceId("trace_id")
                        .attributes(
                            Event.UnstructuredLog.Attributes.builder()
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
    fun querySpans() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val telemetryService = client.telemetry()

        val response =
            telemetryService.querySpans(
                TelemetryQuerySpansParams.builder()
                    .addAttributeFilter(
                        QueryCondition.builder()
                            .key("key")
                            .op(QueryCondition.Op.EQ)
                            .value(true)
                            .build()
                    )
                    .addAttributesToReturn("string")
                    .maxDepth(0L)
                    .build()
            )

        response.forEach { it.validate() }
    }

    @Disabled("unsupported query params in java / kotlin")
    @Test
    fun queryTraces() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val telemetryService = client.telemetry()

        val traces =
            telemetryService.queryTraces(
                TelemetryQueryTracesParams.builder()
                    .addAttributeFilter(
                        QueryCondition.builder()
                            .key("key")
                            .op(QueryCondition.Op.EQ)
                            .value(true)
                            .build()
                    )
                    .limit(0L)
                    .offset(0L)
                    .addOrderBy("string")
                    .build()
            )

        traces.forEach { it.validate() }
    }

    @Test
    fun saveSpansToDataset() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val telemetryService = client.telemetry()

        telemetryService.saveSpansToDataset(
            TelemetrySaveSpansToDatasetParams.builder()
                .addAttributeFilter(
                    QueryCondition.builder().key("key").op(QueryCondition.Op.EQ).value(true).build()
                )
                .addAttributesToSave("string")
                .datasetId("dataset_id")
                .maxDepth(0L)
                .build()
        )
    }
}
