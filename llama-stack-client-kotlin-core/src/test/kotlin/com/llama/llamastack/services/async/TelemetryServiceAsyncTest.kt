// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.async

import com.llama.llamastack.TestServerExtension
import com.llama.llamastack.client.okhttp.LlamaStackClientOkHttpClientAsync
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
internal class TelemetryServiceAsyncTest {

    @Test
    suspend fun getSpan() {
        val client =
            LlamaStackClientOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .build()
        val telemetryServiceAsync = client.telemetry()

        val response =
            telemetryServiceAsync.getSpan(
                TelemetryGetSpanParams.builder().traceId("trace_id").spanId("span_id").build()
            )

        response.validate()
    }

    @Test
    suspend fun getSpanTree() {
        val client =
            LlamaStackClientOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .build()
        val telemetryServiceAsync = client.telemetry()

        val response =
            telemetryServiceAsync.getSpanTree(
                TelemetryGetSpanTreeParams.builder()
                    .spanId("span_id")
                    .addAttributesToReturn("string")
                    .maxDepth(0L)
                    .build()
            )

        response.validate()
    }

    @Test
    suspend fun getTrace() {
        val client =
            LlamaStackClientOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .build()
        val telemetryServiceAsync = client.telemetry()

        val trace = telemetryServiceAsync.getTrace("trace_id")

        trace.validate()
    }

    @Test
    suspend fun logEvent() {
        val client =
            LlamaStackClientOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .build()
        val telemetryServiceAsync = client.telemetry()

        telemetryServiceAsync.logEvent(
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
    suspend fun querySpans() {
        val client =
            LlamaStackClientOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .build()
        val telemetryServiceAsync = client.telemetry()

        val response =
            telemetryServiceAsync.querySpans(
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
    suspend fun queryTraces() {
        val client =
            LlamaStackClientOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .build()
        val telemetryServiceAsync = client.telemetry()

        val traces =
            telemetryServiceAsync.queryTraces(
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
    suspend fun saveSpansToDataset() {
        val client =
            LlamaStackClientOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .build()
        val telemetryServiceAsync = client.telemetry()

        telemetryServiceAsync.saveSpansToDataset(
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
