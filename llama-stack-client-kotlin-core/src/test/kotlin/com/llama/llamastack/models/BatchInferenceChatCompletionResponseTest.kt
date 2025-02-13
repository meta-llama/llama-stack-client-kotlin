// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.llama.llamastack.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class BatchInferenceChatCompletionResponseTest {

    @Test
    fun createBatchInferenceChatCompletionResponse() {
        val batchInferenceChatCompletionResponse =
            BatchInferenceChatCompletionResponse.builder()
                .addBatch(
                    ChatCompletionResponse.builder()
                        .completionMessage(
                            CompletionMessage.builder()
                                .content("string")
                                .stopReason(CompletionMessage.StopReason.END_OF_TURN)
                                .addToolCall(
                                    ToolCall.builder()
                                        .arguments(
                                            ToolCall.Arguments.builder()
                                                .putAdditionalProperty(
                                                    "foo",
                                                    JsonValue.from("string")
                                                )
                                                .build()
                                        )
                                        .callId("call_id")
                                        .toolName(ToolCall.ToolName.BRAVE_SEARCH)
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
                        .build()
                )
                .build()
        assertThat(batchInferenceChatCompletionResponse).isNotNull
        assertThat(batchInferenceChatCompletionResponse.batch())
            .containsExactly(
                ChatCompletionResponse.builder()
                    .completionMessage(
                        CompletionMessage.builder()
                            .content("string")
                            .stopReason(CompletionMessage.StopReason.END_OF_TURN)
                            .addToolCall(
                                ToolCall.builder()
                                    .arguments(
                                        ToolCall.Arguments.builder()
                                            .putAdditionalProperty("foo", JsonValue.from("string"))
                                            .build()
                                    )
                                    .callId("call_id")
                                    .toolName(ToolCall.ToolName.BRAVE_SEARCH)
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
                    .build()
            )
    }
}
