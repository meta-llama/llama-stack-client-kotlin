// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.llama.llamastack.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ToolRuntimeListToolsParamsTest {

    @Test
    fun createToolRuntimeListToolsParams() {
        ToolRuntimeListToolsParams.builder()
            .mcpEndpoint(Url.builder().uri("uri").build())
            .toolGroupId("tool_group_id")
            .xLlamaStackClientVersion("X-LlamaStack-Client-Version")
            .xLlamaStackProviderData("X-LlamaStack-Provider-Data")
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            ToolRuntimeListToolsParams.builder()
                .mcpEndpoint(Url.builder().uri("uri").build())
                .toolGroupId("tool_group_id")
                .xLlamaStackClientVersion("X-LlamaStack-Client-Version")
                .xLlamaStackProviderData("X-LlamaStack-Provider-Data")
                .build()
        val expected = QueryParams.builder()
        // MANUAL PATCH
        Url.builder().uri("uri").build()._additionalProperties().forEach { (key, values) ->
            expected.put("mcp_endpoint[$key]", values.toString())
        }
        expected.put("tool_group_id", "tool_group_id")
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = ToolRuntimeListToolsParams.builder().build()
        val expected = QueryParams.builder()
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }
}
