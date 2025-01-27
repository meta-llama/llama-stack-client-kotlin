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
import com.llama.llamastack.models.DataEnvelope
import com.llama.llamastack.models.ListVectorDbsResponse
import com.llama.llamastack.models.VectorDbListParams
import com.llama.llamastack.models.VectorDbRegisterParams
import com.llama.llamastack.models.VectorDbRegisterResponse
import com.llama.llamastack.models.VectorDbRetrieveParams
import com.llama.llamastack.models.VectorDbRetrieveResponse
import com.llama.llamastack.models.VectorDbUnregisterParams

class VectorDbServiceAsyncImpl
internal constructor(
    private val clientOptions: ClientOptions,
) : VectorDbServiceAsync {

    private val errorHandler: Handler<LlamaStackClientError> =
        errorHandler(clientOptions.jsonMapper)

    private val retrieveHandler: Handler<VectorDbRetrieveResponse?> =
        jsonHandler<VectorDbRetrieveResponse?>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    override suspend fun retrieve(
        params: VectorDbRetrieveParams,
        requestOptions: RequestOptions
    ): VectorDbRetrieveResponse? {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("v1", "vector-dbs", params.getPathParam(0))
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

    private val listHandler: Handler<DataEnvelope<List<ListVectorDbsResponse.Data>>> =
        jsonHandler<DataEnvelope<List<ListVectorDbsResponse.Data>>>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    override suspend fun list(
        params: VectorDbListParams,
        requestOptions: RequestOptions
    ): List<ListVectorDbsResponse.Data> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("v1", "vector-dbs")
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
                .run { data() }
        }
    }

    private val registerHandler: Handler<VectorDbRegisterResponse> =
        jsonHandler<VectorDbRegisterResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    override suspend fun register(
        params: VectorDbRegisterParams,
        requestOptions: RequestOptions
    ): VectorDbRegisterResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "vector-dbs")
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .replaceAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).let { response ->
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

    override suspend fun unregister(
        params: VectorDbUnregisterParams,
        requestOptions: RequestOptions
    ) {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.DELETE)
                .addPathSegments("v1", "vector-dbs", params.getPathParam(0))
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .replaceAllHeaders(params.getHeaders())
                .apply { params.getBody()?.also { body(json(clientOptions.jsonMapper, it)) } }
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).let { response ->
            response.use { unregisterHandler.handle(it) }
        }
    }
}
