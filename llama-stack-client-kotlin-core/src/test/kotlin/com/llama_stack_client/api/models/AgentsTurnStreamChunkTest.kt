// File generated from our OpenAPI spec by Stainless.

package com.llama_stack_client.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AgentsTurnStreamChunkTest {

    @Test
    fun createAgentsTurnStreamChunk() {
        val agentsTurnStreamChunk =
            AgentsTurnStreamChunk.builder()
                .event(
                    TurnStreamEvent.builder()
                        .payload(
                            TurnStreamEvent.Payload.ofAgentTurnResponseStepStartPayload(
                                TurnStreamEvent.Payload.AgentTurnResponseStepStartPayload.builder()
                                    .eventType(
                                        TurnStreamEvent.Payload.AgentTurnResponseStepStartPayload
                                            .EventType
                                            .STEP_START
                                    )
                                    .stepId("step_id")
                                    .stepType(
                                        TurnStreamEvent.Payload.AgentTurnResponseStepStartPayload
                                            .StepType
                                            .INFERENCE
                                    )
                                    .metadata(
                                        TurnStreamEvent.Payload.AgentTurnResponseStepStartPayload
                                            .Metadata
                                            .builder()
                                            .build()
                                    )
                                    .build()
                            )
                        )
                        .build()
                )
                .build()
        assertThat(agentsTurnStreamChunk).isNotNull
        assertThat(agentsTurnStreamChunk.event())
            .isEqualTo(
                TurnStreamEvent.builder()
                    .payload(
                        TurnStreamEvent.Payload.ofAgentTurnResponseStepStartPayload(
                            TurnStreamEvent.Payload.AgentTurnResponseStepStartPayload.builder()
                                .eventType(
                                    TurnStreamEvent.Payload.AgentTurnResponseStepStartPayload
                                        .EventType
                                        .STEP_START
                                )
                                .stepId("step_id")
                                .stepType(
                                    TurnStreamEvent.Payload.AgentTurnResponseStepStartPayload
                                        .StepType
                                        .INFERENCE
                                )
                                .metadata(
                                    TurnStreamEvent.Payload.AgentTurnResponseStepStartPayload
                                        .Metadata
                                        .builder()
                                        .build()
                                )
                                .build()
                        )
                    )
                    .build()
            )
    }
}
