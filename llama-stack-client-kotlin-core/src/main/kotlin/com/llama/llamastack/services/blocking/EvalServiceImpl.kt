// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.blocking

import com.llama.llamastack.core.ClientOptions
import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.core.RequestOptions
import com.llama.llamastack.core.checkRequired
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
import com.llama.llamastack.models.EvalEvaluateRowsAlphaParams
import com.llama.llamastack.models.EvalEvaluateRowsParams
import com.llama.llamastack.models.EvalRunEvalAlphaParams
import com.llama.llamastack.models.EvalRunEvalParams
import com.llama.llamastack.models.EvaluateResponse
import com.llama.llamastack.models.Job
import com.llama.llamastack.services.blocking.eval.JobService
import com.llama.llamastack.services.blocking.eval.JobServiceImpl

class EvalServiceImpl internal constructor(private val clientOptions: ClientOptions) : EvalService {

    private val withRawResponse: EvalService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val jobs: JobService by lazy { JobServiceImpl(clientOptions) }

    override fun withRawResponse(): EvalService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): EvalService =
        EvalServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun jobs(): JobService = jobs

    override fun evaluateRows(
        params: EvalEvaluateRowsParams,
        requestOptions: RequestOptions,
    ): EvaluateResponse =
        // post /v1/eval/benchmarks/{benchmark_id}/evaluations
        withRawResponse().evaluateRows(params, requestOptions).parse()

    override fun evaluateRowsAlpha(
        params: EvalEvaluateRowsAlphaParams,
        requestOptions: RequestOptions,
    ): EvaluateResponse =
        // post /v1/eval/benchmarks/{benchmark_id}/evaluations
        withRawResponse().evaluateRowsAlpha(params, requestOptions).parse()

    override fun runEval(params: EvalRunEvalParams, requestOptions: RequestOptions): Job =
        // post /v1/eval/benchmarks/{benchmark_id}/jobs
        withRawResponse().runEval(params, requestOptions).parse()

    override fun runEvalAlpha(params: EvalRunEvalAlphaParams, requestOptions: RequestOptions): Job =
        // post /v1/eval/benchmarks/{benchmark_id}/jobs
        withRawResponse().runEvalAlpha(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        EvalService.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val jobs: JobService.WithRawResponse by lazy {
            JobServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): EvalService.WithRawResponse =
            EvalServiceImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier).build())

        override fun jobs(): JobService.WithRawResponse = jobs

        private val evaluateRowsHandler: Handler<EvaluateResponse> =
            jsonHandler<EvaluateResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun evaluateRows(
            params: EvalEvaluateRowsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EvaluateResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("benchmarkId", params.benchmarkId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "v1",
                        "eval",
                        "benchmarks",
                        params._pathParam(0),
                        "evaluations",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { evaluateRowsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val evaluateRowsAlphaHandler: Handler<EvaluateResponse> =
            jsonHandler<EvaluateResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun evaluateRowsAlpha(
            params: EvalEvaluateRowsAlphaParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EvaluateResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("benchmarkId", params.benchmarkId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "v1",
                        "eval",
                        "benchmarks",
                        params._pathParam(0),
                        "evaluations",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { evaluateRowsAlphaHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val runEvalHandler: Handler<Job> =
            jsonHandler<Job>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun runEval(
            params: EvalRunEvalParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Job> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("benchmarkId", params.benchmarkId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "eval", "benchmarks", params._pathParam(0), "jobs")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { runEvalHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val runEvalAlphaHandler: Handler<Job> =
            jsonHandler<Job>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun runEvalAlpha(
            params: EvalRunEvalAlphaParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Job> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("benchmarkId", params.benchmarkId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "eval", "benchmarks", params._pathParam(0), "jobs")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { runEvalAlphaHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
