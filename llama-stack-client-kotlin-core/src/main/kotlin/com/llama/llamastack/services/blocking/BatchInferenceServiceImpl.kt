// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.blocking

import com.llama.llamastack.core.ClientOptions
import com.llama.llamastack.core.RequestOptions
import com.llama.llamastack.core.handlers.errorHandler
import com.llama.llamastack.core.handlers.jsonHandler
import com.llama.llamastack.core.handlers.withErrorHandler
import com.llama.llamastack.core.http.HttpMethod
import com.llama.llamastack.core.http.HttpRequest
import com.llama.llamastack.core.http.HttpResponse.Handler
import com.llama.llamastack.core.json
import com.llama.llamastack.errors.LlamaStackClientError
import com.llama.llamastack.models.BatchCompletion
import com.llama.llamastack.models.BatchInferenceChatCompletionParams
import com.llama.llamastack.models.BatchInferenceChatCompletionResponse
import com.llama.llamastack.models.BatchInferenceCompletionParams

class BatchInferenceServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : BatchInferenceService {

    private val errorHandler: Handler<LlamaStackClientError> =
        errorHandler(clientOptions.jsonMapper)

    private val chatCompletionHandler: Handler<BatchInferenceChatCompletionResponse> =
        jsonHandler<BatchInferenceChatCompletionResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    override fun chatCompletion(
        params: BatchInferenceChatCompletionParams,
        requestOptions: RequestOptions
    ): BatchInferenceChatCompletionResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("batch_inference", "chat_completion")
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .replaceAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { chatCompletionHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val completionHandler: Handler<BatchCompletion> =
        jsonHandler<BatchCompletion>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    override fun completion(
        params: BatchInferenceCompletionParams,
        requestOptions: RequestOptions
    ): BatchCompletion {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("batch_inference", "completion")
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .replaceAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
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