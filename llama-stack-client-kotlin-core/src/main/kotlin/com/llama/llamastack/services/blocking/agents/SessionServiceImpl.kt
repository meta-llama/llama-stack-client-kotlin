// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.blocking.agents

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
import com.llama.llamastack.core.prepare
import com.llama.llamastack.errors.LlamaStackClientError
import com.llama.llamastack.models.AgentSessionCreateParams
import com.llama.llamastack.models.AgentSessionCreateResponse
import com.llama.llamastack.models.AgentSessionDeleteParams
import com.llama.llamastack.models.AgentSessionRetrieveParams
import com.llama.llamastack.models.Session

class SessionServiceImpl
internal constructor(
    private val clientOptions: ClientOptions,
) : SessionService {

    private val errorHandler: Handler<LlamaStackClientError> =
        errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<AgentSessionCreateResponse> =
        jsonHandler<AgentSessionCreateResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    override fun create(
        params: AgentSessionCreateParams,
        requestOptions: RequestOptions
    ): AgentSessionCreateResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "agents", params.getPathParam(0), "session")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { createHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }

    private val retrieveHandler: Handler<Session> =
        jsonHandler<Session>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    override fun retrieve(
        params: AgentSessionRetrieveParams,
        requestOptions: RequestOptions
    ): Session {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments(
                    "v1",
                    "agents",
                    params.getPathParam(0),
                    "session",
                    params.getPathParam(1)
                )
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { retrieveHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }

    private val deleteHandler: Handler<Void?> = emptyHandler().withErrorHandler(errorHandler)

    override fun delete(params: AgentSessionDeleteParams, requestOptions: RequestOptions) {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.DELETE)
                .addPathSegments(
                    "v1",
                    "agents",
                    params.getPathParam(0),
                    "session",
                    params.getPathParam(1)
                )
                .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        response.use { deleteHandler.handle(it) }
    }
}
