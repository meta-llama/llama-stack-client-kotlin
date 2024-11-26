// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.blocking

import com.llama.llamastack.core.ClientOptions
import com.llama.llamastack.core.RequestOptions
import com.llama.llamastack.core.handlers.emptyHandler
import com.llama.llamastack.core.handlers.errorHandler
import com.llama.llamastack.core.handlers.jsonHandler
import com.llama.llamastack.core.handlers.withErrorHandler
import com.llama.llamastack.core.http.HttpMethod
import com.llama.llamastack.core.http.HttpRequest
import com.llama.llamastack.core.http.HttpResponse.Handler
import com.llama.llamastack.core.json
import com.llama.llamastack.errors.LlamaStackClientError
import com.llama.llamastack.models.AgentCreateParams
import com.llama.llamastack.models.AgentCreateResponse
import com.llama.llamastack.models.AgentDeleteParams
import com.llama.llamastack.services.blocking.agents.SessionService
import com.llama.llamastack.services.blocking.agents.SessionServiceImpl
import com.llama.llamastack.services.blocking.agents.StepService
import com.llama.llamastack.services.blocking.agents.StepServiceImpl
import com.llama.llamastack.services.blocking.agents.TurnService
import com.llama.llamastack.services.blocking.agents.TurnServiceImpl

class AgentServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : AgentService {

    private val errorHandler: Handler<LlamaStackClientError> =
        errorHandler(clientOptions.jsonMapper)

    private val session: SessionService by lazy { SessionServiceImpl(clientOptions) }

    private val steps: StepService by lazy { StepServiceImpl(clientOptions) }

    private val turn: TurnService by lazy { TurnServiceImpl(clientOptions) }

    override fun session(): SessionService = session

    override fun steps(): StepService = steps

    override fun turn(): TurnService = turn

    private val createHandler: Handler<AgentCreateResponse> =
        jsonHandler<AgentCreateResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    override fun create(
        params: AgentCreateParams,
        requestOptions: RequestOptions
    ): AgentCreateResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("alpha", "agents", "create")
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .replaceAllHeaders(params.getHeaders())
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
                .addPathSegments("alpha", "agents", "delete")
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .replaceAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response.use { deleteHandler.handle(it) }
        }
    }
}
