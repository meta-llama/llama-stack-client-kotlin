// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.blocking.agents

import com.llama.llamastack.core.ClientOptions
import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.core.RequestOptions
import com.llama.llamastack.core.handlers.errorHandler
import com.llama.llamastack.core.handlers.jsonHandler
import com.llama.llamastack.core.handlers.mapJson
import com.llama.llamastack.core.handlers.sseHandler
import com.llama.llamastack.core.handlers.withErrorHandler
import com.llama.llamastack.core.http.HttpMethod
import com.llama.llamastack.core.http.HttpRequest
import com.llama.llamastack.core.http.HttpResponse.Handler
import com.llama.llamastack.core.http.StreamResponse
import com.llama.llamastack.core.http.map
import com.llama.llamastack.core.json
import com.llama.llamastack.core.prepare
import com.llama.llamastack.errors.LlamaStackClientError
import com.llama.llamastack.models.AgentTurnCreateParams
import com.llama.llamastack.models.AgentTurnResponseStreamChunk
import com.llama.llamastack.models.AgentTurnRetrieveParams
import com.llama.llamastack.models.Turn

class TurnServiceImpl internal constructor(private val clientOptions: ClientOptions) : TurnService {

    private val errorHandler: Handler<LlamaStackClientError> =
        errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<Turn> =
        jsonHandler<Turn>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    override fun create(params: AgentTurnCreateParams, requestOptions: RequestOptions): Turn {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments(
                    "v1",
                    "agents",
                    params.getPathParam(0),
                    "session",
                    params.getPathParam(1),
                    "turn",
                )
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

    private val createStreamingHandler: Handler<StreamResponse<AgentTurnResponseStreamChunk>> =
        sseHandler(clientOptions.jsonMapper)
            .mapJson<AgentTurnResponseStreamChunk>()
            .withErrorHandler(errorHandler)

    override fun createStreaming(
        params: AgentTurnCreateParams,
        requestOptions: RequestOptions,
    ): StreamResponse<AgentTurnResponseStreamChunk> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments(
                    "v1",
                    "agents",
                    params.getPathParam(0),
                    "session",
                    params.getPathParam(1),
                    "turn",
                )
                .body(
                    json(
                        clientOptions.jsonMapper,
                        params
                            ._body()
                            .toBuilder()
                            .putAdditionalProperty("stream", JsonValue.from(true))
                            .build(),
                    )
                )
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .let { createStreamingHandler.handle(it) }
            .let { streamResponse ->
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    streamResponse.map { it.validate() }
                } else {
                    streamResponse
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
                    params.getPathParam(2),
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
}
