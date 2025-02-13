// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.llama.llamastack.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AgentTurnResponseStreamChunkTest {

    @Test
    fun createAgentTurnResponseStreamChunk() {
        val agentTurnResponseStreamChunk =
            AgentTurnResponseStreamChunk.builder()
                .event(
                    TurnResponseEvent.builder()
                        .payload(
                            TurnResponseEventPayload.AgentTurnResponseStepStartPayload.builder()
                                .stepId("step_id")
                                .stepType(
                                    TurnResponseEventPayload.AgentTurnResponseStepStartPayload
                                        .StepType
                                        .INFERENCE
                                )
                                .metadata(
                                    TurnResponseEventPayload.AgentTurnResponseStepStartPayload
                                        .Metadata
                                        .builder()
                                        .putAdditionalProperty("foo", JsonValue.from(true))
                                        .build()
                                )
                                .build()
                        )
                        .build()
                )
                .build()
        assertThat(agentTurnResponseStreamChunk).isNotNull
        assertThat(agentTurnResponseStreamChunk.event())
            .isEqualTo(
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
            )
    }
}
