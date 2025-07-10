// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.llama.llamastack.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ResponseInputItemListParamsTest {

    @Test
    fun create() {
        ResponseInputItemListParams.builder()
            .responseId("response_id")
            .after("after")
            .before("before")
            .addInclude("string")
            .limit(0L)
            .order(ResponseInputItemListParams.Order.ASC)
            .build()
    }

    @Test
    fun pathParams() {
        val params = ResponseInputItemListParams.builder().responseId("response_id").build()

        assertThat(params._pathParam(0)).isEqualTo("response_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            ResponseInputItemListParams.builder()
                .responseId("response_id")
                .after("after")
                .before("before")
                .addInclude("string")
                .limit(0L)
                .order(ResponseInputItemListParams.Order.ASC)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("after", "after")
                    .put("before", "before")
                    .put("include", listOf("string").joinToString(","))
                    .put("limit", "0")
                    .put("order", "asc")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = ResponseInputItemListParams.builder().responseId("response_id").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
