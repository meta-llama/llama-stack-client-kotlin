// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.blocking

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
import com.llama.llamastack.models.DataEnvelope
import com.llama.llamastack.models.ListMemoryBanksResponse
import com.llama.llamastack.models.MemoryBankListParams
import com.llama.llamastack.models.MemoryBankRegisterParams
import com.llama.llamastack.models.MemoryBankRegisterResponse
import com.llama.llamastack.models.MemoryBankRetrieveParams
import com.llama.llamastack.models.MemoryBankRetrieveResponse
import com.llama.llamastack.models.MemoryBankUnregisterParams

class MemoryBankServiceImpl
internal constructor(
    private val clientOptions: ClientOptions,
) : MemoryBankService {

    private val errorHandler: Handler<LlamaStackClientError> =
        errorHandler(clientOptions.jsonMapper)

    private val retrieveHandler: Handler<MemoryBankRetrieveResponse?> =
        jsonHandler<MemoryBankRetrieveResponse?>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    override fun retrieve(
        params: MemoryBankRetrieveParams,
        requestOptions: RequestOptions
    ): MemoryBankRetrieveResponse? {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("v1", "memory-banks", params.getPathParam(0))
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .replaceAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { retrieveHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        this?.validate()
                    }
                }
        }
    }

    private val listHandler: Handler<DataEnvelope<List<ListMemoryBanksResponse.Data>>> =
        jsonHandler<DataEnvelope<List<ListMemoryBanksResponse.Data>>>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    override fun list(
        params: MemoryBankListParams,
        requestOptions: RequestOptions
    ): List<ListMemoryBanksResponse.Data> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("v1", "memory-banks")
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .replaceAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { listHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
                .run { data() }
        }
    }

    private val registerHandler: Handler<MemoryBankRegisterResponse> =
        jsonHandler<MemoryBankRegisterResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    override fun register(
        params: MemoryBankRegisterParams,
        requestOptions: RequestOptions
    ): MemoryBankRegisterResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "memory-banks")
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .replaceAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { registerHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val unregisterHandler: Handler<Void?> = emptyHandler().withErrorHandler(errorHandler)

    override fun unregister(params: MemoryBankUnregisterParams, requestOptions: RequestOptions) {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.DELETE)
                .addPathSegments("v1", "memory-banks", params.getPathParam(0))
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .replaceAllHeaders(params.getHeaders())
                .apply { params.getBody()?.also { body(json(clientOptions.jsonMapper, it)) } }
                .build()
        clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response.use { unregisterHandler.handle(it) }
        }
    }
}
