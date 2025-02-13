// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.async.postTraining

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
import com.llama.llamastack.core.prepareAsync
import com.llama.llamastack.errors.LlamaStackClientError
import com.llama.llamastack.models.DataEnvelope
import com.llama.llamastack.models.ListPostTrainingJobsResponse
import com.llama.llamastack.models.PostTrainingJobArtifactsParams
import com.llama.llamastack.models.PostTrainingJobArtifactsResponse
import com.llama.llamastack.models.PostTrainingJobCancelParams
import com.llama.llamastack.models.PostTrainingJobListParams
import com.llama.llamastack.models.PostTrainingJobStatusParams
import com.llama.llamastack.models.PostTrainingJobStatusResponse

class JobServiceAsyncImpl
internal constructor(
    private val clientOptions: ClientOptions,
) : JobServiceAsync {

    private val errorHandler: Handler<LlamaStackClientError> =
        errorHandler(clientOptions.jsonMapper)

    private val listHandler: Handler<DataEnvelope<List<ListPostTrainingJobsResponse.Data>>> =
        jsonHandler<DataEnvelope<List<ListPostTrainingJobsResponse.Data>>>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    override suspend fun list(
        params: PostTrainingJobListParams,
        requestOptions: RequestOptions
    ): List<ListPostTrainingJobsResponse.Data> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("v1", "post-training", "jobs")
                .build()
                .prepareAsync(clientOptions, params)
        val response = clientOptions.httpClient.executeAsync(request, requestOptions)
        return response
            .use { listHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
            .data()
    }

    private val artifactsHandler: Handler<PostTrainingJobArtifactsResponse?> =
        jsonHandler<PostTrainingJobArtifactsResponse?>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    override suspend fun artifacts(
        params: PostTrainingJobArtifactsParams,
        requestOptions: RequestOptions
    ): PostTrainingJobArtifactsResponse? {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("v1", "post-training", "job", "artifacts")
                .build()
                .prepareAsync(clientOptions, params)
        val response = clientOptions.httpClient.executeAsync(request, requestOptions)
        return response
            .use { artifactsHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it?.validate()
                }
            }
    }

    private val cancelHandler: Handler<Void?> = emptyHandler().withErrorHandler(errorHandler)

    override suspend fun cancel(
        params: PostTrainingJobCancelParams,
        requestOptions: RequestOptions
    ) {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "post-training", "job", "cancel")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepareAsync(clientOptions, params)
        val response = clientOptions.httpClient.executeAsync(request, requestOptions)
        response.use { cancelHandler.handle(it) }
    }

    private val statusHandler: Handler<PostTrainingJobStatusResponse?> =
        jsonHandler<PostTrainingJobStatusResponse?>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    override suspend fun status(
        params: PostTrainingJobStatusParams,
        requestOptions: RequestOptions
    ): PostTrainingJobStatusResponse? {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("v1", "post-training", "job", "status")
                .build()
                .prepareAsync(clientOptions, params)
        val response = clientOptions.httpClient.executeAsync(request, requestOptions)
        return response
            .use { statusHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it?.validate()
                }
            }
    }
}
