// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services

import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.equalTo
import com.github.tomakehurst.wiremock.client.WireMock.matchingJsonPath
import com.github.tomakehurst.wiremock.client.WireMock.ok
import com.github.tomakehurst.wiremock.client.WireMock.post
import com.github.tomakehurst.wiremock.client.WireMock.postRequestedFor
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.client.WireMock.verify
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import com.llama.llamastack.client.LlamaStackClientClient
import com.llama.llamastack.client.okhttp.LlamaStackClientOkHttpClient
import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.models.InferenceChatCompletionParams
import com.llama.llamastack.models.ModelRegisterParams
import com.llama.llamastack.models.ResponseFormat
import com.llama.llamastack.models.SamplingParams
import com.llama.llamastack.models.UserMessage
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

@WireMockTest
internal class ServiceParamsTest {

    private lateinit var client: LlamaStackClientClient

    @BeforeEach
    fun beforeEach(wmRuntimeInfo: WireMockRuntimeInfo) {
        client = LlamaStackClientOkHttpClient.builder().baseUrl(wmRuntimeInfo.httpBaseUrl).build()
    }

    @Test
    fun chatCompletion() {
        val inferenceService = client.inference()
        stubFor(post(anyUrl()).willReturn(ok("{}")))

        inferenceService.chatCompletion(
            InferenceChatCompletionParams.builder()
                .addMessage(UserMessage.builder().content("string").context("string").build())
                .modelId("model_id")
                .logprobs(InferenceChatCompletionParams.Logprobs.builder().topK(0L).build())
                .jsonSchemaResponseFormat(
                    ResponseFormat.JsonSchemaResponseFormat.JsonSchema.builder()
                        .putAdditionalProperty("foo", JsonValue.from(true))
                        .build()
                )
                .samplingParams(
                    SamplingParams.builder()
                        .strategyGreedySampling()
                        .maxTokens(0L)
                        .repetitionPenalty(0.0)
                        .addStop("string")
                        .build()
                )
                .toolChoice(InferenceChatCompletionParams.ToolChoice.AUTO)
                .toolConfig(
                    InferenceChatCompletionParams.ToolConfig.builder()
                        .systemMessageBehavior(
                            InferenceChatCompletionParams.ToolConfig.SystemMessageBehavior.APPEND
                        )
                        .toolChoice(InferenceChatCompletionParams.ToolConfig.ToolChoice.AUTO)
                        .toolPromptFormat(
                            InferenceChatCompletionParams.ToolConfig.ToolPromptFormat.JSON
                        )
                        .build()
                )
                .toolPromptFormat(InferenceChatCompletionParams.ToolPromptFormat.JSON)
                .addTool(
                    InferenceChatCompletionParams.Tool.builder()
                        .toolName(InferenceChatCompletionParams.Tool.ToolName.BRAVE_SEARCH)
                        .description("description")
                        .parameters(
                            InferenceChatCompletionParams.Tool.Parameters.builder()
                                .putAdditionalProperty(
                                    "foo",
                                    JsonValue.from(
                                        mapOf(
                                            "param_type" to "param_type",
                                            "default" to true,
                                            "description" to "description",
                                            "required" to true,
                                        )
                                    ),
                                )
                                .build()
                        )
                        .build()
                )
                .putAdditionalHeader("Secret-Header", "42")
                .putAdditionalQueryParam("secret_query_param", "42")
                .putAdditionalBodyProperty("secretProperty", JsonValue.from("42"))
                .build()
        )

        verify(
            postRequestedFor(anyUrl())
                .withHeader("Secret-Header", equalTo("42"))
                .withQueryParam("secret_query_param", equalTo("42"))
                .withRequestBody(matchingJsonPath("$.secretProperty", equalTo("42")))
        )
    }

    @Test
    fun register() {
        val modelService = client.models()
        stubFor(post(anyUrl()).willReturn(ok("{}")))

        modelService.register(
            ModelRegisterParams.builder()
                .modelId("model_id")
                .metadata(
                    ModelRegisterParams.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from(true))
                        .build()
                )
                .modelType(ModelRegisterParams.ModelType.LLM)
                .providerId("provider_id")
                .providerModelId("provider_model_id")
                .putAdditionalHeader("Secret-Header", "42")
                .putAdditionalQueryParam("secret_query_param", "42")
                .putAdditionalBodyProperty("secretProperty", JsonValue.from("42"))
                .build()
        )

        verify(
            postRequestedFor(anyUrl())
                .withHeader("Secret-Header", equalTo("42"))
                .withQueryParam("secret_query_param", equalTo("42"))
                .withRequestBody(matchingJsonPath("$.secretProperty", equalTo("42")))
        )
    }
}
