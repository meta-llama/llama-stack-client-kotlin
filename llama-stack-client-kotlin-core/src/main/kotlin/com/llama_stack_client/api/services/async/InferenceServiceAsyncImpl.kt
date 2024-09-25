// File generated from our OpenAPI spec by Stainless.

package com.llama_stack_client.api.services.async

import com.llama_stack_client.api.core.ClientOptions
import com.llama_stack_client.api.core.RequestOptions
import com.llama_stack_client.api.core.http.HttpMethod
import com.llama_stack_client.api.core.http.HttpRequest
import com.llama_stack_client.api.core.http.HttpResponse.Handler
import com.llama_stack_client.api.errors.LlamaStackClientError
import com.llama_stack_client.api.models.InferenceChatCompletionParams
import com.llama_stack_client.api.models.InferenceChatCompletionResponse
import com.llama_stack_client.api.models.InferenceCompletionParams
import com.llama_stack_client.api.models.InferenceCompletionResponse
import com.llama_stack_client.api.services.async.inference.EmbeddingServiceAsync
import com.llama_stack_client.api.services.async.inference.EmbeddingServiceAsyncImpl
import com.llama_stack_client.api.services.errorHandler
import com.llama_stack_client.api.services.json
import com.llama_stack_client.api.services.jsonHandler
import com.llama_stack_client.api.services.withErrorHandler

class InferenceServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : InferenceServiceAsync {

    private val errorHandler: Handler<LlamaStackClientError> =
        errorHandler(clientOptions.jsonMapper)

    private val embeddings: EmbeddingServiceAsync by lazy {
        EmbeddingServiceAsyncImpl(clientOptions)
    }

    override fun embeddings(): EmbeddingServiceAsync = embeddings

    private val chatCompletionHandler: Handler<InferenceChatCompletionResponse> =
        jsonHandler<InferenceChatCompletionResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    override suspend fun chatCompletion(
        params: InferenceChatCompletionParams,
        requestOptions: RequestOptions
    ): InferenceChatCompletionResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("inference", "chat_completion")
                .putAllQueryParams(clientOptions.queryParams)
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).let { response ->
            response
                .use { chatCompletionHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val completionHandler: Handler<InferenceCompletionResponse> =
        jsonHandler<InferenceCompletionResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    override suspend fun completion(
        params: InferenceCompletionParams,
        requestOptions: RequestOptions
    ): InferenceCompletionResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("inference", "completion")
                .putAllQueryParams(clientOptions.queryParams)
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).let { response ->
            response
                .use { completionHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }
}
