// File generated from our OpenAPI spec by Stainless.

package com.llama_stack_client.api.client.local

import com.llama_stack_client.api.core.JsonValue
import com.llama_stack_client.api.core.RequestOptions
import com.llama_stack_client.api.models.CompletionMessage
import com.llama_stack_client.api.models.InferenceChatCompletionParams
import com.llama_stack_client.api.models.InferenceChatCompletionResponse
import com.llama_stack_client.api.models.InferenceCompletionParams
import com.llama_stack_client.api.models.InferenceCompletionResponse
import com.llama_stack_client.api.services.blocking.InferenceService
import com.llama_stack_client.api.services.blocking.inference.EmbeddingService
import org.pytorch.executorch.LlamaCallback

class InferenceServiceLocalImpl
constructor(
    private val clientOptions: LocalClientOptions,
) : InferenceService, LlamaCallback {

    private var resultMessage: String = ""
    private var onResultComplete: Boolean = false
    private var statsMetric: Float = 0.0f
    private var onStatsComplete: Boolean = false

    override fun onResult(p0: String?) {
        if (p0.equals("<|eot_id|>")) {
            onResultComplete = true
            return
        }

        if (p0.equals("\n\n") || p0.equals("\n")) {
            if (resultMessage.isNotEmpty()) {
                resultMessage += p0
            }
        } else {
            resultMessage += p0
        }
    }

    override fun onStats(p0: Float) {
        onResultComplete =
            true // required since in some cases where seq_len is met then EOT is not appended by ET
        // logic
        statsMetric = p0
        onStatsComplete = true
    }

    override fun embeddings(): EmbeddingService {
        TODO("Not yet implemented")
    }

    override fun chatCompletion(
        params: InferenceChatCompletionParams,
        requestOptions: RequestOptions
    ): InferenceChatCompletionResponse {
        resultMessage = ""
        val mModule = clientOptions.llamaModule
        val message = params.messages().last().userMessage()?.content()?.string().toString()
        println("Chat Completion Prompt is: $message")
        onResultComplete = false
        mModule.generate(message, ((message.length * 0.75) + 64).toInt(), this, false)

        while (!onResultComplete && !onStatsComplete) {
            Thread.sleep(2)
        }
        onResultComplete = false
        onStatsComplete = false
        println("Response is: $resultMessage")
        println("Stats is $statsMetric")

        return InferenceChatCompletionResponse.ofChatCompletionResponse(
            InferenceChatCompletionResponse.ChatCompletionResponse.builder()
                .completionMessage(
                    CompletionMessage.builder()
                        .content(CompletionMessage.Content.ofString(resultMessage))
                        .build()
                )
                .putAdditionalProperty("tps", JsonValue.from(statsMetric))
                .build()
        )
    }

    override fun completion(
        params: InferenceCompletionParams,
        requestOptions: RequestOptions
    ): InferenceCompletionResponse {
        resultMessage = ""
        val mModule = clientOptions.llamaModule
        val message = params.content().string().toString()
        println("Completion Prompt is: $message")
        onResultComplete = false
        mModule.generate(message, ((message.length * 0.75) + 64).toInt(), this, true)

        while (!onResultComplete) {
            Thread.sleep(2)
        }
        onResultComplete = false
        onStatsComplete = false
        println("Response is: $resultMessage")
        println("Stats is $statsMetric")

        return InferenceCompletionResponse.ofCompletionResponse(
            InferenceCompletionResponse.CompletionResponse.builder()
                .completionMessage(
                    CompletionMessage.builder()
                        .content(CompletionMessage.Content.ofString(resultMessage))
                        .build()
                )
                .putAdditionalProperty("tps", JsonValue.from(statsMetric))
                .build()
        )
    }
}
