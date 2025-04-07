// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ChatCompletionResponseTest {

    @Test
    fun create() {
        val chatCompletionResponse =
            ChatCompletionResponse.builder()
                .completionMessage(
                    CompletionMessage.builder()
                        .content("string")
                        .stopReason(CompletionMessage.StopReason.END_OF_TURN)
                        .addToolCall(
                            ToolCall.builder()
                                .arguments("string")
                                .callId("call_id")
                                .toolName(ToolCall.ToolName.BRAVE_SEARCH)
                                .argumentsJson("arguments_json")
                                .build()
                        )
                        .build()
                )
                .addLogprob(
                    TokenLogProbs.builder()
                        .logprobsByToken(
                            TokenLogProbs.LogprobsByToken.builder()
                                .putAdditionalProperty("foo", JsonValue.from(0))
                                .build()
                        )
                        .build()
                )
                .addMetric(
                    ChatCompletionResponse.Metric.builder()
                        .metric("metric")
                        .value(0.0)
                        .unit("unit")
                        .build()
                )
                .build()

        assertThat(chatCompletionResponse.completionMessage())
            .isEqualTo(
                CompletionMessage.builder()
                    .content("string")
                    .stopReason(CompletionMessage.StopReason.END_OF_TURN)
                    .addToolCall(
                        ToolCall.builder()
                            .arguments("string")
                            .callId("call_id")
                            .toolName(ToolCall.ToolName.BRAVE_SEARCH)
                            .argumentsJson("arguments_json")
                            .build()
                    )
                    .build()
            )
        assertThat(chatCompletionResponse.logprobs())
            .containsExactly(
                TokenLogProbs.builder()
                    .logprobsByToken(
                        TokenLogProbs.LogprobsByToken.builder()
                            .putAdditionalProperty("foo", JsonValue.from(0))
                            .build()
                    )
                    .build()
            )
        assertThat(chatCompletionResponse.metrics())
            .containsExactly(
                ChatCompletionResponse.Metric.builder()
                    .metric("metric")
                    .value(0.0)
                    .unit("unit")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val chatCompletionResponse =
            ChatCompletionResponse.builder()
                .completionMessage(
                    CompletionMessage.builder()
                        .content("string")
                        .stopReason(CompletionMessage.StopReason.END_OF_TURN)
                        .addToolCall(
                            ToolCall.builder()
                                .arguments("string")
                                .callId("call_id")
                                .toolName(ToolCall.ToolName.BRAVE_SEARCH)
                                .argumentsJson("arguments_json")
                                .build()
                        )
                        .build()
                )
                .addLogprob(
                    TokenLogProbs.builder()
                        .logprobsByToken(
                            TokenLogProbs.LogprobsByToken.builder()
                                .putAdditionalProperty("foo", JsonValue.from(0))
                                .build()
                        )
                        .build()
                )
                .addMetric(
                    ChatCompletionResponse.Metric.builder()
                        .metric("metric")
                        .value(0.0)
                        .unit("unit")
                        .build()
                )
                .build()

        val roundtrippedChatCompletionResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(chatCompletionResponse),
                jacksonTypeRef<ChatCompletionResponse>(),
            )

        assertThat(roundtrippedChatCompletionResponse).isEqualTo(chatCompletionResponse)
    }
}
