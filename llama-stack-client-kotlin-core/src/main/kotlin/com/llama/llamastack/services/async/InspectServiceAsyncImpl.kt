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
import com.llama.llamastack.core.http.parseable
import com.llama.llamastack.core.prepareAsync
import com.llama.llamastack.models.HealthInfo
import com.llama.llamastack.models.InspectHealthParams
import com.llama.llamastack.models.InspectVersionParams
import com.llama.llamastack.models.VersionInfo

class InspectServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    InspectServiceAsync {

    private val withRawResponse: InspectServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): InspectServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): InspectServiceAsync =
        InspectServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override suspend fun health(
        params: InspectHealthParams,
        requestOptions: RequestOptions,
    ): HealthInfo =
        // get /v1/health
        withRawResponse().health(params, requestOptions).parse()

    override suspend fun version(
        params: InspectVersionParams,
        requestOptions: RequestOptions,
    ): VersionInfo =
        // get /v1/version
        withRawResponse().version(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        InspectServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): InspectServiceAsync.WithRawResponse =
            InspectServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val healthHandler: Handler<HealthInfo> =
            jsonHandler<HealthInfo>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override suspend fun health(
            params: InspectHealthParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<HealthInfo> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "health")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { healthHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val versionHandler: Handler<VersionInfo> =
            jsonHandler<VersionInfo>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override suspend fun version(
            params: InspectVersionParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<VersionInfo> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "version")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { versionHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
