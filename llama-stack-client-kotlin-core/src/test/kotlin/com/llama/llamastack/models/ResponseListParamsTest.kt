// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.llama.llamastack.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ResponseListParamsTest {

    @Test
    fun create() {
        ResponseListParams.builder()
            .after("after")
            .limit(0L)
            .model("model")
            .order(ResponseListParams.Order.ASC)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            ResponseListParams.builder()
                .after("after")
                .limit(0L)
                .model("model")
                .order(ResponseListParams.Order.ASC)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("after", "after")
                    .put("limit", "0")
                    .put("model", "model")
                    .put("order", "asc")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = ResponseListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
