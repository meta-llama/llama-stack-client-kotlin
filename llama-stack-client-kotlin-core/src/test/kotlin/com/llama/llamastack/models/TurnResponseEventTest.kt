// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TurnResponseEventTest {

    @Test
    fun create() {
        val turnResponseEvent =
            TurnResponseEvent.builder()
                .payload(
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
                .build()

        assertThat(turnResponseEvent.payload())
            .isEqualTo(
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
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val turnResponseEvent =
            TurnResponseEvent.builder()
                .payload(
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
                .build()

        val roundtrippedTurnResponseEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(turnResponseEvent),
                jacksonTypeRef<TurnResponseEvent>(),
            )

        assertThat(roundtrippedTurnResponseEvent).isEqualTo(turnResponseEvent)
    }
}
