// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class TurnTest {

    @Test
    fun createTurn() {
        val turn =
            Turn.builder()
                .inputMessages(
                    listOf(
                        Turn.InputMessage.ofUserMessage(
                            UserMessage.builder()
                                .content(UserMessage.Content.ofString("string"))
                                .role(UserMessage.Role.USER)
                                .context(UserMessage.Context.ofString("string"))
                                .build()
                        )
                    )
                )
                .outputAttachments(
                    listOf(
                        Attachment.builder()
                            .content(Attachment.Content.ofString("string"))
                            .mimeType("mime_type")
                            .build()
                    )
                )
                .outputMessage(
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
                .sessionId("session_id")
                .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .steps(
                    listOf(
                        Turn.Step.ofInferenceStep(
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
                )
                .turnId("turn_id")
                .completedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()
        assertThat(turn).isNotNull
        assertThat(turn.inputMessages())
            .containsExactly(
                Turn.InputMessage.ofUserMessage(
                    UserMessage.builder()
                        .content(UserMessage.Content.ofString("string"))
                        .role(UserMessage.Role.USER)
                        .context(UserMessage.Context.ofString("string"))
                        .build()
                )
            )
        assertThat(turn.outputAttachments())
            .containsExactly(
                Attachment.builder()
                    .content(Attachment.Content.ofString("string"))
                    .mimeType("mime_type")
                    .build()
            )
        assertThat(turn.outputMessage())
            .isEqualTo(
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
        assertThat(turn.sessionId()).isEqualTo("session_id")
        assertThat(turn.startedAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(turn.steps())
            .containsExactly(
                Turn.Step.ofInferenceStep(
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
        assertThat(turn.turnId()).isEqualTo("turn_id")
        assertThat(turn.completedAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }
}
