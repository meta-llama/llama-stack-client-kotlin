// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.blocking

import com.llama.llamastack.TestServerExtension
import com.llama.llamastack.client.okhttp.LlamaStackClientOkHttpClient
import com.llama.llamastack.models.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class BatchInferenceServiceTest {

    @Test
    fun callChatCompletion() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val batchInferenceService = client.batchInference()
        val batchInferenceChatCompletionResponse =
            batchInferenceService.chatCompletion(
                BatchInferenceChatCompletionParams.builder()
                    .messagesBatch(
                        listOf(
                            listOf(
                                BatchInferenceChatCompletionParams.MessagesBatch.ofUserMessage(
                                    UserMessage.builder()
                                        .content(UserMessage.Content.ofString("string"))
                                        .role(UserMessage.Role.USER)
                                        .context(UserMessage.Context.ofString("string"))
                                        .build()
                                )
                            )
                        )
                    )
                    .model("model")
                    .logprobs(
                        BatchInferenceChatCompletionParams.Logprobs.builder().topK(123L).build()
                    )
                    .samplingParams(
                        SamplingParams.builder()
                            .strategy(SamplingParams.Strategy.GREEDY)
                            .maxTokens(123L)
                            .repetitionPenalty(42.23)
                            .temperature(42.23)
                            .topK(123L)
                            .topP(42.23)
                            .build()
                    )
                    .toolChoice(BatchInferenceChatCompletionParams.ToolChoice.AUTO)
                    .toolPromptFormat(BatchInferenceChatCompletionParams.ToolPromptFormat.JSON)
                    .tools(
                        listOf(
                            BatchInferenceChatCompletionParams.Tool.builder()
                                .toolName(
                                    BatchInferenceChatCompletionParams.Tool.ToolName.BRAVE_SEARCH
                                )
                                .description("description")
                                .parameters(
                                    BatchInferenceChatCompletionParams.Tool.Parameters.builder()
                                        .build()
                                )
                                .build()
                        )
                    )
                    .xLlamaStackProviderData("X-LlamaStack-ProviderData")
                    .build()
            )
        println(batchInferenceChatCompletionResponse)
        batchInferenceChatCompletionResponse.validate()
    }

    @Test
    fun callCompletion() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val batchInferenceService = client.batchInference()
        val batchCompletion =
            batchInferenceService.completion(
                BatchInferenceCompletionParams.builder()
                    .contentBatch(
                        listOf(BatchInferenceCompletionParams.ContentBatch.ofString("string"))
                    )
                    .model("model")
                    .logprobs(BatchInferenceCompletionParams.Logprobs.builder().topK(123L).build())
                    .samplingParams(
                        SamplingParams.builder()
                            .strategy(SamplingParams.Strategy.GREEDY)
                            .maxTokens(123L)
                            .repetitionPenalty(42.23)
                            .temperature(42.23)
                            .topK(123L)
                            .topP(42.23)
                            .build()
                    )
                    .xLlamaStackProviderData("X-LlamaStack-ProviderData")
                    .build()
            )
        println(batchCompletion)
        batchCompletion.validate()
    }
}
