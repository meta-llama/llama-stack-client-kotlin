// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.core.jsonMapper
import com.llama.llamastack.errors.LlamaStackClientInvalidDataException
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.EnumSource

internal class TurnResponseEventPayloadTest {

    @Test
    fun ofStepStart() {
        val stepStart =
            TurnResponseEventPayload.StepStart.builder()
                .stepId("step_id")
                .stepType(TurnResponseEventPayload.StepStart.StepType.INFERENCE)
                .metadata(
                    TurnResponseEventPayload.StepStart.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from(true))
                        .build()
                )
                .build()

        val turnResponseEventPayload = TurnResponseEventPayload.ofStepStart(stepStart)

        assertThat(turnResponseEventPayload.stepStart()).isEqualTo(stepStart)
        assertThat(turnResponseEventPayload.stepProgress()).isNull()
        assertThat(turnResponseEventPayload.stepComplete()).isNull()
        assertThat(turnResponseEventPayload.start()).isNull()
        assertThat(turnResponseEventPayload.complete()).isNull()
        assertThat(turnResponseEventPayload.awaitingInput()).isNull()
    }

    @Test
    fun ofStepStartRoundtrip() {
        val jsonMapper = jsonMapper()
        val turnResponseEventPayload =
            TurnResponseEventPayload.ofStepStart(
                TurnResponseEventPayload.StepStart.builder()
                    .stepId("step_id")
                    .stepType(TurnResponseEventPayload.StepStart.StepType.INFERENCE)
                    .metadata(
                        TurnResponseEventPayload.StepStart.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from(true))
                            .build()
                    )
                    .build()
            )

        val roundtrippedTurnResponseEventPayload =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(turnResponseEventPayload),
                jacksonTypeRef<TurnResponseEventPayload>(),
            )

        assertThat(roundtrippedTurnResponseEventPayload).isEqualTo(turnResponseEventPayload)
    }

    @Test
    fun ofStepProgress() {
        val stepProgress =
            TurnResponseEventPayload.StepProgress.builder()
                .textDelta("text")
                .stepId("step_id")
                .stepType(TurnResponseEventPayload.StepProgress.StepType.INFERENCE)
                .build()

        val turnResponseEventPayload = TurnResponseEventPayload.ofStepProgress(stepProgress)

        assertThat(turnResponseEventPayload.stepStart()).isNull()
        assertThat(turnResponseEventPayload.stepProgress()).isEqualTo(stepProgress)
        assertThat(turnResponseEventPayload.stepComplete()).isNull()
        assertThat(turnResponseEventPayload.start()).isNull()
        assertThat(turnResponseEventPayload.complete()).isNull()
        assertThat(turnResponseEventPayload.awaitingInput()).isNull()
    }

    @Test
    fun ofStepProgressRoundtrip() {
        val jsonMapper = jsonMapper()
        val turnResponseEventPayload =
            TurnResponseEventPayload.ofStepProgress(
                TurnResponseEventPayload.StepProgress.builder()
                    .textDelta("text")
                    .stepId("step_id")
                    .stepType(TurnResponseEventPayload.StepProgress.StepType.INFERENCE)
                    .build()
            )

        val roundtrippedTurnResponseEventPayload =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(turnResponseEventPayload),
                jacksonTypeRef<TurnResponseEventPayload>(),
            )

        assertThat(roundtrippedTurnResponseEventPayload).isEqualTo(turnResponseEventPayload)
    }

    @Test
    fun ofStepComplete() {
        val stepComplete =
            TurnResponseEventPayload.StepComplete.builder()
                .stepDetails(
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
                .stepId("step_id")
                .stepType(TurnResponseEventPayload.StepComplete.StepType.INFERENCE)
                .build()

        val turnResponseEventPayload = TurnResponseEventPayload.ofStepComplete(stepComplete)

        assertThat(turnResponseEventPayload.stepStart()).isNull()
        assertThat(turnResponseEventPayload.stepProgress()).isNull()
        assertThat(turnResponseEventPayload.stepComplete()).isEqualTo(stepComplete)
        assertThat(turnResponseEventPayload.start()).isNull()
        assertThat(turnResponseEventPayload.complete()).isNull()
        assertThat(turnResponseEventPayload.awaitingInput()).isNull()
    }

    @Test
    fun ofStepCompleteRoundtrip() {
        val jsonMapper = jsonMapper()
        val turnResponseEventPayload =
            TurnResponseEventPayload.ofStepComplete(
                TurnResponseEventPayload.StepComplete.builder()
                    .stepDetails(
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
                    .stepId("step_id")
                    .stepType(TurnResponseEventPayload.StepComplete.StepType.INFERENCE)
                    .build()
            )

        val roundtrippedTurnResponseEventPayload =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(turnResponseEventPayload),
                jacksonTypeRef<TurnResponseEventPayload>(),
            )

        assertThat(roundtrippedTurnResponseEventPayload).isEqualTo(turnResponseEventPayload)
    }

    @Test
    fun ofStart() {
        val start = TurnResponseEventPayload.TurnStart.builder().turnId("turn_id").build()

        val turnResponseEventPayload = TurnResponseEventPayload.ofStart(start)

        assertThat(turnResponseEventPayload.stepStart()).isNull()
        assertThat(turnResponseEventPayload.stepProgress()).isNull()
        assertThat(turnResponseEventPayload.stepComplete()).isNull()
        assertThat(turnResponseEventPayload.start()).isEqualTo(start)
        assertThat(turnResponseEventPayload.complete()).isNull()
        assertThat(turnResponseEventPayload.awaitingInput()).isNull()
    }

    @Test
    fun ofStartRoundtrip() {
        val jsonMapper = jsonMapper()
        val turnResponseEventPayload =
            TurnResponseEventPayload.ofStart(
                TurnResponseEventPayload.TurnStart.builder().turnId("turn_id").build()
            )

        val roundtrippedTurnResponseEventPayload =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(turnResponseEventPayload),
                jacksonTypeRef<TurnResponseEventPayload>(),
            )

        assertThat(roundtrippedTurnResponseEventPayload).isEqualTo(turnResponseEventPayload)
    }

    @Test
    fun ofComplete() {
        val complete =
            TurnResponseEventPayload.TurnComplete.builder()
                .turn(
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

        val turnResponseEventPayload = TurnResponseEventPayload.ofComplete(complete)

        assertThat(turnResponseEventPayload.stepStart()).isNull()
        assertThat(turnResponseEventPayload.stepProgress()).isNull()
        assertThat(turnResponseEventPayload.stepComplete()).isNull()
        assertThat(turnResponseEventPayload.start()).isNull()
        assertThat(turnResponseEventPayload.complete()).isEqualTo(complete)
        assertThat(turnResponseEventPayload.awaitingInput()).isNull()
    }

    @Test
    fun ofCompleteRoundtrip() {
        val jsonMapper = jsonMapper()
        val turnResponseEventPayload =
            TurnResponseEventPayload.ofComplete(
                TurnResponseEventPayload.TurnComplete.builder()
                    .turn(
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
            )

        val roundtrippedTurnResponseEventPayload =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(turnResponseEventPayload),
                jacksonTypeRef<TurnResponseEventPayload>(),
            )

        assertThat(roundtrippedTurnResponseEventPayload).isEqualTo(turnResponseEventPayload)
    }

    @Test
    fun ofAwaitingInput() {
        val awaitingInput =
            TurnResponseEventPayload.TurnAwaitingInput.builder()
                .turn(
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

        val turnResponseEventPayload = TurnResponseEventPayload.ofAwaitingInput(awaitingInput)

        assertThat(turnResponseEventPayload.stepStart()).isNull()
        assertThat(turnResponseEventPayload.stepProgress()).isNull()
        assertThat(turnResponseEventPayload.stepComplete()).isNull()
        assertThat(turnResponseEventPayload.start()).isNull()
        assertThat(turnResponseEventPayload.complete()).isNull()
        assertThat(turnResponseEventPayload.awaitingInput()).isEqualTo(awaitingInput)
    }

    @Test
    fun ofAwaitingInputRoundtrip() {
        val jsonMapper = jsonMapper()
        val turnResponseEventPayload =
            TurnResponseEventPayload.ofAwaitingInput(
                TurnResponseEventPayload.TurnAwaitingInput.builder()
                    .turn(
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
            )

        val roundtrippedTurnResponseEventPayload =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(turnResponseEventPayload),
                jacksonTypeRef<TurnResponseEventPayload>(),
            )

        assertThat(roundtrippedTurnResponseEventPayload).isEqualTo(turnResponseEventPayload)
    }

    enum class IncompatibleJsonShapeTestCase(val value: JsonValue) {
        BOOLEAN(JsonValue.from(false)),
        STRING(JsonValue.from("invalid")),
        INTEGER(JsonValue.from(-1)),
        FLOAT(JsonValue.from(3.14)),
        ARRAY(JsonValue.from(listOf("invalid", "array"))),
    }

    @ParameterizedTest
    @EnumSource
    fun incompatibleJsonShapeDeserializesToUnknown(testCase: IncompatibleJsonShapeTestCase) {
        val turnResponseEventPayload =
            jsonMapper().convertValue(testCase.value, jacksonTypeRef<TurnResponseEventPayload>())

        val e =
            assertThrows<LlamaStackClientInvalidDataException> {
                turnResponseEventPayload.validate()
            }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
