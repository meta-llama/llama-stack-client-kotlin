// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.blocking

import com.llama.llamastack.core.ClientOptions
import com.llama.llamastack.core.JsonValue
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
import com.llama.llamastack.models.BatchCompletion
import com.llama.llamastack.models.BatchInferenceChatCompletionParams
import com.llama.llamastack.models.BatchInferenceChatCompletionResponse
import com.llama.llamastack.models.BatchInferenceCompletionParams

class BatchInferenceServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    BatchInferenceService {

    private val withRawResponse: BatchInferenceService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): BatchInferenceService.WithRawResponse = withRawResponse

    override fun chatCompletion(
        params: BatchInferenceChatCompletionParams,
        requestOptions: RequestOptions,
    ): BatchInferenceChatCompletionResponse =
        // post /v1/batch-inference/chat-completion
        withRawResponse().chatCompletion(params, requestOptions).parse()

    override fun completion(
        params: BatchInferenceCompletionParams,
        requestOptions: RequestOptions,
    ): BatchCompletion =
        // post /v1/batch-inference/completion
        withRawResponse().completion(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        BatchInferenceService.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val chatCompletionHandler: Handler<BatchInferenceChatCompletionResponse> =
            jsonHandler<BatchInferenceChatCompletionResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun chatCompletion(
            params: BatchInferenceChatCompletionParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BatchInferenceChatCompletionResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("v1", "batch-inference", "chat-completion")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { chatCompletionHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val completionHandler: Handler<BatchCompletion> =
            jsonHandler<BatchCompletion>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun completion(
            params: BatchInferenceCompletionParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BatchCompletion> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("v1", "batch-inference", "completion")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { completionHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
