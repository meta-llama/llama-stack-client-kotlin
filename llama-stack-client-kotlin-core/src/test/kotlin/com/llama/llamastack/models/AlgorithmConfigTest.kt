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
    fun ofLoraFinetuning() {
        val loraFinetuning =
            AlgorithmConfig.LoraFinetuningConfig.builder()
                .alpha(0L)
                .applyLoraToMlp(true)
                .applyLoraToOutput(true)
                .addLoraAttnModule("string")
                .rank(0L)
                .quantizeBase(true)
                .useDora(true)
                .build()

        val algorithmConfig = AlgorithmConfig.ofLoraFinetuning(loraFinetuning)

        assertThat(algorithmConfig.loraFinetuning()).isEqualTo(loraFinetuning)
        assertThat(algorithmConfig.qatFinetuning()).isNull()
    }

    @Test
    fun ofLoraFinetuningRoundtrip() {
        val jsonMapper = jsonMapper()
        val algorithmConfig =
            AlgorithmConfig.ofLoraFinetuning(
                AlgorithmConfig.LoraFinetuningConfig.builder()
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
    fun ofQatFinetuning() {
        val qatFinetuning =
            AlgorithmConfig.QatFinetuningConfig.builder()
                .groupSize(0L)
                .quantizerName("quantizer_name")
                .build()

        val algorithmConfig = AlgorithmConfig.ofQatFinetuning(qatFinetuning)

        assertThat(algorithmConfig.loraFinetuning()).isNull()
        assertThat(algorithmConfig.qatFinetuning()).isEqualTo(qatFinetuning)
    }

    @Test
    fun ofQatFinetuningRoundtrip() {
        val jsonMapper = jsonMapper()
        val algorithmConfig =
            AlgorithmConfig.ofQatFinetuning(
                AlgorithmConfig.QatFinetuningConfig.builder()
                    .groupSize(0L)
                    .quantizerName("quantizer_name")
                    .build()
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
