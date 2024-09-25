// File generated from our OpenAPI spec by Stainless.

package com.llama_stack_client.api.models

import com.llama_stack_client.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class RewardScoringScoreParamsTest {

    @Test
    fun createRewardScoringScoreParams() {
        RewardScoringScoreParams.builder()
            .dialogGenerations(
                listOf(
                    RewardScoringScoreParams.DialogGeneration.builder()
                        .dialog(
                            listOf(
                                RewardScoringScoreParams.DialogGeneration.Dialog.ofUserMessage(
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
    }

    @Test
    fun getBody() {
        val params =
            RewardScoringScoreParams.builder()
                .dialogGenerations(
                    listOf(
                        RewardScoringScoreParams.DialogGeneration.builder()
                            .dialog(
                                listOf(
                                    RewardScoringScoreParams.DialogGeneration.Dialog.ofUserMessage(
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
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.dialogGenerations())
            .isEqualTo(
                listOf(
                    RewardScoringScoreParams.DialogGeneration.builder()
                        .dialog(
                            listOf(
                                RewardScoringScoreParams.DialogGeneration.Dialog.ofUserMessage(
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
        assertThat(body.model()).isEqualTo("model")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            RewardScoringScoreParams.builder()
                .dialogGenerations(
                    listOf(
                        RewardScoringScoreParams.DialogGeneration.builder()
                            .dialog(
                                listOf(
                                    RewardScoringScoreParams.DialogGeneration.Dialog.ofUserMessage(
                                        UserMessage.builder()
                                            .content(UserMessage.Content.ofString("string"))
                                            .role(UserMessage.Role.USER)
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
                                                .build()
                                        )
                                )
                            )
                            .build()
                    )
                )
                .model("model")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.dialogGenerations())
            .isEqualTo(
                listOf(
                    RewardScoringScoreParams.DialogGeneration.builder()
                        .dialog(
                            listOf(
                                RewardScoringScoreParams.DialogGeneration.Dialog.ofUserMessage(
                                    UserMessage.builder()
                                        .content(UserMessage.Content.ofString("string"))
                                        .role(UserMessage.Role.USER)
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
                                            .build()
                                    )
                            )
                        )
                        .build()
                )
            )
        assertThat(body.model()).isEqualTo("model")
    }
}
