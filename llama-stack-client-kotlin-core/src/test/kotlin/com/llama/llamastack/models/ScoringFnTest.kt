// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.llama.llamastack.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ScoringFnTest {

    @Test
    fun createScoringFn() {
        val scoringFn =
            ScoringFn.builder()
                .identifier("identifier")
                .metadata(
                    ScoringFn.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from(true))
                        .build()
                )
                .providerId("provider_id")
                .providerResourceId("provider_resource_id")
                .returnType(ReturnType.builder().type(ReturnType.Type.STRING).build())
                .description("description")
                .params(
                    ScoringFnParams.LlmAsJudgeScoringFnParams.builder()
                        .judgeModel("judge_model")
                        .addAggregationFunction(
                            ScoringFnParams.LlmAsJudgeScoringFnParams.AggregationFunction.AVERAGE
                        )
                        .addJudgeScoreRegex("string")
                        .promptTemplate("prompt_template")
                        .build()
                )
                .build()
        assertThat(scoringFn).isNotNull
        assertThat(scoringFn.identifier()).isEqualTo("identifier")
        assertThat(scoringFn.metadata())
            .isEqualTo(
                ScoringFn.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from(true))
                    .build()
            )
        assertThat(scoringFn.providerId()).isEqualTo("provider_id")
        assertThat(scoringFn.providerResourceId()).isEqualTo("provider_resource_id")
        assertThat(scoringFn.returnType())
            .isEqualTo(ReturnType.builder().type(ReturnType.Type.STRING).build())
        assertThat(scoringFn.description()).isEqualTo("description")
        assertThat(scoringFn.params())
            .isEqualTo(
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
            )
    }
}
