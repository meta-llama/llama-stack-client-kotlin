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

internal class ResponseFormatTest {

    @Test
    fun ofJsonSchema() {
        val jsonSchema =
            ResponseFormat.JsonSchemaResponseFormat.builder()
                .jsonSchema(
                    ResponseFormat.JsonSchemaResponseFormat.JsonSchema.builder()
                        .putAdditionalProperty("foo", JsonValue.from(true))
                        .build()
                )
                .build()

        val responseFormat = ResponseFormat.ofJsonSchema(jsonSchema)

        assertThat(responseFormat.jsonSchema()).isEqualTo(jsonSchema)
        assertThat(responseFormat.grammar()).isNull()
    }

    @Test
    fun ofJsonSchemaRoundtrip() {
        val jsonMapper = jsonMapper()
        val responseFormat =
            ResponseFormat.ofJsonSchema(
                ResponseFormat.JsonSchemaResponseFormat.builder()
                    .jsonSchema(
                        ResponseFormat.JsonSchemaResponseFormat.JsonSchema.builder()
                            .putAdditionalProperty("foo", JsonValue.from(true))
                            .build()
                    )
                    .build()
            )

        val roundtrippedResponseFormat =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(responseFormat),
                jacksonTypeRef<ResponseFormat>(),
            )

        assertThat(roundtrippedResponseFormat).isEqualTo(responseFormat)
    }

    @Test
    fun ofGrammar() {
        val grammar =
            ResponseFormat.GrammarResponseFormat.builder()
                .bnf(
                    ResponseFormat.GrammarResponseFormat.Bnf.builder()
                        .putAdditionalProperty("foo", JsonValue.from(true))
                        .build()
                )
                .build()

        val responseFormat = ResponseFormat.ofGrammar(grammar)

        assertThat(responseFormat.jsonSchema()).isNull()
        assertThat(responseFormat.grammar()).isEqualTo(grammar)
    }

    @Test
    fun ofGrammarRoundtrip() {
        val jsonMapper = jsonMapper()
        val responseFormat =
            ResponseFormat.ofGrammar(
                ResponseFormat.GrammarResponseFormat.builder()
                    .bnf(
                        ResponseFormat.GrammarResponseFormat.Bnf.builder()
                            .putAdditionalProperty("foo", JsonValue.from(true))
                            .build()
                    )
                    .build()
            )

        val roundtrippedResponseFormat =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(responseFormat),
                jacksonTypeRef<ResponseFormat>(),
            )

        assertThat(roundtrippedResponseFormat).isEqualTo(responseFormat)
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
        val responseFormat =
            jsonMapper().convertValue(testCase.value, jacksonTypeRef<ResponseFormat>())

        val e = assertThrows<LlamaStackClientInvalidDataException> { responseFormat.validate() }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
