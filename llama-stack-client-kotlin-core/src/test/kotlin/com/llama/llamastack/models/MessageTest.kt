// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.core.jsonMapper
import com.llama.llamastack.errors.LlamaStackClientInvalidDataException
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.EnumSource

internal class MessageTest {

    @Test
    fun ofUser() {
        val user = UserMessage.builder().content("string").context("string").build()

        val message = Message.ofUser(user)

        assertThat(message.user()).isEqualTo(user)
        assertThat(message.system()).isNull()
        assertThat(message.tool()).isNull()
        assertThat(message.assistant()).isNull()
    }

    @Test
    fun ofUserRoundtrip() {
        val jsonMapper = jsonMapper()
        val message =
            Message.ofUser(UserMessage.builder().content("string").context("string").build())

        val roundtrippedMessage =
            jsonMapper.readValue(jsonMapper.writeValueAsString(message), jacksonTypeRef<Message>())

        assertThat(roundtrippedMessage).isEqualTo(message)
    }

    @Test
    fun ofSystem() {
        val system = SystemMessage.builder().content("string").build()

        val message = Message.ofSystem(system)

        assertThat(message.user()).isNull()
        assertThat(message.system()).isEqualTo(system)
        assertThat(message.tool()).isNull()
        assertThat(message.assistant()).isNull()
    }

    @Test
    fun ofSystemRoundtrip() {
        val jsonMapper = jsonMapper()
        val message = Message.ofSystem(SystemMessage.builder().content("string").build())

        val roundtrippedMessage =
            jsonMapper.readValue(jsonMapper.writeValueAsString(message), jacksonTypeRef<Message>())

        assertThat(roundtrippedMessage).isEqualTo(message)
    }

    @Test
    fun ofTool() {
        val tool = ToolResponseMessage.builder().callId("call_id").content("string").build()

        val message = Message.ofTool(tool)

        assertThat(message.user()).isNull()
        assertThat(message.system()).isNull()
        assertThat(message.tool()).isEqualTo(tool)
        assertThat(message.assistant()).isNull()
    }

    @Test
    fun ofToolRoundtrip() {
        val jsonMapper = jsonMapper()
        val message =
            Message.ofTool(
                ToolResponseMessage.builder().callId("call_id").content("string").build()
            )

        val roundtrippedMessage =
            jsonMapper.readValue(jsonMapper.writeValueAsString(message), jacksonTypeRef<Message>())

        assertThat(roundtrippedMessage).isEqualTo(message)
    }

    @Test
    fun ofAssistant() {
        val assistant =
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

        val message = Message.ofAssistant(assistant)

        assertThat(message.user()).isNull()
        assertThat(message.system()).isNull()
        assertThat(message.tool()).isNull()
        assertThat(message.assistant()).isEqualTo(assistant)
    }

    @Test
    fun ofAssistantRoundtrip() {
        val jsonMapper = jsonMapper()
        val message =
            Message.ofAssistant(
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
            )

        val roundtrippedMessage =
            jsonMapper.readValue(jsonMapper.writeValueAsString(message), jacksonTypeRef<Message>())

        assertThat(roundtrippedMessage).isEqualTo(message)
    }

    enum class IncompatibleJsonShapeTestCase(val value: JsonValue) {
        BOOLEAN(JsonValue.from(false)),
        STRING(JsonValue.from("invalid")),
        INTEGER(JsonValue.from(-1)),
        FLOAT(JsonValue.from(3.14)),
        ARRAY(JsonValue.from(listOf("invalid", "array"))),
    }

    @ParameterizedTest
    @EnumSource
    fun incompatibleJsonShapeDeserializesToUnknown(testCase: IncompatibleJsonShapeTestCase) {
        val message = jsonMapper().convertValue(testCase.value, jacksonTypeRef<Message>())

        val e = assertThrows<LlamaStackClientInvalidDataException> { message.validate() }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
