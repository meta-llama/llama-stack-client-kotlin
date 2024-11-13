// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class BatchInferenceChatCompletionResponseTest {

    @Test
    fun createBatchInferenceChatCompletionResponse() {
        val batchInferenceChatCompletionResponse =
            BatchInferenceChatCompletionResponse.builder()
                .completionMessageBatch(
                    listOf(
                        CompletionMessage.builder()
                            .content(CompletionMessage.Content.ofString("string"))
                            .role(CompletionMessage.Role.ASSISTANT)
                            .stopReason(CompletionMessage.StopReason.END_OF_TURN)
                            .toolCalls(
                                listOf(
                                    ToolCall.builder()
                                        .arguments(ToolCall.Arguments.builder().build())
                                        .callId("call_id")
                                        .toolName(ToolCall.ToolName.BRAVE_SEARCH)
                                        .build()
                                )
                            )
                            .build()
                    )
                )
                .build()
        assertThat(batchInferenceChatCompletionResponse).isNotNull
        assertThat(batchInferenceChatCompletionResponse.completionMessageBatch())
            .containsExactly(
                CompletionMessage.builder()
                    .content(CompletionMessage.Content.ofString("string"))
                    .role(CompletionMessage.Role.ASSISTANT)
                    .stopReason(CompletionMessage.StopReason.END_OF_TURN)
                    .toolCalls(
                        listOf(
                            ToolCall.builder()
                                .arguments(ToolCall.Arguments.builder().build())
                                .callId("call_id")
                                .toolName(ToolCall.ToolName.BRAVE_SEARCH)
                                .build()
                        )
                    )
                    .build()
            )
    }
}
