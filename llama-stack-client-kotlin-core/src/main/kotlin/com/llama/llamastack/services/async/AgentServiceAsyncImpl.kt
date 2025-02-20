// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.async

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
import com.llama.llamastack.core.prepareAsync
import com.llama.llamastack.errors.LlamaStackClientError
import com.llama.llamastack.models.AgentCreateParams
import com.llama.llamastack.models.AgentCreateResponse
import com.llama.llamastack.models.AgentDeleteParams
import com.llama.llamastack.services.async.agents.SessionServiceAsync
import com.llama.llamastack.services.async.agents.SessionServiceAsyncImpl
import com.llama.llamastack.services.async.agents.StepServiceAsync
import com.llama.llamastack.services.async.agents.StepServiceAsyncImpl
import com.llama.llamastack.services.async.agents.TurnServiceAsync
import com.llama.llamastack.services.async.agents.TurnServiceAsyncImpl

class AgentServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    AgentServiceAsync {

    private val errorHandler: Handler<LlamaStackClientError> =
        errorHandler(clientOptions.jsonMapper)

    private val session: SessionServiceAsync by lazy { SessionServiceAsyncImpl(clientOptions) }

    private val steps: StepServiceAsync by lazy { StepServiceAsyncImpl(clientOptions) }

    private val turn: TurnServiceAsync by lazy { TurnServiceAsyncImpl(clientOptions) }

    override fun session(): SessionServiceAsync = session

    override fun steps(): StepServiceAsync = steps

    override fun turn(): TurnServiceAsync = turn

    private val createHandler: Handler<AgentCreateResponse> =
        jsonHandler<AgentCreateResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    override suspend fun create(
        params: AgentCreateParams,
        requestOptions: RequestOptions,
    ): AgentCreateResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "agents")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepareAsync(clientOptions, params)
        val response = clientOptions.httpClient.executeAsync(request, requestOptions)
        return response
            .use { createHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }

    private val deleteHandler: Handler<Void?> = emptyHandler().withErrorHandler(errorHandler)

    override suspend fun delete(params: AgentDeleteParams, requestOptions: RequestOptions) {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.DELETE)
                .addPathSegments("v1", "agents", params.getPathParam(0))
                .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                .build()
                .prepareAsync(clientOptions, params)
        val response = clientOptions.httpClient.executeAsync(request, requestOptions)
        response.use { deleteHandler.handle(it) }
    }
}
