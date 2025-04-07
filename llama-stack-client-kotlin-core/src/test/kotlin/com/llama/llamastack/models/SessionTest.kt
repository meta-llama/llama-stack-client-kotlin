// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llama.llamastack.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SessionTest {

    @Test
    fun create() {
        val session =
            Session.builder()
                .sessionId("session_id")
                .sessionName("session_name")
                .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addTurn(
                    Turn.builder()
                        .addInputMessage(
                            UserMessage.builder().content("string").context("string").build()
                        )
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
                            Turn.OutputAttachment.builder()
                                .content("string")
                                .mimeType("mime_type")
                                .build()
                        )
                        .build()
                )
                .build()

        assertThat(session.sessionId()).isEqualTo("session_id")
        assertThat(session.sessionName()).isEqualTo("session_name")
        assertThat(session.startedAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(session.turns())
            .containsExactly(
                Turn.builder()
                    .addInputMessage(
                        UserMessage.builder().content("string").context("string").build()
                    )
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
                        Turn.OutputAttachment.builder()
                            .content("string")
                            .mimeType("mime_type")
                            .build()
                    )
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val session =
            Session.builder()
                .sessionId("session_id")
                .sessionName("session_name")
                .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addTurn(
                    Turn.builder()
                        .addInputMessage(
                            UserMessage.builder().content("string").context("string").build()
                        )
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
                            Turn.OutputAttachment.builder()
                                .content("string")
                                .mimeType("mime_type")
                                .build()
                        )
                        .build()
                )
                .build()

        val roundtrippedSession =
            jsonMapper.readValue(jsonMapper.writeValueAsString(session), jacksonTypeRef<Session>())

        assertThat(roundtrippedSession).isEqualTo(session)
    }
}
