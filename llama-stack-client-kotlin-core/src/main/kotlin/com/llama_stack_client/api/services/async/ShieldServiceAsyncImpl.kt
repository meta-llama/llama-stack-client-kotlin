// File generated from our OpenAPI spec by Stainless.

package com.llama_stack_client.api.services.async

import com.llama_stack_client.api.core.ClientOptions
import com.llama_stack_client.api.core.RequestOptions
import com.llama_stack_client.api.core.http.HttpMethod
import com.llama_stack_client.api.core.http.HttpRequest
import com.llama_stack_client.api.core.http.HttpResponse.Handler
import com.llama_stack_client.api.errors.LlamaStackClientError
import com.llama_stack_client.api.models.ShieldGetParams
import com.llama_stack_client.api.models.ShieldListParams
import com.llama_stack_client.api.models.ShieldSpec
import com.llama_stack_client.api.services.errorHandler
import com.llama_stack_client.api.services.jsonHandler
import com.llama_stack_client.api.services.withErrorHandler

class ShieldServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : ShieldServiceAsync {

    private val errorHandler: Handler<LlamaStackClientError> =
        errorHandler(clientOptions.jsonMapper)

    private val listHandler: Handler<ShieldSpec> =
        jsonHandler<ShieldSpec>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    override suspend fun list(
        params: ShieldListParams,
        requestOptions: RequestOptions
    ): ShieldSpec {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("shields", "list")
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

    private val getHandler: Handler<ShieldSpec?> =
        jsonHandler<ShieldSpec?>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    override suspend fun get(params: ShieldGetParams, requestOptions: RequestOptions): ShieldSpec? {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("shields", "get")
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
