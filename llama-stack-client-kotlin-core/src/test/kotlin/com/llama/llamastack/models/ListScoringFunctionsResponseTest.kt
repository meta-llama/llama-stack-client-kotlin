// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.llama.llamastack.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ListScoringFunctionsResponseTest {

    @Test
    fun createListScoringFunctionsResponse() {
        val listScoringFunctionsResponse =
            ListScoringFunctionsResponse.builder()
                .addData(
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
                            ScoringFn.Params.LlmAsJudge.builder()
                                .judgeModel("judge_model")
                                .type(ScoringFn.Params.LlmAsJudge.Type.LLM_AS_JUDGE)
                                .addAggregationFunction(
                                    ScoringFn.Params.LlmAsJudge.AggregationFunction.AVERAGE
                                )
                                .addJudgeScoreRegex("string")
                                .promptTemplate("prompt_template")
                                .build()
                        )
                        .build()
                )
                .build()
        assertThat(listScoringFunctionsResponse).isNotNull
        assertThat(listScoringFunctionsResponse.data())
            .containsExactly(
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
                        ScoringFn.Params.LlmAsJudge.builder()
                            .judgeModel("judge_model")
                            .type(ScoringFn.Params.LlmAsJudge.Type.LLM_AS_JUDGE)
                            .addAggregationFunction(
                                ScoringFn.Params.LlmAsJudge.AggregationFunction.AVERAGE
                            )
                            .addJudgeScoreRegex("string")
                            .promptTemplate("prompt_template")
                            .build()
                    )
                    .build()
            )
    }
}
