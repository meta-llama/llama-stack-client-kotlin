// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llama.llamastack.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TurnTest {

    @Test
    fun create() {
        val turn =
            Turn.builder()
                .addInputMessage(UserMessage.builder().content("string").context("string").build())
                .outputMessage(
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
                .sessionId("session_id")
                .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addStep(
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
                )
                .turnId("turn_id")
                .completedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addOutputAttachment(
                    Turn.OutputAttachment.builder().content("string").mimeType("mime_type").build()
                )
                .build()

        assertThat(turn.inputMessages())
            .containsExactly(
                Turn.InputMessage.ofUser(
                    UserMessage.builder().content("string").context("string").build()
                )
            )
        assertThat(turn.outputMessage())
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
        assertThat(turn.sessionId()).isEqualTo("session_id")
        assertThat(turn.startedAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(turn.steps())
            .containsExactly(
                Turn.Step.ofInference(
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
                )
            )
        assertThat(turn.turnId()).isEqualTo("turn_id")
        assertThat(turn.completedAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(turn.outputAttachments())
            .containsExactly(
                Turn.OutputAttachment.builder().content("string").mimeType("mime_type").build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val turn =
            Turn.builder()
                .addInputMessage(UserMessage.builder().content("string").context("string").build())
                .outputMessage(
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
                .sessionId("session_id")
                .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addStep(
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
                )
                .turnId("turn_id")
                .completedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addOutputAttachment(
                    Turn.OutputAttachment.builder().content("string").mimeType("mime_type").build()
                )
                .build()

        val roundtrippedTurn =
            jsonMapper.readValue(jsonMapper.writeValueAsString(turn), jacksonTypeRef<Turn>())

        assertThat(roundtrippedTurn).isEqualTo(turn)
    }
}
