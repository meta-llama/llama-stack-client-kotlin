// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.llama.llamastack.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ToolRuntimeInvokeToolParamsTest {

    @Test
    fun createToolRuntimeInvokeToolParams() {
        ToolRuntimeInvokeToolParams.builder()
            .kwargs(
                ToolRuntimeInvokeToolParams.Kwargs.builder()
                    .putAdditionalProperty("foo", JsonValue.from(true))
                    .build()
            )
            .toolName("tool_name")
            .xLlamaStackClientVersion("X-LlamaStack-Client-Version")
            .xLlamaStackProviderData("X-LlamaStack-Provider-Data")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            ToolRuntimeInvokeToolParams.builder()
                .kwargs(
                    ToolRuntimeInvokeToolParams.Kwargs.builder()
                        .putAdditionalProperty("foo", JsonValue.from(true))
                        .build()
                )
                .toolName("tool_name")
                .xLlamaStackClientVersion("X-LlamaStack-Client-Version")
                .xLlamaStackProviderData("X-LlamaStack-Provider-Data")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.kwargs())
            .isEqualTo(
                ToolRuntimeInvokeToolParams.Kwargs.builder()
                    .putAdditionalProperty("foo", JsonValue.from(true))
                    .build()
            )
        assertThat(body.toolName()).isEqualTo("tool_name")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            ToolRuntimeInvokeToolParams.builder()
                .kwargs(
                    ToolRuntimeInvokeToolParams.Kwargs.builder()
                        .putAdditionalProperty("foo", JsonValue.from(true))
                        .build()
                )
                .toolName("tool_name")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.kwargs())
            .isEqualTo(
                ToolRuntimeInvokeToolParams.Kwargs.builder()
                    .putAdditionalProperty("foo", JsonValue.from(true))
                    .build()
            )
        assertThat(body.toolName()).isEqualTo("tool_name")
    }
}
