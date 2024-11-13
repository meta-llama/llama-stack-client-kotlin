// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.async

import com.llama.llamastack.core.ClientOptions
import com.llama.llamastack.core.RequestOptions
import com.llama.llamastack.core.handlers.errorHandler
import com.llama.llamastack.core.handlers.jsonHandler
import com.llama.llamastack.core.handlers.withErrorHandler
import com.llama.llamastack.core.http.HttpMethod
import com.llama.llamastack.core.http.HttpRequest
import com.llama.llamastack.core.http.HttpResponse.Handler
import com.llama.llamastack.errors.LlamaStackClientError
import com.llama.llamastack.models.DatasetioGetRowsPaginatedParams
import com.llama.llamastack.models.PaginatedRowsResult

class DatasetioServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : DatasetioServiceAsync {

    private val errorHandler: Handler<LlamaStackClientError> =
        errorHandler(clientOptions.jsonMapper)

    private val getRowsPaginatedHandler: Handler<PaginatedRowsResult> =
        jsonHandler<PaginatedRowsResult>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    override suspend fun getRowsPaginated(
        params: DatasetioGetRowsPaginatedParams,
        requestOptions: RequestOptions
    ): PaginatedRowsResult {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("datasetio", "get_rows_paginated")
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .replaceAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).let { response ->
            response
                .use { getRowsPaginatedHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }
}
