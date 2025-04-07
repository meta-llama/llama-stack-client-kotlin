// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class QuerySpansResponseTest {

    @Test
    fun create() {
        val querySpansResponse =
            QuerySpansResponse.builder()
                .addData(
                    QuerySpansResponse.Data.builder()
                        .name("name")
                        .spanId("span_id")
                        .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .traceId("trace_id")
                        .attributes(
                            QuerySpansResponse.Data.Attributes.builder()
                                .putAdditionalProperty("foo", JsonValue.from(true))
                                .build()
                        )
                        .endTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .parentSpanId("parent_span_id")
                        .build()
                )
                .build()

        assertThat(querySpansResponse.data())
            .containsExactly(
                QuerySpansResponse.Data.builder()
                    .name("name")
                    .spanId("span_id")
                    .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .traceId("trace_id")
                    .attributes(
                        QuerySpansResponse.Data.Attributes.builder()
                            .putAdditionalProperty("foo", JsonValue.from(true))
                            .build()
                    )
                    .endTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .parentSpanId("parent_span_id")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val querySpansResponse =
            QuerySpansResponse.builder()
                .addData(
                    QuerySpansResponse.Data.builder()
                        .name("name")
                        .spanId("span_id")
                        .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .traceId("trace_id")
                        .attributes(
                            QuerySpansResponse.Data.Attributes.builder()
                                .putAdditionalProperty("foo", JsonValue.from(true))
                                .build()
                        )
                        .endTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .parentSpanId("parent_span_id")
                        .build()
                )
                .build()

        val roundtrippedQuerySpansResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(querySpansResponse),
                jacksonTypeRef<QuerySpansResponse>(),
            )

        assertThat(roundtrippedQuerySpansResponse).isEqualTo(querySpansResponse)
    }
}
