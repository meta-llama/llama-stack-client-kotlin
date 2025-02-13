// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.llama.llamastack.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class TelemetryQuerySpansParamsTest {

    @Test
    fun create() {
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
    }

    @Test
    fun queryParams() {
        val params =
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
        val expected = QueryParams.builder()
        expected.put(
            "attribute_filters",
            QueryCondition.builder()
                .key("key")
                .op(QueryCondition.Op.EQ)
                .value(QueryCondition.Value.ofBoolean(true))
                .build()
                .toString()
        )
        expected.put("attributes_to_return", "string")
        expected.put("max_depth", "0")
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            TelemetryQuerySpansParams.builder()
                .addAttributeFilter(
                    QueryCondition.builder()
                        .key("key")
                        .op(QueryCondition.Op.EQ)
                        .value(QueryCondition.Value.ofBoolean(true))
                        .build()
                )
                .addAttributesToReturn("string")
                .build()
        val expected = QueryParams.builder()
        expected.put(
            "attribute_filters",
            QueryCondition.builder()
                .key("key")
                .op(QueryCondition.Op.EQ)
                .value(QueryCondition.Value.ofBoolean(true))
                .build()
                .toString()
        )
        expected.put("attributes_to_return", "string")
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }
}
