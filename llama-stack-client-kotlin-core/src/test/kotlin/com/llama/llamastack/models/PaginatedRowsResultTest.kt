// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.llama.llamastack.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PaginatedRowsResultTest {

    @Test
    fun createPaginatedRowsResult() {
        val paginatedRowsResult =
            PaginatedRowsResult.builder()
                .rows(
                    listOf(
                        PaginatedRowsResult.Row.builder()
                            .putAdditionalProperty("foo", JsonValue.from(true))
                            .build()
                    )
                )
                .totalCount(0L)
                .nextPageToken("next_page_token")
                .build()
        assertThat(paginatedRowsResult).isNotNull
        assertThat(paginatedRowsResult.rows())
            .containsExactly(
                PaginatedRowsResult.Row.builder()
                    .putAdditionalProperty("foo", JsonValue.from(true))
                    .build()
            )
        assertThat(paginatedRowsResult.totalCount()).isEqualTo(0L)
        assertThat(paginatedRowsResult.nextPageToken()).isEqualTo("next_page_token")
    }
}
