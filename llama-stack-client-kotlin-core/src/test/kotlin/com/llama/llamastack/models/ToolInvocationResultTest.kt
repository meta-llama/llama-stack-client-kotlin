// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ToolInvocationResultTest {

    @Test
    fun create() {
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

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
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

        val roundtrippedToolInvocationResult =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(toolInvocationResult),
                jacksonTypeRef<ToolInvocationResult>(),
            )

        assertThat(roundtrippedToolInvocationResult).isEqualTo(toolInvocationResult)
    }
}
