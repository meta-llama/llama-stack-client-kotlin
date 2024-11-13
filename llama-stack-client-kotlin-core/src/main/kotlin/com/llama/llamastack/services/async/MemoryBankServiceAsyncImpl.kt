// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.async

import com.llama.llamastack.core.ClientOptions
import com.llama.llamastack.core.RequestOptions
import com.llama.llamastack.core.handlers.emptyHandler
import com.llama.llamastack.core.handlers.errorHandler
import com.llama.llamastack.core.handlers.jsonHandler
import com.llama.llamastack.core.handlers.withErrorHandler
import com.llama.llamastack.core.http.HttpMethod
import com.llama.llamastack.core.http.HttpRequest
import com.llama.llamastack.core.http.HttpResponse.Handler
import com.llama.llamastack.core.json
import com.llama.llamastack.errors.LlamaStackClientError
import com.llama.llamastack.models.MemoryBankListParams
import com.llama.llamastack.models.MemoryBankListResponse
import com.llama.llamastack.models.MemoryBankRegisterParams
import com.llama.llamastack.models.MemoryBankRetrieveParams
import com.llama.llamastack.models.MemoryBankRetrieveResponse

class MemoryBankServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : MemoryBankServiceAsync {

    private val errorHandler: Handler<LlamaStackClientError> =
        errorHandler(clientOptions.jsonMapper)

    private val retrieveHandler: Handler<MemoryBankRetrieveResponse?> =
        jsonHandler<MemoryBankRetrieveResponse?>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    override suspend fun retrieve(
        params: MemoryBankRetrieveParams,
        requestOptions: RequestOptions
    ): MemoryBankRetrieveResponse? {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("memory_banks", "get")
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .replaceAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).let { response ->
            response
                .use { retrieveHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        this?.validate()
                    }
                }
        }
    }

    private val listHandler: Handler<MemoryBankListResponse> =
        jsonHandler<MemoryBankListResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    override suspend fun list(
        params: MemoryBankListParams,
        requestOptions: RequestOptions
    ): MemoryBankListResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("memory_banks", "list")
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .replaceAllHeaders(params.getHeaders())
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

    private val registerHandler: Handler<Void?> = emptyHandler().withErrorHandler(errorHandler)

    override suspend fun register(
        params: MemoryBankRegisterParams,
        requestOptions: RequestOptions
    ) {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("memory_banks", "register")
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .replaceAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).let { response ->
            response.use { registerHandler.handle(it) }
        }
    }
}
