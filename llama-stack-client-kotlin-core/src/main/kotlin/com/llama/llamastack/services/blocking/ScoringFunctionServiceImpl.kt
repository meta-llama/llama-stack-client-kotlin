// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.blocking

import com.llama.llamastack.core.ClientOptions
import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.core.RequestOptions
import com.llama.llamastack.core.checkRequired
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
import com.llama.llamastack.core.prepare
import com.llama.llamastack.models.DataEnvelope
import com.llama.llamastack.models.ScoringFn
import com.llama.llamastack.models.ScoringFunctionListParams
import com.llama.llamastack.models.ScoringFunctionRegisterParams
import com.llama.llamastack.models.ScoringFunctionRetrieveParams

class ScoringFunctionServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ScoringFunctionService {

    private val withRawResponse: ScoringFunctionService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ScoringFunctionService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ScoringFunctionService =
        ScoringFunctionServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun retrieve(
        params: ScoringFunctionRetrieveParams,
        requestOptions: RequestOptions,
    ): ScoringFn =
        // get /v1/scoring-functions/{scoring_fn_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(
        params: ScoringFunctionListParams,
        requestOptions: RequestOptions,
    ): List<ScoringFn> =
        // get /v1/scoring-functions
        withRawResponse().list(params, requestOptions).parse()

    override fun register(params: ScoringFunctionRegisterParams, requestOptions: RequestOptions) {
        // post /v1/scoring-functions
        withRawResponse().register(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ScoringFunctionService.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): ScoringFunctionService.WithRawResponse =
            ScoringFunctionServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val retrieveHandler: Handler<ScoringFn> =
            jsonHandler<ScoringFn>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun retrieve(
            params: ScoringFunctionRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ScoringFn> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("scoringFnId", params.scoringFnId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "scoring-functions", params._pathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<DataEnvelope<List<ScoringFn>>> =
            jsonHandler<DataEnvelope<List<ScoringFn>>>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: ScoringFunctionListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<ScoringFn>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "scoring-functions")
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

        private val registerHandler: Handler<Void?> = emptyHandler().withErrorHandler(errorHandler)

        override fun register(
            params: ScoringFunctionRegisterParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "scoring-functions")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable { response.use { registerHandler.handle(it) } }
        }
    }
}
