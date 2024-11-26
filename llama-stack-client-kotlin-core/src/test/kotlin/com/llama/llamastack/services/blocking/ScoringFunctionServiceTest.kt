// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.blocking

import com.llama.llamastack.TestServerExtension
import com.llama.llamastack.models.*
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class ScoringFunctionServiceTest {

    //    @Test
    //    fun callRetrieve() {
    //        val client =
    //
    // LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
    //        val scoringFunctionService = client.scoringFunctions()
    //        val scoringFn =
    //            scoringFunctionService.retrieve(
    //                ScoringFunctionRetrieveParams.builder()
    //                    .xLlamaStackProviderData("X-LlamaStack-ProviderData")
    //                    .scoringFnId("scoring_fn_id")
    //                    .build()
    //            )
    //        println(scoringFn)
    //        scoringFn?.validate()
    //    }
    //
    //    @Disabled(
    //        "skipped: currently no good way to test endpoints with content type application/jsonl,
    // Prism mock server will fail"
    //    )
    //    @Test
    //    fun callList() {
    //        val client =
    //
    // LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
    //        val scoringFunctionService = client.scoringFunctions()
    //        val scoringFn =
    //            scoringFunctionService.list(
    //                ScoringFunctionListParams.builder()
    //                    .xLlamaStackProviderData("X-LlamaStack-ProviderData")
    //                    .build()
    //            )
    //        println(scoringFn)
    //        scoringFn.validate()
    //    }
    //
    //    @Test
    //    fun callRegister() {
    //        val client =
    //
    // LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
    //        val scoringFunctionService = client.scoringFunctions()
    //        scoringFunctionService.register(
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
    //                .xLlamaStackProviderData("X-LlamaStack-ProviderData")
    //                .build()
    //        )
    //    }
}
