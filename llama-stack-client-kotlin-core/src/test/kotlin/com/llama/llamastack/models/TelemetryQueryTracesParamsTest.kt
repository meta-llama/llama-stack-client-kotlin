// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.llama.llamastack.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class TelemetryQueryTracesParamsTest {

    @Test
    fun create() {
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
    }

    @Test
    fun queryParams() {
        val params =
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
        expected.put("limit", "0")
        expected.put("offset", "0")
        expected.put("order_by", "string")
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = TelemetryQueryTracesParams.builder().build()
        val expected = QueryParams.builder()
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }
}
