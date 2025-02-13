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
import com.llama.llamastack.models.QueryChunksResponse
import com.llama.llamastack.models.VectorIoInsertParams
import com.llama.llamastack.models.VectorIoQueryParams

class VectorIoServiceImpl
internal constructor(
    private val clientOptions: ClientOptions,
) : VectorIoService {

    private val errorHandler: Handler<LlamaStackClientError> =
        errorHandler(clientOptions.jsonMapper)

    private val insertHandler: Handler<Void?> = emptyHandler().withErrorHandler(errorHandler)

    override fun insert(params: VectorIoInsertParams, requestOptions: RequestOptions) {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "vector-io", "insert")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        response.use { insertHandler.handle(it) }
    }

    private val queryHandler: Handler<QueryChunksResponse> =
        jsonHandler<QueryChunksResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    override fun query(
        params: VectorIoQueryParams,
        requestOptions: RequestOptions
    ): QueryChunksResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "vector-io", "query")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { queryHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }
}
