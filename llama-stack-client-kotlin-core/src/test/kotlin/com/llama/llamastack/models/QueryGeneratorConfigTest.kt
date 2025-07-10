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

internal class QueryGeneratorConfigTest {

    @Test
    fun ofDefault() {
        val default = QueryGeneratorConfig.Default.builder().separator("separator").build()

        val queryGeneratorConfig = QueryGeneratorConfig.ofDefault(default)

        assertThat(queryGeneratorConfig.default()).isEqualTo(default)
        assertThat(queryGeneratorConfig.llm()).isNull()
    }

    @Test
    fun ofDefaultRoundtrip() {
        val jsonMapper = jsonMapper()
        val queryGeneratorConfig =
            QueryGeneratorConfig.ofDefault(
                QueryGeneratorConfig.Default.builder().separator("separator").build()
            )

        val roundtrippedQueryGeneratorConfig =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(queryGeneratorConfig),
                jacksonTypeRef<QueryGeneratorConfig>(),
            )

        assertThat(roundtrippedQueryGeneratorConfig).isEqualTo(queryGeneratorConfig)
    }

    @Test
    fun ofLlm() {
        val llm = QueryGeneratorConfig.Llm.builder().model("model").template("template").build()

        val queryGeneratorConfig = QueryGeneratorConfig.ofLlm(llm)

        assertThat(queryGeneratorConfig.default()).isNull()
        assertThat(queryGeneratorConfig.llm()).isEqualTo(llm)
    }

    @Test
    fun ofLlmRoundtrip() {
        val jsonMapper = jsonMapper()
        val queryGeneratorConfig =
            QueryGeneratorConfig.ofLlm(
                QueryGeneratorConfig.Llm.builder().model("model").template("template").build()
            )

        val roundtrippedQueryGeneratorConfig =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(queryGeneratorConfig),
                jacksonTypeRef<QueryGeneratorConfig>(),
            )

        assertThat(roundtrippedQueryGeneratorConfig).isEqualTo(queryGeneratorConfig)
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
        val queryGeneratorConfig =
            jsonMapper().convertValue(testCase.value, jacksonTypeRef<QueryGeneratorConfig>())

        val e =
            assertThrows<LlamaStackClientInvalidDataException> { queryGeneratorConfig.validate() }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
