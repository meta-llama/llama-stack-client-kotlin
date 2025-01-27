// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ScoringFunctionRegisterParamsTest {

    @Test
    fun createScoringFunctionRegisterParams() {
        ScoringFunctionRegisterParams.builder()
            .description("description")
            .returnType(ReturnType.builder().type(ReturnType.Type.STRING).build())
            .scoringFnId("scoring_fn_id")
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
            .providerId("provider_id")
            .providerScoringFnId("provider_scoring_fn_id")
            .xLlamaStackClientVersion("X-LlamaStack-Client-Version")
            .xLlamaStackProviderData("X-LlamaStack-Provider-Data")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            ScoringFunctionRegisterParams.builder()
                .description("description")
                .returnType(ReturnType.builder().type(ReturnType.Type.STRING).build())
                .scoringFnId("scoring_fn_id")
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
                .providerId("provider_id")
                .providerScoringFnId("provider_scoring_fn_id")
                .xLlamaStackClientVersion("X-LlamaStack-Client-Version")
                .xLlamaStackProviderData("X-LlamaStack-Provider-Data")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.description()).isEqualTo("description")
        assertThat(body.returnType())
            .isEqualTo(ReturnType.builder().type(ReturnType.Type.STRING).build())
        assertThat(body.scoringFnId()).isEqualTo("scoring_fn_id")
        assertThat(body.params())
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
        assertThat(body.providerId()).isEqualTo("provider_id")
        assertThat(body.providerScoringFnId()).isEqualTo("provider_scoring_fn_id")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            ScoringFunctionRegisterParams.builder()
                .description("description")
                .returnType(ReturnType.builder().type(ReturnType.Type.STRING).build())
                .scoringFnId("scoring_fn_id")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.description()).isEqualTo("description")
        assertThat(body.returnType())
            .isEqualTo(ReturnType.builder().type(ReturnType.Type.STRING).build())
        assertThat(body.scoringFnId()).isEqualTo("scoring_fn_id")
    }
}
