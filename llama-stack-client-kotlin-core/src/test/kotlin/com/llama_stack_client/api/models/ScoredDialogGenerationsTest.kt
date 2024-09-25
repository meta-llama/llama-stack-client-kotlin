// File generated from our OpenAPI spec by Stainless.

package com.llama_stack_client.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ScoredDialogGenerationsTest {

    @Test
    fun createScoredDialogGenerations() {
        val scoredDialogGenerations =
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
        assertThat(scoredDialogGenerations).isNotNull
        assertThat(scoredDialogGenerations.dialog())
            .containsExactly(
                ScoredDialogGenerations.Dialog.ofUserMessage(
                    UserMessage.builder()
                        .content(UserMessage.Content.ofString("string"))
                        .role(UserMessage.Role.USER)
                        .context(UserMessage.Context.ofString("string"))
                        .build()
                )
            )
        assertThat(scoredDialogGenerations.scoredGenerations())
            .containsExactly(
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
    }
}
