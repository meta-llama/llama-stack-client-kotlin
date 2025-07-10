// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AgentConfigTest {

    @Test
    fun create() {
        val agentConfig =
            AgentConfig.builder()
                .instructions("instructions")
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
                                .default(true)
                                .build()
                        )
                        .build()
                )
                .enableSessionPersistence(true)
                .addInputShield("string")
                .maxInferIters(0L)
                .name("name")
                .addOutputShield("string")
                .jsonSchemaResponseFormat(
                    ResponseFormat.JsonSchema.InnerJsonSchema.builder()
                        .putAdditionalProperty("foo", JsonValue.from(true))
                        .build()
                )
                .samplingParams(
                    SamplingParams.builder()
                        .strategyGreedy()
                        .maxTokens(0L)
                        .repetitionPenalty(0.0)
                        .addStop("string")
                        .build()
                )
                .toolChoice(AgentConfig.ToolChoice.AUTO)
                .toolConfig(
                    AgentConfig.ToolConfig.builder()
                        .systemMessageBehavior(AgentConfig.ToolConfig.SystemMessageBehavior.APPEND)
                        .toolChoice(AgentConfig.ToolConfig.ToolChoice.AUTO)
                        .toolPromptFormat(AgentConfig.ToolConfig.ToolPromptFormat.JSON)
                        .build()
                )
                .toolPromptFormat(AgentConfig.ToolPromptFormat.JSON)
                .addToolgroup("string")
                .build()

        assertThat(agentConfig.instructions()).isEqualTo("instructions")
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
                            .default(true)
                            .build()
                    )
                    .build()
            )
        assertThat(agentConfig.enableSessionPersistence()).isEqualTo(true)
        assertThat(agentConfig.inputShields()).containsExactly("string")
        assertThat(agentConfig.maxInferIters()).isEqualTo(0L)
        assertThat(agentConfig.name()).isEqualTo("name")
        assertThat(agentConfig.outputShields()).containsExactly("string")
        assertThat(agentConfig.responseFormat())
            .isEqualTo(
                ResponseFormat.ofJsonSchema(
                    ResponseFormat.JsonSchema.builder()
                        .jsonSchema(
                            ResponseFormat.JsonSchema.InnerJsonSchema.builder()
                                .putAdditionalProperty("foo", JsonValue.from(true))
                                .build()
                        )
                        .build()
                )
            )
        assertThat(agentConfig.samplingParams())
            .isEqualTo(
                SamplingParams.builder()
                    .strategyGreedy()
                    .maxTokens(0L)
                    .repetitionPenalty(0.0)
                    .addStop("string")
                    .build()
            )
        assertThat(agentConfig.toolChoice()).isEqualTo(AgentConfig.ToolChoice.AUTO)
        assertThat(agentConfig.toolConfig())
            .isEqualTo(
                AgentConfig.ToolConfig.builder()
                    .systemMessageBehavior(AgentConfig.ToolConfig.SystemMessageBehavior.APPEND)
                    .toolChoice(AgentConfig.ToolConfig.ToolChoice.AUTO)
                    .toolPromptFormat(AgentConfig.ToolConfig.ToolPromptFormat.JSON)
                    .build()
            )
        assertThat(agentConfig.toolPromptFormat()).isEqualTo(AgentConfig.ToolPromptFormat.JSON)
        assertThat(agentConfig.toolgroups())
            .containsExactly(AgentConfig.Toolgroup.ofString("string"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val agentConfig =
            AgentConfig.builder()
                .instructions("instructions")
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
                                .default(true)
                                .build()
                        )
                        .build()
                )
                .enableSessionPersistence(true)
                .addInputShield("string")
                .maxInferIters(0L)
                .name("name")
                .addOutputShield("string")
                .jsonSchemaResponseFormat(
                    ResponseFormat.JsonSchema.InnerJsonSchema.builder()
                        .putAdditionalProperty("foo", JsonValue.from(true))
                        .build()
                )
                .samplingParams(
                    SamplingParams.builder()
                        .strategyGreedy()
                        .maxTokens(0L)
                        .repetitionPenalty(0.0)
                        .addStop("string")
                        .build()
                )
                .toolChoice(AgentConfig.ToolChoice.AUTO)
                .toolConfig(
                    AgentConfig.ToolConfig.builder()
                        .systemMessageBehavior(AgentConfig.ToolConfig.SystemMessageBehavior.APPEND)
                        .toolChoice(AgentConfig.ToolConfig.ToolChoice.AUTO)
                        .toolPromptFormat(AgentConfig.ToolConfig.ToolPromptFormat.JSON)
                        .build()
                )
                .toolPromptFormat(AgentConfig.ToolPromptFormat.JSON)
                .addToolgroup("string")
                .build()

        val roundtrippedAgentConfig =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(agentConfig),
                jacksonTypeRef<AgentConfig>(),
            )

        assertThat(roundtrippedAgentConfig).isEqualTo(agentConfig)
    }
}
