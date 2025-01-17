// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.blocking.agents

import com.llama.llamastack.core.ClientOptions
import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.core.RequestOptions
import com.llama.llamastack.core.handlers.errorHandler
import com.llama.llamastack.core.handlers.jsonHandler
import com.llama.llamastack.core.handlers.map
import com.llama.llamastack.core.handlers.mapJson
import com.llama.llamastack.core.handlers.sseHandler
import com.llama.llamastack.core.handlers.withErrorHandler
import com.llama.llamastack.core.http.HttpMethod
import com.llama.llamastack.core.http.HttpRequest
import com.llama.llamastack.core.http.HttpResponse.Handler
import com.llama.llamastack.core.http.StreamResponse
import com.llama.llamastack.core.json
import com.llama.llamastack.errors.LlamaStackClientError
import com.llama.llamastack.models.AgentTurnCreateParams
import com.llama.llamastack.models.AgentTurnCreateResponse
import com.llama.llamastack.models.AgentTurnRetrieveParams
import com.llama.llamastack.models.Turn

class TurnServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : TurnService {

    private val errorHandler: Handler<LlamaStackClientError> =
        errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<AgentTurnCreateResponse> =
        jsonHandler<AgentTurnCreateResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    override fun create(
        params: AgentTurnCreateParams,
        requestOptions: RequestOptions
    ): AgentTurnCreateResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments(
                    "v1",
                    "agents",
                    params.getPathParam(0),
                    "session",
                    params.getPathParam(1),
                    "turn"
                )
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

    private val createStreamingHandler: Handler<StreamResponse<AgentTurnCreateResponse>> =
        sseHandler(clientOptions.jsonMapper)
            .mapJson<AgentTurnCreateResponse>()
            .withErrorHandler(errorHandler)

    override fun createStreaming(
        params: AgentTurnCreateParams,
        requestOptions: RequestOptions
    ): StreamResponse<AgentTurnCreateResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments(
                    "v1",
                    "agents",
                    params.getPathParam(0),
                    "session",
                    params.getPathParam(1),
                    "turn"
                )
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .replaceAllHeaders(params.getHeaders())
                .body(
                    json(
                        clientOptions.jsonMapper,
                        params
                            .getBody()
                            .toBuilder()
                            .putAdditionalProperty("stream", JsonValue.from(true))
                            .build()
                    )
                )
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .let { createStreamingHandler.handle(it) }
                .let { streamResponse ->
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        streamResponse.map { it.validate() }
                    } else {
                        streamResponse
                    }
                }
        }
    }

    private val retrieveHandler: Handler<Turn> =
        jsonHandler<Turn>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    override fun retrieve(params: AgentTurnRetrieveParams, requestOptions: RequestOptions): Turn {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments(
                    "v1",
                    "agents",
                    params.getPathParam(0),
                    "session",
                    params.getPathParam(1),
                    "turn",
                    params.getPathParam(2)
                )
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .replaceAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
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
