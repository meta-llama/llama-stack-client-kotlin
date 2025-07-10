// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.async

import com.llama.llamastack.TestServerExtension
import com.llama.llamastack.client.okhttp.LlamaStackClientOkHttpClientAsync
import com.llama.llamastack.models.ReturnType
import com.llama.llamastack.models.ScoringFnParams
import com.llama.llamastack.models.ScoringFunctionRegisterParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ScoringFunctionServiceAsyncTest {

    @Test
    suspend fun retrieve() {
        val client =
            LlamaStackClientOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .build()
        val scoringFunctionServiceAsync = client.scoringFunctions()

        val scoringFn = scoringFunctionServiceAsync.retrieve("scoring_fn_id")

        scoringFn.validate()
    }

    @Test
    suspend fun list() {
        val client =
            LlamaStackClientOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .build()
        val scoringFunctionServiceAsync = client.scoringFunctions()

        val scoringFns = scoringFunctionServiceAsync.list()

        scoringFns.forEach { it.validate() }
    }

    @Test
    suspend fun register() {
        val client =
            LlamaStackClientOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .build()
        val scoringFunctionServiceAsync = client.scoringFunctions()

        scoringFunctionServiceAsync.register(
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
