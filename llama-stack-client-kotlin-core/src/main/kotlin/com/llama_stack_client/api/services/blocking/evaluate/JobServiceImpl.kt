// File generated from our OpenAPI spec by Stainless.

package com.llama_stack_client.api.services.blocking.evaluate

import com.llama_stack_client.api.core.ClientOptions
import com.llama_stack_client.api.core.RequestOptions
import com.llama_stack_client.api.core.http.HttpMethod
import com.llama_stack_client.api.core.http.HttpRequest
import com.llama_stack_client.api.core.http.HttpResponse.Handler
import com.llama_stack_client.api.errors.LlamaStackClientError
import com.llama_stack_client.api.models.EvaluateJobCancelParams
import com.llama_stack_client.api.models.EvaluateJobListParams
import com.llama_stack_client.api.models.EvaluationJob
import com.llama_stack_client.api.services.blocking.evaluate.jobs.ArtifactService
import com.llama_stack_client.api.services.blocking.evaluate.jobs.ArtifactServiceImpl
import com.llama_stack_client.api.services.blocking.evaluate.jobs.LogService
import com.llama_stack_client.api.services.blocking.evaluate.jobs.LogServiceImpl
import com.llama_stack_client.api.services.blocking.evaluate.jobs.StatusService
import com.llama_stack_client.api.services.blocking.evaluate.jobs.StatusServiceImpl
import com.llama_stack_client.api.services.emptyHandler
import com.llama_stack_client.api.services.errorHandler
import com.llama_stack_client.api.services.json
import com.llama_stack_client.api.services.jsonHandler
import com.llama_stack_client.api.services.withErrorHandler

class JobServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : JobService {

    private val errorHandler: Handler<LlamaStackClientError> =
        errorHandler(clientOptions.jsonMapper)

    private val artifacts: ArtifactService by lazy { ArtifactServiceImpl(clientOptions) }

    private val logs: LogService by lazy { LogServiceImpl(clientOptions) }

    private val status: StatusService by lazy { StatusServiceImpl(clientOptions) }

    override fun artifacts(): ArtifactService = artifacts

    override fun logs(): LogService = logs

    override fun status(): StatusService = status

    private val listHandler: Handler<EvaluationJob> =
        jsonHandler<EvaluationJob>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    override fun list(
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
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
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

    override fun cancel(params: EvaluateJobCancelParams, requestOptions: RequestOptions) {
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
        clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response.use { cancelHandler.handle(it) }
        }
    }
}
