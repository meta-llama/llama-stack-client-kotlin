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
import com.llama.llamastack.errors.LlamaStackClientError
import com.llama.llamastack.models.SyntheticDataGenerationGenerateParams
import com.llama.llamastack.models.SyntheticDataGenerationResponse

class SyntheticDataGenerationServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : SyntheticDataGenerationServiceAsync {

    private val errorHandler: Handler<LlamaStackClientError> =
        errorHandler(clientOptions.jsonMapper)

    private val generateHandler: Handler<SyntheticDataGenerationResponse> =
        jsonHandler<SyntheticDataGenerationResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    override suspend fun generate(
        params: SyntheticDataGenerationGenerateParams,
        requestOptions: RequestOptions
    ): SyntheticDataGenerationResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("synthetic_data_generation", "generate")
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .replaceAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).let { response ->
            response
                .use { generateHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }
}
