// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.blocking

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
import com.llama.llamastack.core.prepare
import com.llama.llamastack.models.SyntheticDataGenerationGenerateParams
import com.llama.llamastack.models.SyntheticDataGenerationResponse

class SyntheticDataGenerationServiceImpl
internal constructor(private val clientOptions: ClientOptions) : SyntheticDataGenerationService {

    private val withRawResponse: SyntheticDataGenerationService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): SyntheticDataGenerationService.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: (ClientOptions.Builder) -> Unit
    ): SyntheticDataGenerationService =
        SyntheticDataGenerationServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun generate(
        params: SyntheticDataGenerationGenerateParams,
        requestOptions: RequestOptions,
    ): SyntheticDataGenerationResponse =
        // post /v1/synthetic-data-generation/generate
        withRawResponse().generate(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SyntheticDataGenerationService.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): SyntheticDataGenerationService.WithRawResponse =
            SyntheticDataGenerationServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val generateHandler: Handler<SyntheticDataGenerationResponse> =
            jsonHandler<SyntheticDataGenerationResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun generate(
            params: SyntheticDataGenerationGenerateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SyntheticDataGenerationResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "synthetic-data-generation", "generate")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
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
