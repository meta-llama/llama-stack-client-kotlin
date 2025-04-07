// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.async

import com.llama.llamastack.core.ClientOptions
import com.llama.llamastack.core.JsonValue
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
import com.llama.llamastack.core.prepareAsync
import com.llama.llamastack.models.SyntheticDataGenerationGenerateParams
import com.llama.llamastack.models.SyntheticDataGenerationResponse

class SyntheticDataGenerationServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) :
    SyntheticDataGenerationServiceAsync {

    private val withRawResponse: SyntheticDataGenerationServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): SyntheticDataGenerationServiceAsync.WithRawResponse =
        withRawResponse

    override suspend fun generate(
        params: SyntheticDataGenerationGenerateParams,
        requestOptions: RequestOptions,
    ): SyntheticDataGenerationResponse =
        // post /v1/synthetic-data-generation/generate
        withRawResponse().generate(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SyntheticDataGenerationServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val generateHandler: Handler<SyntheticDataGenerationResponse> =
            jsonHandler<SyntheticDataGenerationResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun generate(
            params: SyntheticDataGenerationGenerateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SyntheticDataGenerationResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("v1", "synthetic-data-generation", "generate")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { generateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
