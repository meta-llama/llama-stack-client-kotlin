// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.blocking

import com.llama.llamastack.TestServerExtension
import com.llama.llamastack.client.okhttp.LlamaStackClientOkHttpClient
import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.models.AgentConfig
import com.llama.llamastack.models.AgentCreateParams
import com.llama.llamastack.models.AgentDeleteParams
import com.llama.llamastack.models.SamplingParams
import com.llama.llamastack.models.ToolDef
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class AgentServiceTest {

    @Test
    fun callCreate() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val agentService = client.agents()
        val agentCreateResponse =
            agentService.create(
                AgentCreateParams.builder()
                    .agentConfig(
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
                                            .default(true)
                                            .build()
                                    )
                                    .build()
                            )
                            .addInputShield("string")
                            .addOutputShield("string")
                            .samplingParams(
                                SamplingParams.builder()
                                    .strategy(
                                        SamplingParams.Strategy.GreedySamplingStrategy.builder()
                                            .type(
                                                SamplingParams.Strategy.GreedySamplingStrategy.Type
                                                    .GREEDY
                                            )
                                            .build()
                                    )
                                    .maxTokens(0L)
                                    .repetitionPenalty(0.0)
                                    .build()
                            )
                            .toolChoice(AgentConfig.ToolChoice.AUTO)
                            .toolPromptFormat(AgentConfig.ToolPromptFormat.JSON)
                            .addToolgroup("string")
                            .build()
                    )
                    .xLlamaStackClientVersion("X-LlamaStack-Client-Version")
                    .xLlamaStackProviderData("X-LlamaStack-Provider-Data")
                    .build()
            )
        println(agentCreateResponse)
        agentCreateResponse.validate()
    }

    @Test
    fun callDelete() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val agentService = client.agents()
        agentService.delete(
            AgentDeleteParams.builder()
                .agentId("agent_id")
                .xLlamaStackClientVersion("X-LlamaStack-Client-Version")
                .xLlamaStackProviderData("X-LlamaStack-Provider-Data")
                .build()
        )
    }
}
