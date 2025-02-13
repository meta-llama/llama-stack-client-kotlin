// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.llama.llamastack.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ToolRuntimeListToolsParamsTest {

    @Test
    fun create() {
        ToolRuntimeListToolsParams.builder()
            .mcpEndpoint(ToolRuntimeListToolsParams.McpEndpoint.builder().uri("uri").build())
            .toolGroupId("tool_group_id")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            ToolRuntimeListToolsParams.builder()
                .mcpEndpoint(ToolRuntimeListToolsParams.McpEndpoint.builder().uri("uri").build())
                .toolGroupId("tool_group_id")
                .build()
        val expected = QueryParams.builder()
        ToolRuntimeListToolsParams.McpEndpoint.builder().uri("uri").build().forEachQueryParam {
            key,
            values ->
            expected.put("mcp_endpoint[$key]", values)
        }
        expected.put("tool_group_id", "tool_group_id")
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = ToolRuntimeListToolsParams.builder().build()
        val expected = QueryParams.builder()
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }
}
