// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services

import com.fasterxml.jackson.databind.json.JsonMapper
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
import com.llama.llamastack.core.jsonMapper
import com.llama.llamastack.models.InferenceChatCompletionParams
import com.llama.llamastack.models.InferenceChatCompletionResponse
import com.llama.llamastack.models.InterleavedContent
import com.llama.llamastack.models.Model
import com.llama.llamastack.models.ModelRegisterParams
import com.llama.llamastack.models.SamplingParams
import com.llama.llamastack.models.TokenLogProbs
import com.llama.llamastack.models.ToolCall
import com.llama.llamastack.models.UserMessage
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

@WireMockTest
class ServiceParamsTest {

    private val JSON_MAPPER: JsonMapper = jsonMapper()

    private lateinit var client: LlamaStackClientClient

    @BeforeEach
    fun beforeEach(wmRuntimeInfo: WireMockRuntimeInfo) {
        client =
            LlamaStackClientOkHttpClient.builder().baseUrl(wmRuntimeInfo.getHttpBaseUrl()).build()
    }

    @Test
    fun inferencesChatCompletionWithAdditionalParams() {
        val additionalHeaders = mutableMapOf<String, List<String>>()

        additionalHeaders.put("x-test-header", listOf("abc1234"))

        val additionalQueryParams = mutableMapOf<String, List<String>>()

        additionalQueryParams.put("test_query_param", listOf("def567"))

        val additionalBodyProperties = mutableMapOf<String, JsonValue>()

        additionalBodyProperties.put("testBodyProperty", JsonValue.from("ghi890"))

        val params =
            InferenceChatCompletionParams.builder()
                .messages(
                    listOf(
                        InferenceChatCompletionParams.Message.ofUserMessage(
                            UserMessage.builder()
                                .content(InterleavedContent.ofString("string"))
                                .role(UserMessage.Role.USER)
                                .context(InterleavedContent.ofString("string"))
                                .build()
                        )
                    )
                )
                .modelId("model_id")
                .logprobs(InferenceChatCompletionParams.Logprobs.builder().topK(0L).build())
                .responseFormat(
                    InferenceChatCompletionParams.ResponseFormat.ofUnionMember0(
                        InferenceChatCompletionParams.ResponseFormat.UnionMember0.builder()
                            .jsonSchema(
                                InferenceChatCompletionParams.ResponseFormat.UnionMember0.JsonSchema
                                    .builder()
                                    .putAdditionalProperty("foo", JsonValue.from(true))
                                    .build()
                            )
                            .type(
                                InferenceChatCompletionParams.ResponseFormat.UnionMember0.Type
                                    .JSON_SCHEMA
                            )
                            .build()
                    )
                )
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
                .toolChoice(InferenceChatCompletionParams.ToolChoice.AUTO)
                .toolPromptFormat(InferenceChatCompletionParams.ToolPromptFormat.JSON)
                .tools(
                    listOf(
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
                                        )
                                    )
                                    .build()
                            )
                            .build()
                    )
                )
                .xLlamaStackClientVersion("X-LlamaStack-Client-Version")
                .xLlamaStackProviderData("X-LlamaStack-Provider-Data")
                .additionalHeaders(additionalHeaders)
                .additionalBodyProperties(additionalBodyProperties)
                .additionalQueryParams(additionalQueryParams)
                .build()

        val apiResponse =
            InferenceChatCompletionResponse.ofChatCompletionResponse(
                InferenceChatCompletionResponse.ChatCompletionResponse.builder()
                    .completionMessage(
                        InferenceChatCompletionResponse.ChatCompletionResponse.CompletionMessage
                            .builder()
                            .content(InterleavedContent.ofString("string"))
                            .role(
                                InferenceChatCompletionResponse.ChatCompletionResponse
                                    .CompletionMessage
                                    .Role
                                    .ASSISTANT
                            )
                            .stopReason(
                                InferenceChatCompletionResponse.ChatCompletionResponse
                                    .CompletionMessage
                                    .StopReason
                                    .END_OF_TURN
                            )
                            .toolCalls(
                                listOf(
                                    ToolCall.builder()
                                        .arguments(
                                            ToolCall.Arguments.builder()
                                                .putAdditionalProperty(
                                                    "foo",
                                                    JsonValue.from("string")
                                                )
                                                .build()
                                        )
                                        .callId("call_id")
                                        .toolName(ToolCall.ToolName.BRAVE_SEARCH)
                                        .build()
                                )
                            )
                            .build()
                    )
                    .logprobs(
                        listOf(
                            TokenLogProbs.builder()
                                .logprobsByToken(
                                    TokenLogProbs.LogprobsByToken.builder()
                                        .putAdditionalProperty("foo", JsonValue.from(0))
                                        .build()
                                )
                                .build()
                        )
                    )
                    .build()
            )

        stubFor(
            post(anyUrl())
                .withHeader("x-test-header", equalTo("abc1234"))
                .withQueryParam("test_query_param", equalTo("def567"))
                .withRequestBody(matchingJsonPath("$.testBodyProperty", equalTo("ghi890")))
                .willReturn(ok(JSON_MAPPER.writeValueAsString(apiResponse)))
        )

        client.inference().chatCompletion(params)

        verify(postRequestedFor(anyUrl()))
    }

    @Test
    fun modelsRegisterWithAdditionalParams() {
        val additionalHeaders = mutableMapOf<String, List<String>>()

        additionalHeaders.put("x-test-header", listOf("abc1234"))

        val additionalQueryParams = mutableMapOf<String, List<String>>()

        additionalQueryParams.put("test_query_param", listOf("def567"))

        val additionalBodyProperties = mutableMapOf<String, JsonValue>()

        additionalBodyProperties.put("testBodyProperty", JsonValue.from("ghi890"))

        val params =
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
                .xLlamaStackClientVersion("X-LlamaStack-Client-Version")
                .xLlamaStackProviderData("X-LlamaStack-Provider-Data")
                .additionalHeaders(additionalHeaders)
                .additionalBodyProperties(additionalBodyProperties)
                .additionalQueryParams(additionalQueryParams)
                .build()

        val apiResponse =
            Model.builder()
                .identifier("identifier")
                .metadata(
                    Model.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from(true))
                        .build()
                )
                .modelType(Model.ModelType.LLM)
                .providerId("provider_id")
                .providerResourceId("provider_resource_id")
                .type(Model.Type.MODEL)
                .build()

        stubFor(
            post(anyUrl())
                .withHeader("x-test-header", equalTo("abc1234"))
                .withQueryParam("test_query_param", equalTo("def567"))
                .withRequestBody(matchingJsonPath("$.testBodyProperty", equalTo("ghi890")))
                .willReturn(ok(JSON_MAPPER.writeValueAsString(apiResponse)))
        )

        client.models().register(params)

        verify(postRequestedFor(anyUrl()))
    }
}
