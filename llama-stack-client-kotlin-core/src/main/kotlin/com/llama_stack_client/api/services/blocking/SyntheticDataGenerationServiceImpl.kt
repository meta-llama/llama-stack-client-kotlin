// File generated from our OpenAPI spec by Stainless.

package com.llama_stack_client.api.services.blocking

import com.llama_stack_client.api.core.ClientOptions
import com.llama_stack_client.api.core.RequestOptions
import com.llama_stack_client.api.core.http.HttpMethod
import com.llama_stack_client.api.core.http.HttpRequest
import com.llama_stack_client.api.core.http.HttpResponse.Handler
import com.llama_stack_client.api.errors.LlamaStackClientError
import com.llama_stack_client.api.models.SyntheticDataGeneration
import com.llama_stack_client.api.models.SyntheticDataGenerationGenerateParams
import com.llama_stack_client.api.services.errorHandler
import com.llama_stack_client.api.services.json
import com.llama_stack_client.api.services.jsonHandler
import com.llama_stack_client.api.services.withErrorHandler

class SyntheticDataGenerationServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : SyntheticDataGenerationService {

    private val errorHandler: Handler<LlamaStackClientError> =
        errorHandler(clientOptions.jsonMapper)

    private val generateHandler: Handler<SyntheticDataGeneration> =
        jsonHandler<SyntheticDataGeneration>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    override fun generate(
        params: SyntheticDataGenerationGenerateParams,
        requestOptions: RequestOptions
    ): SyntheticDataGeneration {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("synthetic_data_generation", "generate")
                .putAllQueryParams(clientOptions.queryParams)
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
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
