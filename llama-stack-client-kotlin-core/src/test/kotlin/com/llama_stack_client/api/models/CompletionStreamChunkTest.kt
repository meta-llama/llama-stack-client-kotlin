// File generated from our OpenAPI spec by Stainless.

package com.llama_stack_client.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CompletionStreamChunkTest {

    @Test
    fun createCompletionStreamChunk() {
        val completionStreamChunk =
            CompletionStreamChunk.builder()
                .delta("delta")
                .logprobs(
                    listOf(
                        TokenLogProbs.builder()
                            .logprobsByToken(TokenLogProbs.LogprobsByToken.builder().build())
                            .build()
                    )
                )
                .stopReason(CompletionStreamChunk.StopReason.END_OF_TURN)
                .build()
        assertThat(completionStreamChunk).isNotNull
        assertThat(completionStreamChunk.delta()).isEqualTo("delta")
        assertThat(completionStreamChunk.logprobs())
            .containsExactly(
                TokenLogProbs.builder()
                    .logprobsByToken(TokenLogProbs.LogprobsByToken.builder().build())
                    .build()
            )
        assertThat(completionStreamChunk.stopReason())
            .isEqualTo(CompletionStreamChunk.StopReason.END_OF_TURN)
    }
}
