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
import com.llama.llamastack.core.prepareAsync
import com.llama.llamastack.errors.LlamaStackClientError
import com.llama.llamastack.models.DataEnvelope
import com.llama.llamastack.models.DatasetListParams
import com.llama.llamastack.models.DatasetRegisterParams
import com.llama.llamastack.models.DatasetRetrieveParams
import com.llama.llamastack.models.DatasetRetrieveResponse
import com.llama.llamastack.models.DatasetUnregisterParams
import com.llama.llamastack.models.ListDatasetsResponse

class DatasetServiceAsyncImpl
internal constructor(
    private val clientOptions: ClientOptions,
) : DatasetServiceAsync {

    private val errorHandler: Handler<LlamaStackClientError> =
        errorHandler(clientOptions.jsonMapper)

    private val retrieveHandler: Handler<DatasetRetrieveResponse?> =
        jsonHandler<DatasetRetrieveResponse?>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    override suspend fun retrieve(
        params: DatasetRetrieveParams,
        requestOptions: RequestOptions
    ): DatasetRetrieveResponse? {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("v1", "datasets", params.getPathParam(0))
                .build()
                .prepareAsync(clientOptions, params)
        val response = clientOptions.httpClient.executeAsync(request, requestOptions)
        return response
            .use { retrieveHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it?.validate()
                }
            }
    }

    private val listHandler: Handler<DataEnvelope<List<ListDatasetsResponse.Data>>> =
        jsonHandler<DataEnvelope<List<ListDatasetsResponse.Data>>>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    override suspend fun list(
        params: DatasetListParams,
        requestOptions: RequestOptions
    ): List<ListDatasetsResponse.Data> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("v1", "datasets")
                .build()
                .prepareAsync(clientOptions, params)
        val response = clientOptions.httpClient.executeAsync(request, requestOptions)
        return response
            .use { listHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
            .data()
    }

    private val registerHandler: Handler<Void?> = emptyHandler().withErrorHandler(errorHandler)

    override suspend fun register(params: DatasetRegisterParams, requestOptions: RequestOptions) {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "datasets")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepareAsync(clientOptions, params)
        val response = clientOptions.httpClient.executeAsync(request, requestOptions)
        response.use { registerHandler.handle(it) }
    }

    private val unregisterHandler: Handler<Void?> = emptyHandler().withErrorHandler(errorHandler)

    override suspend fun unregister(
        params: DatasetUnregisterParams,
        requestOptions: RequestOptions
    ) {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.DELETE)
                .addPathSegments("v1", "datasets", params.getPathParam(0))
                .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                .build()
                .prepareAsync(clientOptions, params)
        val response = clientOptions.httpClient.executeAsync(request, requestOptions)
        response.use { unregisterHandler.handle(it) }
    }
}
