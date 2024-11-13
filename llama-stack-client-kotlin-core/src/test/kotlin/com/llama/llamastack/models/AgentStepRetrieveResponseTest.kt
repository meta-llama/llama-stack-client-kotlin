// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AgentStepRetrieveResponseTest {

    @Test
    fun createAgentStepRetrieveResponse() {
        val agentStepRetrieveResponse =
            AgentStepRetrieveResponse.builder()
                .step(
                    AgentStepRetrieveResponse.Step.ofInferenceStep(
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
                                                .toolName(ToolCall.ToolName.BRAVE_SEARCH)
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
        assertThat(agentStepRetrieveResponse).isNotNull
        assertThat(agentStepRetrieveResponse.step())
            .isEqualTo(
                AgentStepRetrieveResponse.Step.ofInferenceStep(
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
                                            .toolName(ToolCall.ToolName.BRAVE_SEARCH)
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
