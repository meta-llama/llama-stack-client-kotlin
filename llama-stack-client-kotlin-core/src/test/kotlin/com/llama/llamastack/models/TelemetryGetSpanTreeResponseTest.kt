// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TelemetryGetSpanTreeResponseTest {

    @Test
    fun create() {
        val telemetryGetSpanTreeResponse =
            TelemetryGetSpanTreeResponse.builder()
                .putAdditionalProperty(
                    "foo",
                    JsonValue.from(
                        mapOf(
                            "name" to "name",
                            "span_id" to "span_id",
                            "start_time" to "2019-12-27T18:11:19.117Z",
                            "trace_id" to "trace_id",
                            "attributes" to mapOf("foo" to true),
                            "end_time" to "2019-12-27T18:11:19.117Z",
                            "parent_span_id" to "parent_span_id",
                            "status" to "ok",
                        )
                    ),
                )
                .build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val telemetryGetSpanTreeResponse =
            TelemetryGetSpanTreeResponse.builder()
                .putAdditionalProperty(
                    "foo",
                    JsonValue.from(
                        mapOf(
                            "name" to "name",
                            "span_id" to "span_id",
                            "start_time" to "2019-12-27T18:11:19.117Z",
                            "trace_id" to "trace_id",
                            "attributes" to mapOf("foo" to true),
                            "end_time" to "2019-12-27T18:11:19.117Z",
                            "parent_span_id" to "parent_span_id",
                            "status" to "ok",
                        )
                    ),
                )
                .build()

        val roundtrippedTelemetryGetSpanTreeResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(telemetryGetSpanTreeResponse),
                jacksonTypeRef<TelemetryGetSpanTreeResponse>(),
            )

        assertThat(roundtrippedTelemetryGetSpanTreeResponse).isEqualTo(telemetryGetSpanTreeResponse)
    }
}
