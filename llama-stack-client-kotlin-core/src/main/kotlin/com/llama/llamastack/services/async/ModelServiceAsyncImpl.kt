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
import com.llama.llamastack.models.Model
import com.llama.llamastack.models.ModelListParams
import com.llama.llamastack.models.ModelRegisterParams
import com.llama.llamastack.models.ModelRetrieveParams
import com.llama.llamastack.models.ModelUnregisterParams

class ModelServiceAsyncImpl
internal constructor(
    private val clientOptions: ClientOptions,
) : ModelServiceAsync {

    private val errorHandler: Handler<LlamaStackClientError> =
        errorHandler(clientOptions.jsonMapper)

    private val retrieveHandler: Handler<Model?> =
        jsonHandler<Model?>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    override suspend fun retrieve(
        params: ModelRetrieveParams,
        requestOptions: RequestOptions
    ): Model? {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("v1", "models", params.getPathParam(0))
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

    private val listHandler: Handler<DataEnvelope<List<Model>>> =
        jsonHandler<DataEnvelope<List<Model>>>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    override suspend fun list(
        params: ModelListParams,
        requestOptions: RequestOptions
    ): List<Model> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("v1", "models")
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

    private val registerHandler: Handler<Model> =
        jsonHandler<Model>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    override suspend fun register(
        params: ModelRegisterParams,
        requestOptions: RequestOptions
    ): Model {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "models")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepareAsync(clientOptions, params)
        val response = clientOptions.httpClient.executeAsync(request, requestOptions)
        return response
            .use { registerHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }

    private val unregisterHandler: Handler<Void?> = emptyHandler().withErrorHandler(errorHandler)

    override suspend fun unregister(params: ModelUnregisterParams, requestOptions: RequestOptions) {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.DELETE)
                .addPathSegments("v1", "models", params.getPathParam(0))
                .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                .build()
                .prepareAsync(clientOptions, params)
        val response = clientOptions.httpClient.executeAsync(request, requestOptions)
        response.use { unregisterHandler.handle(it) }
    }
}
