// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.async.agents

import com.llama.llamastack.core.ClientOptions
import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.core.RequestOptions
import com.llama.llamastack.core.handlers.errorHandler
import com.llama.llamastack.core.handlers.jsonHandler
import com.llama.llamastack.core.handlers.withErrorHandler
import com.llama.llamastack.core.http.HttpMethod
import com.llama.llamastack.core.http.HttpRequest
import com.llama.llamastack.core.http.HttpResponse.Handler
import com.llama.llamastack.core.http.HttpResponseFor
import com.llama.llamastack.core.http.json
import com.llama.llamastack.core.http.parseable
import com.llama.llamastack.core.prepareAsync
import com.llama.llamastack.models.AgentTurnCreateParams
import com.llama.llamastack.models.AgentTurnResumeParams
import com.llama.llamastack.models.AgentTurnRetrieveParams
import com.llama.llamastack.models.Turn

class TurnServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    TurnServiceAsync {

    private val withRawResponse: TurnServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): TurnServiceAsync.WithRawResponse = withRawResponse

    override suspend fun create(
        params: AgentTurnCreateParams,
        requestOptions: RequestOptions,
    ): Turn =
        // post /v1/agents/{agent_id}/session/{session_id}/turn
        withRawResponse().create(params, requestOptions).parse()

    override suspend fun retrieve(
        params: AgentTurnRetrieveParams,
        requestOptions: RequestOptions,
    ): Turn =
        // get /v1/agents/{agent_id}/session/{session_id}/turn/{turn_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override suspend fun resume(
        params: AgentTurnResumeParams,
        requestOptions: RequestOptions,
    ): Turn =
        // post /v1/agents/{agent_id}/session/{session_id}/turn/{turn_id}/resume
        withRawResponse().resume(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        TurnServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<Turn> =
            jsonHandler<Turn>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override suspend fun create(
            params: AgentTurnCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Turn> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments(
                        "v1",
                        "agents",
                        params._pathParam(0),
                        "session",
                        params._pathParam(1),
                        "turn",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
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

        private val retrieveHandler: Handler<Turn> =
            jsonHandler<Turn>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override suspend fun retrieve(
            params: AgentTurnRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Turn> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments(
                        "v1",
                        "agents",
                        params._pathParam(0),
                        "session",
                        params._pathParam(1),
                        "turn",
                        params._pathParam(2),
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
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

        override suspend fun resume(
            params: AgentTurnResumeParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Turn> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments(
                        "v1",
                        "agents",
                        params._pathParam(0),
                        "session",
                        params._pathParam(1),
                        "turn",
                        params._pathParam(2),
                        "resume",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
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
    }
}
