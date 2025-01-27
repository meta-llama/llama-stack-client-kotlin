// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

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
                .build()
        assertThat(toolResponse).isNotNull
        assertThat(toolResponse.callId()).isEqualTo("call_id")
        assertThat(toolResponse.content()).isEqualTo(InterleavedContent.ofString("string"))
        assertThat(toolResponse.toolName()).isEqualTo(ToolResponse.ToolName.BRAVE_SEARCH)
    }
}
