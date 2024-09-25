// File generated from our OpenAPI spec by Stainless.

package com.llama_stack_client.api.services.blocking

import com.llama_stack_client.api.core.ClientOptions
import com.llama_stack_client.api.core.RequestOptions
import com.llama_stack_client.api.core.http.HttpMethod
import com.llama_stack_client.api.core.http.HttpRequest
import com.llama_stack_client.api.core.http.HttpResponse.Handler
import com.llama_stack_client.api.errors.LlamaStackClientError
import com.llama_stack_client.api.models.BatchChatCompletion
import com.llama_stack_client.api.models.BatchCompletion
import com.llama_stack_client.api.models.BatchInferenceChatCompletionParams
import com.llama_stack_client.api.models.BatchInferenceCompletionParams
import com.llama_stack_client.api.services.errorHandler
import com.llama_stack_client.api.services.json
import com.llama_stack_client.api.services.jsonHandler
import com.llama_stack_client.api.services.withErrorHandler

class BatchInferenceServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : BatchInferenceService {

    private val errorHandler: Handler<LlamaStackClientError> =
        errorHandler(clientOptions.jsonMapper)

    private val chatCompletionHandler: Handler<BatchChatCompletion> =
        jsonHandler<BatchChatCompletion>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    override fun chatCompletion(
        params: BatchInferenceChatCompletionParams,
        requestOptions: RequestOptions
    ): BatchChatCompletion {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("batch_inference", "chat_completion")
                .putAllQueryParams(clientOptions.queryParams)
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
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
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
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
