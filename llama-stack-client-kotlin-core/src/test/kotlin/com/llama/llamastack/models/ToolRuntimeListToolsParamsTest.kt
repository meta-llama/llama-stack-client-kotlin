// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.llama.llamastack.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ToolRuntimeListToolsParamsTest {

    @Test
    fun createToolRuntimeListToolsParams() {
        ToolRuntimeListToolsParams.builder()
            .toolGroupId("tool_group_id")
            .mcpEndpoint(Url.builder().uri("uri").build())
            .xLlamaStackClientVersion("X-LlamaStack-Client-Version")
            .xLlamaStackProviderData("X-LlamaStack-Provider-Data")
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            ToolRuntimeListToolsParams.builder()
                .toolGroupId("tool_group_id")
                .mcpEndpoint(Url.builder().uri("uri").build())
                .xLlamaStackClientVersion("X-LlamaStack-Client-Version")
                .xLlamaStackProviderData("X-LlamaStack-Provider-Data")
                .build()
        val expected = QueryParams.builder()
        expected.put("tool_group_id", "tool_group_id")
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = ToolRuntimeListToolsParams.builder().build()
        val expected = QueryParams.builder()
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }

    @Test
    fun getBody() {
        val params =
            ToolRuntimeListToolsParams.builder()
                .toolGroupId("tool_group_id")
                .mcpEndpoint(Url.builder().uri("uri").build())
                .xLlamaStackClientVersion("X-LlamaStack-Client-Version")
                .xLlamaStackProviderData("X-LlamaStack-Provider-Data")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.mcpEndpoint()).isEqualTo(Url.builder().uri("uri").build())
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params = ToolRuntimeListToolsParams.builder().build()
        val body = params.getBody()
        assertThat(body).isNotNull
    }
}
