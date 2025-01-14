// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.llama.llamastack.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class BatchCompletionTest {

    @Test
    fun createBatchCompletion() {
        val batchCompletion =
            BatchCompletion.builder()
                .completionMessageBatch(
                    listOf(
                        BatchCompletion.CompletionMessageBatch.builder()
                            .content(InterleavedContent.ofString("string"))
                            .role(BatchCompletion.CompletionMessageBatch.Role.ASSISTANT)
                            .stopReason(
                                BatchCompletion.CompletionMessageBatch.StopReason.END_OF_TURN
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
        assertThat(batchCompletion).isNotNull
        assertThat(batchCompletion.completionMessageBatch())
            .containsExactly(
                BatchCompletion.CompletionMessageBatch.builder()
                    .content(InterleavedContent.ofString("string"))
                    .role(BatchCompletion.CompletionMessageBatch.Role.ASSISTANT)
                    .stopReason(BatchCompletion.CompletionMessageBatch.StopReason.END_OF_TURN)
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
