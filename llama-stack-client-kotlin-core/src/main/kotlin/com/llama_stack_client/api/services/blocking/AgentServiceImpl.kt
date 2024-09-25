// File generated from our OpenAPI spec by Stainless.

package com.llama_stack_client.api.services.blocking

import com.llama_stack_client.api.core.ClientOptions
import com.llama_stack_client.api.core.RequestOptions
import com.llama_stack_client.api.core.http.HttpMethod
import com.llama_stack_client.api.core.http.HttpRequest
import com.llama_stack_client.api.core.http.HttpResponse.Handler
import com.llama_stack_client.api.errors.LlamaStackClientError
import com.llama_stack_client.api.models.AgentCreateParams
import com.llama_stack_client.api.models.AgentCreateResponse
import com.llama_stack_client.api.models.AgentDeleteParams
import com.llama_stack_client.api.services.blocking.agents.SessionService
import com.llama_stack_client.api.services.blocking.agents.SessionServiceImpl
import com.llama_stack_client.api.services.blocking.agents.StepService
import com.llama_stack_client.api.services.blocking.agents.StepServiceImpl
import com.llama_stack_client.api.services.blocking.agents.TurnService
import com.llama_stack_client.api.services.blocking.agents.TurnServiceImpl
import com.llama_stack_client.api.services.emptyHandler
import com.llama_stack_client.api.services.errorHandler
import com.llama_stack_client.api.services.json
import com.llama_stack_client.api.services.jsonHandler
import com.llama_stack_client.api.services.withErrorHandler

class AgentServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : AgentService {

    private val errorHandler: Handler<LlamaStackClientError> =
        errorHandler(clientOptions.jsonMapper)

    private val sessions: SessionService by lazy { SessionServiceImpl(clientOptions) }

    private val steps: StepService by lazy { StepServiceImpl(clientOptions) }

    private val turns: TurnService by lazy { TurnServiceImpl(clientOptions) }

    override fun sessions(): SessionService = sessions

    override fun steps(): StepService = steps

    override fun turns(): TurnService = turns

    private val createHandler: Handler<AgentCreateResponse> =
        jsonHandler<AgentCreateResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    override fun create(
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
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
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

    override fun delete(params: AgentDeleteParams, requestOptions: RequestOptions) {
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
        clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response.use { deleteHandler.handle(it) }
        }
    }
}
