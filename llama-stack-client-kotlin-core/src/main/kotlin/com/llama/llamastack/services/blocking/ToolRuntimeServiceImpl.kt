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
import com.llama.llamastack.core.http.HttpResponseFor
import com.llama.llamastack.core.http.StreamResponse
import com.llama.llamastack.core.http.json
import com.llama.llamastack.core.http.map
import com.llama.llamastack.core.http.parseable
import com.llama.llamastack.core.prepare
import com.llama.llamastack.errors.LlamaStackClientError
import com.llama.llamastack.models.ToolDef
import com.llama.llamastack.models.ToolInvocationResult
import com.llama.llamastack.models.ToolRuntimeInvokeToolParams
import com.llama.llamastack.models.ToolRuntimeListToolsParams
import com.llama.llamastack.services.blocking.toolRuntime.RagToolService
import com.llama.llamastack.services.blocking.toolRuntime.RagToolServiceImpl

class ToolRuntimeServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ToolRuntimeService {

    private val withRawResponse: ToolRuntimeService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val ragTool: RagToolService by lazy { RagToolServiceImpl(clientOptions) }

    override fun withRawResponse(): ToolRuntimeService.WithRawResponse = withRawResponse

    override fun ragTool(): RagToolService = ragTool

    override fun invokeTool(
        params: ToolRuntimeInvokeToolParams,
        requestOptions: RequestOptions,
    ): ToolInvocationResult =
        // post /v1/tool-runtime/invoke
        withRawResponse().invokeTool(params, requestOptions).parse()

    override fun listToolsStreaming(
        params: ToolRuntimeListToolsParams,
        requestOptions: RequestOptions,
    ): StreamResponse<ToolDef> =
        // get /v1/tool-runtime/list-tools
        withRawResponse().listToolsStreaming(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ToolRuntimeService.WithRawResponse {

        private val errorHandler: Handler<LlamaStackClientError> =
            errorHandler(clientOptions.jsonMapper)

        private val ragTool: RagToolService.WithRawResponse by lazy {
            RagToolServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun ragTool(): RagToolService.WithRawResponse = ragTool

        private val invokeToolHandler: Handler<ToolInvocationResult> =
            jsonHandler<ToolInvocationResult>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun invokeTool(
            params: ToolRuntimeInvokeToolParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ToolInvocationResult> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("v1", "tool-runtime", "invoke")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
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

        private val listToolsStreamingHandler: Handler<StreamResponse<ToolDef>> =
            jsonlHandler<ToolDef>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun listToolsStreaming(
            params: ToolRuntimeListToolsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<StreamResponse<ToolDef>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("v1", "tool-runtime", "list-tools")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .let { listToolsStreamingHandler.handle(it) }
                    .let { streamResponse ->
                        if (requestOptions.responseValidation!!) {
                            streamResponse.map { it.validate() }
                        } else {
                            streamResponse
                        }
                    }
            }
        }
    }
}
