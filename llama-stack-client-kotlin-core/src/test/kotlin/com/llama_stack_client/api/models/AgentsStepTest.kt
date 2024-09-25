// File generated from our OpenAPI spec by Stainless.

package com.llama_stack_client.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AgentsStepTest {

    @Test
    fun createAgentsStep() {
        val agentsStep =
            AgentsStep.builder()
                .step(
                    AgentsStep.Step.ofInferenceStep(
                        InferenceStep.builder()
                            .modelResponse(
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
                            .stepId("step_id")
                            .stepType(InferenceStep.StepType.INFERENCE)
                            .turnId("turn_id")
                            .completedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
                    )
                )
                .build()
        assertThat(agentsStep).isNotNull
        assertThat(agentsStep.step())
            .isEqualTo(
                AgentsStep.Step.ofInferenceStep(
                    InferenceStep.builder()
                        .modelResponse(
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
                        .stepId("step_id")
                        .stepType(InferenceStep.StepType.INFERENCE)
                        .turnId("turn_id")
                        .completedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
            )
    }
}
