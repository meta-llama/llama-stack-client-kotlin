// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.blocking

import com.llama.llamastack.TestServerExtension
import com.llama.llamastack.client.okhttp.LlamaStackClientOkHttpClient
import com.llama.llamastack.models.*
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
                                    InferenceChatCompletionParams.ResponseFormat.JsonSchemaFormat
                                        .Type
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
                                    InferenceChatCompletionParams.ResponseFormat.JsonSchemaFormat
                                        .Type
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
                    .content(InferenceCompletionParams.Content.ofString("string"))
                    .modelId("model_id")
                    .logprobs(InferenceCompletionParams.Logprobs.builder().topK(0L).build())
                    .responseFormat(
                        InferenceCompletionParams.ResponseFormat.ofJsonSchemaFormat(
                            InferenceCompletionParams.ResponseFormat.JsonSchemaFormat.builder()
                                .jsonSchema(
                                    InferenceCompletionParams.ResponseFormat.JsonSchemaFormat
                                        .JsonSchema
                                        .builder()
                                        .build()
                                )
                                .type(
                                    InferenceCompletionParams.ResponseFormat.JsonSchemaFormat.Type
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
                    .content(InferenceCompletionParams.Content.ofString("string"))
                    .modelId("model_id")
                    .logprobs(InferenceCompletionParams.Logprobs.builder().topK(0L).build())
                    .responseFormat(
                        InferenceCompletionParams.ResponseFormat.ofJsonSchemaFormat(
                            InferenceCompletionParams.ResponseFormat.JsonSchemaFormat.builder()
                                .jsonSchema(
                                    InferenceCompletionParams.ResponseFormat.JsonSchemaFormat
                                        .JsonSchema
                                        .builder()
                                        .build()
                                )
                                .type(
                                    InferenceCompletionParams.ResponseFormat.JsonSchemaFormat.Type
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
                    .contents(listOf(InferenceEmbeddingsParams.Content.ofString("string")))
                    .modelId("model_id")
                    .xLlamaStackProviderData("X-LlamaStack-ProviderData")
                    .build()
            )
        println(embeddingsResponse)
        embeddingsResponse.validate()
    }
}
