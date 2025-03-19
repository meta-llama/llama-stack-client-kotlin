// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.async.eval

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
import com.llama.llamastack.models.EvalJobCancelParams
import com.llama.llamastack.models.EvalJobRetrieveParams
import com.llama.llamastack.models.EvalJobStatusParams
import com.llama.llamastack.models.EvalJobStatusResponse
import com.llama.llamastack.models.EvaluateResponse

class JobServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    JobServiceAsync {

    private val withRawResponse: JobServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): JobServiceAsync.WithRawResponse = withRawResponse

    override suspend fun retrieve(
        params: EvalJobRetrieveParams,
        requestOptions: RequestOptions,
    ): EvaluateResponse =
        // get /v1/eval/benchmarks/{benchmark_id}/jobs/{job_id}/result
        withRawResponse().retrieve(params, requestOptions).parse()

    override suspend fun cancel(params: EvalJobCancelParams, requestOptions: RequestOptions) {
        // delete /v1/eval/benchmarks/{benchmark_id}/jobs/{job_id}
        withRawResponse().cancel(params, requestOptions)
    }

    override suspend fun status(
        params: EvalJobStatusParams,
        requestOptions: RequestOptions,
    ): EvalJobStatusResponse? =
        // get /v1/eval/benchmarks/{benchmark_id}/jobs/{job_id}
        withRawResponse().status(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        JobServiceAsync.WithRawResponse {

        private val errorHandler: Handler<LlamaStackClientError> =
            errorHandler(clientOptions.jsonMapper)

        private val retrieveHandler: Handler<EvaluateResponse> =
            jsonHandler<EvaluateResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override suspend fun retrieve(
            params: EvalJobRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EvaluateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments(
                        "v1",
                        "eval",
                        "benchmarks",
                        params.getPathParam(0),
                        "jobs",
                        params.getPathParam(1),
                        "result",
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
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

        private val cancelHandler: Handler<Void?> = emptyHandler().withErrorHandler(errorHandler)

        override suspend fun cancel(
            params: EvalJobCancelParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .addPathSegments(
                        "v1",
                        "eval",
                        "benchmarks",
                        params.getPathParam(0),
                        "jobs",
                        params.getPathParam(1),
                    )
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable { response.use { cancelHandler.handle(it) } }
        }

        private val statusHandler: Handler<EvalJobStatusResponse?> =
            jsonHandler<EvalJobStatusResponse?>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun status(
            params: EvalJobStatusParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EvalJobStatusResponse?> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments(
                        "v1",
                        "eval",
                        "benchmarks",
                        params.getPathParam(0),
                        "jobs",
                        params.getPathParam(1),
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable { response.use { statusHandler.handle(it) } }
        }
    }
}
