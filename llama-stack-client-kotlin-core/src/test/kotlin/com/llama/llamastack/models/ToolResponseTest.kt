// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.llama.llamastack.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ToolResponseTest {

    @Test
    fun createToolResponse() {
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
        assertThat(toolResponse).isNotNull
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
}
