// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services

import com.fasterxml.jackson.databind.json.JsonMapper
import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.ok
import com.github.tomakehurst.wiremock.client.WireMock.post
import com.github.tomakehurst.wiremock.client.WireMock.status
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import com.llama.llamastack.client.LlamaStackClientClient
import com.llama.llamastack.client.okhttp.LlamaStackClientOkHttpClient
import com.llama.llamastack.core.JsonValue
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
import com.llama.llamastack.models.ChatCompletionResponse
import com.llama.llamastack.models.CompletionMessage
import com.llama.llamastack.models.InferenceChatCompletionParams
import com.llama.llamastack.models.ResponseFormat
import com.llama.llamastack.models.SamplingParams
import com.llama.llamastack.models.TokenLogProbs
import com.llama.llamastack.models.ToolCall
import com.llama.llamastack.models.UserMessage
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.assertThatThrownBy
import org.assertj.core.api.InstanceOfAssertFactories
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

@WireMockTest
class ErrorHandlingTest {

    private val JSON_MAPPER: JsonMapper = jsonMapper()

    private val LLAMA_STACK_CLIENT_ERROR: LlamaStackClientError =
        LlamaStackClientError.builder()
            .putAdditionalProperty("key", JsonValue.from("value"))
            .build()

    private lateinit var client: LlamaStackClientClient

    @BeforeEach
    fun beforeEach(wmRuntimeInfo: WireMockRuntimeInfo) {
        client =
            LlamaStackClientOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.getHttpBaseUrl())
                .apiKey("My API Key")
                .build()
    }

    @Test
    fun inferencesChatCompletion200() {
        val params =
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
                .build()

        val expected =
            ChatCompletionResponse.builder()
                .completionMessage(
                    CompletionMessage.builder()
                        .content("string")
                        .stopReason(CompletionMessage.StopReason.END_OF_TURN)
                        .addToolCall(
                            ToolCall.builder()
                                .arguments(
                                    ToolCall.Arguments.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("string"))
                                        .build()
                                )
                                .callId("call_id")
                                .toolName(ToolCall.ToolName.BRAVE_SEARCH)
                                .build()
                        )
                        .build()
                )
                .addLogprob(
                    TokenLogProbs.builder()
                        .logprobsByToken(
                            TokenLogProbs.LogprobsByToken.builder()
                                .putAdditionalProperty("foo", JsonValue.from(0))
                                .build()
                        )
                        .build()
                )
                .addMetric(
                    ChatCompletionResponse.Metric.builder()
                        .metric("metric")
                        .spanId("span_id")
                        .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .traceId("trace_id")
                        .unit("unit")
                        .value(0.0)
                        .attributes(
                            ChatCompletionResponse.Metric.Attributes.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .build()
                )
                .build()

        stubFor(post(anyUrl()).willReturn(ok().withBody(toJson(expected))))

        assertThat(client.inference().chatCompletion(params)).isEqualTo(expected)
    }

    @Test
    fun inferencesChatCompletion400() {
        val params =
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
                    LLAMA_STACK_CLIENT_ERROR,
                )
            })
    }

    @Test
    fun inferencesChatCompletion401() {
        val params =
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
                    LLAMA_STACK_CLIENT_ERROR,
                )
            })
    }

    @Test
    fun inferencesChatCompletion403() {
        val params =
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
                    LLAMA_STACK_CLIENT_ERROR,
                )
            })
    }

    @Test
    fun inferencesChatCompletion404() {
        val params =
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
                    LLAMA_STACK_CLIENT_ERROR,
                )
            })
    }

    @Test
    fun inferencesChatCompletion422() {
        val params =
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
                    LLAMA_STACK_CLIENT_ERROR,
                )
            })
    }

    @Test
    fun inferencesChatCompletion429() {
        val params =
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
                    LLAMA_STACK_CLIENT_ERROR,
                )
            })
    }

    @Test
    fun inferencesChatCompletion500() {
        val params =
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
                    LLAMA_STACK_CLIENT_ERROR,
                )
            })
    }

    @Test
    fun unexpectedStatusCode() {
        val params =
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
                    toJson(LLAMA_STACK_CLIENT_ERROR),
                )
            })
    }

    @Test
    fun invalidBody() {
        val params =
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
                .build()

        stubFor(post(anyUrl()).willReturn(status(400).withBody("Not JSON")))

        assertThatThrownBy({ client.inference().chatCompletion(params) })
            .satisfies({ e ->
                assertBadRequest(
                    e,
                    Headers.builder().build(),
                    LlamaStackClientError.builder().build(),
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
        responseBody: ByteArray,
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
        error: LlamaStackClientError,
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
        error: LlamaStackClientError,
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
        error: LlamaStackClientError,
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
        error: LlamaStackClientError,
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
        error: LlamaStackClientError,
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
        error: LlamaStackClientError,
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
        error: LlamaStackClientError,
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
