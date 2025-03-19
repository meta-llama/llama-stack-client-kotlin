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
import com.llama.llamastack.models.ScoringFn
import com.llama.llamastack.models.ScoringFunctionListParams
import com.llama.llamastack.models.ScoringFunctionRegisterParams
import com.llama.llamastack.models.ScoringFunctionRetrieveParams

class ScoringFunctionServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : ScoringFunctionServiceAsync {

    private val withRawResponse: ScoringFunctionServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ScoringFunctionServiceAsync.WithRawResponse = withRawResponse

    override suspend fun retrieve(
        params: ScoringFunctionRetrieveParams,
        requestOptions: RequestOptions,
    ): ScoringFn? =
        // get /v1/scoring-functions/{scoring_fn_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override suspend fun list(
        params: ScoringFunctionListParams,
        requestOptions: RequestOptions,
    ): List<ScoringFn> =
        // get /v1/scoring-functions
        withRawResponse().list(params, requestOptions).parse()

    override suspend fun register(
        params: ScoringFunctionRegisterParams,
        requestOptions: RequestOptions,
    ) {
        // post /v1/scoring-functions
        withRawResponse().register(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ScoringFunctionServiceAsync.WithRawResponse {

        private val errorHandler: Handler<LlamaStackClientError> =
            errorHandler(clientOptions.jsonMapper)

        private val retrieveHandler: Handler<ScoringFn?> =
            jsonHandler<ScoringFn?>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override suspend fun retrieve(
            params: ScoringFunctionRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ScoringFn?> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("v1", "scoring-functions", params.getPathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
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

        private val listHandler: Handler<DataEnvelope<List<ScoringFn>>> =
            jsonHandler<DataEnvelope<List<ScoringFn>>>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun list(
            params: ScoringFunctionListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<ScoringFn>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("v1", "scoring-functions")
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

        private val registerHandler: Handler<Void?> = emptyHandler().withErrorHandler(errorHandler)

        override suspend fun register(
            params: ScoringFunctionRegisterParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("v1", "scoring-functions")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable { response.use { registerHandler.handle(it) } }
        }
    }
}
