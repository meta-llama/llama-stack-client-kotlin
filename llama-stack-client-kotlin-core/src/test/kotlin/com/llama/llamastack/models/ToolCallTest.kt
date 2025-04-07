// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llama.llamastack.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ToolCallTest {

    @Test
    fun create() {
        val toolCall =
            ToolCall.builder()
                .arguments("string")
                .callId("call_id")
                .toolName(ToolCall.ToolName.BRAVE_SEARCH)
                .argumentsJson("arguments_json")
                .build()

        assertThat(toolCall.arguments()).isEqualTo(ToolCall.Arguments.ofString("string"))
        assertThat(toolCall.callId()).isEqualTo("call_id")
        assertThat(toolCall.toolName()).isEqualTo(ToolCall.ToolName.BRAVE_SEARCH)
        assertThat(toolCall.argumentsJson()).isEqualTo("arguments_json")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val toolCall =
            ToolCall.builder()
                .arguments("string")
                .callId("call_id")
                .toolName(ToolCall.ToolName.BRAVE_SEARCH)
                .argumentsJson("arguments_json")
                .build()

        val roundtrippedToolCall =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(toolCall),
                jacksonTypeRef<ToolCall>(),
            )

        assertThat(roundtrippedToolCall).isEqualTo(toolCall)
    }
}
