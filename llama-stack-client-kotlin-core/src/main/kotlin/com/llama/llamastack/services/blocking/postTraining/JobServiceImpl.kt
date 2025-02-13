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
import com.llama.llamastack.core.prepare
import com.llama.llamastack.errors.LlamaStackClientError
import com.llama.llamastack.models.DataEnvelope
import com.llama.llamastack.models.ListPostTrainingJobsResponse
import com.llama.llamastack.models.PostTrainingJobArtifactsParams
import com.llama.llamastack.models.PostTrainingJobArtifactsResponse
import com.llama.llamastack.models.PostTrainingJobCancelParams
import com.llama.llamastack.models.PostTrainingJobListParams
import com.llama.llamastack.models.PostTrainingJobStatusParams
import com.llama.llamastack.models.PostTrainingJobStatusResponse

class JobServiceImpl
internal constructor(
    private val clientOptions: ClientOptions,
) : JobService {

    private val errorHandler: Handler<LlamaStackClientError> =
        errorHandler(clientOptions.jsonMapper)

    private val listHandler: Handler<DataEnvelope<List<ListPostTrainingJobsResponse.Data>>> =
        jsonHandler<DataEnvelope<List<ListPostTrainingJobsResponse.Data>>>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    override fun list(
        params: PostTrainingJobListParams,
        requestOptions: RequestOptions
    ): List<ListPostTrainingJobsResponse.Data> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("v1", "post-training", "jobs")
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
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

    override fun artifacts(
        params: PostTrainingJobArtifactsParams,
        requestOptions: RequestOptions
    ): PostTrainingJobArtifactsResponse? {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("v1", "post-training", "job", "artifacts")
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { artifactsHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it?.validate()
                }
            }
    }

    private val cancelHandler: Handler<Void?> = emptyHandler().withErrorHandler(errorHandler)

    override fun cancel(params: PostTrainingJobCancelParams, requestOptions: RequestOptions) {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "post-training", "job", "cancel")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        response.use { cancelHandler.handle(it) }
    }

    private val statusHandler: Handler<PostTrainingJobStatusResponse?> =
        jsonHandler<PostTrainingJobStatusResponse?>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    override fun status(
        params: PostTrainingJobStatusParams,
        requestOptions: RequestOptions
    ): PostTrainingJobStatusResponse? {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("v1", "post-training", "job", "status")
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { statusHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it?.validate()
                }
            }
    }
}
