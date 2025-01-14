// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.llama.llamastack.core.JsonValue
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class InferenceStepTest {

    @Test
    fun createInferenceStep() {
        val inferenceStep =
            InferenceStep.builder()
                .modelResponse(
                    InferenceStep.ModelResponse.builder()
                        .content(InterleavedContent.ofString("string"))
                        .role(InferenceStep.ModelResponse.Role.ASSISTANT)
                        .stopReason(InferenceStep.ModelResponse.StopReason.END_OF_TURN)
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
                .stepId("step_id")
                .stepType(InferenceStep.StepType.INFERENCE)
                .turnId("turn_id")
                .completedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()
        assertThat(inferenceStep).isNotNull
        assertThat(inferenceStep.modelResponse())
            .isEqualTo(
                InferenceStep.ModelResponse.builder()
                    .content(InterleavedContent.ofString("string"))
                    .role(InferenceStep.ModelResponse.Role.ASSISTANT)
                    .stopReason(InferenceStep.ModelResponse.StopReason.END_OF_TURN)
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
        assertThat(inferenceStep.stepId()).isEqualTo("step_id")
        assertThat(inferenceStep.stepType()).isEqualTo(InferenceStep.StepType.INFERENCE)
        assertThat(inferenceStep.turnId()).isEqualTo("turn_id")
        assertThat(inferenceStep.completedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(inferenceStep.startedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }
}
