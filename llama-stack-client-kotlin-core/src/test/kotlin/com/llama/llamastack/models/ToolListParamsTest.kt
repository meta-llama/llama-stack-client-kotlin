// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.llama.llamastack.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ToolListParamsTest {

    @Test
    fun create() {
        ToolListParams.builder().toolgroupId("toolgroup_id").build()
    }

    @Test
    fun queryParams() {
        val params = ToolListParams.builder().toolgroupId("toolgroup_id").build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("toolgroup_id", "toolgroup_id").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = ToolListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
