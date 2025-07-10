// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.async

import com.llama.llamastack.core.ClientOptions
import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.core.RequestOptions
import com.llama.llamastack.core.checkRequired
import com.llama.llamastack.core.handlers.errorHandler
import com.llama.llamastack.core.handlers.jsonHandler
import com.llama.llamastack.core.handlers.withErrorHandler
import com.llama.llamastack.core.http.HttpMethod
import com.llama.llamastack.core.http.HttpRequest
import com.llama.llamastack.core.http.HttpResponse.Handler
import com.llama.llamastack.core.http.HttpResponseFor
import com.llama.llamastack.core.http.json
import com.llama.llamastack.core.http.parseable
import com.llama.llamastack.core.prepareAsync
import com.llama.llamastack.models.ListVectorStoresResponse
import com.llama.llamastack.models.VectorStore
import com.llama.llamastack.models.VectorStoreCreateParams
import com.llama.llamastack.models.VectorStoreDeleteParams
import com.llama.llamastack.models.VectorStoreDeleteResponse
import com.llama.llamastack.models.VectorStoreListParams
import com.llama.llamastack.models.VectorStoreRetrieveParams
import com.llama.llamastack.models.VectorStoreSearchParams
import com.llama.llamastack.models.VectorStoreSearchResponse
import com.llama.llamastack.models.VectorStoreUpdateParams
import com.llama.llamastack.services.async.vectorStores.FileServiceAsync
import com.llama.llamastack.services.async.vectorStores.FileServiceAsyncImpl

class VectorStoreServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    VectorStoreServiceAsync {

    private val withRawResponse: VectorStoreServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val files: FileServiceAsync by lazy { FileServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): VectorStoreServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): VectorStoreServiceAsync =
        VectorStoreServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun files(): FileServiceAsync = files

    override suspend fun create(
        params: VectorStoreCreateParams,
        requestOptions: RequestOptions,
    ): VectorStore =
        // post /v1/openai/v1/vector_stores
        withRawResponse().create(params, requestOptions).parse()

    override suspend fun retrieve(
        params: VectorStoreRetrieveParams,
        requestOptions: RequestOptions,
    ): VectorStore =
        // get /v1/openai/v1/vector_stores/{vector_store_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override suspend fun update(
        params: VectorStoreUpdateParams,
        requestOptions: RequestOptions,
    ): VectorStore =
        // post /v1/openai/v1/vector_stores/{vector_store_id}
        withRawResponse().update(params, requestOptions).parse()

    override suspend fun list(
        params: VectorStoreListParams,
        requestOptions: RequestOptions,
    ): ListVectorStoresResponse =
        // get /v1/openai/v1/vector_stores
        withRawResponse().list(params, requestOptions).parse()

    override suspend fun delete(
        params: VectorStoreDeleteParams,
        requestOptions: RequestOptions,
    ): VectorStoreDeleteResponse =
        // delete /v1/openai/v1/vector_stores/{vector_store_id}
        withRawResponse().delete(params, requestOptions).parse()

    override suspend fun search(
        params: VectorStoreSearchParams,
        requestOptions: RequestOptions,
    ): VectorStoreSearchResponse =
        // post /v1/openai/v1/vector_stores/{vector_store_id}/search
        withRawResponse().search(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        VectorStoreServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val files: FileServiceAsync.WithRawResponse by lazy {
            FileServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): VectorStoreServiceAsync.WithRawResponse =
            VectorStoreServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        override fun files(): FileServiceAsync.WithRawResponse = files

        private val createHandler: Handler<VectorStore> =
            jsonHandler<VectorStore>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override suspend fun create(
            params: VectorStoreCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<VectorStore> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "openai", "v1", "vector_stores")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveHandler: Handler<VectorStore> =
            jsonHandler<VectorStore>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override suspend fun retrieve(
            params: VectorStoreRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<VectorStore> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("vectorStoreId", params.vectorStoreId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "openai", "v1", "vector_stores", params._pathParam(0))
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

        private val updateHandler: Handler<VectorStore> =
            jsonHandler<VectorStore>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override suspend fun update(
            params: VectorStoreUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<VectorStore> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("vectorStoreId", params.vectorStoreId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "openai", "v1", "vector_stores", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { updateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<ListVectorStoresResponse> =
            jsonHandler<ListVectorStoresResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun list(
            params: VectorStoreListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ListVectorStoresResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "openai", "v1", "vector_stores")
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
            }
        }

        private val deleteHandler: Handler<VectorStoreDeleteResponse> =
            jsonHandler<VectorStoreDeleteResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun delete(
            params: VectorStoreDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<VectorStoreDeleteResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("vectorStoreId", params.vectorStoreId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "openai", "v1", "vector_stores", params._pathParam(0))
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { deleteHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val searchHandler: Handler<VectorStoreSearchResponse> =
            jsonHandler<VectorStoreSearchResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun search(
            params: VectorStoreSearchParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<VectorStoreSearchResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("vectorStoreId", params.vectorStoreId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "v1",
                        "openai",
                        "v1",
                        "vector_stores",
                        params._pathParam(0),
                        "search",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { searchHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
