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
    fun getQueryParamsWithoutOptionalFields() {
        val params = ToolRuntimeListToolsParams.builder().build()
        val expected = QueryParams.builder()
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }
}
