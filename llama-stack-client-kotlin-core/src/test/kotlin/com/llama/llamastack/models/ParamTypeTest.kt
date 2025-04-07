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
    fun ofObject() {
        val paramType = ParamType.ofObject()

        assertThat(paramType.object_()).isEqualTo(JsonValue.from(mapOf("type" to "string")))
        assertThat(paramType.object_()).isNull()
        assertThat(paramType.object_()).isNull()
        assertThat(paramType.object_()).isNull()
        assertThat(paramType.object_()).isNull()
        assertThat(paramType.object_()).isNull()
        assertThat(paramType.object_()).isNull()
        assertThat(paramType.object_()).isNull()
        assertThat(paramType.object_()).isNull()
        assertThat(paramType.object_()).isNull()
    }

    @Test
    fun ofObjectRoundtrip() {
        val jsonMapper = jsonMapper()
        val paramType = ParamType.ofObject()

        val roundtrippedParamType =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(paramType),
                jacksonTypeRef<ParamType>(),
            )

        assertThat(roundtrippedParamType).isEqualTo(paramType)
    }

    @Test
    fun ofObject() {
        val paramType = ParamType.ofObject()

        assertThat(paramType.object_()).isNull()
        assertThat(paramType.object_()).isEqualTo(JsonValue.from(mapOf("type" to "number")))
        assertThat(paramType.object_()).isNull()
        assertThat(paramType.object_()).isNull()
        assertThat(paramType.object_()).isNull()
        assertThat(paramType.object_()).isNull()
        assertThat(paramType.object_()).isNull()
        assertThat(paramType.object_()).isNull()
        assertThat(paramType.object_()).isNull()
        assertThat(paramType.object_()).isNull()
    }

    @Test
    fun ofObjectRoundtrip() {
        val jsonMapper = jsonMapper()
        val paramType = ParamType.ofObject()

        val roundtrippedParamType =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(paramType),
                jacksonTypeRef<ParamType>(),
            )

        assertThat(roundtrippedParamType).isEqualTo(paramType)
    }

    @Test
    fun ofObject() {
        val paramType = ParamType.ofObject()

        assertThat(paramType.object_()).isNull()
        assertThat(paramType.object_()).isNull()
        assertThat(paramType.object_()).isEqualTo(JsonValue.from(mapOf("type" to "boolean")))
        assertThat(paramType.object_()).isNull()
        assertThat(paramType.object_()).isNull()
        assertThat(paramType.object_()).isNull()
        assertThat(paramType.object_()).isNull()
        assertThat(paramType.object_()).isNull()
        assertThat(paramType.object_()).isNull()
        assertThat(paramType.object_()).isNull()
    }

    @Test
    fun ofObjectRoundtrip() {
        val jsonMapper = jsonMapper()
        val paramType = ParamType.ofObject()

        val roundtrippedParamType =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(paramType),
                jacksonTypeRef<ParamType>(),
            )

        assertThat(roundtrippedParamType).isEqualTo(paramType)
    }

    @Test
    fun ofObject() {
        val paramType = ParamType.ofObject()

        assertThat(paramType.object_()).isNull()
        assertThat(paramType.object_()).isNull()
        assertThat(paramType.object_()).isNull()
        assertThat(paramType.object_()).isEqualTo(JsonValue.from(mapOf("type" to "array")))
        assertThat(paramType.object_()).isNull()
        assertThat(paramType.object_()).isNull()
        assertThat(paramType.object_()).isNull()
        assertThat(paramType.object_()).isNull()
        assertThat(paramType.object_()).isNull()
        assertThat(paramType.object_()).isNull()
    }

    @Test
    fun ofObjectRoundtrip() {
        val jsonMapper = jsonMapper()
        val paramType = ParamType.ofObject()

        val roundtrippedParamType =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(paramType),
                jacksonTypeRef<ParamType>(),
            )

        assertThat(roundtrippedParamType).isEqualTo(paramType)
    }

    @Test
    fun ofObject() {
        val paramType = ParamType.ofObject()

        assertThat(paramType.object_()).isNull()
        assertThat(paramType.object_()).isNull()
        assertThat(paramType.object_()).isNull()
        assertThat(paramType.object_()).isNull()
        assertThat(paramType.object_()).isEqualTo(JsonValue.from(mapOf("type" to "object")))
        assertThat(paramType.object_()).isNull()
        assertThat(paramType.object_()).isNull()
        assertThat(paramType.object_()).isNull()
        assertThat(paramType.object_()).isNull()
        assertThat(paramType.object_()).isNull()
    }

    @Test
    fun ofObjectRoundtrip() {
        val jsonMapper = jsonMapper()
        val paramType = ParamType.ofObject()

        val roundtrippedParamType =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(paramType),
                jacksonTypeRef<ParamType>(),
            )

        assertThat(roundtrippedParamType).isEqualTo(paramType)
    }

    @Test
    fun ofObject() {
        val paramType = ParamType.ofObject()

        assertThat(paramType.object_()).isNull()
        assertThat(paramType.object_()).isNull()
        assertThat(paramType.object_()).isNull()
        assertThat(paramType.object_()).isNull()
        assertThat(paramType.object_()).isNull()
        assertThat(paramType.object_()).isEqualTo(JsonValue.from(mapOf("type" to "json")))
        assertThat(paramType.object_()).isNull()
        assertThat(paramType.object_()).isNull()
        assertThat(paramType.object_()).isNull()
        assertThat(paramType.object_()).isNull()
    }

    @Test
    fun ofObjectRoundtrip() {
        val jsonMapper = jsonMapper()
        val paramType = ParamType.ofObject()

        val roundtrippedParamType =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(paramType),
                jacksonTypeRef<ParamType>(),
            )

        assertThat(roundtrippedParamType).isEqualTo(paramType)
    }

    @Test
    fun ofObject() {
        val paramType = ParamType.ofObject()

        assertThat(paramType.object_()).isNull()
        assertThat(paramType.object_()).isNull()
        assertThat(paramType.object_()).isNull()
        assertThat(paramType.object_()).isNull()
        assertThat(paramType.object_()).isNull()
        assertThat(paramType.object_()).isNull()
        assertThat(paramType.object_()).isEqualTo(JsonValue.from(mapOf("type" to "union")))
        assertThat(paramType.object_()).isNull()
        assertThat(paramType.object_()).isNull()
        assertThat(paramType.object_()).isNull()
    }

    @Test
    fun ofObjectRoundtrip() {
        val jsonMapper = jsonMapper()
        val paramType = ParamType.ofObject()

        val roundtrippedParamType =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(paramType),
                jacksonTypeRef<ParamType>(),
            )

        assertThat(roundtrippedParamType).isEqualTo(paramType)
    }

    @Test
    fun ofObject() {
        val paramType = ParamType.ofObject()

        assertThat(paramType.object_()).isNull()
        assertThat(paramType.object_()).isNull()
        assertThat(paramType.object_()).isNull()
        assertThat(paramType.object_()).isNull()
        assertThat(paramType.object_()).isNull()
        assertThat(paramType.object_()).isNull()
        assertThat(paramType.object_()).isNull()
        assertThat(paramType.object_())
            .isEqualTo(JsonValue.from(mapOf("type" to "chat_completion_input")))
        assertThat(paramType.object_()).isNull()
        assertThat(paramType.object_()).isNull()
    }

    @Test
    fun ofObjectRoundtrip() {
        val jsonMapper = jsonMapper()
        val paramType = ParamType.ofObject()

        val roundtrippedParamType =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(paramType),
                jacksonTypeRef<ParamType>(),
            )

        assertThat(roundtrippedParamType).isEqualTo(paramType)
    }

    @Test
    fun ofObject() {
        val paramType = ParamType.ofObject()

        assertThat(paramType.object_()).isNull()
        assertThat(paramType.object_()).isNull()
        assertThat(paramType.object_()).isNull()
        assertThat(paramType.object_()).isNull()
        assertThat(paramType.object_()).isNull()
        assertThat(paramType.object_()).isNull()
        assertThat(paramType.object_()).isNull()
        assertThat(paramType.object_()).isNull()
        assertThat(paramType.object_())
            .isEqualTo(JsonValue.from(mapOf("type" to "completion_input")))
        assertThat(paramType.object_()).isNull()
    }

    @Test
    fun ofObjectRoundtrip() {
        val jsonMapper = jsonMapper()
        val paramType = ParamType.ofObject()

        val roundtrippedParamType =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(paramType),
                jacksonTypeRef<ParamType>(),
            )

        assertThat(roundtrippedParamType).isEqualTo(paramType)
    }

    @Test
    fun ofObject() {
        val paramType = ParamType.ofObject()

        assertThat(paramType.object_()).isNull()
        assertThat(paramType.object_()).isNull()
        assertThat(paramType.object_()).isNull()
        assertThat(paramType.object_()).isNull()
        assertThat(paramType.object_()).isNull()
        assertThat(paramType.object_()).isNull()
        assertThat(paramType.object_()).isNull()
        assertThat(paramType.object_()).isNull()
        assertThat(paramType.object_()).isNull()
        assertThat(paramType.object_())
            .isEqualTo(JsonValue.from(mapOf("type" to "agent_turn_input")))
    }

    @Test
    fun ofObjectRoundtrip() {
        val jsonMapper = jsonMapper()
        val paramType = ParamType.ofObject()

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
