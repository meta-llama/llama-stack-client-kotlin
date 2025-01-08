// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.blocking

import com.llama.llamastack.TestServerExtension
import com.llama.llamastack.client.okhttp.LlamaStackClientOkHttpClient
import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.models.InferenceChatCompletionParams
import com.llama.llamastack.models.InferenceCompletionParams
import com.llama.llamastack.models.InferenceEmbeddingsParams
import com.llama.llamastack.models.InterleavedContent
import com.llama.llamastack.models.SamplingParams
import com.llama.llamastack.models.UserMessage
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class InferenceServiceTest {

    @Disabled(
        "skipped: currently no good way to test endpoints with content type text/event-stream, Prism mock server will fail"
    )
    @Test
    fun callChatCompletion() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val inferenceService = client.inference()
        val inferenceChatCompletionResponse =
            inferenceService.chatCompletion(
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
                                    InferenceChatCompletionParams.ResponseFormat.UnionMember0
                                        .JsonSchema
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
                    .xLlamaStackProviderData("X-LlamaStack-ProviderData")
                    .build()
            )
        println(inferenceChatCompletionResponse)
    }

    @Disabled(
        "skipped: currently no good way to test endpoints with content type text/event-stream, Prism mock server will fail"
    )
    @Test
    fun callChatCompletionStreaming() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val inferenceService = client.inference()

        val inferenceChatCompletionResponseStream =
            inferenceService.chatCompletionStreaming(
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
                                    InferenceChatCompletionParams.ResponseFormat.UnionMember0
                                        .JsonSchema
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
                    .xLlamaStackProviderData("X-LlamaStack-ProviderData")
                    .build()
            )

        inferenceChatCompletionResponseStream.use {
            inferenceChatCompletionResponseStream.asSequence().forEach { println(it) }
        }
    }

    @Disabled(
        "skipped: currently no good way to test endpoints with content type text/event-stream, Prism mock server will fail"
    )
    @Test
    fun callCompletion() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val inferenceService = client.inference()
        val inferenceCompletionResponse =
            inferenceService.completion(
                InferenceCompletionParams.builder()
                    .content(InterleavedContent.ofString("string"))
                    .modelId("model_id")
                    .logprobs(InferenceCompletionParams.Logprobs.builder().topK(0L).build())
                    .responseFormat(
                        InferenceCompletionParams.ResponseFormat.ofUnionMember0(
                            InferenceCompletionParams.ResponseFormat.UnionMember0.builder()
                                .jsonSchema(
                                    InferenceCompletionParams.ResponseFormat.UnionMember0.JsonSchema
                                        .builder()
                                        .putAdditionalProperty("foo", JsonValue.from(true))
                                        .build()
                                )
                                .type(
                                    InferenceCompletionParams.ResponseFormat.UnionMember0.Type
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
                    .xLlamaStackProviderData("X-LlamaStack-ProviderData")
                    .build()
            )
        println(inferenceCompletionResponse)
    }

    @Disabled(
        "skipped: currently no good way to test endpoints with content type text/event-stream, Prism mock server will fail"
    )
    @Test
    fun callCompletionStreaming() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val inferenceService = client.inference()

        val inferenceCompletionResponseStream =
            inferenceService.completionStreaming(
                InferenceCompletionParams.builder()
                    .content(InterleavedContent.ofString("string"))
                    .modelId("model_id")
                    .logprobs(InferenceCompletionParams.Logprobs.builder().topK(0L).build())
                    .responseFormat(
                        InferenceCompletionParams.ResponseFormat.ofUnionMember0(
                            InferenceCompletionParams.ResponseFormat.UnionMember0.builder()
                                .jsonSchema(
                                    InferenceCompletionParams.ResponseFormat.UnionMember0.JsonSchema
                                        .builder()
                                        .putAdditionalProperty("foo", JsonValue.from(true))
                                        .build()
                                )
                                .type(
                                    InferenceCompletionParams.ResponseFormat.UnionMember0.Type
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
                    .xLlamaStackProviderData("X-LlamaStack-ProviderData")
                    .build()
            )

        inferenceCompletionResponseStream.use {
            inferenceCompletionResponseStream.asSequence().forEach { println(it) }
        }
    }

    @Test
    fun callEmbeddings() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val inferenceService = client.inference()
        val embeddingsResponse =
            inferenceService.embeddings(
                InferenceEmbeddingsParams.builder()
                    .contents(listOf(InterleavedContent.ofString("string")))
                    .modelId("model_id")
                    .xLlamaStackProviderData("X-LlamaStack-ProviderData")
                    .build()
            )
        println(embeddingsResponse)
        embeddingsResponse.validate()
    }
}
