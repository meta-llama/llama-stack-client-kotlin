// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.core.jsonMapper
import com.llama.llamastack.errors.LlamaStackClientInvalidDataException
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.EnumSource

internal class EventTest {

    @Test
    fun ofUnstructuredLog() {
        val unstructuredLog =
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

        val event = Event.ofUnstructuredLog(unstructuredLog)

        assertThat(event.unstructuredLog()).isEqualTo(unstructuredLog)
        assertThat(event.metric()).isNull()
        assertThat(event.structuredLog()).isNull()
    }

    @Test
    fun ofUnstructuredLogRoundtrip() {
        val jsonMapper = jsonMapper()
        val event =
            Event.ofUnstructuredLog(
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

        val roundtrippedEvent =
            jsonMapper.readValue(jsonMapper.writeValueAsString(event), jacksonTypeRef<Event>())

        assertThat(roundtrippedEvent).isEqualTo(event)
    }

    @Test
    fun ofMetric() {
        val metric =
            Event.Metric.builder()
                .metric("metric")
                .spanId("span_id")
                .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .traceId("trace_id")
                .unit("unit")
                .value(0.0)
                .attributes(
                    Event.Metric.Attributes.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        val event = Event.ofMetric(metric)

        assertThat(event.unstructuredLog()).isNull()
        assertThat(event.metric()).isEqualTo(metric)
        assertThat(event.structuredLog()).isNull()
    }

    @Test
    fun ofMetricRoundtrip() {
        val jsonMapper = jsonMapper()
        val event =
            Event.ofMetric(
                Event.Metric.builder()
                    .metric("metric")
                    .spanId("span_id")
                    .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .traceId("trace_id")
                    .unit("unit")
                    .value(0.0)
                    .attributes(
                        Event.Metric.Attributes.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .build()
            )

        val roundtrippedEvent =
            jsonMapper.readValue(jsonMapper.writeValueAsString(event), jacksonTypeRef<Event>())

        assertThat(roundtrippedEvent).isEqualTo(event)
    }

    @Test
    fun ofStructuredLog() {
        val structuredLog =
            Event.StructuredLog.builder()
                .payload(
                    Event.StructuredLog.Payload.SpanStart.builder()
                        .name("name")
                        .parentSpanId("parent_span_id")
                        .build()
                )
                .spanId("span_id")
                .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .traceId("trace_id")
                .attributes(
                    Event.StructuredLog.Attributes.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        val event = Event.ofStructuredLog(structuredLog)

        assertThat(event.unstructuredLog()).isNull()
        assertThat(event.metric()).isNull()
        assertThat(event.structuredLog()).isEqualTo(structuredLog)
    }

    @Test
    fun ofStructuredLogRoundtrip() {
        val jsonMapper = jsonMapper()
        val event =
            Event.ofStructuredLog(
                Event.StructuredLog.builder()
                    .payload(
                        Event.StructuredLog.Payload.SpanStart.builder()
                            .name("name")
                            .parentSpanId("parent_span_id")
                            .build()
                    )
                    .spanId("span_id")
                    .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .traceId("trace_id")
                    .attributes(
                        Event.StructuredLog.Attributes.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .build()
            )

        val roundtrippedEvent =
            jsonMapper.readValue(jsonMapper.writeValueAsString(event), jacksonTypeRef<Event>())

        assertThat(roundtrippedEvent).isEqualTo(event)
    }

    enum class IncompatibleJsonShapeTestCase(val value: JsonValue) {
        BOOLEAN(JsonValue.from(false)),
        STRING(JsonValue.from("invalid")),
        INTEGER(JsonValue.from(-1)),
        FLOAT(JsonValue.from(3.14)),
        ARRAY(JsonValue.from(listOf("invalid", "array"))),
    }

    @ParameterizedTest
    @EnumSource
    fun incompatibleJsonShapeDeserializesToUnknown(testCase: IncompatibleJsonShapeTestCase) {
        val event = jsonMapper().convertValue(testCase.value, jacksonTypeRef<Event>())

        val e = assertThrows<LlamaStackClientInvalidDataException> { event.validate() }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
