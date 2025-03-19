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
import com.llama.llamastack.core.http.HttpResponse
import com.llama.llamastack.core.http.HttpResponse.Handler
import com.llama.llamastack.core.http.HttpResponseFor
import com.llama.llamastack.core.http.json
import com.llama.llamastack.core.http.parseable
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

    private val withRawResponse: ToolgroupServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ToolgroupServiceAsync.WithRawResponse = withRawResponse

    override suspend fun list(
        params: ToolgroupListParams,
        requestOptions: RequestOptions,
    ): List<ToolGroup> =
        // get /v1/toolgroups
        withRawResponse().list(params, requestOptions).parse()

    override suspend fun get(
        params: ToolgroupGetParams,
        requestOptions: RequestOptions,
    ): ToolGroup =
        // get /v1/toolgroups/{toolgroup_id}
        withRawResponse().get(params, requestOptions).parse()

    override suspend fun register(params: ToolgroupRegisterParams, requestOptions: RequestOptions) {
        // post /v1/toolgroups
        withRawResponse().register(params, requestOptions)
    }

    override suspend fun unregister(
        params: ToolgroupUnregisterParams,
        requestOptions: RequestOptions,
    ) {
        // delete /v1/toolgroups/{toolgroup_id}
        withRawResponse().unregister(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ToolgroupServiceAsync.WithRawResponse {

        private val errorHandler: Handler<LlamaStackClientError> =
            errorHandler(clientOptions.jsonMapper)

        private val listHandler: Handler<DataEnvelope<List<ToolGroup>>> =
            jsonHandler<DataEnvelope<List<ToolGroup>>>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun list(
            params: ToolgroupListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<ToolGroup>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("v1", "toolgroups")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
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

        private val getHandler: Handler<ToolGroup> =
            jsonHandler<ToolGroup>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override suspend fun get(
            params: ToolgroupGetParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ToolGroup> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("v1", "toolgroups", params.getPathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
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

        private val registerHandler: Handler<Void?> = emptyHandler().withErrorHandler(errorHandler)

        override suspend fun register(
            params: ToolgroupRegisterParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("v1", "toolgroups")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable { response.use { registerHandler.handle(it) } }
        }

        private val unregisterHandler: Handler<Void?> =
            emptyHandler().withErrorHandler(errorHandler)

        override suspend fun unregister(
            params: ToolgroupUnregisterParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .addPathSegments("v1", "toolgroups", params.getPathParam(0))
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable { response.use { unregisterHandler.handle(it) } }
        }
    }
}
