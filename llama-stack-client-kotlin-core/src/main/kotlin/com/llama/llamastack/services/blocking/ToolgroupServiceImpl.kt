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
import com.llama.llamastack.errors.LlamaStackClientError
import com.llama.llamastack.models.ToolGroup
import com.llama.llamastack.models.ToolgroupGetParams
import com.llama.llamastack.models.ToolgroupListParams
import com.llama.llamastack.models.ToolgroupRegisterParams
import com.llama.llamastack.models.ToolgroupUnregisterParams

class ToolgroupServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : ToolgroupService {

    private val errorHandler: Handler<LlamaStackClientError> =
        errorHandler(clientOptions.jsonMapper)

    private val listHandler: Handler<ToolGroup> =
        jsonHandler<ToolGroup>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** List tool groups with optional provider */
    override fun list(params: ToolgroupListParams, requestOptions: RequestOptions): ToolGroup {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("alpha", "toolgroups", "list")
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .replaceAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { listHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val getHandler: Handler<ToolGroup> =
        jsonHandler<ToolGroup>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    override fun get(params: ToolgroupGetParams, requestOptions: RequestOptions): ToolGroup {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("alpha", "toolgroups", "get")
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .replaceAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { getHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val registerHandler: Handler<Void?> = emptyHandler().withErrorHandler(errorHandler)

    /** Register a tool group */
    override fun register(params: ToolgroupRegisterParams, requestOptions: RequestOptions) {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("alpha", "toolgroups", "register")
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .replaceAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response.use { registerHandler.handle(it) }
        }
    }

    private val unregisterHandler: Handler<Void?> = emptyHandler().withErrorHandler(errorHandler)

    /** Unregister a tool group */
    override fun unregister(params: ToolgroupUnregisterParams, requestOptions: RequestOptions) {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("alpha", "toolgroups", "unregister")
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .replaceAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response.use { unregisterHandler.handle(it) }
        }
    }
}
