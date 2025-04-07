// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.llama.llamastack.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ToolRuntimeInvokeToolParamsTest {

    @Test
    fun create() {
        ToolRuntimeInvokeToolParams.builder()
            .kwargs(
                ToolRuntimeInvokeToolParams.Kwargs.builder()
                    .putAdditionalProperty("foo", JsonValue.from(true))
                    .build()
            )
            .toolName("tool_name")
            .build()
    }

    @Test
    fun body() {
        val params =
            ToolRuntimeInvokeToolParams.builder()
                .kwargs(
                    ToolRuntimeInvokeToolParams.Kwargs.builder()
                        .putAdditionalProperty("foo", JsonValue.from(true))
                        .build()
                )
                .toolName("tool_name")
                .build()

        val body = params._body()

        assertThat(body.kwargs())
            .isEqualTo(
                ToolRuntimeInvokeToolParams.Kwargs.builder()
                    .putAdditionalProperty("foo", JsonValue.from(true))
                    .build()
            )
        assertThat(body.toolName()).isEqualTo("tool_name")
    }
}
