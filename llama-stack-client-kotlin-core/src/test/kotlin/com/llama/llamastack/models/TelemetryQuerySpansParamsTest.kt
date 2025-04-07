// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TelemetryQuerySpansParamsTest {

    @Test
    fun create() {
        TelemetryQuerySpansParams.builder()
            .addAttributeFilter(
                QueryCondition.builder().key("key").op(QueryCondition.Op.EQ).value(true).build()
            )
            .addAttributesToReturn("string")
            .maxDepth(0L)
            .build()
    }

    @Test
    fun body() {
        val params =
            TelemetryQuerySpansParams.builder()
                .addAttributeFilter(
                    QueryCondition.builder().key("key").op(QueryCondition.Op.EQ).value(true).build()
                )
                .addAttributesToReturn("string")
                .maxDepth(0L)
                .build()

        val body = params._body()

        assertThat(body.attributeFilters())
            .containsExactly(
                QueryCondition.builder().key("key").op(QueryCondition.Op.EQ).value(true).build()
            )
        assertThat(body.attributesToReturn()).containsExactly("string")
        assertThat(body.maxDepth()).isEqualTo(0L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            TelemetryQuerySpansParams.builder()
                .addAttributeFilter(
                    QueryCondition.builder().key("key").op(QueryCondition.Op.EQ).value(true).build()
                )
                .addAttributesToReturn("string")
                .build()

        val body = params._body()

        assertThat(body.attributeFilters())
            .containsExactly(
                QueryCondition.builder().key("key").op(QueryCondition.Op.EQ).value(true).build()
            )
        assertThat(body.attributesToReturn()).containsExactly("string")
    }
}
