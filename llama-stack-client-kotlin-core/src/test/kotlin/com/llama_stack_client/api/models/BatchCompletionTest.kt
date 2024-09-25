// File generated from our OpenAPI spec by Stainless.

package com.llama_stack_client.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class BatchCompletionTest {

    @Test
    fun createBatchCompletion() {
        val batchCompletion =
            BatchCompletion.builder()
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
                                        .toolName(
                                            ToolCall.ToolName.ofBuiltinTool(
                                                ToolCall.ToolName.BuiltinTool.BRAVE_SEARCH
                                            )
                                        )
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
                CompletionMessage.builder()
                    .content(CompletionMessage.Content.ofString("string"))
                    .role(CompletionMessage.Role.ASSISTANT)
                    .stopReason(CompletionMessage.StopReason.END_OF_TURN)
                    .toolCalls(
                        listOf(
                            ToolCall.builder()
                                .arguments(ToolCall.Arguments.builder().build())
                                .callId("call_id")
                                .toolName(
                                    ToolCall.ToolName.ofBuiltinTool(
                                        ToolCall.ToolName.BuiltinTool.BRAVE_SEARCH
                                    )
                                )
                                .build()
                        )
                    )
                    .build()
            )
    }
}
