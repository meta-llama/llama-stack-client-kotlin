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

internal class AlgorithmConfigTest {

    @Test
    fun ofLoRa() {
        val loRa =
            AlgorithmConfig.LoRa.builder()
                .alpha(0L)
                .applyLoraToMlp(true)
                .applyLoraToOutput(true)
                .addLoraAttnModule("string")
                .rank(0L)
                .quantizeBase(true)
                .useDora(true)
                .build()

        val algorithmConfig = AlgorithmConfig.ofLoRa(loRa)

        assertThat(algorithmConfig.loRa()).isEqualTo(loRa)
        assertThat(algorithmConfig.qat()).isNull()
    }

    @Test
    fun ofLoRaRoundtrip() {
        val jsonMapper = jsonMapper()
        val algorithmConfig =
            AlgorithmConfig.ofLoRa(
                AlgorithmConfig.LoRa.builder()
                    .alpha(0L)
                    .applyLoraToMlp(true)
                    .applyLoraToOutput(true)
                    .addLoraAttnModule("string")
                    .rank(0L)
                    .quantizeBase(true)
                    .useDora(true)
                    .build()
            )

        val roundtrippedAlgorithmConfig =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(algorithmConfig),
                jacksonTypeRef<AlgorithmConfig>(),
            )

        assertThat(roundtrippedAlgorithmConfig).isEqualTo(algorithmConfig)
    }

    @Test
    fun ofQat() {
        val qat =
            AlgorithmConfig.Qat.builder().groupSize(0L).quantizerName("quantizer_name").build()

        val algorithmConfig = AlgorithmConfig.ofQat(qat)

        assertThat(algorithmConfig.loRa()).isNull()
        assertThat(algorithmConfig.qat()).isEqualTo(qat)
    }

    @Test
    fun ofQatRoundtrip() {
        val jsonMapper = jsonMapper()
        val algorithmConfig =
            AlgorithmConfig.ofQat(
                AlgorithmConfig.Qat.builder().groupSize(0L).quantizerName("quantizer_name").build()
            )

        val roundtrippedAlgorithmConfig =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(algorithmConfig),
                jacksonTypeRef<AlgorithmConfig>(),
            )

        assertThat(roundtrippedAlgorithmConfig).isEqualTo(algorithmConfig)
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
        val algorithmConfig =
            jsonMapper().convertValue(testCase.value, jacksonTypeRef<AlgorithmConfig>())

        val e = assertThrows<LlamaStackClientInvalidDataException> { algorithmConfig.validate() }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
