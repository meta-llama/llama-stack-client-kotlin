// File generated from our OpenAPI spec by Stainless.

package com.llama_stack_client.api.services.blocking.postTraining

import com.llama_stack_client.api.core.ClientOptions
import com.llama_stack_client.api.core.RequestOptions
import com.llama_stack_client.api.core.http.HttpMethod
import com.llama_stack_client.api.core.http.HttpRequest
import com.llama_stack_client.api.core.http.HttpResponse.Handler
import com.llama_stack_client.api.errors.LlamaStackClientError
import com.llama_stack_client.api.models.PostTrainingJob
import com.llama_stack_client.api.models.PostTrainingJobArtifacts
import com.llama_stack_client.api.models.PostTrainingJobArtifactsParams
import com.llama_stack_client.api.models.PostTrainingJobCancelParams
import com.llama_stack_client.api.models.PostTrainingJobListParams
import com.llama_stack_client.api.models.PostTrainingJobLogStream
import com.llama_stack_client.api.models.PostTrainingJobLogsParams
import com.llama_stack_client.api.models.PostTrainingJobStatus
import com.llama_stack_client.api.models.PostTrainingJobStatusParams
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

    private val listHandler: Handler<PostTrainingJob> =
        jsonHandler<PostTrainingJob>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    override fun list(
        params: PostTrainingJobListParams,
        requestOptions: RequestOptions
    ): PostTrainingJob {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("post_training", "jobs")
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

    private val artifactsHandler: Handler<PostTrainingJobArtifacts> =
        jsonHandler<PostTrainingJobArtifacts>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    override fun artifacts(
        params: PostTrainingJobArtifactsParams,
        requestOptions: RequestOptions
    ): PostTrainingJobArtifacts {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("post_training", "job", "artifacts")
                .putAllQueryParams(clientOptions.queryParams)
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { artifactsHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val cancelHandler: Handler<Void?> = emptyHandler().withErrorHandler(errorHandler)

    override fun cancel(params: PostTrainingJobCancelParams, requestOptions: RequestOptions) {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("post_training", "job", "cancel")
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

    private val logsHandler: Handler<PostTrainingJobLogStream> =
        jsonHandler<PostTrainingJobLogStream>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    override fun logs(
        params: PostTrainingJobLogsParams,
        requestOptions: RequestOptions
    ): PostTrainingJobLogStream {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("post_training", "job", "logs")
                .putAllQueryParams(clientOptions.queryParams)
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { logsHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val statusHandler: Handler<PostTrainingJobStatus> =
        jsonHandler<PostTrainingJobStatus>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    override fun status(
        params: PostTrainingJobStatusParams,
        requestOptions: RequestOptions
    ): PostTrainingJobStatus {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("post_training", "job", "status")
                .putAllQueryParams(clientOptions.queryParams)
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { statusHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }
}
