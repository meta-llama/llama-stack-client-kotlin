// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services

import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
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
import com.llama.llamastack.models.InferenceChatCompletionParams
import com.llama.llamastack.models.ResponseFormat
import com.llama.llamastack.models.SamplingParams
import com.llama.llamastack.models.UserMessage
import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.entry
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

@WireMockTest
class ErrorHandlingTest {

    companion object {

        private val ERROR: LlamaStackClientError =
            LlamaStackClientError.builder()
                .putAdditionalProperty("errorProperty", JsonValue.from("42"))
                .build()

        private val ERROR_JSON: ByteArray = jsonMapper().writeValueAsBytes(ERROR)

        private const val HEADER_NAME: String = "Error-Header"

        private const val HEADER_VALUE: String = "42"

        private const val NOT_JSON: String = "Not JSON"
    }

    private lateinit var client: LlamaStackClientClient

    @BeforeEach
    fun beforeEach(wmRuntimeInfo: WireMockRuntimeInfo) {
        client = LlamaStackClientOkHttpClient.builder().baseUrl(wmRuntimeInfo.httpBaseUrl).build()
    }

    @Test
    fun inferenceChatCompletion400() {
        val inferenceService = client.inference()
        stubFor(
            post(anyUrl())
                .willReturn(status(400).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON))
        )

        val e =
            assertThrows<BadRequestException> {
                inferenceService.chatCompletion(
                    InferenceChatCompletionParams.builder()
                        .addMessage(
                            UserMessage.builder().content("string").context("string").build()
                        )
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
                                    InferenceChatCompletionParams.ToolConfig.SystemMessageBehavior
                                        .APPEND
                                )
                                .toolChoice(
                                    InferenceChatCompletionParams.ToolConfig.ToolChoice.AUTO
                                )
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
                )
            }

        assertThat(e.statusCode()).isEqualTo(400)
        assertThat(e.error()).isEqualTo(ERROR)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
    }

    @Test
    fun inferenceChatCompletion401() {
        val inferenceService = client.inference()
        stubFor(
            post(anyUrl())
                .willReturn(status(401).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON))
        )

        val e =
            assertThrows<UnauthorizedException> {
                inferenceService.chatCompletion(
                    InferenceChatCompletionParams.builder()
                        .addMessage(
                            UserMessage.builder().content("string").context("string").build()
                        )
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
                                    InferenceChatCompletionParams.ToolConfig.SystemMessageBehavior
                                        .APPEND
                                )
                                .toolChoice(
                                    InferenceChatCompletionParams.ToolConfig.ToolChoice.AUTO
                                )
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
                )
            }

        assertThat(e.statusCode()).isEqualTo(401)
        assertThat(e.error()).isEqualTo(ERROR)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
    }

    @Test
    fun inferenceChatCompletion403() {
        val inferenceService = client.inference()
        stubFor(
            post(anyUrl())
                .willReturn(status(403).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON))
        )

        val e =
            assertThrows<PermissionDeniedException> {
                inferenceService.chatCompletion(
                    InferenceChatCompletionParams.builder()
                        .addMessage(
                            UserMessage.builder().content("string").context("string").build()
                        )
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
                                    InferenceChatCompletionParams.ToolConfig.SystemMessageBehavior
                                        .APPEND
                                )
                                .toolChoice(
                                    InferenceChatCompletionParams.ToolConfig.ToolChoice.AUTO
                                )
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
                )
            }

        assertThat(e.statusCode()).isEqualTo(403)
        assertThat(e.error()).isEqualTo(ERROR)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
    }

    @Test
    fun inferenceChatCompletion404() {
        val inferenceService = client.inference()
        stubFor(
            post(anyUrl())
                .willReturn(status(404).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON))
        )

        val e =
            assertThrows<NotFoundException> {
                inferenceService.chatCompletion(
                    InferenceChatCompletionParams.builder()
                        .addMessage(
                            UserMessage.builder().content("string").context("string").build()
                        )
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
                                    InferenceChatCompletionParams.ToolConfig.SystemMessageBehavior
                                        .APPEND
                                )
                                .toolChoice(
                                    InferenceChatCompletionParams.ToolConfig.ToolChoice.AUTO
                                )
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
                )
            }

        assertThat(e.statusCode()).isEqualTo(404)
        assertThat(e.error()).isEqualTo(ERROR)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
    }

    @Test
    fun inferenceChatCompletion422() {
        val inferenceService = client.inference()
        stubFor(
            post(anyUrl())
                .willReturn(status(422).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON))
        )

        val e =
            assertThrows<UnprocessableEntityException> {
                inferenceService.chatCompletion(
                    InferenceChatCompletionParams.builder()
                        .addMessage(
                            UserMessage.builder().content("string").context("string").build()
                        )
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
                                    InferenceChatCompletionParams.ToolConfig.SystemMessageBehavior
                                        .APPEND
                                )
                                .toolChoice(
                                    InferenceChatCompletionParams.ToolConfig.ToolChoice.AUTO
                                )
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
                )
            }

        assertThat(e.statusCode()).isEqualTo(422)
        assertThat(e.error()).isEqualTo(ERROR)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
    }

    @Test
    fun inferenceChatCompletion429() {
        val inferenceService = client.inference()
        stubFor(
            post(anyUrl())
                .willReturn(status(429).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON))
        )

        val e =
            assertThrows<RateLimitException> {
                inferenceService.chatCompletion(
                    InferenceChatCompletionParams.builder()
                        .addMessage(
                            UserMessage.builder().content("string").context("string").build()
                        )
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
                                    InferenceChatCompletionParams.ToolConfig.SystemMessageBehavior
                                        .APPEND
                                )
                                .toolChoice(
                                    InferenceChatCompletionParams.ToolConfig.ToolChoice.AUTO
                                )
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
                )
            }

        assertThat(e.statusCode()).isEqualTo(429)
        assertThat(e.error()).isEqualTo(ERROR)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
    }

    @Test
    fun inferenceChatCompletion500() {
        val inferenceService = client.inference()
        stubFor(
            post(anyUrl())
                .willReturn(status(500).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON))
        )

        val e =
            assertThrows<InternalServerException> {
                inferenceService.chatCompletion(
                    InferenceChatCompletionParams.builder()
                        .addMessage(
                            UserMessage.builder().content("string").context("string").build()
                        )
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
                                    InferenceChatCompletionParams.ToolConfig.SystemMessageBehavior
                                        .APPEND
                                )
                                .toolChoice(
                                    InferenceChatCompletionParams.ToolConfig.ToolChoice.AUTO
                                )
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
                )
            }

        assertThat(e.statusCode()).isEqualTo(500)
        assertThat(e.error()).isEqualTo(ERROR)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
    }

    @Test
    fun inferenceChatCompletion999() {
        val inferenceService = client.inference()
        stubFor(
            post(anyUrl())
                .willReturn(status(999).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON))
        )

        val e =
            assertThrows<UnexpectedStatusCodeException> {
                inferenceService.chatCompletion(
                    InferenceChatCompletionParams.builder()
                        .addMessage(
                            UserMessage.builder().content("string").context("string").build()
                        )
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
                                    InferenceChatCompletionParams.ToolConfig.SystemMessageBehavior
                                        .APPEND
                                )
                                .toolChoice(
                                    InferenceChatCompletionParams.ToolConfig.ToolChoice.AUTO
                                )
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
                )
            }

        assertThat(e.statusCode()).isEqualTo(999)
        assertThat(e.error()).isEqualTo(ERROR)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
    }

    @Test
    fun inferenceChatCompletionInvalidJsonBody() {
        val inferenceService = client.inference()
        stubFor(
            post(anyUrl())
                .willReturn(status(200).withHeader(HEADER_NAME, HEADER_VALUE).withBody(NOT_JSON))
        )

        val e =
            assertThrows<LlamaStackClientException> {
                inferenceService.chatCompletion(
                    InferenceChatCompletionParams.builder()
                        .addMessage(
                            UserMessage.builder().content("string").context("string").build()
                        )
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
                                    InferenceChatCompletionParams.ToolConfig.SystemMessageBehavior
                                        .APPEND
                                )
                                .toolChoice(
                                    InferenceChatCompletionParams.ToolConfig.ToolChoice.AUTO
                                )
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
                )
            }

        assertThat(e).hasMessage("Error reading response")
    }

    private fun Headers.toMap(): Map<String, List<String>> =
        mutableMapOf<String, List<String>>().also { map ->
            names().forEach { map[it] = values(it) }
        }
}
