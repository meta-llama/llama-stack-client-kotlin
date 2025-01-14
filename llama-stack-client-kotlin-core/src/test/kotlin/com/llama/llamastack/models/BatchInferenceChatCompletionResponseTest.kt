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
                .completionMessageBatch(
                    listOf(
                        BatchInferenceChatCompletionResponse.CompletionMessageBatch.builder()
                            .content(InterleavedContent.ofString("string"))
                            .role(
                                BatchInferenceChatCompletionResponse.CompletionMessageBatch.Role
                                    .ASSISTANT
                            )
                            .stopReason(
                                BatchInferenceChatCompletionResponse.CompletionMessageBatch
                                    .StopReason
                                    .END_OF_TURN
                            )
                            .toolCalls(
                                listOf(
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
                            )
                            .build()
                    )
                )
                .build()
        assertThat(batchInferenceChatCompletionResponse).isNotNull
        assertThat(batchInferenceChatCompletionResponse.completionMessageBatch())
            .containsExactly(
                BatchInferenceChatCompletionResponse.CompletionMessageBatch.builder()
                    .content(InterleavedContent.ofString("string"))
                    .role(
                        BatchInferenceChatCompletionResponse.CompletionMessageBatch.Role.ASSISTANT
                    )
                    .stopReason(
                        BatchInferenceChatCompletionResponse.CompletionMessageBatch.StopReason
                            .END_OF_TURN
                    )
                    .toolCalls(
                        listOf(
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
                    )
                    .build()
            )
    }
}
