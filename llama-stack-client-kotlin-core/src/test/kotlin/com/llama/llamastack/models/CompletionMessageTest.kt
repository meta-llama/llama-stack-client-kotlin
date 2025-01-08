// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.llama.llamastack.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CompletionMessageTest {

    @Test
    fun createCompletionMessage() {
        val completionMessage =
            CompletionMessage.builder()
                .content(InterleavedContent.ofString("string"))
                .role(CompletionMessage.Role.ASSISTANT)
                .stopReason(CompletionMessage.StopReason.END_OF_TURN)
                .toolCalls(
                    listOf(
                        ToolCall.builder()
                            .arguments(
                                ToolCall.Arguments.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .callId("call_id")
                            .toolName(ToolCall.ToolName.BRAVE_SEARCH)
                            .build()
                    )
                )
                .build()
        assertThat(completionMessage).isNotNull
        assertThat(completionMessage.content()).isEqualTo(InterleavedContent.ofString("string"))
        assertThat(completionMessage.role()).isEqualTo(CompletionMessage.Role.ASSISTANT)
        assertThat(completionMessage.stopReason())
            .isEqualTo(CompletionMessage.StopReason.END_OF_TURN)
        assertThat(completionMessage.toolCalls())
            .containsExactly(
                ToolCall.builder()
                    .arguments(
                        ToolCall.Arguments.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .callId("call_id")
                    .toolName(ToolCall.ToolName.BRAVE_SEARCH)
                    .build()
            )
    }
}
