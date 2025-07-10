// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InferenceBatchChatCompletionResponseTest {

    @Test
    fun create() {
        val inferenceBatchChatCompletionResponse =
            InferenceBatchChatCompletionResponse.builder()
                .addBatch(
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
                )
                .build()

        assertThat(inferenceBatchChatCompletionResponse.batch())
            .containsExactly(
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
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val inferenceBatchChatCompletionResponse =
            InferenceBatchChatCompletionResponse.builder()
                .addBatch(
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
                )
                .build()

        val roundtrippedInferenceBatchChatCompletionResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(inferenceBatchChatCompletionResponse),
                jacksonTypeRef<InferenceBatchChatCompletionResponse>(),
            )

        assertThat(roundtrippedInferenceBatchChatCompletionResponse)
            .isEqualTo(inferenceBatchChatCompletionResponse)
    }
}
