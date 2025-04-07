// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llama.llamastack.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InferenceStepTest {

    @Test
    fun create() {
        val inferenceStep =
            InferenceStep.builder()
                .modelResponse(
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
                .stepId("step_id")
                .turnId("turn_id")
                .completedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(inferenceStep.modelResponse())
            .isEqualTo(
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
        assertThat(inferenceStep.stepId()).isEqualTo("step_id")
        assertThat(inferenceStep.turnId()).isEqualTo("turn_id")
        assertThat(inferenceStep.completedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(inferenceStep.startedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val inferenceStep =
            InferenceStep.builder()
                .modelResponse(
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
                .stepId("step_id")
                .turnId("turn_id")
                .completedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedInferenceStep =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(inferenceStep),
                jacksonTypeRef<InferenceStep>(),
            )

        assertThat(roundtrippedInferenceStep).isEqualTo(inferenceStep)
    }
}
