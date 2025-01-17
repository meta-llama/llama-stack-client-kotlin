// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.llama.llamastack.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AgentCreateParamsTest {

    @Test
    fun createAgentCreateParams() {
        AgentCreateParams.builder()
            .agentConfig(
                AgentConfig.builder()
                    .enableSessionPersistence(true)
                    .instructions("instructions")
                    .maxInferIters(0L)
                    .model("model")
                    .clientTools(
                        listOf(
                            ToolDef.builder()
                                .name("name")
                                .description("description")
                                .metadata(
                                    ToolDef.Metadata.builder()
                                        .putAdditionalProperty("foo", JsonValue.from(true))
                                        .build()
                                )
                                .parameters(
                                    listOf(
                                        ToolDef.Parameter.builder()
                                            .description("description")
                                            .name("name")
                                            .parameterType("parameter_type")
                                            .required(true)
                                            .default(ToolDef.Parameter.Default.ofBoolean(true))
                                            .build()
                                    )
                                )
                                .build()
                        )
                    )
                    .inputShields(listOf("string"))
                    .outputShields(listOf("string"))
                    .samplingParams(
                        SamplingParams.builder()
                            .strategy(
                                SamplingParams.Strategy.ofGreedySamplingStrategy(
                                    SamplingParams.Strategy.GreedySamplingStrategy.builder()
                                        .type(
                                            SamplingParams.Strategy.GreedySamplingStrategy.Type
                                                .GREEDY
                                        )
                                        .build()
                                )
                            )
                            .maxTokens(0L)
                            .repetitionPenalty(0.0)
                            .build()
                    )
                    .toolChoice(AgentConfig.ToolChoice.AUTO)
                    .toolPromptFormat(AgentConfig.ToolPromptFormat.JSON)
                    .toolgroups(listOf(AgentConfig.Toolgroup.ofString("string")))
                    .build()
            )
            .xLlamaStackClientVersion("X-LlamaStack-Client-Version")
            .xLlamaStackProviderData("X-LlamaStack-Provider-Data")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            AgentCreateParams.builder()
                .agentConfig(
                    AgentConfig.builder()
                        .enableSessionPersistence(true)
                        .instructions("instructions")
                        .maxInferIters(0L)
                        .model("model")
                        .clientTools(
                            listOf(
                                ToolDef.builder()
                                    .name("name")
                                    .description("description")
                                    .metadata(
                                        ToolDef.Metadata.builder()
                                            .putAdditionalProperty("foo", JsonValue.from(true))
                                            .build()
                                    )
                                    .parameters(
                                        listOf(
                                            ToolDef.Parameter.builder()
                                                .description("description")
                                                .name("name")
                                                .parameterType("parameter_type")
                                                .required(true)
                                                .default(ToolDef.Parameter.Default.ofBoolean(true))
                                                .build()
                                        )
                                    )
                                    .build()
                            )
                        )
                        .inputShields(listOf("string"))
                        .outputShields(listOf("string"))
                        .samplingParams(
                            SamplingParams.builder()
                                .strategy(
                                    SamplingParams.Strategy.ofGreedySamplingStrategy(
                                        SamplingParams.Strategy.GreedySamplingStrategy.builder()
                                            .type(
                                                SamplingParams.Strategy.GreedySamplingStrategy.Type
                                                    .GREEDY
                                            )
                                            .build()
                                    )
                                )
                                .maxTokens(0L)
                                .repetitionPenalty(0.0)
                                .build()
                        )
                        .toolChoice(AgentConfig.ToolChoice.AUTO)
                        .toolPromptFormat(AgentConfig.ToolPromptFormat.JSON)
                        .toolgroups(listOf(AgentConfig.Toolgroup.ofString("string")))
                        .build()
                )
                .xLlamaStackClientVersion("X-LlamaStack-Client-Version")
                .xLlamaStackProviderData("X-LlamaStack-Provider-Data")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.agentConfig())
            .isEqualTo(
                AgentConfig.builder()
                    .enableSessionPersistence(true)
                    .instructions("instructions")
                    .maxInferIters(0L)
                    .model("model")
                    .clientTools(
                        listOf(
                            ToolDef.builder()
                                .name("name")
                                .description("description")
                                .metadata(
                                    ToolDef.Metadata.builder()
                                        .putAdditionalProperty("foo", JsonValue.from(true))
                                        .build()
                                )
                                .parameters(
                                    listOf(
                                        ToolDef.Parameter.builder()
                                            .description("description")
                                            .name("name")
                                            .parameterType("parameter_type")
                                            .required(true)
                                            .default(ToolDef.Parameter.Default.ofBoolean(true))
                                            .build()
                                    )
                                )
                                .build()
                        )
                    )
                    .inputShields(listOf("string"))
                    .outputShields(listOf("string"))
                    .samplingParams(
                        SamplingParams.builder()
                            .strategy(
                                SamplingParams.Strategy.ofGreedySamplingStrategy(
                                    SamplingParams.Strategy.GreedySamplingStrategy.builder()
                                        .type(
                                            SamplingParams.Strategy.GreedySamplingStrategy.Type
                                                .GREEDY
                                        )
                                        .build()
                                )
                            )
                            .maxTokens(0L)
                            .repetitionPenalty(0.0)
                            .build()
                    )
                    .toolChoice(AgentConfig.ToolChoice.AUTO)
                    .toolPromptFormat(AgentConfig.ToolPromptFormat.JSON)
                    .toolgroups(listOf(AgentConfig.Toolgroup.ofString("string")))
                    .build()
            )
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            AgentCreateParams.builder()
                .agentConfig(
                    AgentConfig.builder()
                        .enableSessionPersistence(true)
                        .instructions("instructions")
                        .maxInferIters(0L)
                        .model("model")
                        .build()
                )
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.agentConfig())
            .isEqualTo(
                AgentConfig.builder()
                    .enableSessionPersistence(true)
                    .instructions("instructions")
                    .maxInferIters(0L)
                    .model("model")
                    .build()
            )
    }
}
