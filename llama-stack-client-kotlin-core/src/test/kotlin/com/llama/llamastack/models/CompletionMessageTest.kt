// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llama.llamastack.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CompletionMessageTest {

    @Test
    fun create() {
        val completionMessage =
            CompletionMessage.builder()
                .content("string")
                .stopReason(CompletionMessage.StopReason.END_OF_TURN)
                .addToolCall(
                    ToolCall.builder()
                        .arguments("string")
                        .callId("call_id")
                        .toolName(ToolCall.ToolName.BRAVE_SEARCH)
                        .argumentsJson("arguments_json")
                        .build()
                )
                .build()

        assertThat(completionMessage.content()).isEqualTo(InterleavedContent.ofString("string"))
        assertThat(completionMessage.stopReason())
            .isEqualTo(CompletionMessage.StopReason.END_OF_TURN)
        assertThat(completionMessage.toolCalls())
            .containsExactly(
                ToolCall.builder()
                    .arguments("string")
                    .callId("call_id")
                    .toolName(ToolCall.ToolName.BRAVE_SEARCH)
                    .argumentsJson("arguments_json")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val completionMessage =
            CompletionMessage.builder()
                .content("string")
                .stopReason(CompletionMessage.StopReason.END_OF_TURN)
                .addToolCall(
                    ToolCall.builder()
                        .arguments("string")
                        .callId("call_id")
                        .toolName(ToolCall.ToolName.BRAVE_SEARCH)
                        .argumentsJson("arguments_json")
                        .build()
                )
                .build()

        val roundtrippedCompletionMessage =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(completionMessage),
                jacksonTypeRef<CompletionMessage>(),
            )

        assertThat(roundtrippedCompletionMessage).isEqualTo(completionMessage)
    }
}
