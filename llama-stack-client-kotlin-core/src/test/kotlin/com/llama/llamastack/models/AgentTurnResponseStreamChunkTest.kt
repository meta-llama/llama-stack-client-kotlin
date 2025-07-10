// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AgentTurnResponseStreamChunkTest {

    @Test
    fun create() {
        val agentTurnResponseStreamChunk =
            AgentTurnResponseStreamChunk.builder()
                .event(
                    TurnResponseEvent.builder()
                        .payload(
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
                        .build()
                )
                .build()

        assertThat(agentTurnResponseStreamChunk.event())
            .isEqualTo(
                TurnResponseEvent.builder()
                    .payload(
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
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val agentTurnResponseStreamChunk =
            AgentTurnResponseStreamChunk.builder()
                .event(
                    TurnResponseEvent.builder()
                        .payload(
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
                        .build()
                )
                .build()

        val roundtrippedAgentTurnResponseStreamChunk =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(agentTurnResponseStreamChunk),
                jacksonTypeRef<AgentTurnResponseStreamChunk>(),
            )

        assertThat(roundtrippedAgentTurnResponseStreamChunk).isEqualTo(agentTurnResponseStreamChunk)
    }
}
