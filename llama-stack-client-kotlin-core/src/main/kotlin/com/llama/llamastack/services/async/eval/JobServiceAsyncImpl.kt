// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.async.eval

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
import com.llama.llamastack.errors.LlamaStackClientError
import com.llama.llamastack.models.EvalJobCancelParams
import com.llama.llamastack.models.EvalJobRetrieveParams
import com.llama.llamastack.models.EvalJobStatusParams
import com.llama.llamastack.models.EvalJobStatusResponse
import com.llama.llamastack.models.EvaluateResponse

class JobServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : JobServiceAsync {

    private val errorHandler: Handler<LlamaStackClientError> =
        errorHandler(clientOptions.jsonMapper)

    private val retrieveHandler: Handler<EvaluateResponse> =
        jsonHandler<EvaluateResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    override suspend fun retrieve(
        params: EvalJobRetrieveParams,
        requestOptions: RequestOptions
    ): EvaluateResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("eval", "job", "result")
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .replaceAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).let { response ->
            response
                .use { retrieveHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val cancelHandler: Handler<Void?> = emptyHandler().withErrorHandler(errorHandler)

    override suspend fun cancel(params: EvalJobCancelParams, requestOptions: RequestOptions) {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("eval", "job", "cancel")
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .replaceAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).let { response ->
            response.use { cancelHandler.handle(it) }
        }
    }

    private val statusHandler: Handler<EvalJobStatusResponse?> =
        jsonHandler<EvalJobStatusResponse?>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    override suspend fun status(
        params: EvalJobStatusParams,
        requestOptions: RequestOptions
    ): EvalJobStatusResponse? {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("eval", "job", "status")
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .replaceAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).let { response ->
            response
                .use { statusHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        this?.validate()
                    }
                }
        }
    }
}