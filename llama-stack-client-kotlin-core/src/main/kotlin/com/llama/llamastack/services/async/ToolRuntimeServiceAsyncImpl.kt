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
import com.llama.llamastack.core.json
import com.llama.llamastack.errors.LlamaStackClientError
import com.llama.llamastack.models.ToolDef
import com.llama.llamastack.models.ToolInvocationResult
import com.llama.llamastack.models.ToolRuntimeInvokeToolParams
import com.llama.llamastack.models.ToolRuntimeListToolsParams
import com.llama.llamastack.services.async.toolRuntime.RagToolServiceAsync
import com.llama.llamastack.services.async.toolRuntime.RagToolServiceAsyncImpl

class ToolRuntimeServiceAsyncImpl
internal constructor(
    private val clientOptions: ClientOptions,
) : ToolRuntimeServiceAsync {

    private val errorHandler: Handler<LlamaStackClientError> =
        errorHandler(clientOptions.jsonMapper)

    private val ragTool: RagToolServiceAsync by lazy { RagToolServiceAsyncImpl(clientOptions) }

    override fun ragTool(): RagToolServiceAsync = ragTool

    private val invokeToolHandler: Handler<ToolInvocationResult> =
        jsonHandler<ToolInvocationResult>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Run a tool with the given arguments */
    override suspend fun invokeTool(
        params: ToolRuntimeInvokeToolParams,
        requestOptions: RequestOptions
    ): ToolInvocationResult {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "tool-runtime", "invoke")
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .replaceAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).let { response ->
            response
                .use { invokeToolHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val listToolsHandler: Handler<ToolDef> =
        jsonHandler<ToolDef>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    override suspend fun listTools(
        params: ToolRuntimeListToolsParams,
        requestOptions: RequestOptions
    ): ToolDef {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("v1", "tool-runtime", "list-tools")
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .replaceAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).let { response ->
            response
                .use { listToolsHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }
}
