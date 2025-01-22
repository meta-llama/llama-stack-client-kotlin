// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.llama.llamastack.core.JsonValue
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class QuerySpansResponseTest {

    @Test
    fun createQuerySpansResponse() {
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
        assertThat(querySpansResponse).isNotNull
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
}
