// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.blocking

import com.llama.llamastack.core.ClientOptions
import com.llama.llamastack.core.RequestOptions
import com.llama.llamastack.core.handlers.errorHandler
import com.llama.llamastack.core.handlers.jsonHandler
import com.llama.llamastack.core.handlers.withErrorHandler
import com.llama.llamastack.core.http.HttpMethod
import com.llama.llamastack.core.http.HttpRequest
import com.llama.llamastack.core.http.HttpResponse.Handler
import com.llama.llamastack.core.http.HttpResponseFor
import com.llama.llamastack.core.http.parseable
import com.llama.llamastack.core.prepare
import com.llama.llamastack.errors.LlamaStackClientError
import com.llama.llamastack.models.DataEnvelope
import com.llama.llamastack.models.Tool
import com.llama.llamastack.models.ToolGetParams
import com.llama.llamastack.models.ToolListParams

class ToolServiceImpl internal constructor(private val clientOptions: ClientOptions) : ToolService {

    private val withRawResponse: ToolService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ToolService.WithRawResponse = withRawResponse

    override fun list(params: ToolListParams, requestOptions: RequestOptions): List<Tool> =
        // get /v1/tools
        withRawResponse().list(params, requestOptions).parse()

    override fun get(params: ToolGetParams, requestOptions: RequestOptions): Tool =
        // get /v1/tools/{tool_name}
        withRawResponse().get(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ToolService.WithRawResponse {

        private val errorHandler: Handler<LlamaStackClientError> =
            errorHandler(clientOptions.jsonMapper)

        private val listHandler: Handler<DataEnvelope<List<Tool>>> =
            jsonHandler<DataEnvelope<List<Tool>>>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: ToolListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<Tool>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("v1", "tools")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .data()
            }
        }

        private val getHandler: Handler<Tool> =
            jsonHandler<Tool>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun get(
            params: ToolGetParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Tool> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("v1", "tools", params.getPathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { getHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
