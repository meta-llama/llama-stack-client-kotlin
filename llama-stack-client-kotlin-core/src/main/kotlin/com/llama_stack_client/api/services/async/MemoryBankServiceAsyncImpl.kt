// File generated from our OpenAPI spec by Stainless.

package com.llama_stack_client.api.services.async

import com.llama_stack_client.api.core.ClientOptions
import com.llama_stack_client.api.core.RequestOptions
import com.llama_stack_client.api.core.http.HttpMethod
import com.llama_stack_client.api.core.http.HttpRequest
import com.llama_stack_client.api.core.http.HttpResponse.Handler
import com.llama_stack_client.api.errors.LlamaStackClientError
import com.llama_stack_client.api.models.MemoryBankGetParams
import com.llama_stack_client.api.models.MemoryBankListParams
import com.llama_stack_client.api.models.MemoryBankSpec
import com.llama_stack_client.api.services.errorHandler
import com.llama_stack_client.api.services.jsonHandler
import com.llama_stack_client.api.services.withErrorHandler

class MemoryBankServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : MemoryBankServiceAsync {

    private val errorHandler: Handler<LlamaStackClientError> =
        errorHandler(clientOptions.jsonMapper)

    private val listHandler: Handler<MemoryBankSpec> =
        jsonHandler<MemoryBankSpec>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    override suspend fun list(
        params: MemoryBankListParams,
        requestOptions: RequestOptions
    ): MemoryBankSpec {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("memory_banks", "list")
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

    private val getHandler: Handler<MemoryBankSpec?> =
        jsonHandler<MemoryBankSpec?>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    override suspend fun get(
        params: MemoryBankGetParams,
        requestOptions: RequestOptions
    ): MemoryBankSpec? {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("memory_banks", "get")
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
