// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.blocking

import com.llama.llamastack.core.ClientOptions
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
import com.llama.llamastack.core.prepare
import com.llama.llamastack.errors.LlamaStackClientError
import com.llama.llamastack.models.RunShieldResponse
import com.llama.llamastack.models.SafetyRunShieldParams

class SafetyServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    SafetyService {

    private val withRawResponse: SafetyService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): SafetyService.WithRawResponse = withRawResponse

    override fun runShield(
        params: SafetyRunShieldParams,
        requestOptions: RequestOptions,
    ): RunShieldResponse =
        // post /v1/safety/run-shield
        withRawResponse().runShield(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SafetyService.WithRawResponse {

        private val errorHandler: Handler<LlamaStackClientError> =
            errorHandler(clientOptions.jsonMapper)

        private val runShieldHandler: Handler<RunShieldResponse> =
            jsonHandler<RunShieldResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun runShield(
            params: SafetyRunShieldParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RunShieldResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("v1", "safety", "run-shield")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { runShieldHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
