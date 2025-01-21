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
                .type(ScoringFn.Type.SCORING_FUNCTION)
                .description("description")
                .params(
                    ScoringFn.Params.ofLlmAsJudgeScoringFnParams(
                        ScoringFn.Params.LlmAsJudgeScoringFnParams.builder()
                            .judgeModel("judge_model")
                            .type(ScoringFn.Params.LlmAsJudgeScoringFnParams.Type.LLM_AS_JUDGE)
                            .aggregationFunctions(
                                listOf(
                                    ScoringFn.Params.LlmAsJudgeScoringFnParams.AggregationFunction
                                        .AVERAGE
                                )
                            )
                            .judgeScoreRegexes(listOf("string"))
                            .promptTemplate("prompt_template")
                            .build()
                    )
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
        assertThat(scoringFn.type()).isEqualTo(ScoringFn.Type.SCORING_FUNCTION)
        assertThat(scoringFn.description()).isEqualTo("description")
        assertThat(scoringFn.params())
            .isEqualTo(
                ScoringFn.Params.ofLlmAsJudgeScoringFnParams(
                    ScoringFn.Params.LlmAsJudgeScoringFnParams.builder()
                        .judgeModel("judge_model")
                        .type(ScoringFn.Params.LlmAsJudgeScoringFnParams.Type.LLM_AS_JUDGE)
                        .aggregationFunctions(
                            listOf(
                                ScoringFn.Params.LlmAsJudgeScoringFnParams.AggregationFunction
                                    .AVERAGE
                            )
                        )
                        .judgeScoreRegexes(listOf("string"))
                        .promptTemplate("prompt_template")
                        .build()
                )
            )
    }
}
