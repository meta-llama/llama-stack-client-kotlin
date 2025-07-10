// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ScoringFnTest {

    @Test
    fun create() {
        val scoringFn =
            ScoringFn.builder()
                .identifier("identifier")
                .metadata(
                    ScoringFn.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from(true))
                        .build()
                )
                .providerId("provider_id")
                .returnType(ReturnType.builder().type(ReturnType.Type.STRING).build())
                .description("description")
                .params(
                    ScoringFnParams.LlmAsJudge.builder()
                        .addAggregationFunction(
                            ScoringFnParams.LlmAsJudge.AggregationFunction.AVERAGE
                        )
                        .judgeModel("judge_model")
                        .addJudgeScoreRegex("string")
                        .promptTemplate("prompt_template")
                        .build()
                )
                .providerResourceId("provider_resource_id")
                .build()

        assertThat(scoringFn.identifier()).isEqualTo("identifier")
        assertThat(scoringFn.metadata())
            .isEqualTo(
                ScoringFn.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from(true))
                    .build()
            )
        assertThat(scoringFn.providerId()).isEqualTo("provider_id")
        assertThat(scoringFn.returnType())
            .isEqualTo(ReturnType.builder().type(ReturnType.Type.STRING).build())
        assertThat(scoringFn.description()).isEqualTo("description")
        assertThat(scoringFn.params())
            .isEqualTo(
                ScoringFnParams.ofLlmAsJudge(
                    ScoringFnParams.LlmAsJudge.builder()
                        .addAggregationFunction(
                            ScoringFnParams.LlmAsJudge.AggregationFunction.AVERAGE
                        )
                        .judgeModel("judge_model")
                        .addJudgeScoreRegex("string")
                        .promptTemplate("prompt_template")
                        .build()
                )
            )
        assertThat(scoringFn.providerResourceId()).isEqualTo("provider_resource_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val scoringFn =
            ScoringFn.builder()
                .identifier("identifier")
                .metadata(
                    ScoringFn.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from(true))
                        .build()
                )
                .providerId("provider_id")
                .returnType(ReturnType.builder().type(ReturnType.Type.STRING).build())
                .description("description")
                .params(
                    ScoringFnParams.LlmAsJudge.builder()
                        .addAggregationFunction(
                            ScoringFnParams.LlmAsJudge.AggregationFunction.AVERAGE
                        )
                        .judgeModel("judge_model")
                        .addJudgeScoreRegex("string")
                        .promptTemplate("prompt_template")
                        .build()
                )
                .providerResourceId("provider_resource_id")
                .build()

        val roundtrippedScoringFn =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(scoringFn),
                jacksonTypeRef<ScoringFn>(),
            )

        assertThat(roundtrippedScoringFn).isEqualTo(scoringFn)
    }
}
