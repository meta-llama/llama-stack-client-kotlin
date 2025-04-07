// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.llama.llamastack.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AgentCreateParamsTest {

    @Test
    fun create() {
        AgentCreateParams.builder()
            .agentConfig(
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
                    .addOutputShield("string")
                    .jsonSchemaResponseFormat(
                        ResponseFormat.JsonSchemaResponseFormat.JsonSchema.builder()
                            .putAdditionalProperty("foo", JsonValue.from(true))
                            .build()
                    )
                    .samplingParams(
                        SamplingParams.builder()
                            .strategyObject()
                            .maxTokens(0L)
                            .repetitionPenalty(0.0)
                            .addStop("string")
                            .build()
                    )
                    .toolChoice(AgentConfig.ToolChoice.AUTO)
                    .toolConfig(
                        AgentConfig.ToolConfig.builder()
                            .systemMessageBehavior(
                                AgentConfig.ToolConfig.SystemMessageBehavior.APPEND
                            )
                            .toolChoice(AgentConfig.ToolConfig.ToolChoice.AUTO)
                            .toolPromptFormat(AgentConfig.ToolConfig.ToolPromptFormat.JSON)
                            .build()
                    )
                    .toolPromptFormat(AgentConfig.ToolPromptFormat.JSON)
                    .addToolgroup("string")
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            AgentCreateParams.builder()
                .agentConfig(
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
                        .addOutputShield("string")
                        .jsonSchemaResponseFormat(
                            ResponseFormat.JsonSchemaResponseFormat.JsonSchema.builder()
                                .putAdditionalProperty("foo", JsonValue.from(true))
                                .build()
                        )
                        .samplingParams(
                            SamplingParams.builder()
                                .strategyObject()
                                .maxTokens(0L)
                                .repetitionPenalty(0.0)
                                .addStop("string")
                                .build()
                        )
                        .toolChoice(AgentConfig.ToolChoice.AUTO)
                        .toolConfig(
                            AgentConfig.ToolConfig.builder()
                                .systemMessageBehavior(
                                    AgentConfig.ToolConfig.SystemMessageBehavior.APPEND
                                )
                                .toolChoice(AgentConfig.ToolConfig.ToolChoice.AUTO)
                                .toolPromptFormat(AgentConfig.ToolConfig.ToolPromptFormat.JSON)
                                .build()
                        )
                        .toolPromptFormat(AgentConfig.ToolPromptFormat.JSON)
                        .addToolgroup("string")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.agentConfig())
            .isEqualTo(
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
                    .addOutputShield("string")
                    .jsonSchemaResponseFormat(
                        ResponseFormat.JsonSchemaResponseFormat.JsonSchema.builder()
                            .putAdditionalProperty("foo", JsonValue.from(true))
                            .build()
                    )
                    .samplingParams(
                        SamplingParams.builder()
                            .strategyObject()
                            .maxTokens(0L)
                            .repetitionPenalty(0.0)
                            .addStop("string")
                            .build()
                    )
                    .toolChoice(AgentConfig.ToolChoice.AUTO)
                    .toolConfig(
                        AgentConfig.ToolConfig.builder()
                            .systemMessageBehavior(
                                AgentConfig.ToolConfig.SystemMessageBehavior.APPEND
                            )
                            .toolChoice(AgentConfig.ToolConfig.ToolChoice.AUTO)
                            .toolPromptFormat(AgentConfig.ToolConfig.ToolPromptFormat.JSON)
                            .build()
                    )
                    .toolPromptFormat(AgentConfig.ToolPromptFormat.JSON)
                    .addToolgroup("string")
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            AgentCreateParams.builder()
                .agentConfig(
                    AgentConfig.builder().instructions("instructions").model("model").build()
                )
                .build()

        val body = params._body()

        assertThat(body.agentConfig())
            .isEqualTo(AgentConfig.builder().instructions("instructions").model("model").build())
    }
}
