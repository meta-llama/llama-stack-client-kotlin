// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.llama.llamastack.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ToolRuntimeListToolsParamsTest {

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

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("mcp_endpoint[uri]", "uri")
                    .put("tool_group_id", "tool_group_id")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = ToolRuntimeListToolsParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
