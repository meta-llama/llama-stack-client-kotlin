// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.llama.llamastack.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FileListParamsTest {

    @Test
    fun create() {
        FileListParams.builder()
            .after("after")
            .limit(0L)
            .order(FileListParams.Order.ASC)
            .purpose(FileListParams.Purpose.ASSISTANTS)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            FileListParams.builder()
                .after("after")
                .limit(0L)
                .order(FileListParams.Order.ASC)
                .purpose(FileListParams.Purpose.ASSISTANTS)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("after", "after")
                    .put("limit", "0")
                    .put("order", "asc")
                    .put("purpose", "assistants")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = FileListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
