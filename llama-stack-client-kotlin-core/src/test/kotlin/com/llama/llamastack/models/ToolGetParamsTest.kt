// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ToolGetParamsTest {

    @Test
    fun create() {
        ToolGetParams.builder().toolName("tool_name").build()
    }

    @Test
    fun pathParams() {
        val params = ToolGetParams.builder().toolName("tool_name").build()

        assertThat(params._pathParam(0)).isEqualTo("tool_name")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
