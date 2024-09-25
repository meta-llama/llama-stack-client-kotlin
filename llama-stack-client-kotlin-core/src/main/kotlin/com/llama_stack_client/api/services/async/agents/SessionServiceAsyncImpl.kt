// File generated from our OpenAPI spec by Stainless.

package com.llama_stack_client.api.services.async.agents

import com.llama_stack_client.api.core.ClientOptions
import com.llama_stack_client.api.core.RequestOptions
import com.llama_stack_client.api.core.http.HttpMethod
import com.llama_stack_client.api.core.http.HttpRequest
import com.llama_stack_client.api.core.http.HttpResponse.Handler
import com.llama_stack_client.api.errors.LlamaStackClientError
import com.llama_stack_client.api.models.AgentSessionCreateParams
import com.llama_stack_client.api.models.AgentSessionCreateResponse
import com.llama_stack_client.api.models.AgentSessionDeleteParams
import com.llama_stack_client.api.models.AgentSessionRetrieveParams
import com.llama_stack_client.api.models.Session
import com.llama_stack_client.api.services.emptyHandler
import com.llama_stack_client.api.services.errorHandler
import com.llama_stack_client.api.services.json
import com.llama_stack_client.api.services.jsonHandler
import com.llama_stack_client.api.services.withErrorHandler

class SessionServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : SessionServiceAsync {

    private val errorHandler: Handler<LlamaStackClientError> =
        errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<AgentSessionCreateResponse> =
        jsonHandler<AgentSessionCreateResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    override suspend fun create(
        params: AgentSessionCreateParams,
        requestOptions: RequestOptions
    ): AgentSessionCreateResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("agents", "session", "create")
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

    private val retrieveHandler: Handler<Session> =
        jsonHandler<Session>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    override suspend fun retrieve(
        params: AgentSessionRetrieveParams,
        requestOptions: RequestOptions
    ): Session {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("agents", "session", "get")
                .putAllQueryParams(clientOptions.queryParams)
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
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

    private val deleteHandler: Handler<Void?> = emptyHandler().withErrorHandler(errorHandler)

    override suspend fun delete(params: AgentSessionDeleteParams, requestOptions: RequestOptions) {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("agents", "session", "delete")
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
