// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ToolResponseTest {

    @Test
    fun create() {
        val toolResponse =
            ToolResponse.builder()
                .callId("call_id")
                .content("string")
                .toolName(ToolResponse.ToolName.BRAVE_SEARCH)
                .metadata(
                    ToolResponse.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from(true))
                        .build()
                )
                .build()

        assertThat(toolResponse.callId()).isEqualTo("call_id")
        assertThat(toolResponse.content()).isEqualTo(InterleavedContent.ofString("string"))
        assertThat(toolResponse.toolName()).isEqualTo(ToolResponse.ToolName.BRAVE_SEARCH)
        assertThat(toolResponse.metadata())
            .isEqualTo(
                ToolResponse.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from(true))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val toolResponse =
            ToolResponse.builder()
                .callId("call_id")
                .content("string")
                .toolName(ToolResponse.ToolName.BRAVE_SEARCH)
                .metadata(
                    ToolResponse.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from(true))
                        .build()
                )
                .build()

        val roundtrippedToolResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(toolResponse),
                jacksonTypeRef<ToolResponse>(),
            )

        assertThat(roundtrippedToolResponse).isEqualTo(toolResponse)
    }
}
