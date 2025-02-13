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
import com.llama.llamastack.models.BatchCompletion
import com.llama.llamastack.models.BatchInferenceChatCompletionParams
import com.llama.llamastack.models.BatchInferenceChatCompletionResponse
import com.llama.llamastack.models.BatchInferenceCompletionParams

class BatchInferenceServiceAsyncImpl
internal constructor(
    private val clientOptions: ClientOptions,
) : BatchInferenceServiceAsync {

    private val errorHandler: Handler<LlamaStackClientError> =
        errorHandler(clientOptions.jsonMapper)

    private val chatCompletionHandler: Handler<BatchInferenceChatCompletionResponse> =
        jsonHandler<BatchInferenceChatCompletionResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    override suspend fun chatCompletion(
        params: BatchInferenceChatCompletionParams,
        requestOptions: RequestOptions
    ): BatchInferenceChatCompletionResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "batch-inference", "chat-completion")
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

    private val completionHandler: Handler<BatchCompletion> =
        jsonHandler<BatchCompletion>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    override suspend fun completion(
        params: BatchInferenceCompletionParams,
        requestOptions: RequestOptions
    ): BatchCompletion {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "batch-inference", "completion")
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
}
