// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.async

import com.llama.llamastack.TestServerExtension
import com.llama.llamastack.client.okhttp.LlamaStackClientOkHttpClientAsync
import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.models.AgentConfig
import com.llama.llamastack.models.AgentCreateParams
import com.llama.llamastack.models.AgentDeleteParams
import com.llama.llamastack.models.ResponseFormat
import com.llama.llamastack.models.SamplingParams
import com.llama.llamastack.models.ToolDef
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class AgentServiceAsyncTest {

    @Test
    suspend fun create() {
        val client =
            LlamaStackClientOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .build()
        val agentServiceAsync = client.agents()

        val agent =
            agentServiceAsync.create(
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
            )

        agent.validate()
    }

    @Test
    suspend fun delete() {
        val client =
            LlamaStackClientOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .build()
        val agentServiceAsync = client.agents()

        agentServiceAsync.delete(AgentDeleteParams.builder().agentId("agent_id").build())
    }
}
