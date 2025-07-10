// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.async

import com.llama.llamastack.core.ClientOptions
import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.core.RequestOptions
import com.llama.llamastack.core.checkRequired
import com.llama.llamastack.core.handlers.emptyHandler
import com.llama.llamastack.core.handlers.errorHandler
import com.llama.llamastack.core.handlers.jsonHandler
import com.llama.llamastack.core.handlers.withErrorHandler
import com.llama.llamastack.core.http.HttpMethod
import com.llama.llamastack.core.http.HttpRequest
import com.llama.llamastack.core.http.HttpResponse
import com.llama.llamastack.core.http.HttpResponse.Handler
import com.llama.llamastack.core.http.HttpResponseFor
import com.llama.llamastack.core.http.json
import com.llama.llamastack.core.http.parseable
import com.llama.llamastack.core.prepareAsync
import com.llama.llamastack.models.DataEnvelope
import com.llama.llamastack.models.DatasetIterrowsParams
import com.llama.llamastack.models.DatasetIterrowsResponse
import com.llama.llamastack.models.DatasetListParams
import com.llama.llamastack.models.DatasetRegisterParams
import com.llama.llamastack.models.DatasetRegisterResponse
import com.llama.llamastack.models.DatasetRetrieveParams
import com.llama.llamastack.models.DatasetRetrieveResponse
import com.llama.llamastack.models.DatasetUnregisterParams
import com.llama.llamastack.models.ListDatasetsResponse

class DatasetServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    DatasetServiceAsync {

    private val withRawResponse: DatasetServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): DatasetServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): DatasetServiceAsync =
        DatasetServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override suspend fun retrieve(
        params: DatasetRetrieveParams,
        requestOptions: RequestOptions,
    ): DatasetRetrieveResponse =
        // get /v1/datasets/{dataset_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override suspend fun list(
        params: DatasetListParams,
        requestOptions: RequestOptions,
    ): List<ListDatasetsResponse.Data> =
        // get /v1/datasets
        withRawResponse().list(params, requestOptions).parse()

    override suspend fun iterrows(
        params: DatasetIterrowsParams,
        requestOptions: RequestOptions,
    ): DatasetIterrowsResponse =
        // get /v1/datasetio/iterrows/{dataset_id}
        withRawResponse().iterrows(params, requestOptions).parse()

    override suspend fun register(
        params: DatasetRegisterParams,
        requestOptions: RequestOptions,
    ): DatasetRegisterResponse =
        // post /v1/datasets
        withRawResponse().register(params, requestOptions).parse()

    override suspend fun unregister(
        params: DatasetUnregisterParams,
        requestOptions: RequestOptions,
    ) {
        // delete /v1/datasets/{dataset_id}
        withRawResponse().unregister(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        DatasetServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): DatasetServiceAsync.WithRawResponse =
            DatasetServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val retrieveHandler: Handler<DatasetRetrieveResponse> =
            jsonHandler<DatasetRetrieveResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun retrieve(
            params: DatasetRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DatasetRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("datasetId", params.datasetId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "datasets", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<DataEnvelope<List<ListDatasetsResponse.Data>>> =
            jsonHandler<DataEnvelope<List<ListDatasetsResponse.Data>>>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun list(
            params: DatasetListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<ListDatasetsResponse.Data>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "datasets")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .data()
            }
        }

        private val iterrowsHandler: Handler<DatasetIterrowsResponse> =
            jsonHandler<DatasetIterrowsResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun iterrows(
            params: DatasetIterrowsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DatasetIterrowsResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("datasetId", params.datasetId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "datasetio", "iterrows", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { iterrowsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val registerHandler: Handler<DatasetRegisterResponse> =
            jsonHandler<DatasetRegisterResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun register(
            params: DatasetRegisterParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DatasetRegisterResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "datasets")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { registerHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val unregisterHandler: Handler<Void?> =
            emptyHandler().withErrorHandler(errorHandler)

        override suspend fun unregister(
            params: DatasetUnregisterParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("datasetId", params.datasetId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "datasets", params._pathParam(0))
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable { response.use { unregisterHandler.handle(it) } }
        }
    }
}
