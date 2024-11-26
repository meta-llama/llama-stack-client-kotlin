// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.blocking

import com.llama.llamastack.core.ClientOptions
import com.llama.llamastack.core.RequestOptions
import com.llama.llamastack.core.handlers.errorHandler
import com.llama.llamastack.core.handlers.jsonHandler
import com.llama.llamastack.core.handlers.withErrorHandler
import com.llama.llamastack.core.http.HttpMethod
import com.llama.llamastack.core.http.HttpRequest
import com.llama.llamastack.core.http.HttpResponse.Handler
import com.llama.llamastack.core.json
import com.llama.llamastack.errors.LlamaStackClientError
import com.llama.llamastack.models.PostTrainingJob
import com.llama.llamastack.models.PostTrainingPreferenceOptimizeParams
import com.llama.llamastack.models.PostTrainingSupervisedFineTuneParams
import com.llama.llamastack.services.blocking.postTraining.JobService
import com.llama.llamastack.services.blocking.postTraining.JobServiceImpl

class PostTrainingServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : PostTrainingService {

    private val errorHandler: Handler<LlamaStackClientError> =
        errorHandler(clientOptions.jsonMapper)

    private val job: JobService by lazy { JobServiceImpl(clientOptions) }

    override fun job(): JobService = job

    private val preferenceOptimizeHandler: Handler<PostTrainingJob> =
        jsonHandler<PostTrainingJob>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    override fun preferenceOptimize(
        params: PostTrainingPreferenceOptimizeParams,
        requestOptions: RequestOptions
    ): PostTrainingJob {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("alpha", "post-training", "preference-optimize")
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .replaceAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { preferenceOptimizeHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val supervisedFineTuneHandler: Handler<PostTrainingJob> =
        jsonHandler<PostTrainingJob>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    override fun supervisedFineTune(
        params: PostTrainingSupervisedFineTuneParams,
        requestOptions: RequestOptions
    ): PostTrainingJob {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("alpha", "post-training", "supervised-fine-tune")
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .replaceAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { supervisedFineTuneHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }
}
