// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.async

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
import com.llama.llamastack.core.prepareAsync
import com.llama.llamastack.errors.LlamaStackClientError
import com.llama.llamastack.models.DataEnvelope
import com.llama.llamastack.models.EvalTask
import com.llama.llamastack.models.EvalTaskListParams
import com.llama.llamastack.models.EvalTaskRegisterParams
import com.llama.llamastack.models.EvalTaskRetrieveParams

class EvalTaskServiceAsyncImpl
internal constructor(
    private val clientOptions: ClientOptions,
) : EvalTaskServiceAsync {

    private val errorHandler: Handler<LlamaStackClientError> =
        errorHandler(clientOptions.jsonMapper)

    private val retrieveHandler: Handler<EvalTask?> =
        jsonHandler<EvalTask?>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    override suspend fun retrieve(
        params: EvalTaskRetrieveParams,
        requestOptions: RequestOptions
    ): EvalTask? {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("v1", "eval-tasks", params.getPathParam(0))
                .build()
                .prepareAsync(clientOptions, params)
        val response = clientOptions.httpClient.executeAsync(request, requestOptions)
        return response
            .use { retrieveHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it?.validate()
                }
            }
    }

    private val listHandler: Handler<DataEnvelope<List<EvalTask>>> =
        jsonHandler<DataEnvelope<List<EvalTask>>>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    override suspend fun list(
        params: EvalTaskListParams,
        requestOptions: RequestOptions
    ): List<EvalTask> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("v1", "eval-tasks")
                .build()
                .prepareAsync(clientOptions, params)
        val response = clientOptions.httpClient.executeAsync(request, requestOptions)
        return response
            .use { listHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
            .data()
    }

    private val registerHandler: Handler<Void?> = emptyHandler().withErrorHandler(errorHandler)

    override suspend fun register(params: EvalTaskRegisterParams, requestOptions: RequestOptions) {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "eval-tasks")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepareAsync(clientOptions, params)
        val response = clientOptions.httpClient.executeAsync(request, requestOptions)
        response.use { registerHandler.handle(it) }
    }
}
