// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.blocking

import com.llama.llamastack.TestServerExtension
import com.llama.llamastack.client.okhttp.LlamaStackClientOkHttpClient
import com.llama.llamastack.models.ReturnType
import com.llama.llamastack.models.ScoringFunctionListParams
import com.llama.llamastack.models.ScoringFunctionRegisterParams
import com.llama.llamastack.models.ScoringFunctionRetrieveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class ScoringFunctionServiceTest {

    @Test
    fun callRetrieve() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val scoringFunctionService = client.scoringFunctions()
        val scoringFn =
            scoringFunctionService.retrieve(
                ScoringFunctionRetrieveParams.builder()
                    .scoringFnId("scoring_fn_id")
                    .xLlamaStackProviderData("X-LlamaStack-ProviderData")
                    .build()
            )
        println(scoringFn)
        scoringFn?.validate()
    }

    @Disabled(
        "skipped: currently no good way to test endpoints with content type application/jsonl, Prism mock server will fail"
    )
    @Test
    fun callList() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val scoringFunctionService = client.scoringFunctions()
        val scoringFn =
            scoringFunctionService.list(
                ScoringFunctionListParams.builder()
                    .xLlamaStackProviderData("X-LlamaStack-ProviderData")
                    .build()
            )
        println(scoringFn)
        scoringFn.validate()
    }

    @Test
    fun callRegister() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val scoringFunctionService = client.scoringFunctions()
        scoringFunctionService.register(
            ScoringFunctionRegisterParams.builder()
                .description("description")
                .returnType(ReturnType.builder().type(ReturnType.Type.STRING).build())
                .scoringFnId("scoring_fn_id")
                .params(
                    ScoringFunctionRegisterParams.Params.ofLlmAsJudgeScoringFnParams(
                        ScoringFunctionRegisterParams.Params.LlmAsJudgeScoringFnParams.builder()
                            .judgeModel("judge_model")
                            .type(
                                ScoringFunctionRegisterParams.Params.LlmAsJudgeScoringFnParams.Type
                                    .LLM_AS_JUDGE
                            )
                            .aggregationFunctions(
                                listOf(
                                    ScoringFunctionRegisterParams.Params.LlmAsJudgeScoringFnParams
                                        .AggregationFunction
                                        .AVERAGE
                                )
                            )
                            .judgeScoreRegexes(listOf("string"))
                            .promptTemplate("prompt_template")
                            .build()
                    )
                )
                .providerId("provider_id")
                .providerScoringFnId("provider_scoring_fn_id")
                .xLlamaStackProviderData("X-LlamaStack-ProviderData")
                .build()
        )
    }
}
