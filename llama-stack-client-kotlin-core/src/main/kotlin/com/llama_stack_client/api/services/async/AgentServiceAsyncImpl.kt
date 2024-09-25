// File generated from our OpenAPI spec by Stainless.

package com.llama_stack_client.api.services.async

import com.llama_stack_client.api.core.ClientOptions
import com.llama_stack_client.api.core.RequestOptions
import com.llama_stack_client.api.core.http.HttpMethod
import com.llama_stack_client.api.core.http.HttpRequest
import com.llama_stack_client.api.core.http.HttpResponse.Handler
import com.llama_stack_client.api.errors.LlamaStackClientError
import com.llama_stack_client.api.models.AgentCreateParams
import com.llama_stack_client.api.models.AgentCreateResponse
import com.llama_stack_client.api.models.AgentDeleteParams
import com.llama_stack_client.api.services.async.agents.SessionServiceAsync
import com.llama_stack_client.api.services.async.agents.SessionServiceAsyncImpl
import com.llama_stack_client.api.services.async.agents.StepServiceAsync
import com.llama_stack_client.api.services.async.agents.StepServiceAsyncImpl
import com.llama_stack_client.api.services.async.agents.TurnServiceAsync
import com.llama_stack_client.api.services.async.agents.TurnServiceAsyncImpl
import com.llama_stack_client.api.services.emptyHandler
import com.llama_stack_client.api.services.errorHandler
import com.llama_stack_client.api.services.json
import com.llama_stack_client.api.services.jsonHandler
import com.llama_stack_client.api.services.withErrorHandler

class AgentServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : AgentServiceAsync {

    private val errorHandler: Handler<LlamaStackClientError> =
        errorHandler(clientOptions.jsonMapper)

    private val sessions: SessionServiceAsync by lazy { SessionServiceAsyncImpl(clientOptions) }

    private val steps: StepServiceAsync by lazy { StepServiceAsyncImpl(clientOptions) }

    private val turns: TurnServiceAsync by lazy { TurnServiceAsyncImpl(clientOptions) }

    override fun sessions(): SessionServiceAsync = sessions

    override fun steps(): StepServiceAsync = steps

    override fun turns(): TurnServiceAsync = turns

    private val createHandler: Handler<AgentCreateResponse> =
        jsonHandler<AgentCreateResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    override suspend fun create(
        params: AgentCreateParams,
        requestOptions: RequestOptions
    ): AgentCreateResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("agents", "create")
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

    private val deleteHandler: Handler<Void?> = emptyHandler().withErrorHandler(errorHandler)

    override suspend fun delete(params: AgentDeleteParams, requestOptions: RequestOptions) {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("agents", "delete")
                .putAllQueryParams(clientOptions.queryParams)
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).let { response ->
            response.use { deleteHandler.handle(it) }
        }
    }
}
