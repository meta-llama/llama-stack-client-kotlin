// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class QueryResultTest {

    @Test
    fun createQueryResult() {
        val queryResult = QueryResult.builder().content("string").build()
        assertThat(queryResult).isNotNull
        assertThat(queryResult.content()).isEqualTo(InterleavedContent.ofString("string"))
    }
}
