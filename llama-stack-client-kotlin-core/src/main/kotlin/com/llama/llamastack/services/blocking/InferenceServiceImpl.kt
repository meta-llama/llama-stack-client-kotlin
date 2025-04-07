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
import com.llama.llamastack.core.http.HttpResponseFor
import com.llama.llamastack.core.http.StreamResponse
import com.llama.llamastack.core.http.json
import com.llama.llamastack.core.http.map
import com.llama.llamastack.core.http.parseable
import com.llama.llamastack.core.prepare
import com.llama.llamastack.models.ChatCompletionResponse
import com.llama.llamastack.models.ChatCompletionResponseStreamChunk
import com.llama.llamastack.models.CompletionResponse
import com.llama.llamastack.models.EmbeddingsResponse
import com.llama.llamastack.models.InferenceChatCompletionParams
import com.llama.llamastack.models.InferenceCompletionParams
import com.llama.llamastack.models.InferenceEmbeddingsParams

class InferenceServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    InferenceService {

    private val withRawResponse: InferenceService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): InferenceService.WithRawResponse = withRawResponse

    override fun chatCompletion(
        params: InferenceChatCompletionParams,
        requestOptions: RequestOptions,
    ): ChatCompletionResponse =
        // post /v1/inference/chat-completion
        withRawResponse().chatCompletion(params, requestOptions).parse()

    override fun chatCompletionStreaming(
        params: InferenceChatCompletionParams,
        requestOptions: RequestOptions,
    ): StreamResponse<ChatCompletionResponseStreamChunk> =
        // post /v1/inference/chat-completion
        withRawResponse().chatCompletionStreaming(params, requestOptions).parse()

    override fun completion(
        params: InferenceCompletionParams,
        requestOptions: RequestOptions,
    ): CompletionResponse =
        // post /v1/inference/completion
        withRawResponse().completion(params, requestOptions).parse()

    override fun completionStreaming(
        params: InferenceCompletionParams,
        requestOptions: RequestOptions,
    ): StreamResponse<CompletionResponse> =
        // post /v1/inference/completion
        withRawResponse().completionStreaming(params, requestOptions).parse()

    override fun embeddings(
        params: InferenceEmbeddingsParams,
        requestOptions: RequestOptions,
    ): EmbeddingsResponse =
        // post /v1/inference/embeddings
        withRawResponse().embeddings(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        InferenceService.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val chatCompletionHandler: Handler<ChatCompletionResponse> =
            jsonHandler<ChatCompletionResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun chatCompletion(
            params: InferenceChatCompletionParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ChatCompletionResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("v1", "inference", "chat-completion")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { chatCompletionHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val chatCompletionStreamingHandler:
            Handler<StreamResponse<ChatCompletionResponseStreamChunk>> =
            sseHandler(clientOptions.jsonMapper)
                .mapJson<ChatCompletionResponseStreamChunk>()
                .withErrorHandler(errorHandler)

        override fun chatCompletionStreaming(
            params: InferenceChatCompletionParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<StreamResponse<ChatCompletionResponseStreamChunk>> {
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
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .let { chatCompletionStreamingHandler.handle(it) }
                    .let { streamResponse ->
                        if (requestOptions.responseValidation!!) {
                            streamResponse.map { it.validate() }
                        } else {
                            streamResponse
                        }
                    }
            }
        }

        private val completionHandler: Handler<CompletionResponse> =
            jsonHandler<CompletionResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun completion(
            params: InferenceCompletionParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CompletionResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("v1", "inference", "completion")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { completionHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val completionStreamingHandler: Handler<StreamResponse<CompletionResponse>> =
            sseHandler(clientOptions.jsonMapper)
                .mapJson<CompletionResponse>()
                .withErrorHandler(errorHandler)

        override fun completionStreaming(
            params: InferenceCompletionParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<StreamResponse<CompletionResponse>> {
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
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .let { completionStreamingHandler.handle(it) }
                    .let { streamResponse ->
                        if (requestOptions.responseValidation!!) {
                            streamResponse.map { it.validate() }
                        } else {
                            streamResponse
                        }
                    }
            }
        }

        private val embeddingsHandler: Handler<EmbeddingsResponse> =
            jsonHandler<EmbeddingsResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun embeddings(
            params: InferenceEmbeddingsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EmbeddingsResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("v1", "inference", "embeddings")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { embeddingsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
