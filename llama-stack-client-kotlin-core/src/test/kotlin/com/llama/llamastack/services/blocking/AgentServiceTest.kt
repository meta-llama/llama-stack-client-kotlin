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
                                                    .default(
                                                        ToolDef.Parameter.Default.ofBoolean(true)
                                                    )
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
                                    .strategy(SamplingParams.Strategy.GREEDY)
                                    .maxTokens(0L)
                                    .repetitionPenalty(0.0)
                                    .temperature(0.0)
                                    .topK(0L)
                                    .topP(0.0)
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
