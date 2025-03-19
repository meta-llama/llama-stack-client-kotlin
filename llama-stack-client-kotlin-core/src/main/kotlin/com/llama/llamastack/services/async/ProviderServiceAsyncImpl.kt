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
import com.llama.llamastack.core.http.HttpResponseFor
import com.llama.llamastack.core.http.parseable
import com.llama.llamastack.core.prepareAsync
import com.llama.llamastack.errors.LlamaStackClientError
import com.llama.llamastack.models.DataEnvelope
import com.llama.llamastack.models.ProviderInfo
import com.llama.llamastack.models.ProviderListParams
import com.llama.llamastack.models.ProviderRetrieveParams

class ProviderServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ProviderServiceAsync {

    private val withRawResponse: ProviderServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ProviderServiceAsync.WithRawResponse = withRawResponse

    override suspend fun retrieve(
        params: ProviderRetrieveParams,
        requestOptions: RequestOptions,
    ): ProviderInfo =
        // get /v1/providers/{provider_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override suspend fun list(
        params: ProviderListParams,
        requestOptions: RequestOptions,
    ): List<ProviderInfo> =
        // get /v1/providers
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ProviderServiceAsync.WithRawResponse {

        private val errorHandler: Handler<LlamaStackClientError> =
            errorHandler(clientOptions.jsonMapper)

        private val retrieveHandler: Handler<ProviderInfo> =
            jsonHandler<ProviderInfo>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override suspend fun retrieve(
            params: ProviderRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ProviderInfo> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("v1", "providers", params.getPathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<DataEnvelope<List<ProviderInfo>>> =
            jsonHandler<DataEnvelope<List<ProviderInfo>>>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun list(
            params: ProviderListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<ProviderInfo>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("v1", "providers")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .data()
            }
        }
    }
}
