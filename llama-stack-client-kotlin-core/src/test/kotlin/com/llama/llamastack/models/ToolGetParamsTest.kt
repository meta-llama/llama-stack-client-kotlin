// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ToolGetParamsTest {

    @Test
    fun create() {
        ToolGetParams.builder().toolName("tool_name").build()
    }

    @Test
    fun getPathParam() {
        val params = ToolGetParams.builder().toolName("tool_name").build()
        assertThat(params).isNotNull
        // path param "toolName"
        assertThat(params.getPathParam(0)).isEqualTo("tool_name")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
