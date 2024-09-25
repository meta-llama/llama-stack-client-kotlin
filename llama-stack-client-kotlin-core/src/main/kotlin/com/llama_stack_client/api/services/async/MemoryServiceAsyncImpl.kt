// File generated from our OpenAPI spec by Stainless.

package com.llama_stack_client.api.services.async

import com.llama_stack_client.api.core.ClientOptions
import com.llama_stack_client.api.core.RequestOptions
import com.llama_stack_client.api.core.http.HttpMethod
import com.llama_stack_client.api.core.http.HttpRequest
import com.llama_stack_client.api.core.http.HttpResponse.Handler
import com.llama_stack_client.api.errors.LlamaStackClientError
import com.llama_stack_client.api.models.MemoryCreateParams
import com.llama_stack_client.api.models.MemoryCreateResponse
import com.llama_stack_client.api.models.MemoryDropParams
import com.llama_stack_client.api.models.MemoryInsertParams
import com.llama_stack_client.api.models.MemoryListParams
import com.llama_stack_client.api.models.MemoryListResponse
import com.llama_stack_client.api.models.MemoryQueryParams
import com.llama_stack_client.api.models.MemoryRetrieveParams
import com.llama_stack_client.api.models.MemoryRetrieveResponse
import com.llama_stack_client.api.models.MemoryUpdateParams
import com.llama_stack_client.api.models.QueryDocuments
import com.llama_stack_client.api.services.async.memory.DocumentServiceAsync
import com.llama_stack_client.api.services.async.memory.DocumentServiceAsyncImpl
import com.llama_stack_client.api.services.emptyHandler
import com.llama_stack_client.api.services.errorHandler
import com.llama_stack_client.api.services.json
import com.llama_stack_client.api.services.jsonHandler
import com.llama_stack_client.api.services.stringHandler
import com.llama_stack_client.api.services.withErrorHandler

class MemoryServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : MemoryServiceAsync {

    private val errorHandler: Handler<LlamaStackClientError> =
        errorHandler(clientOptions.jsonMapper)

    private val documents: DocumentServiceAsync by lazy { DocumentServiceAsyncImpl(clientOptions) }

    override fun documents(): DocumentServiceAsync = documents

    private val createHandler: Handler<MemoryCreateResponse> =
        jsonHandler<MemoryCreateResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    override suspend fun create(
        params: MemoryCreateParams,
        requestOptions: RequestOptions
    ): MemoryCreateResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("memory", "create")
                .putAllQueryParams(clientOptions.queryParams)
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).let { response ->
            response.use { createHandler.handle(it) }
        }
    }

    private val retrieveHandler: Handler<MemoryRetrieveResponse> =
        jsonHandler<MemoryRetrieveResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    override suspend fun retrieve(
        params: MemoryRetrieveParams,
        requestOptions: RequestOptions
    ): MemoryRetrieveResponse? {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("memory", "get")
                .putAllQueryParams(clientOptions.queryParams)
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).let { response ->
            response.use { retrieveHandler.handle(it) }
        }
    }

    private val updateHandler: Handler<Void?> = emptyHandler().withErrorHandler(errorHandler)

    override suspend fun update(params: MemoryUpdateParams, requestOptions: RequestOptions) {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("memory", "update")
                .putAllQueryParams(clientOptions.queryParams)
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).let { response ->
            response.use { updateHandler.handle(it) }
        }
    }

    private val listHandler: Handler<MemoryListResponse> =
        jsonHandler<MemoryListResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    override suspend fun list(
        params: MemoryListParams,
        requestOptions: RequestOptions
    ): MemoryListResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("memory", "list")
                .putAllQueryParams(clientOptions.queryParams)
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).let { response ->
            response.use { listHandler.handle(it) }
        }
    }

    private val dropHandler: Handler<String> = stringHandler().withErrorHandler(errorHandler)

    override suspend fun drop(params: MemoryDropParams, requestOptions: RequestOptions): String {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("memory", "drop")
                .putAllQueryParams(clientOptions.queryParams)
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).let { response ->
            response.use { dropHandler.handle(it) }
        }
    }

    private val insertHandler: Handler<Void?> = emptyHandler().withErrorHandler(errorHandler)

    override suspend fun insert(params: MemoryInsertParams, requestOptions: RequestOptions) {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("memory", "insert")
                .putAllQueryParams(clientOptions.queryParams)
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).let { response ->
            response.use { insertHandler.handle(it) }
        }
    }

    private val queryHandler: Handler<QueryDocuments> =
        jsonHandler<QueryDocuments>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    override suspend fun query(
        params: MemoryQueryParams,
        requestOptions: RequestOptions
    ): QueryDocuments {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("memory", "query")
                .putAllQueryParams(clientOptions.queryParams)
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).let { response ->
            response
                .use { queryHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }
}
