// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.async

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
import com.llama.llamastack.core.prepareAsync
import com.llama.llamastack.errors.LlamaStackClientError
import com.llama.llamastack.models.EvalEvaluateRowsAlphaParams
import com.llama.llamastack.models.EvalEvaluateRowsParams
import com.llama.llamastack.models.EvalRunEvalAlphaParams
import com.llama.llamastack.models.EvalRunEvalParams
import com.llama.llamastack.models.EvaluateResponse
import com.llama.llamastack.models.Job
import com.llama.llamastack.services.async.eval.JobServiceAsync
import com.llama.llamastack.services.async.eval.JobServiceAsyncImpl

class EvalServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    EvalServiceAsync {

    private val withRawResponse: EvalServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val jobs: JobServiceAsync by lazy { JobServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): EvalServiceAsync.WithRawResponse = withRawResponse

    override fun jobs(): JobServiceAsync = jobs

    override suspend fun evaluateRows(
        params: EvalEvaluateRowsParams,
        requestOptions: RequestOptions,
    ): EvaluateResponse =
        // post /v1/eval/benchmarks/{benchmark_id}/evaluations
        withRawResponse().evaluateRows(params, requestOptions).parse()

    override suspend fun evaluateRowsAlpha(
        params: EvalEvaluateRowsAlphaParams,
        requestOptions: RequestOptions,
    ): EvaluateResponse =
        // post /v1/eval/benchmarks/{benchmark_id}/evaluations
        withRawResponse().evaluateRowsAlpha(params, requestOptions).parse()

    override suspend fun runEval(params: EvalRunEvalParams, requestOptions: RequestOptions): Job =
        // post /v1/eval/benchmarks/{benchmark_id}/jobs
        withRawResponse().runEval(params, requestOptions).parse()

    override suspend fun runEvalAlpha(
        params: EvalRunEvalAlphaParams,
        requestOptions: RequestOptions,
    ): Job =
        // post /v1/eval/benchmarks/{benchmark_id}/jobs
        withRawResponse().runEvalAlpha(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        EvalServiceAsync.WithRawResponse {

        private val errorHandler: Handler<LlamaStackClientError> =
            errorHandler(clientOptions.jsonMapper)

        private val jobs: JobServiceAsync.WithRawResponse by lazy {
            JobServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun jobs(): JobServiceAsync.WithRawResponse = jobs

        private val evaluateRowsHandler: Handler<EvaluateResponse> =
            jsonHandler<EvaluateResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override suspend fun evaluateRows(
            params: EvalEvaluateRowsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EvaluateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments(
                        "v1",
                        "eval",
                        "benchmarks",
                        params.getPathParam(0),
                        "evaluations",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
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

        override suspend fun evaluateRowsAlpha(
            params: EvalEvaluateRowsAlphaParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EvaluateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments(
                        "v1",
                        "eval",
                        "benchmarks",
                        params.getPathParam(0),
                        "evaluations",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
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

        override suspend fun runEval(
            params: EvalRunEvalParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Job> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("v1", "eval", "benchmarks", params.getPathParam(0), "jobs")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
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

        override suspend fun runEvalAlpha(
            params: EvalRunEvalAlphaParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Job> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("v1", "eval", "benchmarks", params.getPathParam(0), "jobs")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
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
