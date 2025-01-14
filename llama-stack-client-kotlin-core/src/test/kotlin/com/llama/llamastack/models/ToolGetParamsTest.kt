// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.llama.llamastack.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ToolGetParamsTest {

    @Test
    fun createToolGetParams() {
        ToolGetParams.builder()
            .toolName("tool_name")
            .xLlamaStackClientVersion("X-LlamaStack-Client-Version")
            .xLlamaStackProviderData("X-LlamaStack-Provider-Data")
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            ToolGetParams.builder()
                .toolName("tool_name")
                .xLlamaStackClientVersion("X-LlamaStack-Client-Version")
                .xLlamaStackProviderData("X-LlamaStack-Provider-Data")
                .build()
        val expected = QueryParams.builder()
        expected.put("tool_name", "tool_name")
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = ToolGetParams.builder().toolName("tool_name").build()
        val expected = QueryParams.builder()
        expected.put("tool_name", "tool_name")
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }
}
