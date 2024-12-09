// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services

import com.fasterxml.jackson.databind.json.JsonMapper
import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.get
import com.github.tomakehurst.wiremock.client.WireMock.ok
import com.github.tomakehurst.wiremock.client.WireMock.post
import com.github.tomakehurst.wiremock.client.WireMock.put
import com.github.tomakehurst.wiremock.client.WireMock.status
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import com.llama.llamastack.client.LlamaStackClientClient
import com.llama.llamastack.client.okhttp.LlamaStackClientOkHttpClient
import com.llama.llamastack.core.JsonString
import com.llama.llamastack.core.http.Headers
import com.llama.llamastack.core.jsonMapper
import com.llama.llamastack.errors.BadRequestException
import com.llama.llamastack.errors.InternalServerException
import com.llama.llamastack.errors.LlamaStackClientError
import com.llama.llamastack.errors.LlamaStackClientException
import com.llama.llamastack.errors.NotFoundException
import com.llama.llamastack.errors.PermissionDeniedException
import com.llama.llamastack.errors.RateLimitException
import com.llama.llamastack.errors.UnauthorizedException
import com.llama.llamastack.errors.UnexpectedStatusCodeException
import com.llama.llamastack.errors.UnprocessableEntityException
import com.llama.llamastack.models.*
import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.assertThatThrownBy
import org.assertj.core.api.InstanceOfAssertFactories
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

@WireMockTest
class ErrorHandlingTest {

    private val JSON_MAPPER: JsonMapper = jsonMapper()

    private val LLAMA_STACK_CLIENT_ERROR: LlamaStackClientError =
        LlamaStackClientError.builder().putAdditionalProperty("key", JsonString.of("value")).build()

    private lateinit var client: LlamaStackClientClient

    @BeforeEach
    fun beforeEach(wmRuntimeInfo: WireMockRuntimeInfo) {
        client =
            LlamaStackClientOkHttpClient.builder().baseUrl(wmRuntimeInfo.getHttpBaseUrl()).build()
    }

    @Test
    fun inferencesChatCompletion200() {
        val params =
            InferenceChatCompletionParams.builder()
                .messages(
                    listOf(
                        InferenceChatCompletionParams.Message.ofUserMessage(
                            UserMessage.builder()
                                .content(UserMessage.Content.ofString("string"))
                                .role(UserMessage.Role.USER)
                                .context(UserMessage.Context.ofString("string"))
                                .build()
                        )
                    )
                )
                .modelId("model_id")
                .logprobs(InferenceChatCompletionParams.Logprobs.builder().topK(0L).build())
                .responseFormat(
                    InferenceChatCompletionParams.ResponseFormat.ofJsonSchemaFormat(
                        InferenceChatCompletionParams.ResponseFormat.JsonSchemaFormat.builder()
                            .jsonSchema(
                                InferenceChatCompletionParams.ResponseFormat.JsonSchemaFormat
                                    .JsonSchema
                                    .builder()
                                    .build()
                            )
                            .type(
                                InferenceChatCompletionParams.ResponseFormat.JsonSchemaFormat.Type
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
                                InferenceChatCompletionParams.Tool.Parameters.builder().build()
                            )
                            .build()
                    )
                )
                .xLlamaStackProviderData("X-LlamaStack-ProviderData")
                .build()

        val expected =
            InferenceChatCompletionResponse.ofChatCompletionResponse(
                InferenceChatCompletionResponse.ChatCompletionResponse.builder()
                    .completionMessage(
                        CompletionMessage.builder()
                            .content(CompletionMessage.Content.ofString("string"))
                            .role(CompletionMessage.Role.ASSISTANT)
                            .stopReason(CompletionMessage.StopReason.END_OF_TURN)
                            .toolCalls(
                                listOf(
                                    ToolCall.builder()
                                        .arguments(ToolCall.Arguments.builder().build())
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
                                .logprobsByToken(TokenLogProbs.LogprobsByToken.builder().build())
                                .build()
                        )
                    )
                    .build()
            )

        stubFor(post(anyUrl()).willReturn(ok().withBody(toJson(expected))))

        assertThat(client.inference().chatCompletion(params)).isEqualTo(expected)
    }

    @Test
    fun inferencesChatCompletion400() {
        val params =
            InferenceChatCompletionParams.builder()
                .messages(
                    listOf(
                        InferenceChatCompletionParams.Message.ofUserMessage(
                            UserMessage.builder()
                                .content(UserMessage.Content.ofString("string"))
                                .role(UserMessage.Role.USER)
                                .context(UserMessage.Context.ofString("string"))
                                .build()
                        )
                    )
                )
                .modelId("model_id")
                .logprobs(InferenceChatCompletionParams.Logprobs.builder().topK(0L).build())
                .responseFormat(
                    InferenceChatCompletionParams.ResponseFormat.ofJsonSchemaFormat(
                        InferenceChatCompletionParams.ResponseFormat.JsonSchemaFormat.builder()
                            .jsonSchema(
                                InferenceChatCompletionParams.ResponseFormat.JsonSchemaFormat
                                    .JsonSchema
                                    .builder()
                                    .build()
                            )
                            .type(
                                InferenceChatCompletionParams.ResponseFormat.JsonSchemaFormat.Type
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
                                InferenceChatCompletionParams.Tool.Parameters.builder().build()
                            )
                            .build()
                    )
                )
                .xLlamaStackProviderData("X-LlamaStack-ProviderData")
                .build()

        stubFor(
            post(anyUrl())
                .willReturn(
                    status(400).withHeader("Foo", "Bar").withBody(toJson(LLAMA_STACK_CLIENT_ERROR))
                )
        )

        assertThatThrownBy({ client.inference().chatCompletion(params) })
            .satisfies({ e ->
                assertBadRequest(
                    e,
                    Headers.builder().put("Foo", "Bar").build(),
                    LLAMA_STACK_CLIENT_ERROR
                )
            })
    }

    @Test
    fun inferencesChatCompletion401() {
        val params =
            InferenceChatCompletionParams.builder()
                .messages(
                    listOf(
                        InferenceChatCompletionParams.Message.ofUserMessage(
                            UserMessage.builder()
                                .content(UserMessage.Content.ofString("string"))
                                .role(UserMessage.Role.USER)
                                .context(UserMessage.Context.ofString("string"))
                                .build()
                        )
                    )
                )
                .modelId("model_id")
                .logprobs(InferenceChatCompletionParams.Logprobs.builder().topK(0L).build())
                .responseFormat(
                    InferenceChatCompletionParams.ResponseFormat.ofJsonSchemaFormat(
                        InferenceChatCompletionParams.ResponseFormat.JsonSchemaFormat.builder()
                            .jsonSchema(
                                InferenceChatCompletionParams.ResponseFormat.JsonSchemaFormat
                                    .JsonSchema
                                    .builder()
                                    .build()
                            )
                            .type(
                                InferenceChatCompletionParams.ResponseFormat.JsonSchemaFormat.Type
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
                                InferenceChatCompletionParams.Tool.Parameters.builder().build()
                            )
                            .build()
                    )
                )
                .xLlamaStackProviderData("X-LlamaStack-ProviderData")
                .build()

        stubFor(
            post(anyUrl())
                .willReturn(
                    status(401).withHeader("Foo", "Bar").withBody(toJson(LLAMA_STACK_CLIENT_ERROR))
                )
        )

        assertThatThrownBy({ client.inference().chatCompletion(params) })
            .satisfies({ e ->
                assertUnauthorized(
                    e,
                    Headers.builder().put("Foo", "Bar").build(),
                    LLAMA_STACK_CLIENT_ERROR
                )
            })
    }

    @Test
    fun inferencesChatCompletion403() {
        val params =
            InferenceChatCompletionParams.builder()
                .messages(
                    listOf(
                        InferenceChatCompletionParams.Message.ofUserMessage(
                            UserMessage.builder()
                                .content(UserMessage.Content.ofString("string"))
                                .role(UserMessage.Role.USER)
                                .context(UserMessage.Context.ofString("string"))
                                .build()
                        )
                    )
                )
                .modelId("model_id")
                .logprobs(InferenceChatCompletionParams.Logprobs.builder().topK(0L).build())
                .responseFormat(
                    InferenceChatCompletionParams.ResponseFormat.ofJsonSchemaFormat(
                        InferenceChatCompletionParams.ResponseFormat.JsonSchemaFormat.builder()
                            .jsonSchema(
                                InferenceChatCompletionParams.ResponseFormat.JsonSchemaFormat
                                    .JsonSchema
                                    .builder()
                                    .build()
                            )
                            .type(
                                InferenceChatCompletionParams.ResponseFormat.JsonSchemaFormat.Type
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
                                InferenceChatCompletionParams.Tool.Parameters.builder().build()
                            )
                            .build()
                    )
                )
                .xLlamaStackProviderData("X-LlamaStack-ProviderData")
                .build()

        stubFor(
            post(anyUrl())
                .willReturn(
                    status(403).withHeader("Foo", "Bar").withBody(toJson(LLAMA_STACK_CLIENT_ERROR))
                )
        )

        assertThatThrownBy({ client.inference().chatCompletion(params) })
            .satisfies({ e ->
                assertPermissionDenied(
                    e,
                    Headers.builder().put("Foo", "Bar").build(),
                    LLAMA_STACK_CLIENT_ERROR
                )
            })
    }

    @Test
    fun inferencesChatCompletion404() {
        val params =
            InferenceChatCompletionParams.builder()
                .messages(
                    listOf(
                        InferenceChatCompletionParams.Message.ofUserMessage(
                            UserMessage.builder()
                                .content(UserMessage.Content.ofString("string"))
                                .role(UserMessage.Role.USER)
                                .context(UserMessage.Context.ofString("string"))
                                .build()
                        )
                    )
                )
                .modelId("model_id")
                .logprobs(InferenceChatCompletionParams.Logprobs.builder().topK(0L).build())
                .responseFormat(
                    InferenceChatCompletionParams.ResponseFormat.ofJsonSchemaFormat(
                        InferenceChatCompletionParams.ResponseFormat.JsonSchemaFormat.builder()
                            .jsonSchema(
                                InferenceChatCompletionParams.ResponseFormat.JsonSchemaFormat
                                    .JsonSchema
                                    .builder()
                                    .build()
                            )
                            .type(
                                InferenceChatCompletionParams.ResponseFormat.JsonSchemaFormat.Type
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
                                InferenceChatCompletionParams.Tool.Parameters.builder().build()
                            )
                            .build()
                    )
                )
                .xLlamaStackProviderData("X-LlamaStack-ProviderData")
                .build()

        stubFor(
            post(anyUrl())
                .willReturn(
                    status(404).withHeader("Foo", "Bar").withBody(toJson(LLAMA_STACK_CLIENT_ERROR))
                )
        )

        assertThatThrownBy({ client.inference().chatCompletion(params) })
            .satisfies({ e ->
                assertNotFound(
                    e,
                    Headers.builder().put("Foo", "Bar").build(),
                    LLAMA_STACK_CLIENT_ERROR
                )
            })
    }

    @Test
    fun inferencesChatCompletion422() {
        val params =
            InferenceChatCompletionParams.builder()
                .messages(
                    listOf(
                        InferenceChatCompletionParams.Message.ofUserMessage(
                            UserMessage.builder()
                                .content(UserMessage.Content.ofString("string"))
                                .role(UserMessage.Role.USER)
                                .context(UserMessage.Context.ofString("string"))
                                .build()
                        )
                    )
                )
                .modelId("model_id")
                .logprobs(InferenceChatCompletionParams.Logprobs.builder().topK(0L).build())
                .responseFormat(
                    InferenceChatCompletionParams.ResponseFormat.ofJsonSchemaFormat(
                        InferenceChatCompletionParams.ResponseFormat.JsonSchemaFormat.builder()
                            .jsonSchema(
                                InferenceChatCompletionParams.ResponseFormat.JsonSchemaFormat
                                    .JsonSchema
                                    .builder()
                                    .build()
                            )
                            .type(
                                InferenceChatCompletionParams.ResponseFormat.JsonSchemaFormat.Type
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
                                InferenceChatCompletionParams.Tool.Parameters.builder().build()
                            )
                            .build()
                    )
                )
                .xLlamaStackProviderData("X-LlamaStack-ProviderData")
                .build()

        stubFor(
            post(anyUrl())
                .willReturn(
                    status(422).withHeader("Foo", "Bar").withBody(toJson(LLAMA_STACK_CLIENT_ERROR))
                )
        )

        assertThatThrownBy({ client.inference().chatCompletion(params) })
            .satisfies({ e ->
                assertUnprocessableEntity(
                    e,
                    Headers.builder().put("Foo", "Bar").build(),
                    LLAMA_STACK_CLIENT_ERROR
                )
            })
    }

    @Test
    fun inferencesChatCompletion429() {
        val params =
            InferenceChatCompletionParams.builder()
                .messages(
                    listOf(
                        InferenceChatCompletionParams.Message.ofUserMessage(
                            UserMessage.builder()
                                .content(UserMessage.Content.ofString("string"))
                                .role(UserMessage.Role.USER)
                                .context(UserMessage.Context.ofString("string"))
                                .build()
                        )
                    )
                )
                .modelId("model_id")
                .logprobs(InferenceChatCompletionParams.Logprobs.builder().topK(0L).build())
                .responseFormat(
                    InferenceChatCompletionParams.ResponseFormat.ofJsonSchemaFormat(
                        InferenceChatCompletionParams.ResponseFormat.JsonSchemaFormat.builder()
                            .jsonSchema(
                                InferenceChatCompletionParams.ResponseFormat.JsonSchemaFormat
                                    .JsonSchema
                                    .builder()
                                    .build()
                            )
                            .type(
                                InferenceChatCompletionParams.ResponseFormat.JsonSchemaFormat.Type
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
                                InferenceChatCompletionParams.Tool.Parameters.builder().build()
                            )
                            .build()
                    )
                )
                .xLlamaStackProviderData("X-LlamaStack-ProviderData")
                .build()

        stubFor(
            post(anyUrl())
                .willReturn(
                    status(429).withHeader("Foo", "Bar").withBody(toJson(LLAMA_STACK_CLIENT_ERROR))
                )
        )

        assertThatThrownBy({ client.inference().chatCompletion(params) })
            .satisfies({ e ->
                assertRateLimit(
                    e,
                    Headers.builder().put("Foo", "Bar").build(),
                    LLAMA_STACK_CLIENT_ERROR
                )
            })
    }

    @Test
    fun inferencesChatCompletion500() {
        val params =
            InferenceChatCompletionParams.builder()
                .messages(
                    listOf(
                        InferenceChatCompletionParams.Message.ofUserMessage(
                            UserMessage.builder()
                                .content(UserMessage.Content.ofString("string"))
                                .role(UserMessage.Role.USER)
                                .context(UserMessage.Context.ofString("string"))
                                .build()
                        )
                    )
                )
                .modelId("model_id")
                .logprobs(InferenceChatCompletionParams.Logprobs.builder().topK(0L).build())
                .responseFormat(
                    InferenceChatCompletionParams.ResponseFormat.ofJsonSchemaFormat(
                        InferenceChatCompletionParams.ResponseFormat.JsonSchemaFormat.builder()
                            .jsonSchema(
                                InferenceChatCompletionParams.ResponseFormat.JsonSchemaFormat
                                    .JsonSchema
                                    .builder()
                                    .build()
                            )
                            .type(
                                InferenceChatCompletionParams.ResponseFormat.JsonSchemaFormat.Type
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
                                InferenceChatCompletionParams.Tool.Parameters.builder().build()
                            )
                            .build()
                    )
                )
                .xLlamaStackProviderData("X-LlamaStack-ProviderData")
                .build()

        stubFor(
            post(anyUrl())
                .willReturn(
                    status(500).withHeader("Foo", "Bar").withBody(toJson(LLAMA_STACK_CLIENT_ERROR))
                )
        )

        assertThatThrownBy({ client.inference().chatCompletion(params) })
            .satisfies({ e ->
                assertInternalServer(
                    e,
                    Headers.builder().put("Foo", "Bar").build(),
                    LLAMA_STACK_CLIENT_ERROR
                )
            })
    }

    @Test
    fun unexpectedStatusCode() {
        val params =
            InferenceChatCompletionParams.builder()
                .messages(
                    listOf(
                        InferenceChatCompletionParams.Message.ofUserMessage(
                            UserMessage.builder()
                                .content(UserMessage.Content.ofString("string"))
                                .role(UserMessage.Role.USER)
                                .context(UserMessage.Context.ofString("string"))
                                .build()
                        )
                    )
                )
                .modelId("model_id")
                .logprobs(InferenceChatCompletionParams.Logprobs.builder().topK(0L).build())
                .responseFormat(
                    InferenceChatCompletionParams.ResponseFormat.ofJsonSchemaFormat(
                        InferenceChatCompletionParams.ResponseFormat.JsonSchemaFormat.builder()
                            .jsonSchema(
                                InferenceChatCompletionParams.ResponseFormat.JsonSchemaFormat
                                    .JsonSchema
                                    .builder()
                                    .build()
                            )
                            .type(
                                InferenceChatCompletionParams.ResponseFormat.JsonSchemaFormat.Type
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
                                InferenceChatCompletionParams.Tool.Parameters.builder().build()
                            )
                            .build()
                    )
                )
                .xLlamaStackProviderData("X-LlamaStack-ProviderData")
                .build()

        stubFor(
            post(anyUrl())
                .willReturn(
                    status(999).withHeader("Foo", "Bar").withBody(toJson(LLAMA_STACK_CLIENT_ERROR))
                )
        )

        assertThatThrownBy({ client.inference().chatCompletion(params) })
            .satisfies({ e ->
                assertUnexpectedStatusCodeException(
                    e,
                    999,
                    Headers.builder().put("Foo", "Bar").build(),
                    toJson(LLAMA_STACK_CLIENT_ERROR)
                )
            })
    }

    @Test
    fun invalidBody() {
        val params =
            InferenceChatCompletionParams.builder()
                .messages(
                    listOf(
                        InferenceChatCompletionParams.Message.ofUserMessage(
                            UserMessage.builder()
                                .content(UserMessage.Content.ofString("string"))
                                .role(UserMessage.Role.USER)
                                .context(UserMessage.Context.ofString("string"))
                                .build()
                        )
                    )
                )
                .modelId("model_id")
                .logprobs(InferenceChatCompletionParams.Logprobs.builder().topK(0L).build())
                .responseFormat(
                    InferenceChatCompletionParams.ResponseFormat.ofJsonSchemaFormat(
                        InferenceChatCompletionParams.ResponseFormat.JsonSchemaFormat.builder()
                            .jsonSchema(
                                InferenceChatCompletionParams.ResponseFormat.JsonSchemaFormat
                                    .JsonSchema
                                    .builder()
                                    .build()
                            )
                            .type(
                                InferenceChatCompletionParams.ResponseFormat.JsonSchemaFormat.Type
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
                                InferenceChatCompletionParams.Tool.Parameters.builder().build()
                            )
                            .build()
                    )
                )
                .xLlamaStackProviderData("X-LlamaStack-ProviderData")
                .build()

        stubFor(post(anyUrl()).willReturn(status(200).withBody("Not JSON")))

        assertThatThrownBy({ client.inference().chatCompletion(params) })
            .satisfies({ e ->
                assertThat(e)
                    .isInstanceOf(LlamaStackClientException::class.java)
                    .hasMessage("Error reading response")
            })
    }

    @Test
    fun invalidErrorBody() {
        val params =
            InferenceChatCompletionParams.builder()
                .messages(
                    listOf(
                        InferenceChatCompletionParams.Message.ofUserMessage(
                            UserMessage.builder()
                                .content(UserMessage.Content.ofString("string"))
                                .role(UserMessage.Role.USER)
                                .context(UserMessage.Context.ofString("string"))
                                .build()
                        )
                    )
                )
                .modelId("model_id")
                .logprobs(InferenceChatCompletionParams.Logprobs.builder().topK(0L).build())
                .responseFormat(
                    InferenceChatCompletionParams.ResponseFormat.ofJsonSchemaFormat(
                        InferenceChatCompletionParams.ResponseFormat.JsonSchemaFormat.builder()
                            .jsonSchema(
                                InferenceChatCompletionParams.ResponseFormat.JsonSchemaFormat
                                    .JsonSchema
                                    .builder()
                                    .build()
                            )
                            .type(
                                InferenceChatCompletionParams.ResponseFormat.JsonSchemaFormat.Type
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
                                InferenceChatCompletionParams.Tool.Parameters.builder().build()
                            )
                            .build()
                    )
                )
                .xLlamaStackProviderData("X-LlamaStack-ProviderData")
                .build()

        stubFor(post(anyUrl()).willReturn(status(400).withBody("Not JSON")))

        assertThatThrownBy({ client.inference().chatCompletion(params) })
            .satisfies({ e ->
                assertBadRequest(
                    e,
                    Headers.builder().build(),
                    LlamaStackClientError.builder().build()
                )
            })
    }

    private fun <T> toJson(body: T): ByteArray {
        return JSON_MAPPER.writeValueAsBytes(body)
    }

    private fun assertUnexpectedStatusCodeException(
        throwable: Throwable,
        statusCode: Int,
        headers: Headers,
        responseBody: ByteArray
    ) {
        assertThat(throwable)
            .asInstanceOf(
                InstanceOfAssertFactories.throwable(UnexpectedStatusCodeException::class.java)
            )
            .satisfies({ e ->
                assertThat(e.statusCode()).isEqualTo(statusCode)
                assertThat(e.body()).isEqualTo(String(responseBody))
                assertThat(e.headers().toMap()).containsAllEntriesOf(headers.toMap())
            })
    }

    private fun assertBadRequest(
        throwable: Throwable,
        headers: Headers,
        error: LlamaStackClientError
    ) {
        assertThat(throwable)
            .asInstanceOf(InstanceOfAssertFactories.throwable(BadRequestException::class.java))
            .satisfies({ e ->
                assertThat(e.statusCode()).isEqualTo(400)
                assertThat(e.error()).isEqualTo(error)
                assertThat(e.headers().toMap()).containsAllEntriesOf(headers.toMap())
            })
    }

    private fun assertUnauthorized(
        throwable: Throwable,
        headers: Headers,
        error: LlamaStackClientError
    ) {
        assertThat(throwable)
            .asInstanceOf(InstanceOfAssertFactories.throwable(UnauthorizedException::class.java))
            .satisfies({ e ->
                assertThat(e.statusCode()).isEqualTo(401)
                assertThat(e.error()).isEqualTo(error)
                assertThat(e.headers().toMap()).containsAllEntriesOf(headers.toMap())
            })
    }

    private fun assertPermissionDenied(
        throwable: Throwable,
        headers: Headers,
        error: LlamaStackClientError
    ) {
        assertThat(throwable)
            .asInstanceOf(
                InstanceOfAssertFactories.throwable(PermissionDeniedException::class.java)
            )
            .satisfies({ e ->
                assertThat(e.statusCode()).isEqualTo(403)
                assertThat(e.error()).isEqualTo(error)
                assertThat(e.headers().toMap()).containsAllEntriesOf(headers.toMap())
            })
    }

    private fun assertNotFound(
        throwable: Throwable,
        headers: Headers,
        error: LlamaStackClientError
    ) {
        assertThat(throwable)
            .asInstanceOf(InstanceOfAssertFactories.throwable(NotFoundException::class.java))
            .satisfies({ e ->
                assertThat(e.statusCode()).isEqualTo(404)
                assertThat(e.error()).isEqualTo(error)
                assertThat(e.headers().toMap()).containsAllEntriesOf(headers.toMap())
            })
    }

    private fun assertUnprocessableEntity(
        throwable: Throwable,
        headers: Headers,
        error: LlamaStackClientError
    ) {
        assertThat(throwable)
            .asInstanceOf(
                InstanceOfAssertFactories.throwable(UnprocessableEntityException::class.java)
            )
            .satisfies({ e ->
                assertThat(e.statusCode()).isEqualTo(422)
                assertThat(e.error()).isEqualTo(error)
                assertThat(e.headers().toMap()).containsAllEntriesOf(headers.toMap())
            })
    }

    private fun assertRateLimit(
        throwable: Throwable,
        headers: Headers,
        error: LlamaStackClientError
    ) {
        assertThat(throwable)
            .asInstanceOf(InstanceOfAssertFactories.throwable(RateLimitException::class.java))
            .satisfies({ e ->
                assertThat(e.statusCode()).isEqualTo(429)
                assertThat(e.error()).isEqualTo(error)
                assertThat(e.headers().toMap()).containsAllEntriesOf(headers.toMap())
            })
    }

    private fun assertInternalServer(
        throwable: Throwable,
        headers: Headers,
        error: LlamaStackClientError
    ) {
        assertThat(throwable)
            .asInstanceOf(InstanceOfAssertFactories.throwable(InternalServerException::class.java))
            .satisfies({ e ->
                assertThat(e.statusCode()).isEqualTo(500)
                assertThat(e.error()).isEqualTo(error)
                assertThat(e.headers().toMap()).containsAllEntriesOf(headers.toMap())
            })
    }

    private fun Headers.toMap(): Map<String, List<String>> =
        mutableMapOf<String, List<String>>().also { map ->
            names().forEach { map[it] = values(it) }
        }
}
