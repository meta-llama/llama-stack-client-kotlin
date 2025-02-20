// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.llama.llamastack.core.JsonValue
import java.time.OffsetDateTime
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
                        .spanId("span_id")
                        .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .traceId("trace_id")
                        .unit("unit")
                        .value(0.0)
                        .attributes(
                            ChatCompletionResponseStreamChunk.Metric.Attributes.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
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
                    .spanId("span_id")
                    .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .traceId("trace_id")
                    .unit("unit")
                    .value(0.0)
                    .attributes(
                        ChatCompletionResponseStreamChunk.Metric.Attributes.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .build()
            )
    }
}
