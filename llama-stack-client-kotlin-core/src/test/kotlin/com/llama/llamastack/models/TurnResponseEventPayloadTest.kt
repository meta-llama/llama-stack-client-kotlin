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
    fun ofAgentTurnResponseStepStart() {
        val agentTurnResponseStepStart =
            TurnResponseEventPayload.AgentTurnResponseStepStartPayload.builder()
                .stepId("step_id")
                .stepType(
                    TurnResponseEventPayload.AgentTurnResponseStepStartPayload.StepType.INFERENCE
                )
                .metadata(
                    TurnResponseEventPayload.AgentTurnResponseStepStartPayload.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from(true))
                        .build()
                )
                .build()

        val turnResponseEventPayload =
            TurnResponseEventPayload.ofAgentTurnResponseStepStart(agentTurnResponseStepStart)

        assertThat(turnResponseEventPayload.agentTurnResponseStepStart())
            .isEqualTo(agentTurnResponseStepStart)
        assertThat(turnResponseEventPayload.agentTurnResponseStepProgress()).isNull()
        assertThat(turnResponseEventPayload.agentTurnResponseStepComplete()).isNull()
        assertThat(turnResponseEventPayload.agentTurnResponseTurnStart()).isNull()
        assertThat(turnResponseEventPayload.agentTurnResponseTurnComplete()).isNull()
        assertThat(turnResponseEventPayload.agentTurnResponseTurnAwaitingInput()).isNull()
    }

    @Test
    fun ofAgentTurnResponseStepStartRoundtrip() {
        val jsonMapper = jsonMapper()
        val turnResponseEventPayload =
            TurnResponseEventPayload.ofAgentTurnResponseStepStart(
                TurnResponseEventPayload.AgentTurnResponseStepStartPayload.builder()
                    .stepId("step_id")
                    .stepType(
                        TurnResponseEventPayload.AgentTurnResponseStepStartPayload.StepType
                            .INFERENCE
                    )
                    .metadata(
                        TurnResponseEventPayload.AgentTurnResponseStepStartPayload.Metadata
                            .builder()
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
    fun ofAgentTurnResponseStepProgress() {
        val agentTurnResponseStepProgress =
            TurnResponseEventPayload.AgentTurnResponseStepProgressPayload.builder()
                .textDelta("text")
                .stepId("step_id")
                .stepType(
                    TurnResponseEventPayload.AgentTurnResponseStepProgressPayload.StepType.INFERENCE
                )
                .build()

        val turnResponseEventPayload =
            TurnResponseEventPayload.ofAgentTurnResponseStepProgress(agentTurnResponseStepProgress)

        assertThat(turnResponseEventPayload.agentTurnResponseStepStart()).isNull()
        assertThat(turnResponseEventPayload.agentTurnResponseStepProgress())
            .isEqualTo(agentTurnResponseStepProgress)
        assertThat(turnResponseEventPayload.agentTurnResponseStepComplete()).isNull()
        assertThat(turnResponseEventPayload.agentTurnResponseTurnStart()).isNull()
        assertThat(turnResponseEventPayload.agentTurnResponseTurnComplete()).isNull()
        assertThat(turnResponseEventPayload.agentTurnResponseTurnAwaitingInput()).isNull()
    }

    @Test
    fun ofAgentTurnResponseStepProgressRoundtrip() {
        val jsonMapper = jsonMapper()
        val turnResponseEventPayload =
            TurnResponseEventPayload.ofAgentTurnResponseStepProgress(
                TurnResponseEventPayload.AgentTurnResponseStepProgressPayload.builder()
                    .textDelta("text")
                    .stepId("step_id")
                    .stepType(
                        TurnResponseEventPayload.AgentTurnResponseStepProgressPayload.StepType
                            .INFERENCE
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
    fun ofAgentTurnResponseStepComplete() {
        val agentTurnResponseStepComplete =
            TurnResponseEventPayload.AgentTurnResponseStepCompletePayload.builder()
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
                .stepType(
                    TurnResponseEventPayload.AgentTurnResponseStepCompletePayload.StepType.INFERENCE
                )
                .build()

        val turnResponseEventPayload =
            TurnResponseEventPayload.ofAgentTurnResponseStepComplete(agentTurnResponseStepComplete)

        assertThat(turnResponseEventPayload.agentTurnResponseStepStart()).isNull()
        assertThat(turnResponseEventPayload.agentTurnResponseStepProgress()).isNull()
        assertThat(turnResponseEventPayload.agentTurnResponseStepComplete())
            .isEqualTo(agentTurnResponseStepComplete)
        assertThat(turnResponseEventPayload.agentTurnResponseTurnStart()).isNull()
        assertThat(turnResponseEventPayload.agentTurnResponseTurnComplete()).isNull()
        assertThat(turnResponseEventPayload.agentTurnResponseTurnAwaitingInput()).isNull()
    }

    @Test
    fun ofAgentTurnResponseStepCompleteRoundtrip() {
        val jsonMapper = jsonMapper()
        val turnResponseEventPayload =
            TurnResponseEventPayload.ofAgentTurnResponseStepComplete(
                TurnResponseEventPayload.AgentTurnResponseStepCompletePayload.builder()
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
                    .stepType(
                        TurnResponseEventPayload.AgentTurnResponseStepCompletePayload.StepType
                            .INFERENCE
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
    fun ofAgentTurnResponseTurnStart() {
        val agentTurnResponseTurnStart =
            TurnResponseEventPayload.AgentTurnResponseTurnStartPayload.builder()
                .turnId("turn_id")
                .build()

        val turnResponseEventPayload =
            TurnResponseEventPayload.ofAgentTurnResponseTurnStart(agentTurnResponseTurnStart)

        assertThat(turnResponseEventPayload.agentTurnResponseStepStart()).isNull()
        assertThat(turnResponseEventPayload.agentTurnResponseStepProgress()).isNull()
        assertThat(turnResponseEventPayload.agentTurnResponseStepComplete()).isNull()
        assertThat(turnResponseEventPayload.agentTurnResponseTurnStart())
            .isEqualTo(agentTurnResponseTurnStart)
        assertThat(turnResponseEventPayload.agentTurnResponseTurnComplete()).isNull()
        assertThat(turnResponseEventPayload.agentTurnResponseTurnAwaitingInput()).isNull()
    }

    @Test
    fun ofAgentTurnResponseTurnStartRoundtrip() {
        val jsonMapper = jsonMapper()
        val turnResponseEventPayload =
            TurnResponseEventPayload.ofAgentTurnResponseTurnStart(
                TurnResponseEventPayload.AgentTurnResponseTurnStartPayload.builder()
                    .turnId("turn_id")
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
    fun ofAgentTurnResponseTurnComplete() {
        val agentTurnResponseTurnComplete =
            TurnResponseEventPayload.AgentTurnResponseTurnCompletePayload.builder()
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

        val turnResponseEventPayload =
            TurnResponseEventPayload.ofAgentTurnResponseTurnComplete(agentTurnResponseTurnComplete)

        assertThat(turnResponseEventPayload.agentTurnResponseStepStart()).isNull()
        assertThat(turnResponseEventPayload.agentTurnResponseStepProgress()).isNull()
        assertThat(turnResponseEventPayload.agentTurnResponseStepComplete()).isNull()
        assertThat(turnResponseEventPayload.agentTurnResponseTurnStart()).isNull()
        assertThat(turnResponseEventPayload.agentTurnResponseTurnComplete())
            .isEqualTo(agentTurnResponseTurnComplete)
        assertThat(turnResponseEventPayload.agentTurnResponseTurnAwaitingInput()).isNull()
    }

    @Test
    fun ofAgentTurnResponseTurnCompleteRoundtrip() {
        val jsonMapper = jsonMapper()
        val turnResponseEventPayload =
            TurnResponseEventPayload.ofAgentTurnResponseTurnComplete(
                TurnResponseEventPayload.AgentTurnResponseTurnCompletePayload.builder()
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
    fun ofAgentTurnResponseTurnAwaitingInput() {
        val agentTurnResponseTurnAwaitingInput =
            TurnResponseEventPayload.AgentTurnResponseTurnAwaitingInputPayload.builder()
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

        val turnResponseEventPayload =
            TurnResponseEventPayload.ofAgentTurnResponseTurnAwaitingInput(
                agentTurnResponseTurnAwaitingInput
            )

        assertThat(turnResponseEventPayload.agentTurnResponseStepStart()).isNull()
        assertThat(turnResponseEventPayload.agentTurnResponseStepProgress()).isNull()
        assertThat(turnResponseEventPayload.agentTurnResponseStepComplete()).isNull()
        assertThat(turnResponseEventPayload.agentTurnResponseTurnStart()).isNull()
        assertThat(turnResponseEventPayload.agentTurnResponseTurnComplete()).isNull()
        assertThat(turnResponseEventPayload.agentTurnResponseTurnAwaitingInput())
            .isEqualTo(agentTurnResponseTurnAwaitingInput)
    }

    @Test
    fun ofAgentTurnResponseTurnAwaitingInputRoundtrip() {
        val jsonMapper = jsonMapper()
        val turnResponseEventPayload =
            TurnResponseEventPayload.ofAgentTurnResponseTurnAwaitingInput(
                TurnResponseEventPayload.AgentTurnResponseTurnAwaitingInputPayload.builder()
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
