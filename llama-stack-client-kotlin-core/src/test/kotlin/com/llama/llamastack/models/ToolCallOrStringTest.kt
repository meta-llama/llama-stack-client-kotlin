// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.core.jsonMapper
import com.llama.llamastack.errors.LlamaStackClientInvalidDataException
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

internal class ToolCallOrStringTest {

    @Test
    fun ofString() {
        val string = "string"

        val toolCallOrString = ToolCallOrString.ofString(string)

        assertThat(toolCallOrString.string()).isEqualTo(string)
        assertThat(toolCallOrString.toolCall()).isNull()
    }

    @Test
    fun ofStringRoundtrip() {
        val jsonMapper = jsonMapper()
        val toolCallOrString = ToolCallOrString.ofString("string")

        val roundtrippedToolCallOrString =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(toolCallOrString),
                jacksonTypeRef<ToolCallOrString>(),
            )

        assertThat(roundtrippedToolCallOrString).isEqualTo(toolCallOrString)
    }

    @Test
    fun ofToolCall() {
        val toolCall =
            ToolCall.builder()
                .arguments("string")
                .callId("call_id")
                .toolName(ToolCall.ToolName.BRAVE_SEARCH)
                .argumentsJson("arguments_json")
                .build()

        val toolCallOrString = ToolCallOrString.ofToolCall(toolCall)

        assertThat(toolCallOrString.string()).isNull()
        assertThat(toolCallOrString.toolCall()).isEqualTo(toolCall)
    }

    @Test
    fun ofToolCallRoundtrip() {
        val jsonMapper = jsonMapper()
        val toolCallOrString =
            ToolCallOrString.ofToolCall(
                ToolCall.builder()
                    .arguments("string")
                    .callId("call_id")
                    .toolName(ToolCall.ToolName.BRAVE_SEARCH)
                    .argumentsJson("arguments_json")
                    .build()
            )

        val roundtrippedToolCallOrString =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(toolCallOrString),
                jacksonTypeRef<ToolCallOrString>(),
            )

        assertThat(roundtrippedToolCallOrString).isEqualTo(toolCallOrString)
    }

    @Test
    fun incompatibleJsonShapeDeserializesToUnknown() {
        val value = JsonValue.from(listOf("invalid", "array"))
        val toolCallOrString = jsonMapper().convertValue(value, jacksonTypeRef<ToolCallOrString>())

        val e = assertThrows<LlamaStackClientInvalidDataException> { toolCallOrString.validate() }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
