// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.llama.llamastack.core.http.QueryParams
import org.junit.jupiter.api.Test

class TelemetryQuerySpansParamsTest {

    @Test
    fun createTelemetryQuerySpansParams() {
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
            .xLlamaStackClientVersion("X-LlamaStack-Client-Version")
            .xLlamaStackProviderData("X-LlamaStack-Provider-Data")
            .build()
    }

    @Test
    fun getQueryParams() {
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
                .xLlamaStackClientVersion("X-LlamaStack-Client-Version")
                .xLlamaStackProviderData("X-LlamaStack-Provider-Data")
                .build()
        val expected = QueryParams.builder()
        expected.put(
            "attribute_filters",
            QueryCondition.builder()
                .key("key")
                .op(QueryCondition.Op.EQ.toString())
                .value(QueryCondition.Value.ofBoolean("true").toString())
                .build()
        )
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
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
                .op(QueryCondition.Op.EQ.toString())
                .value(QueryCondition.Value.ofBoolean("true").toString())
                .build()
        )
    }
}
