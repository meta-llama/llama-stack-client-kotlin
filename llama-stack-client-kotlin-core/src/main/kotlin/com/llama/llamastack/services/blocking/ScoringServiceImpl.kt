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
import com.llama.llamastack.models.ScoringScoreBatchParams
import com.llama.llamastack.models.ScoringScoreBatchResponse
import com.llama.llamastack.models.ScoringScoreParams
import com.llama.llamastack.models.ScoringScoreResponse

class ScoringServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ScoringService {

    private val withRawResponse: ScoringService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ScoringService.WithRawResponse = withRawResponse

    override fun score(
        params: ScoringScoreParams,
        requestOptions: RequestOptions,
    ): ScoringScoreResponse =
        // post /v1/scoring/score
        withRawResponse().score(params, requestOptions).parse()

    override fun scoreBatch(
        params: ScoringScoreBatchParams,
        requestOptions: RequestOptions,
    ): ScoringScoreBatchResponse =
        // post /v1/scoring/score-batch
        withRawResponse().scoreBatch(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ScoringService.WithRawResponse {

        private val errorHandler: Handler<LlamaStackClientError> =
            errorHandler(clientOptions.jsonMapper)

        private val scoreHandler: Handler<ScoringScoreResponse> =
            jsonHandler<ScoringScoreResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun score(
            params: ScoringScoreParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ScoringScoreResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("v1", "scoring", "score")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { scoreHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val scoreBatchHandler: Handler<ScoringScoreBatchResponse> =
            jsonHandler<ScoringScoreBatchResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun scoreBatch(
            params: ScoringScoreBatchParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ScoringScoreBatchResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("v1", "scoring", "score-batch")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { scoreBatchHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
