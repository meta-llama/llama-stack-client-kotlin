// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.blocking

import com.llama.llamastack.core.ClientOptions
import com.llama.llamastack.core.RequestOptions
import com.llama.llamastack.core.handlers.errorHandler
import com.llama.llamastack.core.handlers.jsonHandler
import com.llama.llamastack.core.handlers.withErrorHandler
import com.llama.llamastack.core.http.HttpMethod
import com.llama.llamastack.core.http.HttpRequest
import com.llama.llamastack.core.http.HttpResponse.Handler
import com.llama.llamastack.core.prepare
import com.llama.llamastack.errors.LlamaStackClientError
import com.llama.llamastack.models.HealthInfo
import com.llama.llamastack.models.InspectHealthParams
import com.llama.llamastack.models.InspectVersionParams
import com.llama.llamastack.models.VersionInfo

class InspectServiceImpl
internal constructor(
    private val clientOptions: ClientOptions,
) : InspectService {

    private val errorHandler: Handler<LlamaStackClientError> =
        errorHandler(clientOptions.jsonMapper)

    private val healthHandler: Handler<HealthInfo> =
        jsonHandler<HealthInfo>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    override fun health(params: InspectHealthParams, requestOptions: RequestOptions): HealthInfo {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("v1", "health")
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { healthHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }

    private val versionHandler: Handler<VersionInfo> =
        jsonHandler<VersionInfo>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    override fun version(
        params: InspectVersionParams,
        requestOptions: RequestOptions
    ): VersionInfo {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("v1", "version")
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { versionHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }
}
