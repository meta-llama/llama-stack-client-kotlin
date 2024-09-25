// File generated from our OpenAPI spec by Stainless.

package com.llama_stack_client.api.services.async.evaluate

import com.llama_stack_client.api.core.ClientOptions
import com.llama_stack_client.api.core.RequestOptions
import com.llama_stack_client.api.core.http.HttpMethod
import com.llama_stack_client.api.core.http.HttpRequest
import com.llama_stack_client.api.core.http.HttpResponse.Handler
import com.llama_stack_client.api.errors.LlamaStackClientError
import com.llama_stack_client.api.models.EvaluateQuestionAnsweringCreateParams
import com.llama_stack_client.api.models.EvaluationJob
import com.llama_stack_client.api.services.errorHandler
import com.llama_stack_client.api.services.json
import com.llama_stack_client.api.services.jsonHandler
import com.llama_stack_client.api.services.withErrorHandler

class QuestionAnsweringServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : QuestionAnsweringServiceAsync {

    private val errorHandler: Handler<LlamaStackClientError> =
        errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<EvaluationJob> =
        jsonHandler<EvaluationJob>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    override suspend fun create(
        params: EvaluateQuestionAnsweringCreateParams,
        requestOptions: RequestOptions
    ): EvaluationJob {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("evaluate", "question_answering", "")
                .putAllQueryParams(clientOptions.queryParams)
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).let { response ->
            response
                .use { createHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }
}
