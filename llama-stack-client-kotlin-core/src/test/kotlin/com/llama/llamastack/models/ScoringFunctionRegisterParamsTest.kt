// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.llama.llamastack.models.*
import org.junit.jupiter.api.Test

class ScoringFunctionRegisterParamsTest {

    @Test
    fun createScoringFunctionRegisterParams() {
        ScoringFunctionRegisterParams.builder()
            .description("description")
            .returnType(
                ScoringFunctionRegisterParams.ReturnType.ofType(
                    ScoringFunctionRegisterParams.ReturnType.Type.builder()
                        .type(ScoringFunctionRegisterParams.ReturnType.Type.Type.STRING)
                        .build()
                )
            )
            .scoringFnId("scoring_fn_id")
            .params(
                ScoringFunctionRegisterParams.Params.ofLlmAsJudgeScoringFnParams(
                    ScoringFunctionRegisterParams.Params.LlmAsJudgeScoringFnParams.builder()
                        .judgeModel("judge_model")
                        .type(
                            ScoringFunctionRegisterParams.Params.LlmAsJudgeScoringFnParams.Type
                                .LLM_AS_JUDGE
                        )
                        .judgeScoreRegexes(listOf("string"))
                        .promptTemplate("prompt_template")
                        .build()
                )
            )
            .providerId("provider_id")
            .providerScoringFnId("provider_scoring_fn_id")
            .build()
    }

    //    @Test
    //    fun getBody() {
    //        val params =
    //            ScoringFunctionRegisterParams.builder()
    //                .description("description")
    //                .returnType(
    //                    ScoringFunctionRegisterParams.ReturnType.ofType(
    //                        ScoringFunctionRegisterParams.ReturnType.Type.builder()
    //                            .type(ScoringFunctionRegisterParams.ReturnType.Type.Type.STRING)
    //                            .build()
    //                    )
    //                )
    //                .scoringFnId("scoring_fn_id")
    //                .params(
    //                    ScoringFunctionRegisterParams.Params.ofLlmAsJudgeScoringFnParams(
    //
    // ScoringFunctionRegisterParams.Params.LlmAsJudgeScoringFnParams.builder()
    //                            .judgeModel("judge_model")
    //                            .type(
    //
    // ScoringFunctionRegisterParams.Params.LlmAsJudgeScoringFnParams.Type
    //                                    .LLM_AS_JUDGE
    //                            )
    //                            .judgeScoreRegexes(listOf("string"))
    //                            .promptTemplate("prompt_template")
    //                            .build()
    //                    )
    //                )
    //                .providerId("provider_id")
    //                .providerScoringFnId("provider_scoring_fn_id")
    //                .build()
    //        val body = params.getBody()
    //        assertThat(body).isNotNull
    //        assertThat(body.description()).isEqualTo("description")
    //        assertThat(body.returnType())
    //            .isEqualTo(
    //                ScoringFunctionRegisterParams.ReturnType.ofType(
    //                    ScoringFunctionRegisterParams.ReturnType.Type.builder()
    //                        .type(ScoringFunctionRegisterParams.ReturnType.Type.Type.STRING)
    //                        .build()
    //                )
    //            )
    //        assertThat(body.scoringFnId()).isEqualTo("scoring_fn_id")
    //        assertThat(body.params())
    //            .isEqualTo(
    //                ScoringFunctionRegisterParams.Params.ofLlmAsJudgeScoringFnParams(
    //                    ScoringFunctionRegisterParams.Params.LlmAsJudgeScoringFnParams.builder()
    //                        .judgeModel("judge_model")
    //                        .type(
    //
    // ScoringFunctionRegisterParams.Params.LlmAsJudgeScoringFnParams.Type
    //                                .LLM_AS_JUDGE
    //                        )
    //                        .judgeScoreRegexes(listOf("string"))
    //                        .promptTemplate("prompt_template")
    //                        .build()
    //                )
    //            )
    //        assertThat(body.providerId()).isEqualTo("provider_id")
    //        assertThat(body.providerScoringFnId()).isEqualTo("provider_scoring_fn_id")
    //    }

    //    @Test
    //    fun getBodyWithoutOptionalFields() {
    //        val params =
    //            ScoringFunctionRegisterParams.builder()
    //                .description("description")
    //                .returnType(
    //                    ScoringFunctionRegisterParams.ReturnType.ofType(
    //                        ScoringFunctionRegisterParams.ReturnType.Type.builder()
    //                            .type(ScoringFunctionRegisterParams.ReturnType.Type.Type.STRING)
    //                            .build()
    //                    )
    //                )
    //                .scoringFnId("scoring_fn_id")
    //                .build()
    //        val body = params.getBody()
    //        assertThat(body).isNotNull
    //        assertThat(body.description()).isEqualTo("description")
    //        assertThat(body.returnType())
    //            .isEqualTo(
    //                ScoringFunctionRegisterParams.ReturnType.ofType(
    //                    ScoringFunctionRegisterParams.ReturnType.Type.builder()
    //                        .type(ScoringFunctionRegisterParams.ReturnType.Type.Type.STRING)
    //                        .build()
    //                )
    //            )
    //        assertThat(body.scoringFnId()).isEqualTo("scoring_fn_id")
    //    }
}
