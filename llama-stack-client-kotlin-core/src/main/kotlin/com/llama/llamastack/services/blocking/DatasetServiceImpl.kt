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
import com.llama.llamastack.core.prepare
import com.llama.llamastack.errors.LlamaStackClientError
import com.llama.llamastack.models.DataEnvelope
import com.llama.llamastack.models.DatasetListParams
import com.llama.llamastack.models.DatasetRegisterParams
import com.llama.llamastack.models.DatasetRetrieveParams
import com.llama.llamastack.models.DatasetRetrieveResponse
import com.llama.llamastack.models.DatasetUnregisterParams
import com.llama.llamastack.models.ListDatasetsResponse

class DatasetServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    DatasetService {

    private val errorHandler: Handler<LlamaStackClientError> =
        errorHandler(clientOptions.jsonMapper)

    private val retrieveHandler: Handler<DatasetRetrieveResponse?> =
        jsonHandler<DatasetRetrieveResponse?>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    override fun retrieve(
        params: DatasetRetrieveParams,
        requestOptions: RequestOptions,
    ): DatasetRetrieveResponse? {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("v1", "datasets", params.getPathParam(0))
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
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

    override fun list(
        params: DatasetListParams,
        requestOptions: RequestOptions,
    ): List<ListDatasetsResponse.Data> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("v1", "datasets")
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
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

    override fun register(params: DatasetRegisterParams, requestOptions: RequestOptions) {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "datasets")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        response.use { registerHandler.handle(it) }
    }

    private val unregisterHandler: Handler<Void?> = emptyHandler().withErrorHandler(errorHandler)

    override fun unregister(params: DatasetUnregisterParams, requestOptions: RequestOptions) {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.DELETE)
                .addPathSegments("v1", "datasets", params.getPathParam(0))
                .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        response.use { unregisterHandler.handle(it) }
    }
}
