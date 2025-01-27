// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.llama.llamastack.core.JsonValue
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SpanWithStatusTest {

    @Test
    fun createSpanWithStatus() {
        val spanWithStatus =
            SpanWithStatus.builder()
                .name("name")
                .spanId("span_id")
                .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .traceId("trace_id")
                .attributes(
                    SpanWithStatus.Attributes.builder()
                        .putAdditionalProperty("foo", JsonValue.from(true))
                        .build()
                )
                .endTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .parentSpanId("parent_span_id")
                .status(SpanWithStatus.Status.OK)
                .build()
        assertThat(spanWithStatus).isNotNull
        assertThat(spanWithStatus.name()).isEqualTo("name")
        assertThat(spanWithStatus.spanId()).isEqualTo("span_id")
        assertThat(spanWithStatus.startTime())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(spanWithStatus.traceId()).isEqualTo("trace_id")
        assertThat(spanWithStatus.attributes())
            .isEqualTo(
                SpanWithStatus.Attributes.builder()
                    .putAdditionalProperty("foo", JsonValue.from(true))
                    .build()
            )
        assertThat(spanWithStatus.endTime())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(spanWithStatus.parentSpanId()).isEqualTo("parent_span_id")
        assertThat(spanWithStatus.status()).isEqualTo(SpanWithStatus.Status.OK)
    }
}
