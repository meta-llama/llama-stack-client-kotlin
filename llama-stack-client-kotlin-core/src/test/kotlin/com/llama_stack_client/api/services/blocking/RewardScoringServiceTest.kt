// File generated from our OpenAPI spec by Stainless.

package com.llama_stack_client.api.services.blocking

import com.llama_stack_client.api.TestServerExtension
import com.llama_stack_client.api.client.okhttp.LlamaStackClientOkHttpClient
import com.llama_stack_client.api.models.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class RewardScoringServiceTest {

    @Test
    fun callScore() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val rewardScoringService = client.rewardScoring()
        val rewardScoring =
            rewardScoringService.score(
                RewardScoringScoreParams.builder()
                    .dialogGenerations(
                        listOf(
                            RewardScoringScoreParams.DialogGeneration.builder()
                                .dialog(
                                    listOf(
                                        RewardScoringScoreParams.DialogGeneration.Dialog
                                            .ofUserMessage(
                                                UserMessage.builder()
                                                    .content(UserMessage.Content.ofString("string"))
                                                    .role(UserMessage.Role.USER)
                                                    .context(UserMessage.Context.ofString("string"))
                                                    .build()
                                            )
                                    )
                                )
                                .sampledGenerations(
                                    listOf(
                                        RewardScoringScoreParams.DialogGeneration.SampledGeneration
                                            .ofUserMessage(
                                                UserMessage.builder()
                                                    .content(UserMessage.Content.ofString("string"))
                                                    .role(UserMessage.Role.USER)
                                                    .context(UserMessage.Context.ofString("string"))
                                                    .build()
                                            )
                                    )
                                )
                                .build()
                        )
                    )
                    .model("model")
                    .build()
            )
        println(rewardScoring)
        rewardScoring.validate()
    }
}
