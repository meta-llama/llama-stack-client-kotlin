// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.llama.llamastack.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AgentConfigTest {

    @Test
    fun createAgentConfig() {
        val agentConfig =
            AgentConfig.builder()
                .enableSessionPersistence(true)
                .instructions("instructions")
                .maxInferIters(0L)
                .model("model")
                .addClientTool(
                    ToolDef.builder()
                        .name("name")
                        .description("description")
                        .metadata(
                            ToolDef.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from(true))
                                .build()
                        )
                        .addParameter(
                            ToolDef.Parameter.builder()
                                .description("description")
                                .name("name")
                                .parameterType("parameter_type")
                                .required(true)
                                .default(ToolDef.Parameter.Default.ofBoolean(true))
                                .build()
                        )
                        .build()
                )
                .addInputShield("string")
                .addOutputShield("string")
                .samplingParams(
                    SamplingParams.builder()
                        .strategyGreedySampling()
                        .maxTokens(0L)
                        .repetitionPenalty(0.0)
                        .build()
                )
                .toolChoice(AgentConfig.ToolChoice.AUTO)
                .toolPromptFormat(AgentConfig.ToolPromptFormat.JSON)
                .addToolgroup("string")
                .build()
        assertThat(agentConfig).isNotNull
        assertThat(agentConfig.enableSessionPersistence()).isEqualTo(true)
        assertThat(agentConfig.instructions()).isEqualTo("instructions")
        assertThat(agentConfig.maxInferIters()).isEqualTo(0L)
        assertThat(agentConfig.model()).isEqualTo("model")
        assertThat(agentConfig.clientTools())
            .containsExactly(
                ToolDef.builder()
                    .name("name")
                    .description("description")
                    .metadata(
                        ToolDef.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from(true))
                            .build()
                    )
                    .addParameter(
                        ToolDef.Parameter.builder()
                            .description("description")
                            .name("name")
                            .parameterType("parameter_type")
                            .required(true)
                            .default(ToolDef.Parameter.Default.ofBoolean(true))
                            .build()
                    )
                    .build()
            )
        assertThat(agentConfig.inputShields()).containsExactly("string")
        assertThat(agentConfig.outputShields()).containsExactly("string")
        assertThat(agentConfig.samplingParams())
            .isEqualTo(
                SamplingParams.builder()
                    .strategyGreedySampling()
                    .maxTokens(0L)
                    .repetitionPenalty(0.0)
                    .build()
            )
        assertThat(agentConfig.toolChoice()).isEqualTo(AgentConfig.ToolChoice.AUTO)
        assertThat(agentConfig.toolPromptFormat()).isEqualTo(AgentConfig.ToolPromptFormat.JSON)
        assertThat(agentConfig.toolgroups())
            .containsExactly(AgentConfig.Toolgroup.ofString("string"))
    }
}
