// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.blocking

import com.llama.llamastack.core.ClientOptions
import com.llama.llamastack.core.JsonValue
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
import com.llama.llamastack.core.prepare
import com.llama.llamastack.models.Benchmark
import com.llama.llamastack.models.BenchmarkListParams
import com.llama.llamastack.models.BenchmarkRegisterParams
import com.llama.llamastack.models.BenchmarkRetrieveParams
import com.llama.llamastack.models.DataEnvelope

class BenchmarkServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    BenchmarkService {

    private val withRawResponse: BenchmarkService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): BenchmarkService.WithRawResponse = withRawResponse

    override fun retrieve(
        params: BenchmarkRetrieveParams,
        requestOptions: RequestOptions,
    ): Benchmark =
        // get /v1/eval/benchmarks/{benchmark_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(
        params: BenchmarkListParams,
        requestOptions: RequestOptions,
    ): List<Benchmark> =
        // get /v1/eval/benchmarks
        withRawResponse().list(params, requestOptions).parse()

    override fun register(params: BenchmarkRegisterParams, requestOptions: RequestOptions) {
        // post /v1/eval/benchmarks
        withRawResponse().register(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        BenchmarkService.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val retrieveHandler: Handler<Benchmark> =
            jsonHandler<Benchmark>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun retrieve(
            params: BenchmarkRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Benchmark> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("v1", "eval", "benchmarks", params._pathParam(0))
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

        private val listHandler: Handler<DataEnvelope<List<Benchmark>>> =
            jsonHandler<DataEnvelope<List<Benchmark>>>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: BenchmarkListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<Benchmark>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("v1", "eval", "benchmarks")
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
            params: BenchmarkRegisterParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("v1", "eval", "benchmarks")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable { response.use { registerHandler.handle(it) } }
        }
    }
}
