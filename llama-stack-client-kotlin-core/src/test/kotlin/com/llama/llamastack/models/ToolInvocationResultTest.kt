// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.llama.llamastack.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ToolInvocationResultTest {

    @Test
    fun createToolInvocationResult() {
        val toolInvocationResult =
            ToolInvocationResult.builder()
                .content("string")
                .errorCode(0L)
                .errorMessage("error_message")
                .metadata(
                    ToolInvocationResult.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from(true))
                        .build()
                )
                .build()
        assertThat(toolInvocationResult).isNotNull
        assertThat(toolInvocationResult.content()).isEqualTo(InterleavedContent.ofString("string"))
        assertThat(toolInvocationResult.errorCode()).isEqualTo(0L)
        assertThat(toolInvocationResult.errorMessage()).isEqualTo("error_message")
        assertThat(toolInvocationResult.metadata())
            .isEqualTo(
                ToolInvocationResult.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from(true))
                    .build()
            )
    }
}
