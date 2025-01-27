// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class QueryConditionTest {

    @Test
    fun createQueryCondition() {
        val queryCondition =
            QueryCondition.builder()
                .key("key")
                .op(QueryCondition.Op.EQ)
                .value(QueryCondition.Value.ofBoolean(true))
                .build()
        assertThat(queryCondition).isNotNull
        assertThat(queryCondition.key()).isEqualTo("key")
        assertThat(queryCondition.op()).isEqualTo(QueryCondition.Op.EQ)
        assertThat(queryCondition.value()).isEqualTo(QueryCondition.Value.ofBoolean(true))
    }
}
