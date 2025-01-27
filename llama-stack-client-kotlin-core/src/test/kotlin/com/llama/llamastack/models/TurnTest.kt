// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.llama.llamastack.core.JsonValue
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class TurnTest {

    @Test
    fun createTurn() {
        val turn =
            Turn.builder()
                .addInputMessage(UserMessage.builder().content("string").context("string").build())
                .addOutputAttachment(
                    Turn.OutputAttachment.builder().content("string").mimeType("mime_type").build()
                )
                .outputMessage(
                    CompletionMessage.builder()
                        .content("string")
                        .stopReason(CompletionMessage.StopReason.END_OF_TURN)
                        .addToolCall(
                            CompletionMessage.ToolCall.builder()
                                .arguments(
                                    CompletionMessage.ToolCall.Arguments.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("string"))
                                        .build()
                                )
                                .callId("call_id")
                                .toolName(CompletionMessage.ToolCall.ToolName.BRAVE_SEARCH)
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
                                    CompletionMessage.ToolCall.builder()
                                        .arguments(
                                            CompletionMessage.ToolCall.Arguments.builder()
                                                .putAdditionalProperty(
                                                    "foo",
                                                    JsonValue.from("string")
                                                )
                                                .build()
                                        )
                                        .callId("call_id")
                                        .toolName(CompletionMessage.ToolCall.ToolName.BRAVE_SEARCH)
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
                .build()
        assertThat(turn).isNotNull
        assertThat(turn.inputMessages())
            .containsExactly(
                Turn.InputMessage.ofUser(
                    UserMessage.builder().content("string").context("string").build()
                )
            )
        assertThat(turn.outputAttachments())
            .containsExactly(
                Turn.OutputAttachment.builder().content("string").mimeType("mime_type").build()
            )
        assertThat(turn.outputMessage())
            .isEqualTo(
                CompletionMessage.builder()
                    .content("string")
                    .stopReason(CompletionMessage.StopReason.END_OF_TURN)
                    .addToolCall(
                        CompletionMessage.ToolCall.builder()
                            .arguments(
                                CompletionMessage.ToolCall.Arguments.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .callId("call_id")
                            .toolName(CompletionMessage.ToolCall.ToolName.BRAVE_SEARCH)
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
                                    CompletionMessage.ToolCall.builder()
                                        .arguments(
                                            CompletionMessage.ToolCall.Arguments.builder()
                                                .putAdditionalProperty(
                                                    "foo",
                                                    JsonValue.from("string")
                                                )
                                                .build()
                                        )
                                        .callId("call_id")
                                        .toolName(CompletionMessage.ToolCall.ToolName.BRAVE_SEARCH)
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
    }
}
