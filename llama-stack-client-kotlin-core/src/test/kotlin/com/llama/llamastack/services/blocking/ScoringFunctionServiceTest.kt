// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.blocking

import com.llama.llamastack.TestServerExtension
import com.llama.llamastack.client.okhttp.LlamaStackClientOkHttpClient
import com.llama.llamastack.models.ReturnType
import com.llama.llamastack.models.ScoringFnParams
import com.llama.llamastack.models.ScoringFunctionRegisterParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ScoringFunctionServiceTest {

    @Test
    fun retrieve() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val scoringFunctionService = client.scoringFunctions()

        val scoringFn = scoringFunctionService.retrieve("scoring_fn_id")

        scoringFn.validate()
    }

    @Test
    fun list() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val scoringFunctionService = client.scoringFunctions()

        val scoringFns = scoringFunctionService.list()

        scoringFns.forEach { it.validate() }
    }

    @Test
    fun register() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val scoringFunctionService = client.scoringFunctions()

        scoringFunctionService.register(
            ScoringFunctionRegisterParams.builder()
                .description("description")
                .returnType(ReturnType.builder().type(ReturnType.Type.STRING).build())
                .scoringFnId("scoring_fn_id")
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
                .providerId("provider_id")
                .providerScoringFnId("provider_scoring_fn_id")
                .build()
        )
    }
}
