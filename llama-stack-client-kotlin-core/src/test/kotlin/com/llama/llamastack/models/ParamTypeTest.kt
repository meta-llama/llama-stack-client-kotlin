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

internal class ParamTypeTest {

    @Test
    fun ofString() {
        val paramType = ParamType.ofString()

        assertThat(paramType.string()).isEqualTo(JsonValue.from(mapOf("type" to "string")))
        assertThat(paramType.number()).isNull()
        assertThat(paramType.boolean()).isNull()
        assertThat(paramType.array()).isNull()
        assertThat(paramType.objectType()).isNull()
        assertThat(paramType.json()).isNull()
        assertThat(paramType.union()).isNull()
        assertThat(paramType.chatCompletionInput()).isNull()
        assertThat(paramType.completionInput()).isNull()
        assertThat(paramType.agentTurnInput()).isNull()
    }

    @Test
    fun ofStringRoundtrip() {
        val jsonMapper = jsonMapper()
        val paramType = ParamType.ofString()

        val roundtrippedParamType =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(paramType),
                jacksonTypeRef<ParamType>(),
            )

        assertThat(roundtrippedParamType).isEqualTo(paramType)
    }

    @Test
    fun ofNumber() {
        val paramType = ParamType.ofNumber()

        assertThat(paramType.string()).isNull()
        assertThat(paramType.number()).isEqualTo(JsonValue.from(mapOf("type" to "number")))
        assertThat(paramType.boolean()).isNull()
        assertThat(paramType.array()).isNull()
        assertThat(paramType.objectType()).isNull()
        assertThat(paramType.json()).isNull()
        assertThat(paramType.union()).isNull()
        assertThat(paramType.chatCompletionInput()).isNull()
        assertThat(paramType.completionInput()).isNull()
        assertThat(paramType.agentTurnInput()).isNull()
    }

    @Test
    fun ofNumberRoundtrip() {
        val jsonMapper = jsonMapper()
        val paramType = ParamType.ofNumber()

        val roundtrippedParamType =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(paramType),
                jacksonTypeRef<ParamType>(),
            )

        assertThat(roundtrippedParamType).isEqualTo(paramType)
    }

    @Test
    fun ofBoolean() {
        val paramType = ParamType.ofBoolean()

        assertThat(paramType.string()).isNull()
        assertThat(paramType.number()).isNull()
        assertThat(paramType.boolean()).isEqualTo(JsonValue.from(mapOf("type" to "boolean")))
        assertThat(paramType.array()).isNull()
        assertThat(paramType.objectType()).isNull()
        assertThat(paramType.json()).isNull()
        assertThat(paramType.union()).isNull()
        assertThat(paramType.chatCompletionInput()).isNull()
        assertThat(paramType.completionInput()).isNull()
        assertThat(paramType.agentTurnInput()).isNull()
    }

    @Test
    fun ofBooleanRoundtrip() {
        val jsonMapper = jsonMapper()
        val paramType = ParamType.ofBoolean()

        val roundtrippedParamType =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(paramType),
                jacksonTypeRef<ParamType>(),
            )

        assertThat(roundtrippedParamType).isEqualTo(paramType)
    }

    @Test
    fun ofArray() {
        val paramType = ParamType.ofArray()

        assertThat(paramType.string()).isNull()
        assertThat(paramType.number()).isNull()
        assertThat(paramType.boolean()).isNull()
        assertThat(paramType.array()).isEqualTo(JsonValue.from(mapOf("type" to "array")))
        assertThat(paramType.objectType()).isNull()
        assertThat(paramType.json()).isNull()
        assertThat(paramType.union()).isNull()
        assertThat(paramType.chatCompletionInput()).isNull()
        assertThat(paramType.completionInput()).isNull()
        assertThat(paramType.agentTurnInput()).isNull()
    }

    @Test
    fun ofArrayRoundtrip() {
        val jsonMapper = jsonMapper()
        val paramType = ParamType.ofArray()

        val roundtrippedParamType =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(paramType),
                jacksonTypeRef<ParamType>(),
            )

        assertThat(roundtrippedParamType).isEqualTo(paramType)
    }

    @Test
    fun ofObjectType() {
        val paramType = ParamType.ofObjectType()

        assertThat(paramType.string()).isNull()
        assertThat(paramType.number()).isNull()
        assertThat(paramType.boolean()).isNull()
        assertThat(paramType.array()).isNull()
        assertThat(paramType.objectType()).isEqualTo(JsonValue.from(mapOf("type" to "object")))
        assertThat(paramType.json()).isNull()
        assertThat(paramType.union()).isNull()
        assertThat(paramType.chatCompletionInput()).isNull()
        assertThat(paramType.completionInput()).isNull()
        assertThat(paramType.agentTurnInput()).isNull()
    }

    @Test
    fun ofObjectTypeRoundtrip() {
        val jsonMapper = jsonMapper()
        val paramType = ParamType.ofObjectType()

        val roundtrippedParamType =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(paramType),
                jacksonTypeRef<ParamType>(),
            )

        assertThat(roundtrippedParamType).isEqualTo(paramType)
    }

    @Test
    fun ofJson() {
        val paramType = ParamType.ofJson()

        assertThat(paramType.string()).isNull()
        assertThat(paramType.number()).isNull()
        assertThat(paramType.boolean()).isNull()
        assertThat(paramType.array()).isNull()
        assertThat(paramType.objectType()).isNull()
        assertThat(paramType.json()).isEqualTo(JsonValue.from(mapOf("type" to "json")))
        assertThat(paramType.union()).isNull()
        assertThat(paramType.chatCompletionInput()).isNull()
        assertThat(paramType.completionInput()).isNull()
        assertThat(paramType.agentTurnInput()).isNull()
    }

    @Test
    fun ofJsonRoundtrip() {
        val jsonMapper = jsonMapper()
        val paramType = ParamType.ofJson()

        val roundtrippedParamType =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(paramType),
                jacksonTypeRef<ParamType>(),
            )

        assertThat(roundtrippedParamType).isEqualTo(paramType)
    }

    @Test
    fun ofUnion() {
        val paramType = ParamType.ofUnion()

        assertThat(paramType.string()).isNull()
        assertThat(paramType.number()).isNull()
        assertThat(paramType.boolean()).isNull()
        assertThat(paramType.array()).isNull()
        assertThat(paramType.objectType()).isNull()
        assertThat(paramType.json()).isNull()
        assertThat(paramType.union()).isEqualTo(JsonValue.from(mapOf("type" to "union")))
        assertThat(paramType.chatCompletionInput()).isNull()
        assertThat(paramType.completionInput()).isNull()
        assertThat(paramType.agentTurnInput()).isNull()
    }

    @Test
    fun ofUnionRoundtrip() {
        val jsonMapper = jsonMapper()
        val paramType = ParamType.ofUnion()

        val roundtrippedParamType =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(paramType),
                jacksonTypeRef<ParamType>(),
            )

        assertThat(roundtrippedParamType).isEqualTo(paramType)
    }

    @Test
    fun ofChatCompletionInput() {
        val paramType = ParamType.ofChatCompletionInput()

        assertThat(paramType.string()).isNull()
        assertThat(paramType.number()).isNull()
        assertThat(paramType.boolean()).isNull()
        assertThat(paramType.array()).isNull()
        assertThat(paramType.objectType()).isNull()
        assertThat(paramType.json()).isNull()
        assertThat(paramType.union()).isNull()
        assertThat(paramType.chatCompletionInput())
            .isEqualTo(JsonValue.from(mapOf("type" to "chat_completion_input")))
        assertThat(paramType.completionInput()).isNull()
        assertThat(paramType.agentTurnInput()).isNull()
    }

    @Test
    fun ofChatCompletionInputRoundtrip() {
        val jsonMapper = jsonMapper()
        val paramType = ParamType.ofChatCompletionInput()

        val roundtrippedParamType =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(paramType),
                jacksonTypeRef<ParamType>(),
            )

        assertThat(roundtrippedParamType).isEqualTo(paramType)
    }

    @Test
    fun ofCompletionInput() {
        val paramType = ParamType.ofCompletionInput()

        assertThat(paramType.string()).isNull()
        assertThat(paramType.number()).isNull()
        assertThat(paramType.boolean()).isNull()
        assertThat(paramType.array()).isNull()
        assertThat(paramType.objectType()).isNull()
        assertThat(paramType.json()).isNull()
        assertThat(paramType.union()).isNull()
        assertThat(paramType.chatCompletionInput()).isNull()
        assertThat(paramType.completionInput())
            .isEqualTo(JsonValue.from(mapOf("type" to "completion_input")))
        assertThat(paramType.agentTurnInput()).isNull()
    }

    @Test
    fun ofCompletionInputRoundtrip() {
        val jsonMapper = jsonMapper()
        val paramType = ParamType.ofCompletionInput()

        val roundtrippedParamType =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(paramType),
                jacksonTypeRef<ParamType>(),
            )

        assertThat(roundtrippedParamType).isEqualTo(paramType)
    }

    @Test
    fun ofAgentTurnInput() {
        val paramType = ParamType.ofAgentTurnInput()

        assertThat(paramType.string()).isNull()
        assertThat(paramType.number()).isNull()
        assertThat(paramType.boolean()).isNull()
        assertThat(paramType.array()).isNull()
        assertThat(paramType.objectType()).isNull()
        assertThat(paramType.json()).isNull()
        assertThat(paramType.union()).isNull()
        assertThat(paramType.chatCompletionInput()).isNull()
        assertThat(paramType.completionInput()).isNull()
        assertThat(paramType.agentTurnInput())
            .isEqualTo(JsonValue.from(mapOf("type" to "agent_turn_input")))
    }

    @Test
    fun ofAgentTurnInputRoundtrip() {
        val jsonMapper = jsonMapper()
        val paramType = ParamType.ofAgentTurnInput()

        val roundtrippedParamType =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(paramType),
                jacksonTypeRef<ParamType>(),
            )

        assertThat(roundtrippedParamType).isEqualTo(paramType)
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
        val paramType = jsonMapper().convertValue(testCase.value, jacksonTypeRef<ParamType>())

        val e = assertThrows<LlamaStackClientInvalidDataException> { paramType.validate() }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
