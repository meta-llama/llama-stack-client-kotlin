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
import com.llama.llamastack.core.http.HttpResponseFor
import com.llama.llamastack.core.http.json
import com.llama.llamastack.core.http.parseable
import com.llama.llamastack.core.prepareAsync
import com.llama.llamastack.errors.LlamaStackClientError
import com.llama.llamastack.models.BatchCompletion
import com.llama.llamastack.models.BatchInferenceChatCompletionParams
import com.llama.llamastack.models.BatchInferenceChatCompletionResponse
import com.llama.llamastack.models.BatchInferenceCompletionParams

class BatchInferenceServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : BatchInferenceServiceAsync {

    private val withRawResponse: BatchInferenceServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): BatchInferenceServiceAsync.WithRawResponse = withRawResponse

    override suspend fun chatCompletion(
        params: BatchInferenceChatCompletionParams,
        requestOptions: RequestOptions,
    ): BatchInferenceChatCompletionResponse =
        // post /v1/batch-inference/chat-completion
        withRawResponse().chatCompletion(params, requestOptions).parse()

    override suspend fun completion(
        params: BatchInferenceCompletionParams,
        requestOptions: RequestOptions,
    ): BatchCompletion =
        // post /v1/batch-inference/completion
        withRawResponse().completion(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        BatchInferenceServiceAsync.WithRawResponse {

        private val errorHandler: Handler<LlamaStackClientError> =
            errorHandler(clientOptions.jsonMapper)

        private val chatCompletionHandler: Handler<BatchInferenceChatCompletionResponse> =
            jsonHandler<BatchInferenceChatCompletionResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun chatCompletion(
            params: BatchInferenceChatCompletionParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BatchInferenceChatCompletionResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("v1", "batch-inference", "chat-completion")
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

        private val completionHandler: Handler<BatchCompletion> =
            jsonHandler<BatchCompletion>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override suspend fun completion(
            params: BatchInferenceCompletionParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BatchCompletion> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("v1", "batch-inference", "completion")
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
    }
}
