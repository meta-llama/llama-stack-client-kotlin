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
import com.llama.llamastack.core.http.HttpResponse
import com.llama.llamastack.core.http.HttpResponse.Handler
import com.llama.llamastack.core.http.HttpResponseFor
import com.llama.llamastack.core.http.json
import com.llama.llamastack.core.http.parseable
import com.llama.llamastack.core.prepareAsync
import com.llama.llamastack.errors.LlamaStackClientError
import com.llama.llamastack.models.QueryChunksResponse
import com.llama.llamastack.models.VectorIoInsertParams
import com.llama.llamastack.models.VectorIoQueryParams

class VectorIoServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    VectorIoServiceAsync {

    private val withRawResponse: VectorIoServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): VectorIoServiceAsync.WithRawResponse = withRawResponse

    override suspend fun insert(params: VectorIoInsertParams, requestOptions: RequestOptions) {
        // post /v1/vector-io/insert
        withRawResponse().insert(params, requestOptions)
    }

    override suspend fun query(
        params: VectorIoQueryParams,
        requestOptions: RequestOptions,
    ): QueryChunksResponse =
        // post /v1/vector-io/query
        withRawResponse().query(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        VectorIoServiceAsync.WithRawResponse {

        private val errorHandler: Handler<LlamaStackClientError> =
            errorHandler(clientOptions.jsonMapper)

        private val insertHandler: Handler<Void?> = emptyHandler().withErrorHandler(errorHandler)

        override suspend fun insert(
            params: VectorIoInsertParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("v1", "vector-io", "insert")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable { response.use { insertHandler.handle(it) } }
        }

        private val queryHandler: Handler<QueryChunksResponse> =
            jsonHandler<QueryChunksResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun query(
            params: VectorIoQueryParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<QueryChunksResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("v1", "vector-io", "query")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { queryHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
