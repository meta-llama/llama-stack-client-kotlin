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
import com.llama.llamastack.models.DatasetioAppendRowsParams
import com.llama.llamastack.models.DatasetioGetRowsPaginatedParams
import com.llama.llamastack.models.PaginatedRowsResult

class DatasetioServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    DatasetioServiceAsync {

    private val withRawResponse: DatasetioServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): DatasetioServiceAsync.WithRawResponse = withRawResponse

    override suspend fun appendRows(
        params: DatasetioAppendRowsParams,
        requestOptions: RequestOptions,
    ) {
        // post /v1/datasetio/rows
        withRawResponse().appendRows(params, requestOptions)
    }

    override suspend fun getRowsPaginated(
        params: DatasetioGetRowsPaginatedParams,
        requestOptions: RequestOptions,
    ): PaginatedRowsResult =
        // get /v1/datasetio/rows
        withRawResponse().getRowsPaginated(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        DatasetioServiceAsync.WithRawResponse {

        private val errorHandler: Handler<LlamaStackClientError> =
            errorHandler(clientOptions.jsonMapper)

        private val appendRowsHandler: Handler<Void?> =
            emptyHandler().withErrorHandler(errorHandler)

        override suspend fun appendRows(
            params: DatasetioAppendRowsParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("v1", "datasetio", "rows")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable { response.use { appendRowsHandler.handle(it) } }
        }

        private val getRowsPaginatedHandler: Handler<PaginatedRowsResult> =
            jsonHandler<PaginatedRowsResult>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun getRowsPaginated(
            params: DatasetioGetRowsPaginatedParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PaginatedRowsResult> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("v1", "datasetio", "rows")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { getRowsPaginatedHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
