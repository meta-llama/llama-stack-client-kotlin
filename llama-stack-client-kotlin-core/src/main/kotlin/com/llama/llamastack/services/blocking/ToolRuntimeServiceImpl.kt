// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.blocking

import com.llama.llamastack.core.ClientOptions
import com.llama.llamastack.core.RequestOptions
import com.llama.llamastack.core.handlers.errorHandler
import com.llama.llamastack.core.handlers.jsonHandler
import com.llama.llamastack.core.handlers.jsonlHandler
import com.llama.llamastack.core.handlers.withErrorHandler
import com.llama.llamastack.core.http.HttpMethod
import com.llama.llamastack.core.http.HttpRequest
import com.llama.llamastack.core.http.HttpResponse.Handler
import com.llama.llamastack.core.http.StreamResponse
import com.llama.llamastack.core.http.map
import com.llama.llamastack.core.json
import com.llama.llamastack.errors.LlamaStackClientError
import com.llama.llamastack.models.ToolDef
import com.llama.llamastack.models.ToolInvocationResult
import com.llama.llamastack.models.ToolRuntimeInvokeToolParams
import com.llama.llamastack.models.ToolRuntimeListToolsParams

class ToolRuntimeServiceImpl
internal constructor(
    private val clientOptions: ClientOptions,
) : ToolRuntimeService {

    private val errorHandler: Handler<LlamaStackClientError> =
        errorHandler(clientOptions.jsonMapper)

    private val invokeToolHandler: Handler<ToolInvocationResult> =
        jsonHandler<ToolInvocationResult>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Run a tool with the given arguments */
    override fun invokeTool(
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
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { invokeToolHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val listToolsStreamingHandler: Handler<StreamResponse<ToolDef>> =
        jsonlHandler<ToolDef>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    override fun listToolsStreaming(
        params: ToolRuntimeListToolsParams,
        requestOptions: RequestOptions
    ): StreamResponse<ToolDef> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("v1", "tool-runtime", "list-tools")
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .replaceAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .let { listToolsStreamingHandler.handle(it) }
                .let { streamResponse ->
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        streamResponse.map { it.validate() }
                    } else {
                        streamResponse
                    }
                }
        }
    }
}
