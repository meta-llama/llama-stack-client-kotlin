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
import com.llama.llamastack.models.Tool
import com.llama.llamastack.models.ToolGetParams
import com.llama.llamastack.models.ToolListParams

class ToolServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : ToolServiceAsync {

    private val errorHandler: Handler<LlamaStackClientError> =
        errorHandler(clientOptions.jsonMapper)

    private val listHandler: Handler<Tool> =
        jsonHandler<Tool>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** List tools with optional tool group */
    override suspend fun list(params: ToolListParams, requestOptions: RequestOptions): Tool {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("alpha", "tools", "list")
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
        }
    }

    private val getHandler: Handler<Tool> =
        jsonHandler<Tool>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    override suspend fun get(params: ToolGetParams, requestOptions: RequestOptions): Tool {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("alpha", "tools", "get")
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .replaceAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).let { response ->
            response
                .use { getHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }
}
