// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.blocking.agents

import com.llama.llamastack.core.ClientOptions
import com.llama.llamastack.core.RequestOptions
import com.llama.llamastack.core.handlers.errorHandler
import com.llama.llamastack.core.handlers.jsonHandler
import com.llama.llamastack.core.handlers.withErrorHandler
import com.llama.llamastack.core.http.HttpMethod
import com.llama.llamastack.core.http.HttpRequest
import com.llama.llamastack.core.http.HttpResponse.Handler
import com.llama.llamastack.core.http.HttpResponseFor
import com.llama.llamastack.core.http.parseable
import com.llama.llamastack.core.prepare
import com.llama.llamastack.errors.LlamaStackClientError
import com.llama.llamastack.models.AgentStepRetrieveParams
import com.llama.llamastack.models.AgentStepRetrieveResponse

class StepServiceImpl internal constructor(private val clientOptions: ClientOptions) : StepService {

    private val withRawResponse: StepService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): StepService.WithRawResponse = withRawResponse

    override fun retrieve(
        params: AgentStepRetrieveParams,
        requestOptions: RequestOptions,
    ): AgentStepRetrieveResponse =
        // get /v1/agents/{agent_id}/session/{session_id}/turn/{turn_id}/step/{step_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        StepService.WithRawResponse {

        private val errorHandler: Handler<LlamaStackClientError> =
            errorHandler(clientOptions.jsonMapper)

        private val retrieveHandler: Handler<AgentStepRetrieveResponse> =
            jsonHandler<AgentStepRetrieveResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun retrieve(
            params: AgentStepRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AgentStepRetrieveResponse> {
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
                        "step",
                        params.getPathParam(3),
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
    }
}
