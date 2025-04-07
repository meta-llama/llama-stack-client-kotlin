// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.async

import com.llama.llamastack.core.ClientOptions
import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.core.RequestOptions
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
import com.llama.llamastack.models.DataEnvelope
import com.llama.llamastack.models.ToolDef
import com.llama.llamastack.models.ToolInvocationResult
import com.llama.llamastack.models.ToolRuntimeInvokeToolParams
import com.llama.llamastack.models.ToolRuntimeListToolsParams
import com.llama.llamastack.services.async.toolRuntime.RagToolServiceAsync
import com.llama.llamastack.services.async.toolRuntime.RagToolServiceAsyncImpl

class ToolRuntimeServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ToolRuntimeServiceAsync {

    private val withRawResponse: ToolRuntimeServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val ragTool: RagToolServiceAsync by lazy { RagToolServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): ToolRuntimeServiceAsync.WithRawResponse = withRawResponse

    override fun ragTool(): RagToolServiceAsync = ragTool

    override suspend fun invokeTool(
        params: ToolRuntimeInvokeToolParams,
        requestOptions: RequestOptions,
    ): ToolInvocationResult =
        // post /v1/tool-runtime/invoke
        withRawResponse().invokeTool(params, requestOptions).parse()

    override suspend fun listTools(
        params: ToolRuntimeListToolsParams,
        requestOptions: RequestOptions,
    ): List<ToolDef> =
        // get /v1/tool-runtime/list-tools
        withRawResponse().listTools(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ToolRuntimeServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val ragTool: RagToolServiceAsync.WithRawResponse by lazy {
            RagToolServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun ragTool(): RagToolServiceAsync.WithRawResponse = ragTool

        private val invokeToolHandler: Handler<ToolInvocationResult> =
            jsonHandler<ToolInvocationResult>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun invokeTool(
            params: ToolRuntimeInvokeToolParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ToolInvocationResult> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("v1", "tool-runtime", "invoke")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { invokeToolHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listToolsHandler: Handler<DataEnvelope<List<ToolDef>>> =
            jsonHandler<DataEnvelope<List<ToolDef>>>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun listTools(
            params: ToolRuntimeListToolsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<ToolDef>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("v1", "tool-runtime", "list-tools")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { listToolsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .data()
            }
        }
    }
}
