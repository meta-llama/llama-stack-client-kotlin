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
import com.llama.llamastack.models.ToolGroup
import com.llama.llamastack.models.ToolgroupGetParams
import com.llama.llamastack.models.ToolgroupListParams
import com.llama.llamastack.models.ToolgroupRegisterParams
import com.llama.llamastack.models.ToolgroupUnregisterParams

class ToolgroupServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ToolgroupServiceAsync {

    private val errorHandler: Handler<LlamaStackClientError> =
        errorHandler(clientOptions.jsonMapper)

    private val listHandler: Handler<DataEnvelope<List<ToolGroup>>> =
        jsonHandler<DataEnvelope<List<ToolGroup>>>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** List tool groups with optional provider */
    override suspend fun list(
        params: ToolgroupListParams,
        requestOptions: RequestOptions,
    ): List<ToolGroup> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("v1", "toolgroups")
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

    private val getHandler: Handler<ToolGroup> =
        jsonHandler<ToolGroup>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    override suspend fun get(
        params: ToolgroupGetParams,
        requestOptions: RequestOptions,
    ): ToolGroup {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("v1", "toolgroups", params.getPathParam(0))
                .build()
                .prepareAsync(clientOptions, params)
        val response = clientOptions.httpClient.executeAsync(request, requestOptions)
        return response
            .use { getHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }

    private val registerHandler: Handler<Void?> = emptyHandler().withErrorHandler(errorHandler)

    /** Register a tool group */
    override suspend fun register(params: ToolgroupRegisterParams, requestOptions: RequestOptions) {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "toolgroups")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepareAsync(clientOptions, params)
        val response = clientOptions.httpClient.executeAsync(request, requestOptions)
        response.use { registerHandler.handle(it) }
    }

    private val unregisterHandler: Handler<Void?> = emptyHandler().withErrorHandler(errorHandler)

    /** Unregister a tool group */
    override suspend fun unregister(
        params: ToolgroupUnregisterParams,
        requestOptions: RequestOptions,
    ) {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.DELETE)
                .addPathSegments("v1", "toolgroups", params.getPathParam(0))
                .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                .build()
                .prepareAsync(clientOptions, params)
        val response = clientOptions.httpClient.executeAsync(request, requestOptions)
        response.use { unregisterHandler.handle(it) }
    }
}
