// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.blocking.postTraining

import com.llama.llamastack.core.ClientOptions
import com.llama.llamastack.core.RequestOptions
import com.llama.llamastack.core.handlers.emptyHandler
import com.llama.llamastack.core.handlers.errorHandler
import com.llama.llamastack.core.handlers.jsonHandler
import com.llama.llamastack.core.handlers.withErrorHandler
import com.llama.llamastack.core.http.HttpMethod
import com.llama.llamastack.core.http.HttpRequest
import com.llama.llamastack.core.http.HttpResponse.Handler
import com.llama.llamastack.core.json
import com.llama.llamastack.errors.LlamaStackClientError
import com.llama.llamastack.models.PostTrainingJob
import com.llama.llamastack.models.PostTrainingJobArtifactsParams
import com.llama.llamastack.models.PostTrainingJobArtifactsResponse
import com.llama.llamastack.models.PostTrainingJobCancelParams
import com.llama.llamastack.models.PostTrainingJobListParams
import com.llama.llamastack.models.PostTrainingJobLogsParams
import com.llama.llamastack.models.PostTrainingJobLogsResponse
import com.llama.llamastack.models.PostTrainingJobStatusParams
import com.llama.llamastack.models.PostTrainingJobStatusResponse

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
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .replaceAllHeaders(params.getHeaders())
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

    private val artifactsHandler: Handler<PostTrainingJobArtifactsResponse> =
        jsonHandler<PostTrainingJobArtifactsResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    override fun artifacts(
        params: PostTrainingJobArtifactsParams,
        requestOptions: RequestOptions
    ): PostTrainingJobArtifactsResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("post_training", "job", "artifacts")
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .replaceAllHeaders(params.getHeaders())
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
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .replaceAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response.use { cancelHandler.handle(it) }
        }
    }

    private val logsHandler: Handler<PostTrainingJobLogsResponse> =
        jsonHandler<PostTrainingJobLogsResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    override fun logs(
        params: PostTrainingJobLogsParams,
        requestOptions: RequestOptions
    ): PostTrainingJobLogsResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("post_training", "job", "logs")
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .replaceAllHeaders(params.getHeaders())
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

    private val statusHandler: Handler<PostTrainingJobStatusResponse> =
        jsonHandler<PostTrainingJobStatusResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    override fun status(
        params: PostTrainingJobStatusParams,
        requestOptions: RequestOptions
    ): PostTrainingJobStatusResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("post_training", "job", "status")
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .replaceAllHeaders(params.getHeaders())
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
