// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.async

import com.llama.llamastack.core.ClientOptions
import com.llama.llamastack.core.RequestOptions
import com.llama.llamastack.core.handlers.errorHandler
import com.llama.llamastack.core.handlers.jsonHandler
import com.llama.llamastack.core.handlers.withErrorHandler
import com.llama.llamastack.core.http.HttpMethod
import com.llama.llamastack.core.http.HttpRequest
import com.llama.llamastack.core.http.HttpResponse.Handler
import com.llama.llamastack.core.json
import com.llama.llamastack.core.prepareAsync
import com.llama.llamastack.errors.LlamaStackClientError
import com.llama.llamastack.models.ScoringScoreBatchParams
import com.llama.llamastack.models.ScoringScoreBatchResponse
import com.llama.llamastack.models.ScoringScoreParams
import com.llama.llamastack.models.ScoringScoreResponse

class ScoringServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ScoringServiceAsync {

    private val errorHandler: Handler<LlamaStackClientError> =
        errorHandler(clientOptions.jsonMapper)

    private val scoreHandler: Handler<ScoringScoreResponse> =
        jsonHandler<ScoringScoreResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    override suspend fun score(
        params: ScoringScoreParams,
        requestOptions: RequestOptions,
    ): ScoringScoreResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "scoring", "score")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepareAsync(clientOptions, params)
        val response = clientOptions.httpClient.executeAsync(request, requestOptions)
        return response
            .use { scoreHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }

    private val scoreBatchHandler: Handler<ScoringScoreBatchResponse> =
        jsonHandler<ScoringScoreBatchResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    override suspend fun scoreBatch(
        params: ScoringScoreBatchParams,
        requestOptions: RequestOptions,
    ): ScoringScoreBatchResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "scoring", "score-batch")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepareAsync(clientOptions, params)
        val response = clientOptions.httpClient.executeAsync(request, requestOptions)
        return response
            .use { scoreBatchHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }
}
