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
        println("onResult is: $p0")
        resultMessage += p0

        if (p0.equals("<|eot_id|>")) {
            onResultComplete = true
        }
    }

    override fun onStats(p0: Float) {
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
        val promptExample =
            "<|begin_of_text|><|start_header_id|>system<|end_header_id|><|eot_id|><|start_header_id|>user<|end_header_id|>what is France's capital?<|eot_id|><|start_header_id|>assistant<|end_header_id|>"
        /*val promptExample =
            "<|begin_of_text|><|start_header_id|>user<|end_header_id|>What is France's capital?<|eot_id|><|start_header_id|>assistant<|end_header_id|>"
        */
        println("Prompt is: $promptExample")
        mModule.generate(promptExample, ((promptExample.length * 0.75) + 64).toInt(), this, false)

        while (!onResultComplete) {
            Thread.sleep(2)
        }
        onResultComplete = false
        println("Response is: $resultMessage")

        // mModule.generate("What is the capital of France?", 64, this, false)
        val content = CompletionMessage.Content.ofString(resultMessage)
        val completionMessage = CompletionMessage.builder().content(content).build()

        return InferenceChatCompletionResponse.ofChatCompletionResponse(
            InferenceChatCompletionResponse.ChatCompletionResponse.builder()
                .completionMessage(completionMessage)
                .build()
        )
    }

    override fun completion(
        params: InferenceCompletionParams,
        requestOptions: RequestOptions
    ): InferenceCompletionResponse {
        TODO("IMPLEMENT ET LOGIC HERE")
        //        val request =
        //            HttpRequest.builder()
        //                .method(HttpMethod.POST)
        //                .addPathSegments("inference", "completion")
        //                .putAllQueryParams(clientOptions.queryParams)
        //                .putAllQueryParams(params.getQueryParams())
        //                .putAllHeaders(clientOptions.headers)
        //                .putAllHeaders(params.getHeaders())
        //                .body(json(clientOptions.jsonMapper, params.getBody()))
        //                .build()
        //        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
        //            response
        //                .use { completionHandler.handle(it) }
        //                .apply {
        //                    if (requestOptions.responseValidation ?:
        // clientOptions.responseValidation) {
        //                        validate()
        //                    }
        //                }
        //        }
    }
}
