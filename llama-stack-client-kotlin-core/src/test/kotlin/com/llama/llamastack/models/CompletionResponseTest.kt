// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CompletionResponseTest {

    @Test
    fun createCompletionResponse() {
        val completionResponse =
            CompletionResponse.builder()
                .content("content")
                .stopReason(CompletionResponse.StopReason.END_OF_TURN)
                .logprobs(
                    listOf(
                        TokenLogProbs.builder()
                            .logprobsByToken(TokenLogProbs.LogprobsByToken.builder().build())
                            .build()
                    )
                )
                .build()
        assertThat(completionResponse).isNotNull
        assertThat(completionResponse.content()).isEqualTo("content")
        assertThat(completionResponse.stopReason())
            .isEqualTo(CompletionResponse.StopReason.END_OF_TURN)
        assertThat(completionResponse.logprobs())
            .containsExactly(
                TokenLogProbs.builder()
                    .logprobsByToken(TokenLogProbs.LogprobsByToken.builder().build())
                    .build()
            )
    }
}
