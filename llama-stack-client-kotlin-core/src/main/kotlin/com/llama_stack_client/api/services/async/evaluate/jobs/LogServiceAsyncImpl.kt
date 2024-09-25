// File generated from our OpenAPI spec by Stainless.

package com.llama_stack_client.api.services.async.evaluate.jobs

import com.llama_stack_client.api.core.ClientOptions
import com.llama_stack_client.api.core.RequestOptions
import com.llama_stack_client.api.core.http.HttpMethod
import com.llama_stack_client.api.core.http.HttpRequest
import com.llama_stack_client.api.core.http.HttpResponse.Handler
import com.llama_stack_client.api.errors.LlamaStackClientError
import com.llama_stack_client.api.models.EvaluateJobLogListParams
import com.llama_stack_client.api.models.EvaluationJobLogStream
import com.llama_stack_client.api.services.errorHandler
import com.llama_stack_client.api.services.jsonHandler
import com.llama_stack_client.api.services.withErrorHandler

class LogServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : LogServiceAsync {

    private val errorHandler: Handler<LlamaStackClientError> =
        errorHandler(clientOptions.jsonMapper)

    private val listHandler: Handler<EvaluationJobLogStream> =
        jsonHandler<EvaluationJobLogStream>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    override suspend fun list(
        params: EvaluateJobLogListParams,
        requestOptions: RequestOptions
    ): EvaluationJobLogStream {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("evaluate", "job", "logs")
                .putAllQueryParams(clientOptions.queryParams)
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).let { response ->
            response
                .use { listHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }
}
