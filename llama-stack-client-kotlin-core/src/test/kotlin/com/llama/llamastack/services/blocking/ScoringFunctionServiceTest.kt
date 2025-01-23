// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.blocking

import com.llama.llamastack.TestServerExtension
import com.llama.llamastack.client.okhttp.LlamaStackClientOkHttpClient
import com.llama.llamastack.models.ReturnType
import com.llama.llamastack.models.ScoringFn
import com.llama.llamastack.models.ScoringFunctionListParams
import com.llama.llamastack.models.ScoringFunctionRegisterParams
import com.llama.llamastack.models.ScoringFunctionRetrieveParams
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
                    .xLlamaStackClientVersion("X-LlamaStack-Client-Version")
                    .xLlamaStackProviderData("X-LlamaStack-Provider-Data")
                    .build()
            )
        println(scoringFn)
        scoringFn?.validate()
    }

    @Test
    fun callList() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val scoringFunctionService = client.scoringFunctions()
        val listScoringFunctionsResponse =
            scoringFunctionService.list(
                ScoringFunctionListParams.builder()
                    .xLlamaStackClientVersion("X-LlamaStack-Client-Version")
                    .xLlamaStackProviderData("X-LlamaStack-Provider-Data")
                    .build()
            )
        println(listScoringFunctionsResponse)
        for (scoringFn: ScoringFn in listScoringFunctionsResponse) {
            scoringFn.validate()
        }
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
                    ScoringFunctionRegisterParams.Params.LlmAsJudge.builder()
                        .judgeModel("judge_model")
                        .type(ScoringFunctionRegisterParams.Params.LlmAsJudge.Type.LLM_AS_JUDGE)
                        .addAggregationFunction(
                            ScoringFunctionRegisterParams.Params.LlmAsJudge.AggregationFunction
                                .AVERAGE
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
        )
    }
}
