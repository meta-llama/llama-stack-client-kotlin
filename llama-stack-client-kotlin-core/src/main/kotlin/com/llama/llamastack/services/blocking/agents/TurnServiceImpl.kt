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
import com.llama.llamastack.core.http.HttpResponseFor
import com.llama.llamastack.core.http.StreamResponse
import com.llama.llamastack.core.http.json
import com.llama.llamastack.core.http.map
import com.llama.llamastack.core.http.parseable
import com.llama.llamastack.core.prepare
import com.llama.llamastack.errors.LlamaStackClientError
import com.llama.llamastack.models.AgentTurnCreateParams
import com.llama.llamastack.models.AgentTurnResponseStreamChunk
import com.llama.llamastack.models.AgentTurnResumeParams
import com.llama.llamastack.models.AgentTurnRetrieveParams
import com.llama.llamastack.models.Turn

class TurnServiceImpl internal constructor(private val clientOptions: ClientOptions) : TurnService {

    private val withRawResponse: TurnService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): TurnService.WithRawResponse = withRawResponse

    override fun create(params: AgentTurnCreateParams, requestOptions: RequestOptions): Turn =
        // post /v1/agents/{agent_id}/session/{session_id}/turn
        withRawResponse().create(params, requestOptions).parse()

    override fun createStreaming(
        params: AgentTurnCreateParams,
        requestOptions: RequestOptions,
    ): StreamResponse<AgentTurnResponseStreamChunk> =
        // post /v1/agents/{agent_id}/session/{session_id}/turn
        withRawResponse().createStreaming(params, requestOptions).parse()

    override fun retrieve(params: AgentTurnRetrieveParams, requestOptions: RequestOptions): Turn =
        // get /v1/agents/{agent_id}/session/{session_id}/turn/{turn_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun resume(params: AgentTurnResumeParams, requestOptions: RequestOptions): Turn =
        // post /v1/agents/{agent_id}/session/{session_id}/turn/{turn_id}/resume
        withRawResponse().resume(params, requestOptions).parse()

    override fun resumeStreaming(
        params: AgentTurnResumeParams,
        requestOptions: RequestOptions,
    ): StreamResponse<AgentTurnResponseStreamChunk> =
        // post /v1/agents/{agent_id}/session/{session_id}/turn/{turn_id}/resume
        withRawResponse().resumeStreaming(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        TurnService.WithRawResponse {

        private val errorHandler: Handler<LlamaStackClientError> =
            errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<Turn> =
            jsonHandler<Turn>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun create(
            params: AgentTurnCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Turn> {
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
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
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
        ): HttpResponseFor<StreamResponse<AgentTurnResponseStreamChunk>> {
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
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .let { createStreamingHandler.handle(it) }
                    .let { streamResponse ->
                        if (requestOptions.responseValidation!!) {
                            streamResponse.map { it.validate() }
                        } else {
                            streamResponse
                        }
                    }
            }
        }

        private val retrieveHandler: Handler<Turn> =
            jsonHandler<Turn>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun retrieve(
            params: AgentTurnRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Turn> {
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
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val resumeHandler: Handler<Turn> =
            jsonHandler<Turn>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun resume(
            params: AgentTurnResumeParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Turn> {
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
                        params.getPathParam(2),
                        "resume",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { resumeHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val resumeStreamingHandler: Handler<StreamResponse<AgentTurnResponseStreamChunk>> =
            sseHandler(clientOptions.jsonMapper)
                .mapJson<AgentTurnResponseStreamChunk>()
                .withErrorHandler(errorHandler)

        override fun resumeStreaming(
            params: AgentTurnResumeParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<StreamResponse<AgentTurnResponseStreamChunk>> {
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
                        params.getPathParam(2),
                        "resume",
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
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .let { resumeStreamingHandler.handle(it) }
                    .let { streamResponse ->
                        if (requestOptions.responseValidation!!) {
                            streamResponse.map { it.validate() }
                        } else {
                            streamResponse
                        }
                    }
            }
        }
    }
}
