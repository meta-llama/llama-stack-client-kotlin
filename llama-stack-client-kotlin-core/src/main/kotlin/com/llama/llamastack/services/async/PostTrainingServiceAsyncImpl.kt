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
import com.llama.llamastack.core.json
import com.llama.llamastack.core.prepareAsync
import com.llama.llamastack.errors.LlamaStackClientError
import com.llama.llamastack.models.PostTrainingJob
import com.llama.llamastack.models.PostTrainingPreferenceOptimizeParams
import com.llama.llamastack.models.PostTrainingSupervisedFineTuneParams
import com.llama.llamastack.services.async.postTraining.JobServiceAsync
import com.llama.llamastack.services.async.postTraining.JobServiceAsyncImpl

class PostTrainingServiceAsyncImpl
internal constructor(
    private val clientOptions: ClientOptions,
) : PostTrainingServiceAsync {

    private val errorHandler: Handler<LlamaStackClientError> =
        errorHandler(clientOptions.jsonMapper)

    private val job: JobServiceAsync by lazy { JobServiceAsyncImpl(clientOptions) }

    override fun job(): JobServiceAsync = job

    private val preferenceOptimizeHandler: Handler<PostTrainingJob> =
        jsonHandler<PostTrainingJob>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    override suspend fun preferenceOptimize(
        params: PostTrainingPreferenceOptimizeParams,
        requestOptions: RequestOptions
    ): PostTrainingJob {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "post-training", "preference-optimize")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepareAsync(clientOptions, params)
        val response = clientOptions.httpClient.executeAsync(request, requestOptions)
        return response
            .use { preferenceOptimizeHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }

    private val supervisedFineTuneHandler: Handler<PostTrainingJob> =
        jsonHandler<PostTrainingJob>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    override suspend fun supervisedFineTune(
        params: PostTrainingSupervisedFineTuneParams,
        requestOptions: RequestOptions
    ): PostTrainingJob {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "post-training", "supervised-fine-tune")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepareAsync(clientOptions, params)
        val response = clientOptions.httpClient.executeAsync(request, requestOptions)
        return response
            .use { supervisedFineTuneHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }
}
