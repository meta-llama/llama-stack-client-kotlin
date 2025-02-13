// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.blocking

import com.llama.llamastack.TestServerExtension
import com.llama.llamastack.client.okhttp.LlamaStackClientOkHttpClient
import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.models.InferenceChatCompletionParams
import com.llama.llamastack.models.InferenceCompletionParams
import com.llama.llamastack.models.InferenceEmbeddingsParams
import com.llama.llamastack.models.ResponseFormat
import com.llama.llamastack.models.SamplingParams
import com.llama.llamastack.models.UserMessage
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class InferenceServiceTest {

    @Test
    fun callChatCompletion() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val inferenceService = client.inference()
        val chatCompletionResponse =
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
                            .build()
                    )
                    .toolChoice(InferenceChatCompletionParams.ToolChoice.AUTO)
                    .toolConfig(
                        InferenceChatCompletionParams.ToolConfig.builder()
                            .systemMessageBehavior(
                                InferenceChatCompletionParams.ToolConfig.SystemMessageBehavior
                                    .APPEND
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
                                        )
                                    )
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )
        println(chatCompletionResponse)
        chatCompletionResponse.validate()
    }

    @Test
    fun callChatCompletionStreaming() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val inferenceService = client.inference()

        val chatCompletionResponseStream =
            inferenceService.chatCompletionStreaming(
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
                                InferenceChatCompletionParams.ToolConfig.SystemMessageBehavior
                                    .APPEND
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
                                        )
                                    )
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )

        chatCompletionResponseStream.use {
            chatCompletionResponseStream.asSequence().forEach {
                println(it)
                it.validate()
            }
        }
    }

    @Test
    fun callCompletion() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val inferenceService = client.inference()
        val completionResponse =
            inferenceService.completion(
                InferenceCompletionParams.builder()
                    .content("string")
                    .modelId("model_id")
                    .logprobs(InferenceCompletionParams.Logprobs.builder().topK(0L).build())
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
                    .build()
            )
        println(completionResponse)
        completionResponse.validate()
    }

    @Test
    fun callCompletionStreaming() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val inferenceService = client.inference()

        val completionResponseStream =
            inferenceService.completionStreaming(
                InferenceCompletionParams.builder()
                    .content("string")
                    .modelId("model_id")
                    .logprobs(InferenceCompletionParams.Logprobs.builder().topK(0L).build())
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
                    .build()
            )

        completionResponseStream.use {
            completionResponseStream.asSequence().forEach {
                println(it)
                it.validate()
            }
        }
    }

    @Test
    fun callEmbeddings() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val inferenceService = client.inference()
        val embeddingsResponse =
            inferenceService.embeddings(
                InferenceEmbeddingsParams.builder().addContent("string").modelId("model_id").build()
            )
        println(embeddingsResponse)
        embeddingsResponse.validate()
    }
}
