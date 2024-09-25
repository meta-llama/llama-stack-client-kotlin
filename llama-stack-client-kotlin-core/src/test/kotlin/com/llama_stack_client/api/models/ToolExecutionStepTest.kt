// File generated from our OpenAPI spec by Stainless.

package com.llama_stack_client.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ToolExecutionStepTest {

    @Test
    fun createToolExecutionStep() {
        val toolExecutionStep =
            ToolExecutionStep.builder()
                .stepId("step_id")
                .stepType(ToolExecutionStep.StepType.TOOL_EXECUTION)
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
                .toolResponses(
                    listOf(
                        ToolExecutionStep.ToolResponse.builder()
                            .callId("call_id")
                            .content(ToolExecutionStep.ToolResponse.Content.ofString("string"))
                            .toolName(
                                ToolExecutionStep.ToolResponse.ToolName.ofBuiltinTool(
                                    ToolExecutionStep.ToolResponse.ToolName.BuiltinTool.BRAVE_SEARCH
                                )
                            )
                            .build()
                    )
                )
                .turnId("turn_id")
                .completedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()
        assertThat(toolExecutionStep).isNotNull
        assertThat(toolExecutionStep.stepId()).isEqualTo("step_id")
        assertThat(toolExecutionStep.stepType())
            .isEqualTo(ToolExecutionStep.StepType.TOOL_EXECUTION)
        assertThat(toolExecutionStep.toolCalls())
            .containsExactly(
                ToolCall.builder()
                    .arguments(ToolCall.Arguments.builder().build())
                    .callId("call_id")
                    .toolName(
                        ToolCall.ToolName.ofBuiltinTool(ToolCall.ToolName.BuiltinTool.BRAVE_SEARCH)
                    )
                    .build()
            )
        assertThat(toolExecutionStep.toolResponses())
            .containsExactly(
                ToolExecutionStep.ToolResponse.builder()
                    .callId("call_id")
                    .content(ToolExecutionStep.ToolResponse.Content.ofString("string"))
                    .toolName(
                        ToolExecutionStep.ToolResponse.ToolName.ofBuiltinTool(
                            ToolExecutionStep.ToolResponse.ToolName.BuiltinTool.BRAVE_SEARCH
                        )
                    )
                    .build()
            )
        assertThat(toolExecutionStep.turnId()).isEqualTo("turn_id")
        assertThat(toolExecutionStep.completedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(toolExecutionStep.startedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }
}
