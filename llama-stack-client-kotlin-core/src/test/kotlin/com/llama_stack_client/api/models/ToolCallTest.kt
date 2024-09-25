// File generated from our OpenAPI spec by Stainless.

package com.llama_stack_client.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ToolCallTest {

    @Test
    fun createToolCall() {
        val toolCall =
            ToolCall.builder()
                .arguments(ToolCall.Arguments.builder().build())
                .callId("call_id")
                .toolName(
                    ToolCall.ToolName.ofBuiltinTool(ToolCall.ToolName.BuiltinTool.BRAVE_SEARCH)
                )
                .build()
        assertThat(toolCall).isNotNull
        assertThat(toolCall.arguments()).isEqualTo(ToolCall.Arguments.builder().build())
        assertThat(toolCall.callId()).isEqualTo("call_id")
        assertThat(toolCall.toolName())
            .isEqualTo(ToolCall.ToolName.ofBuiltinTool(ToolCall.ToolName.BuiltinTool.BRAVE_SEARCH))
    }
}
