// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.async

import com.llama.llamastack.core.ClientOptions
import com.llama.llamastack.core.RequestOptions
import com.llama.llamastack.core.handlers.errorHandler
import com.llama.llamastack.core.handlers.jsonHandler
import com.llama.llamastack.core.handlers.withErrorHandler
import com.llama.llamastack.core.http.HttpMethod
import com.llama.llamastack.core.http.HttpRequest
import com.llama.llamastack.core.http.HttpResponse.Handler
import com.llama.llamastack.core.json
import com.llama.llamastack.core.prepareAsync
import com.llama.llamastack.errors.LlamaStackClientError
import com.llama.llamastack.models.ChatCompletionResponse
import com.llama.llamastack.models.CompletionResponse
import com.llama.llamastack.models.EmbeddingsResponse
import com.llama.llamastack.models.InferenceChatCompletionParams
import com.llama.llamastack.models.InferenceCompletionParams
import com.llama.llamastack.models.InferenceEmbeddingsParams

class InferenceServiceAsyncImpl
internal constructor(
    private val clientOptions: ClientOptions,
) : InferenceServiceAsync {

    private val errorHandler: Handler<LlamaStackClientError> =
        errorHandler(clientOptions.jsonMapper)

    private val chatCompletionHandler: Handler<ChatCompletionResponse> =
        jsonHandler<ChatCompletionResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Generate a chat completion for the given messages using the specified model. */
    override suspend fun chatCompletion(
        params: InferenceChatCompletionParams,
        requestOptions: RequestOptions
    ): ChatCompletionResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "inference", "chat-completion")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepareAsync(clientOptions, params)
        val response = clientOptions.httpClient.executeAsync(request, requestOptions)
        return response
            .use { chatCompletionHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }

    private val completionHandler: Handler<CompletionResponse> =
        jsonHandler<CompletionResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Generate a completion for the given content using the specified model. */
    override suspend fun completion(
        params: InferenceCompletionParams,
        requestOptions: RequestOptions
    ): CompletionResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "inference", "completion")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepareAsync(clientOptions, params)
        val response = clientOptions.httpClient.executeAsync(request, requestOptions)
        return response
            .use { completionHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }

    private val embeddingsHandler: Handler<EmbeddingsResponse> =
        jsonHandler<EmbeddingsResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Generate embeddings for content pieces using the specified model. */
    override suspend fun embeddings(
        params: InferenceEmbeddingsParams,
        requestOptions: RequestOptions
    ): EmbeddingsResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "inference", "embeddings")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepareAsync(clientOptions, params)
        val response = clientOptions.httpClient.executeAsync(request, requestOptions)
        return response
            .use { embeddingsHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }
}
