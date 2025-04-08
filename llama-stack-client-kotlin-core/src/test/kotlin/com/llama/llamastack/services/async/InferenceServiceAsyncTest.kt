// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.async

import com.llama.llamastack.TestServerExtension
import com.llama.llamastack.client.okhttp.LlamaStackClientOkHttpClientAsync
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
internal class InferenceServiceAsyncTest {

    @Test
    suspend fun chatCompletion() {
        val client =
            LlamaStackClientOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .build()
        val inferenceServiceAsync = client.inference()

        val chatCompletionResponse =
            inferenceServiceAsync.chatCompletion(
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
                                        ),
                                    )
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )

        chatCompletionResponse.validate()
    }

    @Test
    suspend fun completion() {
        val client =
            LlamaStackClientOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .build()
        val inferenceServiceAsync = client.inference()

        val completionResponse =
            inferenceServiceAsync.completion(
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
                            .addStop("string")
                            .build()
                    )
                    .build()
            )

        completionResponse.validate()
    }

    @Test
    suspend fun embeddings() {
        val client =
            LlamaStackClientOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .build()
        val inferenceServiceAsync = client.inference()

        val embeddingsResponse =
            inferenceServiceAsync.embeddings(
                InferenceEmbeddingsParams.builder()
                    .contentsOfStrings(listOf("string"))
                    .modelId("model_id")
                    .outputDimension(0L)
                    .taskType(InferenceEmbeddingsParams.TaskType.QUERY)
                    .textTruncation(InferenceEmbeddingsParams.TextTruncation.NONE)
                    .build()
            )

        embeddingsResponse.validate()
    }
}
