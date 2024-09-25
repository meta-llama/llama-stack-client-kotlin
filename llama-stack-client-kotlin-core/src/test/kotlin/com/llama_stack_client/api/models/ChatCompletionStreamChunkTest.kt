// File generated from our OpenAPI spec by Stainless.

package com.llama_stack_client.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ChatCompletionStreamChunkTest {

    @Test
    fun createChatCompletionStreamChunk() {
        val chatCompletionStreamChunk =
            ChatCompletionStreamChunk.builder()
                .event(
                    ChatCompletionStreamChunk.Event.builder()
                        .delta(ChatCompletionStreamChunk.Event.Delta.ofString("string"))
                        .eventType(ChatCompletionStreamChunk.Event.EventType.START)
                        .logprobs(
                            listOf(
                                TokenLogProbs.builder()
                                    .logprobsByToken(
                                        TokenLogProbs.LogprobsByToken.builder().build()
                                    )
                                    .build()
                            )
                        )
                        .stopReason(ChatCompletionStreamChunk.Event.StopReason.END_OF_TURN)
                        .build()
                )
                .build()
        assertThat(chatCompletionStreamChunk).isNotNull
        assertThat(chatCompletionStreamChunk.event())
            .isEqualTo(
                ChatCompletionStreamChunk.Event.builder()
                    .delta(ChatCompletionStreamChunk.Event.Delta.ofString("string"))
                    .eventType(ChatCompletionStreamChunk.Event.EventType.START)
                    .logprobs(
                        listOf(
                            TokenLogProbs.builder()
                                .logprobsByToken(TokenLogProbs.LogprobsByToken.builder().build())
                                .build()
                        )
                    )
                    .stopReason(ChatCompletionStreamChunk.Event.StopReason.END_OF_TURN)
                    .build()
            )
    }
}
