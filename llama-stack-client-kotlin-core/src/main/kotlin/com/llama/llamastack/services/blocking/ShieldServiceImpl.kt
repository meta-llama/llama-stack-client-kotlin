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
import com.llama.llamastack.core.http.json
import com.llama.llamastack.core.http.parseable
import com.llama.llamastack.core.prepare
import com.llama.llamastack.errors.LlamaStackClientError
import com.llama.llamastack.models.DataEnvelope
import com.llama.llamastack.models.Shield
import com.llama.llamastack.models.ShieldListParams
import com.llama.llamastack.models.ShieldRegisterParams
import com.llama.llamastack.models.ShieldRetrieveParams

class ShieldServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ShieldService {

    private val withRawResponse: ShieldService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ShieldService.WithRawResponse = withRawResponse

    override fun retrieve(params: ShieldRetrieveParams, requestOptions: RequestOptions): Shield? =
        // get /v1/shields/{identifier}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(params: ShieldListParams, requestOptions: RequestOptions): List<Shield> =
        // get /v1/shields
        withRawResponse().list(params, requestOptions).parse()

    override fun register(params: ShieldRegisterParams, requestOptions: RequestOptions): Shield =
        // post /v1/shields
        withRawResponse().register(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ShieldService.WithRawResponse {

        private val errorHandler: Handler<LlamaStackClientError> =
            errorHandler(clientOptions.jsonMapper)

        private val retrieveHandler: Handler<Shield?> =
            jsonHandler<Shield?>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun retrieve(
            params: ShieldRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Shield?> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("v1", "shields", params.getPathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it?.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<DataEnvelope<List<Shield>>> =
            jsonHandler<DataEnvelope<List<Shield>>>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: ShieldListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<Shield>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("v1", "shields")
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

        private val registerHandler: Handler<Shield> =
            jsonHandler<Shield>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun register(
            params: ShieldRegisterParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Shield> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("v1", "shields")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { registerHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
