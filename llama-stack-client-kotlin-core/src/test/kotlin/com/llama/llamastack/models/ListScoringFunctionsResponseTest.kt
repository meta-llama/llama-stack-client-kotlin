// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ListScoringFunctionsResponseTest {

    @Test
    fun create() {
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
                        .returnType(ReturnType.builder().type(ReturnType.Type.STRING).build())
                        .description("description")
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
                        .providerResourceId("provider_resource_id")
                        .build()
                )
                .build()

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
                    .returnType(ReturnType.builder().type(ReturnType.Type.STRING).build())
                    .description("description")
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
                    .providerResourceId("provider_resource_id")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
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
                        .returnType(ReturnType.builder().type(ReturnType.Type.STRING).build())
                        .description("description")
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
                        .providerResourceId("provider_resource_id")
                        .build()
                )
                .build()

        val roundtrippedListScoringFunctionsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(listScoringFunctionsResponse),
                jacksonTypeRef<ListScoringFunctionsResponse>(),
            )

        assertThat(roundtrippedListScoringFunctionsResponse).isEqualTo(listScoringFunctionsResponse)
    }
}
