// File generated from our OpenAPI spec by Stainless.

package com.llama_stack_client.api.client.local

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
        onResultComplete = true
        println("I'm in onStats but not doing anything on purpose for now")
    }

    override fun embeddings(): EmbeddingService {
        TODO("Not yet implemented")
    }

    override fun chatCompletion(
        params: InferenceChatCompletionParams,
        requestOptions: RequestOptions
    ): InferenceChatCompletionResponse {
        val mModule = clientOptions.llamaModule
        val message = params.messages().last().userMessage()?.content()?.string().toString()
        println("Chat Completion Prompt is: $message")
        onResultComplete = false
        mModule.generate(message, ((message.length * 0.75) + 64).toInt(), this, false)

        while (!onResultComplete) {
            Thread.sleep(2)
        }
        onResultComplete = false
        println("Response is: $resultMessage")

        return InferenceChatCompletionResponse.ofChatCompletionResponse(
            InferenceChatCompletionResponse.ChatCompletionResponse.builder()
                .completionMessage(
                    CompletionMessage.builder()
                        .content(CompletionMessage.Content.ofString(resultMessage))
                        .build()
                )
                .build()
        )
    }

    override fun completion(
        params: InferenceCompletionParams,
        requestOptions: RequestOptions
    ): InferenceCompletionResponse {
        val mModule = clientOptions.llamaModule
        val message = params.content()?.string().toString()
        println("Completion Prompt is: $message")
        onResultComplete = false
        mModule.generate(message, ((message.length * 0.75) + 64).toInt(), this, true)

        while (!onResultComplete) {
            Thread.sleep(2)
        }
        onResultComplete = false
        println("Response is: $resultMessage")

        return InferenceCompletionResponse.ofCompletionResponse(
            InferenceCompletionResponse.CompletionResponse.builder()
                .completionMessage(
                    CompletionMessage.builder()
                        .content(CompletionMessage.Content.ofString(resultMessage))
                        .build()
                ).build()
        )
    }
}
