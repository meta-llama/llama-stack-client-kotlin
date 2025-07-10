// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.blocking

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
import com.llama.llamastack.core.prepare
import com.llama.llamastack.models.DataEnvelope
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

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ToolRuntimeService =
        ToolRuntimeServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun ragTool(): RagToolService = ragTool

    override fun invokeTool(
        params: ToolRuntimeInvokeToolParams,
        requestOptions: RequestOptions,
    ): ToolInvocationResult =
        // post /v1/tool-runtime/invoke
        withRawResponse().invokeTool(params, requestOptions).parse()

    override fun listTools(
        params: ToolRuntimeListToolsParams,
        requestOptions: RequestOptions,
    ): List<ToolDef> =
        // get /v1/tool-runtime/list-tools
        withRawResponse().listTools(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ToolRuntimeService.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val ragTool: RagToolService.WithRawResponse by lazy {
            RagToolServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): ToolRuntimeService.WithRawResponse =
            ToolRuntimeServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

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
                    .baseUrl(clientOptions.baseUrl())
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

        private val listToolsHandler: Handler<DataEnvelope<List<ToolDef>>> =
            jsonHandler<DataEnvelope<List<ToolDef>>>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun listTools(
            params: ToolRuntimeListToolsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<ToolDef>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "tool-runtime", "list-tools")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
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
