// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.blocking

import com.llama.llamastack.core.ClientOptions
import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.core.RequestOptions
import com.llama.llamastack.core.handlers.errorHandler
import com.llama.llamastack.core.handlers.jsonHandler
import com.llama.llamastack.core.handlers.mapJson
import com.llama.llamastack.core.handlers.sseHandler
import com.llama.llamastack.core.handlers.withErrorHandler
import com.llama.llamastack.core.http.HttpMethod
import com.llama.llamastack.core.http.HttpRequest
import com.llama.llamastack.core.http.HttpResponse.Handler
import com.llama.llamastack.core.http.StreamResponse
import com.llama.llamastack.core.http.map
import com.llama.llamastack.core.json
import com.llama.llamastack.core.prepare
import com.llama.llamastack.errors.LlamaStackClientError
import com.llama.llamastack.models.ChatCompletionResponse
import com.llama.llamastack.models.ChatCompletionResponseStreamChunk
import com.llama.llamastack.models.CompletionResponse
import com.llama.llamastack.models.EmbeddingsResponse
import com.llama.llamastack.models.InferenceChatCompletionParams
import com.llama.llamastack.models.InferenceCompletionParams
import com.llama.llamastack.models.InferenceEmbeddingsParams

class InferenceServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    InferenceService {

    private val errorHandler: Handler<LlamaStackClientError> =
        errorHandler(clientOptions.jsonMapper)

    private val chatCompletionHandler: Handler<ChatCompletionResponse> =
        jsonHandler<ChatCompletionResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Generate a chat completion for the given messages using the specified model. */
    override fun chatCompletion(
        params: InferenceChatCompletionParams,
        requestOptions: RequestOptions,
    ): ChatCompletionResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "inference", "chat-completion")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { chatCompletionHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }

    private val chatCompletionStreamingHandler:
        Handler<StreamResponse<ChatCompletionResponseStreamChunk>> =
        sseHandler(clientOptions.jsonMapper)
            .mapJson<ChatCompletionResponseStreamChunk>()
            .withErrorHandler(errorHandler)

    /** Generate a chat completion for the given messages using the specified model. */
    override fun chatCompletionStreaming(
        params: InferenceChatCompletionParams,
        requestOptions: RequestOptions,
    ): StreamResponse<ChatCompletionResponseStreamChunk> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "inference", "chat-completion")
                .body(
                    json(
                        clientOptions.jsonMapper,
                        params
                            ._body()
                            .toBuilder()
                            .putAdditionalProperty("stream", JsonValue.from(true))
                            .build(),
                    )
                )
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .let { chatCompletionStreamingHandler.handle(it) }
            .let { streamResponse ->
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    streamResponse.map { it.validate() }
                } else {
                    streamResponse
                }
            }
    }

    private val completionHandler: Handler<CompletionResponse> =
        jsonHandler<CompletionResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Generate a completion for the given content using the specified model. */
    override fun completion(
        params: InferenceCompletionParams,
        requestOptions: RequestOptions,
    ): CompletionResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "inference", "completion")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { completionHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }

    private val completionStreamingHandler: Handler<StreamResponse<CompletionResponse>> =
        sseHandler(clientOptions.jsonMapper)
            .mapJson<CompletionResponse>()
            .withErrorHandler(errorHandler)

    /** Generate a completion for the given content using the specified model. */
    override fun completionStreaming(
        params: InferenceCompletionParams,
        requestOptions: RequestOptions,
    ): StreamResponse<CompletionResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "inference", "completion")
                .body(
                    json(
                        clientOptions.jsonMapper,
                        params
                            ._body()
                            .toBuilder()
                            .putAdditionalProperty("stream", JsonValue.from(true))
                            .build(),
                    )
                )
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .let { completionStreamingHandler.handle(it) }
            .let { streamResponse ->
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    streamResponse.map { it.validate() }
                } else {
                    streamResponse
                }
            }
    }

    private val embeddingsHandler: Handler<EmbeddingsResponse> =
        jsonHandler<EmbeddingsResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Generate embeddings for content pieces using the specified model. */
    override fun embeddings(
        params: InferenceEmbeddingsParams,
        requestOptions: RequestOptions,
    ): EmbeddingsResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "inference", "embeddings")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { embeddingsHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }
}
