// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ToolResponseMessageTest {

    @Test
    fun createToolResponseMessage() {
        val toolResponseMessage =
            ToolResponseMessage.builder()
                .callId("call_id")
                .content(ToolResponseMessage.Content.ofString("string"))
                .role(ToolResponseMessage.Role.IPYTHON)
                .toolName(ToolResponseMessage.ToolName.BRAVE_SEARCH)
                .build()
        assertThat(toolResponseMessage).isNotNull
        assertThat(toolResponseMessage.callId()).isEqualTo("call_id")
        assertThat(toolResponseMessage.content())
            .isEqualTo(ToolResponseMessage.Content.ofString("string"))
        assertThat(toolResponseMessage.role()).isEqualTo(ToolResponseMessage.Role.IPYTHON)
        assertThat(toolResponseMessage.toolName())
            .isEqualTo(ToolResponseMessage.ToolName.BRAVE_SEARCH)
    }
}
