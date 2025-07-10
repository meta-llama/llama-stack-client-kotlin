// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.async

import com.llama.llamastack.core.ClientOptions
import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.core.RequestOptions
import com.llama.llamastack.core.handlers.errorHandler
import com.llama.llamastack.core.handlers.jsonHandler
import com.llama.llamastack.core.handlers.withErrorHandler
import com.llama.llamastack.core.http.HttpMethod
import com.llama.llamastack.core.http.HttpRequest
import com.llama.llamastack.core.http.HttpResponse.Handler
import com.llama.llamastack.core.http.HttpResponseFor
import com.llama.llamastack.core.http.json
import com.llama.llamastack.core.http.parseable
import com.llama.llamastack.core.prepareAsync
import com.llama.llamastack.models.BatchCompletion
import com.llama.llamastack.models.ChatCompletionResponse
import com.llama.llamastack.models.CompletionResponse
import com.llama.llamastack.models.EmbeddingsResponse
import com.llama.llamastack.models.InferenceBatchChatCompletionParams
import com.llama.llamastack.models.InferenceBatchChatCompletionResponse
import com.llama.llamastack.models.InferenceBatchCompletionParams
import com.llama.llamastack.models.InferenceChatCompletionParams
import com.llama.llamastack.models.InferenceCompletionParams
import com.llama.llamastack.models.InferenceEmbeddingsParams

class InferenceServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    InferenceServiceAsync {

    private val withRawResponse: InferenceServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): InferenceServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): InferenceServiceAsync =
        InferenceServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override suspend fun batchChatCompletion(
        params: InferenceBatchChatCompletionParams,
        requestOptions: RequestOptions,
    ): InferenceBatchChatCompletionResponse =
        // post /v1/inference/batch-chat-completion
        withRawResponse().batchChatCompletion(params, requestOptions).parse()

    override suspend fun batchCompletion(
        params: InferenceBatchCompletionParams,
        requestOptions: RequestOptions,
    ): BatchCompletion =
        // post /v1/inference/batch-completion
        withRawResponse().batchCompletion(params, requestOptions).parse()

    override suspend fun chatCompletion(
        params: InferenceChatCompletionParams,
        requestOptions: RequestOptions,
    ): ChatCompletionResponse =
        // post /v1/inference/chat-completion
        withRawResponse().chatCompletion(params, requestOptions).parse()

    override suspend fun completion(
        params: InferenceCompletionParams,
        requestOptions: RequestOptions,
    ): CompletionResponse =
        // post /v1/inference/completion
        withRawResponse().completion(params, requestOptions).parse()

    override suspend fun embeddings(
        params: InferenceEmbeddingsParams,
        requestOptions: RequestOptions,
    ): EmbeddingsResponse =
        // post /v1/inference/embeddings
        withRawResponse().embeddings(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        InferenceServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): InferenceServiceAsync.WithRawResponse =
            InferenceServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val batchChatCompletionHandler: Handler<InferenceBatchChatCompletionResponse> =
            jsonHandler<InferenceBatchChatCompletionResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun batchChatCompletion(
            params: InferenceBatchChatCompletionParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InferenceBatchChatCompletionResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "inference", "batch-chat-completion")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { batchChatCompletionHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val batchCompletionHandler: Handler<BatchCompletion> =
            jsonHandler<BatchCompletion>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override suspend fun batchCompletion(
            params: InferenceBatchCompletionParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BatchCompletion> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "inference", "batch-completion")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { batchCompletionHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val chatCompletionHandler: Handler<ChatCompletionResponse> =
            jsonHandler<ChatCompletionResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun chatCompletion(
            params: InferenceChatCompletionParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ChatCompletionResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "inference", "chat-completion")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
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

        private val completionHandler: Handler<CompletionResponse> =
            jsonHandler<CompletionResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override suspend fun completion(
            params: InferenceCompletionParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CompletionResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "inference", "completion")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
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

        private val embeddingsHandler: Handler<EmbeddingsResponse> =
            jsonHandler<EmbeddingsResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override suspend fun embeddings(
            params: InferenceEmbeddingsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EmbeddingsResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "inference", "embeddings")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
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
