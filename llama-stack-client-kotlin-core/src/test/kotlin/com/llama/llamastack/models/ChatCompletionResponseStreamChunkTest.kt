// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.llama.llamastack.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ChatCompletionResponseStreamChunkTest {

    @Test
    fun createChatCompletionResponseStreamChunk() {
        val chatCompletionResponseStreamChunk =
            ChatCompletionResponseStreamChunk.builder()
                .event(
                    ChatCompletionResponseStreamChunk.Event.builder()
                        .textDelta("text")
                        .eventType(ChatCompletionResponseStreamChunk.Event.EventType.START)
                        .addLogprob(
                            TokenLogProbs.builder()
                                .logprobsByToken(
                                    TokenLogProbs.LogprobsByToken.builder()
                                        .putAdditionalProperty("foo", JsonValue.from(0))
                                        .build()
                                )
                                .build()
                        )
                        .stopReason(ChatCompletionResponseStreamChunk.Event.StopReason.END_OF_TURN)
                        .build()
                )
                .addMetric(
                    ChatCompletionResponseStreamChunk.Metric.builder()
                        .metric("metric")
                        .value(0.0)
                        .unit("unit")
                        .build()
                )
                .build()
        assertThat(chatCompletionResponseStreamChunk).isNotNull
        assertThat(chatCompletionResponseStreamChunk.event())
            .isEqualTo(
                ChatCompletionResponseStreamChunk.Event.builder()
                    .textDelta("text")
                    .eventType(ChatCompletionResponseStreamChunk.Event.EventType.START)
                    .addLogprob(
                        TokenLogProbs.builder()
                            .logprobsByToken(
                                TokenLogProbs.LogprobsByToken.builder()
                                    .putAdditionalProperty("foo", JsonValue.from(0))
                                    .build()
                            )
                            .build()
                    )
                    .stopReason(ChatCompletionResponseStreamChunk.Event.StopReason.END_OF_TURN)
                    .build()
            )
        assertThat(chatCompletionResponseStreamChunk.metrics())
            .containsExactly(
                ChatCompletionResponseStreamChunk.Metric.builder()
                    .metric("metric")
                    .value(0.0)
                    .unit("unit")
                    .build()
            )
    }
}
