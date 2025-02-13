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
import com.llama.llamastack.core.prepareAsync
import com.llama.llamastack.errors.LlamaStackClientError
import com.llama.llamastack.models.DataEnvelope
import com.llama.llamastack.models.RouteInfo
import com.llama.llamastack.models.RouteListParams

class RouteServiceAsyncImpl
internal constructor(
    private val clientOptions: ClientOptions,
) : RouteServiceAsync {

    private val errorHandler: Handler<LlamaStackClientError> =
        errorHandler(clientOptions.jsonMapper)

    private val listHandler: Handler<DataEnvelope<List<RouteInfo>>> =
        jsonHandler<DataEnvelope<List<RouteInfo>>>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    override suspend fun list(
        params: RouteListParams,
        requestOptions: RequestOptions
    ): List<RouteInfo> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("v1", "inspect", "routes")
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
}
