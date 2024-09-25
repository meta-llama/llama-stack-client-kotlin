// File generated from our OpenAPI spec by Stainless.

package com.llama_stack_client.api.services.async

import com.llama_stack_client.api.core.ClientOptions
import com.llama_stack_client.api.core.RequestOptions
import com.llama_stack_client.api.core.http.HttpMethod
import com.llama_stack_client.api.core.http.HttpRequest
import com.llama_stack_client.api.core.http.HttpResponse.Handler
import com.llama_stack_client.api.errors.LlamaStackClientError
import com.llama_stack_client.api.models.ModelGetParams
import com.llama_stack_client.api.models.ModelListParams
import com.llama_stack_client.api.models.ModelServingSpec
import com.llama_stack_client.api.services.errorHandler
import com.llama_stack_client.api.services.jsonHandler
import com.llama_stack_client.api.services.withErrorHandler

class ModelServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : ModelServiceAsync {

    private val errorHandler: Handler<LlamaStackClientError> =
        errorHandler(clientOptions.jsonMapper)

    private val listHandler: Handler<ModelServingSpec> =
        jsonHandler<ModelServingSpec>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    override suspend fun list(
        params: ModelListParams,
        requestOptions: RequestOptions
    ): ModelServingSpec {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("models", "list")
                .putAllQueryParams(clientOptions.queryParams)
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).let { response ->
            response
                .use { listHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val getHandler: Handler<ModelServingSpec?> =
        jsonHandler<ModelServingSpec?>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    override suspend fun get(
        params: ModelGetParams,
        requestOptions: RequestOptions
    ): ModelServingSpec? {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("models", "get")
                .putAllQueryParams(clientOptions.queryParams)
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).let { response ->
            response
                .use { getHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        this?.validate()
                    }
                }
        }
    }
}
