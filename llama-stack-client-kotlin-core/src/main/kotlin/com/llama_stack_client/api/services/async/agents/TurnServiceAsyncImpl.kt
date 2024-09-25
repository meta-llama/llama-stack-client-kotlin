// File generated from our OpenAPI spec by Stainless.

package com.llama_stack_client.api.services.async.agents

import com.llama_stack_client.api.core.ClientOptions
import com.llama_stack_client.api.core.RequestOptions
import com.llama_stack_client.api.core.http.HttpMethod
import com.llama_stack_client.api.core.http.HttpRequest
import com.llama_stack_client.api.core.http.HttpResponse.Handler
import com.llama_stack_client.api.errors.LlamaStackClientError
import com.llama_stack_client.api.models.AgentTurnCreateParams
import com.llama_stack_client.api.models.AgentTurnRetrieveParams
import com.llama_stack_client.api.models.AgentsTurnStreamChunk
import com.llama_stack_client.api.models.Turn
import com.llama_stack_client.api.services.errorHandler
import com.llama_stack_client.api.services.json
import com.llama_stack_client.api.services.jsonHandler
import com.llama_stack_client.api.services.withErrorHandler

class TurnServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : TurnServiceAsync {

    private val errorHandler: Handler<LlamaStackClientError> =
        errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<AgentsTurnStreamChunk> =
        jsonHandler<AgentsTurnStreamChunk>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    override suspend fun create(
        params: AgentTurnCreateParams,
        requestOptions: RequestOptions
    ): AgentsTurnStreamChunk {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("agents", "turn", "create")
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

    private val retrieveHandler: Handler<Turn> =
        jsonHandler<Turn>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    override suspend fun retrieve(
        params: AgentTurnRetrieveParams,
        requestOptions: RequestOptions
    ): Turn {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("agents", "turn", "get")
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
