// File generated from our OpenAPI spec by Stainless.

package com.llama_stack_client.api.services.async.evaluate

import com.llama_stack_client.api.core.ClientOptions
import com.llama_stack_client.api.core.RequestOptions
import com.llama_stack_client.api.core.http.HttpMethod
import com.llama_stack_client.api.core.http.HttpRequest
import com.llama_stack_client.api.core.http.HttpResponse.Handler
import com.llama_stack_client.api.errors.LlamaStackClientError
import com.llama_stack_client.api.models.EvaluateJobCancelParams
import com.llama_stack_client.api.models.EvaluateJobListParams
import com.llama_stack_client.api.models.EvaluationJob
import com.llama_stack_client.api.services.async.evaluate.jobs.ArtifactServiceAsync
import com.llama_stack_client.api.services.async.evaluate.jobs.ArtifactServiceAsyncImpl
import com.llama_stack_client.api.services.async.evaluate.jobs.LogServiceAsync
import com.llama_stack_client.api.services.async.evaluate.jobs.LogServiceAsyncImpl
import com.llama_stack_client.api.services.async.evaluate.jobs.StatusServiceAsync
import com.llama_stack_client.api.services.async.evaluate.jobs.StatusServiceAsyncImpl
import com.llama_stack_client.api.services.emptyHandler
import com.llama_stack_client.api.services.errorHandler
import com.llama_stack_client.api.services.json
import com.llama_stack_client.api.services.jsonHandler
import com.llama_stack_client.api.services.withErrorHandler

class JobServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : JobServiceAsync {

    private val errorHandler: Handler<LlamaStackClientError> =
        errorHandler(clientOptions.jsonMapper)

    private val artifacts: ArtifactServiceAsync by lazy { ArtifactServiceAsyncImpl(clientOptions) }

    private val logs: LogServiceAsync by lazy { LogServiceAsyncImpl(clientOptions) }

    private val status: StatusServiceAsync by lazy { StatusServiceAsyncImpl(clientOptions) }

    override fun artifacts(): ArtifactServiceAsync = artifacts

    override fun logs(): LogServiceAsync = logs

    override fun status(): StatusServiceAsync = status

    private val listHandler: Handler<EvaluationJob> =
        jsonHandler<EvaluationJob>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    override suspend fun list(
        params: EvaluateJobListParams,
        requestOptions: RequestOptions
    ): EvaluationJob {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("evaluate", "jobs")
                .putAllQueryParams(clientOptions.queryParams)
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).let { response ->
            response
                .use { listHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val cancelHandler: Handler<Void?> = emptyHandler().withErrorHandler(errorHandler)

    override suspend fun cancel(params: EvaluateJobCancelParams, requestOptions: RequestOptions) {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("evaluate", "job", "cancel")
                .putAllQueryParams(clientOptions.queryParams)
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).let { response ->
            response.use { cancelHandler.handle(it) }
        }
    }
}
