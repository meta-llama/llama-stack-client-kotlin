// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.llama.llamastack.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class TurnResponseEventTest {

    @Test
    fun createTurnResponseEvent() {
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
        assertThat(turnResponseEvent).isNotNull
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
}
