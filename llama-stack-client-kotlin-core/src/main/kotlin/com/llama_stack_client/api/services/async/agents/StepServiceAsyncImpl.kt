// File generated from our OpenAPI spec by Stainless.

package com.llama_stack_client.api.services.async.agents

import com.llama_stack_client.api.core.ClientOptions
import com.llama_stack_client.api.core.RequestOptions
import com.llama_stack_client.api.core.http.HttpMethod
import com.llama_stack_client.api.core.http.HttpRequest
import com.llama_stack_client.api.core.http.HttpResponse.Handler
import com.llama_stack_client.api.errors.LlamaStackClientError
import com.llama_stack_client.api.models.AgentStepRetrieveParams
import com.llama_stack_client.api.models.AgentsStep
import com.llama_stack_client.api.services.errorHandler
import com.llama_stack_client.api.services.jsonHandler
import com.llama_stack_client.api.services.withErrorHandler

class StepServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : StepServiceAsync {

    private val errorHandler: Handler<LlamaStackClientError> =
        errorHandler(clientOptions.jsonMapper)

    private val retrieveHandler: Handler<AgentsStep> =
        jsonHandler<AgentsStep>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    override suspend fun retrieve(
        params: AgentStepRetrieveParams,
        requestOptions: RequestOptions
    ): AgentsStep {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("agents", "step", "get")
                .putAllQueryParams(clientOptions.queryParams)
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).let { response ->
            response
                .use { retrieveHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }
}
