// File generated from our OpenAPI spec by Stainless.

package com.llama_stack_client.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SyntheticDataGenerationTest {

    @Test
    fun createSyntheticDataGeneration() {
        val syntheticDataGeneration =
            SyntheticDataGeneration.builder()
                .syntheticData(
                    listOf(
                        ScoredDialogGenerations.builder()
                            .dialog(
                                listOf(
                                    ScoredDialogGenerations.Dialog.ofUserMessage(
                                        UserMessage.builder()
                                            .content(UserMessage.Content.ofString("string"))
                                            .role(UserMessage.Role.USER)
                                            .context(UserMessage.Context.ofString("string"))
                                            .build()
                                    )
                                )
                            )
                            .scoredGenerations(
                                listOf(
                                    ScoredDialogGenerations.ScoredGeneration.builder()
                                        .message(
                                            ScoredDialogGenerations.ScoredGeneration.Message
                                                .ofUserMessage(
                                                    UserMessage.builder()
                                                        .content(
                                                            UserMessage.Content.ofString("string")
                                                        )
                                                        .role(UserMessage.Role.USER)
                                                        .context(
                                                            UserMessage.Context.ofString("string")
                                                        )
                                                        .build()
                                                )
                                        )
                                        .score(42.23)
                                        .build()
                                )
                            )
                            .build()
                    )
                )
                .statistics(SyntheticDataGeneration.Statistics.builder().build())
                .build()
        assertThat(syntheticDataGeneration).isNotNull
        assertThat(syntheticDataGeneration.syntheticData())
            .containsExactly(
                ScoredDialogGenerations.builder()
                    .dialog(
                        listOf(
                            ScoredDialogGenerations.Dialog.ofUserMessage(
                                UserMessage.builder()
                                    .content(UserMessage.Content.ofString("string"))
                                    .role(UserMessage.Role.USER)
                                    .context(UserMessage.Context.ofString("string"))
                                    .build()
                            )
                        )
                    )
                    .scoredGenerations(
                        listOf(
                            ScoredDialogGenerations.ScoredGeneration.builder()
                                .message(
                                    ScoredDialogGenerations.ScoredGeneration.Message.ofUserMessage(
                                        UserMessage.builder()
                                            .content(UserMessage.Content.ofString("string"))
                                            .role(UserMessage.Role.USER)
                                            .context(UserMessage.Context.ofString("string"))
                                            .build()
                                    )
                                )
                                .score(42.23)
                                .build()
                        )
                    )
                    .build()
            )
        assertThat(syntheticDataGeneration.statistics())
            .isEqualTo(SyntheticDataGeneration.Statistics.builder().build())
    }
}
