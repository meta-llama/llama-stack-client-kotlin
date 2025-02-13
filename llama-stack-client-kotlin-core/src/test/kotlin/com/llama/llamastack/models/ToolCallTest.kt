// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.llama.llamastack.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ToolCallTest {

    @Test
    fun createToolCall() {
        val toolCall =
            ToolCall.builder()
                .arguments(
                    ToolCall.Arguments.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .callId("call_id")
                .toolName(ToolCall.ToolName.BRAVE_SEARCH)
                .build()
        assertThat(toolCall).isNotNull
        assertThat(toolCall.arguments())
            .isEqualTo(
                ToolCall.Arguments.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(toolCall.callId()).isEqualTo("call_id")
        assertThat(toolCall.toolName()).isEqualTo(ToolCall.ToolName.BRAVE_SEARCH)
    }
}
