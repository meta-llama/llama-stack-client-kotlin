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
        assertThat(message.toolResponse()).isNull()
        assertThat(message.completion()).isNull()
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
        assertThat(message.toolResponse()).isNull()
        assertThat(message.completion()).isNull()
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
    fun ofToolResponse() {
        val toolResponse = ToolResponseMessage.builder().callId("call_id").content("string").build()

        val message = Message.ofToolResponse(toolResponse)

        assertThat(message.user()).isNull()
        assertThat(message.system()).isNull()
        assertThat(message.toolResponse()).isEqualTo(toolResponse)
        assertThat(message.completion()).isNull()
    }

    @Test
    fun ofToolResponseRoundtrip() {
        val jsonMapper = jsonMapper()
        val message =
            Message.ofToolResponse(
                ToolResponseMessage.builder().callId("call_id").content("string").build()
            )

        val roundtrippedMessage =
            jsonMapper.readValue(jsonMapper.writeValueAsString(message), jacksonTypeRef<Message>())

        assertThat(roundtrippedMessage).isEqualTo(message)
    }

    @Test
    fun ofCompletion() {
        val completion =
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

        val message = Message.ofCompletion(completion)

        assertThat(message.user()).isNull()
        assertThat(message.system()).isNull()
        assertThat(message.toolResponse()).isNull()
        assertThat(message.completion()).isEqualTo(completion)
    }

    @Test
    fun ofCompletionRoundtrip() {
        val jsonMapper = jsonMapper()
        val message =
            Message.ofCompletion(
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
