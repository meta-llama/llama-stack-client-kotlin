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

internal class ScoringFnParamsTest {

    @Test
    fun ofLlmAsJudge() {
        val llmAsJudge =
            ScoringFnParams.LlmAsJudgeScoringFnParams.builder()
                .judgeModel("judge_model")
                .addAggregationFunction(
                    ScoringFnParams.LlmAsJudgeScoringFnParams.AggregationFunction.AVERAGE
                )
                .addJudgeScoreRegex("string")
                .promptTemplate("prompt_template")
                .build()

        val scoringFnParams = ScoringFnParams.ofLlmAsJudge(llmAsJudge)

        assertThat(scoringFnParams.llmAsJudge()).isEqualTo(llmAsJudge)
        assertThat(scoringFnParams.regexParser()).isNull()
        assertThat(scoringFnParams.basic()).isNull()
    }

    @Test
    fun ofLlmAsJudgeRoundtrip() {
        val jsonMapper = jsonMapper()
        val scoringFnParams =
            ScoringFnParams.ofLlmAsJudge(
                ScoringFnParams.LlmAsJudgeScoringFnParams.builder()
                    .judgeModel("judge_model")
                    .addAggregationFunction(
                        ScoringFnParams.LlmAsJudgeScoringFnParams.AggregationFunction.AVERAGE
                    )
                    .addJudgeScoreRegex("string")
                    .promptTemplate("prompt_template")
                    .build()
            )

        val roundtrippedScoringFnParams =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(scoringFnParams),
                jacksonTypeRef<ScoringFnParams>(),
            )

        assertThat(roundtrippedScoringFnParams).isEqualTo(scoringFnParams)
    }

    @Test
    fun ofRegexParser() {
        val regexParser =
            ScoringFnParams.RegexParserScoringFnParams.builder()
                .addAggregationFunction(
                    ScoringFnParams.RegexParserScoringFnParams.AggregationFunction.AVERAGE
                )
                .addParsingRegex("string")
                .build()

        val scoringFnParams = ScoringFnParams.ofRegexParser(regexParser)

        assertThat(scoringFnParams.llmAsJudge()).isNull()
        assertThat(scoringFnParams.regexParser()).isEqualTo(regexParser)
        assertThat(scoringFnParams.basic()).isNull()
    }

    @Test
    fun ofRegexParserRoundtrip() {
        val jsonMapper = jsonMapper()
        val scoringFnParams =
            ScoringFnParams.ofRegexParser(
                ScoringFnParams.RegexParserScoringFnParams.builder()
                    .addAggregationFunction(
                        ScoringFnParams.RegexParserScoringFnParams.AggregationFunction.AVERAGE
                    )
                    .addParsingRegex("string")
                    .build()
            )

        val roundtrippedScoringFnParams =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(scoringFnParams),
                jacksonTypeRef<ScoringFnParams>(),
            )

        assertThat(roundtrippedScoringFnParams).isEqualTo(scoringFnParams)
    }

    @Test
    fun ofBasic() {
        val basic =
            ScoringFnParams.BasicScoringFnParams.builder()
                .addAggregationFunction(
                    ScoringFnParams.BasicScoringFnParams.AggregationFunction.AVERAGE
                )
                .build()

        val scoringFnParams = ScoringFnParams.ofBasic(basic)

        assertThat(scoringFnParams.llmAsJudge()).isNull()
        assertThat(scoringFnParams.regexParser()).isNull()
        assertThat(scoringFnParams.basic()).isEqualTo(basic)
    }

    @Test
    fun ofBasicRoundtrip() {
        val jsonMapper = jsonMapper()
        val scoringFnParams =
            ScoringFnParams.ofBasic(
                ScoringFnParams.BasicScoringFnParams.builder()
                    .addAggregationFunction(
                        ScoringFnParams.BasicScoringFnParams.AggregationFunction.AVERAGE
                    )
                    .build()
            )

        val roundtrippedScoringFnParams =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(scoringFnParams),
                jacksonTypeRef<ScoringFnParams>(),
            )

        assertThat(roundtrippedScoringFnParams).isEqualTo(scoringFnParams)
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
        val scoringFnParams =
            jsonMapper().convertValue(testCase.value, jacksonTypeRef<ScoringFnParams>())

        val e = assertThrows<LlamaStackClientInvalidDataException> { scoringFnParams.validate() }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
