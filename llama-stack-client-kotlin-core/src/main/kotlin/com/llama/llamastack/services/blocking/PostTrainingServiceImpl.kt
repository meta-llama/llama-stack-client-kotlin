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
import com.llama.llamastack.core.http.HttpResponseFor
import com.llama.llamastack.core.http.json
import com.llama.llamastack.core.http.parseable
import com.llama.llamastack.core.prepare
import com.llama.llamastack.errors.LlamaStackClientError
import com.llama.llamastack.models.PostTrainingJob
import com.llama.llamastack.models.PostTrainingPreferenceOptimizeParams
import com.llama.llamastack.models.PostTrainingSupervisedFineTuneParams
import com.llama.llamastack.services.blocking.postTraining.JobService
import com.llama.llamastack.services.blocking.postTraining.JobServiceImpl

class PostTrainingServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    PostTrainingService {

    private val withRawResponse: PostTrainingService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val job: JobService by lazy { JobServiceImpl(clientOptions) }

    override fun withRawResponse(): PostTrainingService.WithRawResponse = withRawResponse

    override fun job(): JobService = job

    override fun preferenceOptimize(
        params: PostTrainingPreferenceOptimizeParams,
        requestOptions: RequestOptions,
    ): PostTrainingJob =
        // post /v1/post-training/preference-optimize
        withRawResponse().preferenceOptimize(params, requestOptions).parse()

    override fun supervisedFineTune(
        params: PostTrainingSupervisedFineTuneParams,
        requestOptions: RequestOptions,
    ): PostTrainingJob =
        // post /v1/post-training/supervised-fine-tune
        withRawResponse().supervisedFineTune(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PostTrainingService.WithRawResponse {

        private val errorHandler: Handler<LlamaStackClientError> =
            errorHandler(clientOptions.jsonMapper)

        private val job: JobService.WithRawResponse by lazy {
            JobServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun job(): JobService.WithRawResponse = job

        private val preferenceOptimizeHandler: Handler<PostTrainingJob> =
            jsonHandler<PostTrainingJob>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun preferenceOptimize(
            params: PostTrainingPreferenceOptimizeParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PostTrainingJob> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("v1", "post-training", "preference-optimize")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { preferenceOptimizeHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val supervisedFineTuneHandler: Handler<PostTrainingJob> =
            jsonHandler<PostTrainingJob>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun supervisedFineTune(
            params: PostTrainingSupervisedFineTuneParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PostTrainingJob> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("v1", "post-training", "supervised-fine-tune")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { supervisedFineTuneHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
