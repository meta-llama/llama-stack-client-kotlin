// File generated from our OpenAPI spec by Stainless.

package com.llama_stack_client.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class TurnStreamEventTest {

    @Test
    fun createTurnStreamEvent() {
        val turnStreamEvent =
            TurnStreamEvent.builder()
                .payload(
                    TurnStreamEvent.Payload.ofAgentTurnResponseStepStartPayload(
                        TurnStreamEvent.Payload.AgentTurnResponseStepStartPayload.builder()
                            .eventType(
                                TurnStreamEvent.Payload.AgentTurnResponseStepStartPayload.EventType
                                    .STEP_START
                            )
                            .stepId("step_id")
                            .stepType(
                                TurnStreamEvent.Payload.AgentTurnResponseStepStartPayload.StepType
                                    .INFERENCE
                            )
                            .metadata(
                                TurnStreamEvent.Payload.AgentTurnResponseStepStartPayload.Metadata
                                    .builder()
                                    .build()
                            )
                            .build()
                    )
                )
                .build()
        assertThat(turnStreamEvent).isNotNull
        assertThat(turnStreamEvent.payload())
            .isEqualTo(
                TurnStreamEvent.Payload.ofAgentTurnResponseStepStartPayload(
                    TurnStreamEvent.Payload.AgentTurnResponseStepStartPayload.builder()
                        .eventType(
                            TurnStreamEvent.Payload.AgentTurnResponseStepStartPayload.EventType
                                .STEP_START
                        )
                        .stepId("step_id")
                        .stepType(
                            TurnStreamEvent.Payload.AgentTurnResponseStepStartPayload.StepType
                                .INFERENCE
                        )
                        .metadata(
                            TurnStreamEvent.Payload.AgentTurnResponseStepStartPayload.Metadata
                                .builder()
                                .build()
                        )
                        .build()
                )
            )
    }
}
