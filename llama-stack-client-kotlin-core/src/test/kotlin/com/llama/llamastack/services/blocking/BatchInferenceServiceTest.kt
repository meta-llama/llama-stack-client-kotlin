// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.blocking

import com.llama.llamastack.TestServerExtension
import com.llama.llamastack.client.okhttp.LlamaStackClientOkHttpClient
import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.models.BatchInferenceChatCompletionParams
import com.llama.llamastack.models.BatchInferenceCompletionParams
import com.llama.llamastack.models.Message
import com.llama.llamastack.models.SamplingParams
import com.llama.llamastack.models.UserMessage
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
                    .addMessagesBatch(
                        listOf(
                            Message.ofUser(
                                UserMessage.builder().content("string").context("string").build()
                            )
                        )
                    )
                    .model("model")
                    .logprobs(
                        BatchInferenceChatCompletionParams.Logprobs.builder().topK(0L).build()
                    )
                    .samplingParams(
                        SamplingParams.builder()
                            .strategyGreedySampling()
                            .maxTokens(0L)
                            .repetitionPenalty(0.0)
                            .build()
                    )
                    .toolChoice(BatchInferenceChatCompletionParams.ToolChoice.AUTO)
                    .toolPromptFormat(BatchInferenceChatCompletionParams.ToolPromptFormat.JSON)
                    .addTool(
                        BatchInferenceChatCompletionParams.Tool.builder()
                            .toolName(BatchInferenceChatCompletionParams.Tool.ToolName.BRAVE_SEARCH)
                            .description("description")
                            .parameters(
                                BatchInferenceChatCompletionParams.Tool.Parameters.builder()
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
                    .xLlamaStackClientVersion("X-LlamaStack-Client-Version")
                    .xLlamaStackProviderData("X-LlamaStack-Provider-Data")
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
                    .addContentBatch("string")
                    .model("model")
                    .logprobs(BatchInferenceCompletionParams.Logprobs.builder().topK(0L).build())
                    .samplingParams(
                        SamplingParams.builder()
                            .strategyGreedySampling()
                            .maxTokens(0L)
                            .repetitionPenalty(0.0)
                            .build()
                    )
                    .xLlamaStackClientVersion("X-LlamaStack-Client-Version")
                    .xLlamaStackProviderData("X-LlamaStack-Provider-Data")
                    .build()
            )
        println(batchCompletion)
        batchCompletion.validate()
    }
}
