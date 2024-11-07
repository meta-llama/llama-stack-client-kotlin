// File generated from our OpenAPI spec by Stainless.

package com.llama_stack_client.api.client.local

import com.llama_stack_client.api.core.RequestOptions
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
    override fun onResult(p0: String?) {
        println("onResult" + p0)
    }

    override fun onStats(p0: Float) {
        println("onStats" + p0)
    }

    override fun embeddings(): EmbeddingService {
        TODO("Not yet implemented")
    }

    override fun chatCompletion(
        params: InferenceChatCompletionParams,
        requestOptions: RequestOptions
    ): InferenceChatCompletionResponse {
        val mModule = clientOptions.llamaModule

        mModule.generate("what is the capital of France", 64, this, false)

        //        val request =
        //            HttpRequest.builder()
        //                .method(HttpMethod.POST)
        //                .addPathSegments("inference", "chat_completion")
        //                .putAllQueryParams(clientOptions.queryParams)
        //                .putAllQueryParams(params.getQueryParams())
        //                .putAllHeaders(clientOptions.headers)
        //                .putAllHeaders(params.getHeaders())
        //                .body(json(clientOptions.jsonMapper, params.getBody()))
        //                .build()
        //        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
        //            response
        //                .use { chatCompletionHandler.handle(it) }
        //                .apply {
        //                    if (requestOptions.responseValidation ?:
        // clientOptions.responseValidation) {
        //                        validate()
        //                    }
        //                }
        //        }
        return InferenceChatCompletionResponse.ofChatCompletionResponse(
            InferenceChatCompletionResponse.ChatCompletionResponse.builder().build()
        )
    }

    //    private val completionHandler: Handler<InferenceCompletionResponse> =
    //        jsonHandler<InferenceCompletionResponse>(clientOptions.jsonMapper)
    //            .withErrorHandler(errorHandler)

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
