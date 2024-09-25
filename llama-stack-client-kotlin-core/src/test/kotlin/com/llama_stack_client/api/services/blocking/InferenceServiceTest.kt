// File generated from our OpenAPI spec by Stainless.

package com.llama_stack_client.api.services.blocking

import com.llama_stack_client.api.TestServerExtension
import com.llama_stack_client.api.client.okhttp.LlamaStackClientOkHttpClient
import com.llama_stack_client.api.models.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class InferenceServiceTest {

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
                    .model("model")
                    .logprobs(InferenceChatCompletionParams.Logprobs.builder().topK(123L).build())
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
                    .stream(true)
                    .toolChoice(InferenceChatCompletionParams.ToolChoice.AUTO)
                    .toolPromptFormat(InferenceChatCompletionParams.ToolPromptFormat.JSON)
                    .tools(
                        listOf(
                            InferenceChatCompletionParams.Tool.builder()
                                .toolName(
                                    InferenceChatCompletionParams.Tool.ToolName.ofBuiltinTool(
                                        InferenceChatCompletionParams.Tool.ToolName.BuiltinTool
                                            .BRAVE_SEARCH
                                    )
                                )
                                .description("description")
                                .parameters(
                                    InferenceChatCompletionParams.Tool.Parameters.builder().build()
                                )
                                .build()
                        )
                    )
                    .build()
            )
        println(inferenceChatCompletionResponse)
    }

    @Test
    fun callCompletion() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val inferenceService = client.inference()
        val inferenceCompletionResponse =
            inferenceService.completion(
                InferenceCompletionParams.builder()
                    .content(InferenceCompletionParams.Content.ofString("string"))
                    .model("model")
                    .logprobs(InferenceCompletionParams.Logprobs.builder().topK(123L).build())
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
                    .stream(true)
                    .build()
            )
        println(inferenceCompletionResponse)
    }
}
