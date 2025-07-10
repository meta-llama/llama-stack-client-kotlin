// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.blocking

import com.llama.llamastack.TestServerExtension
import com.llama.llamastack.client.okhttp.LlamaStackClientOkHttpClient
import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.models.AgentConfig
import com.llama.llamastack.models.AgentCreateParams
import com.llama.llamastack.models.ResponseFormat
import com.llama.llamastack.models.SamplingParams
import com.llama.llamastack.models.ToolDef
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class AgentServiceTest {

    @Test
    fun create() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val agentService = client.agents()

        val agent =
            agentService.create(
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
            )

        agent.validate()
    }

    @Test
    fun delete() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val agentService = client.agents()

        agentService.delete("agent_id")
    }
}
