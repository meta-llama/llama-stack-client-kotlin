// File generated from our OpenAPI spec by Stainless.

package com.llama_stack_client.api.services.blocking.evaluate.jobs

import com.llama_stack_client.api.core.ClientOptions
import com.llama_stack_client.api.core.RequestOptions
import com.llama_stack_client.api.core.http.HttpMethod
import com.llama_stack_client.api.core.http.HttpRequest
import com.llama_stack_client.api.core.http.HttpResponse.Handler
import com.llama_stack_client.api.errors.LlamaStackClientError
import com.llama_stack_client.api.models.EvaluateJobStatusListParams
import com.llama_stack_client.api.models.EvaluationJobStatus
import com.llama_stack_client.api.services.errorHandler
import com.llama_stack_client.api.services.jsonHandler
import com.llama_stack_client.api.services.withErrorHandler

class StatusServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : StatusService {

    private val errorHandler: Handler<LlamaStackClientError> =
        errorHandler(clientOptions.jsonMapper)

    private val listHandler: Handler<EvaluationJobStatus> =
        jsonHandler<EvaluationJobStatus>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    override fun list(
        params: EvaluateJobStatusListParams,
        requestOptions: RequestOptions
    ): EvaluationJobStatus {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("evaluate", "job", "status")
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
}
