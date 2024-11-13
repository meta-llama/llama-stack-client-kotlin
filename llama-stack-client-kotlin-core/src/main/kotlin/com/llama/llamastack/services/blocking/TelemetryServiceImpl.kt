// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.blocking

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
import com.llama.llamastack.errors.LlamaStackClientError
import com.llama.llamastack.models.TelemetryGetTraceParams
import com.llama.llamastack.models.TelemetryLogEventParams
import com.llama.llamastack.models.Trace

class TelemetryServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : TelemetryService {

    private val errorHandler: Handler<LlamaStackClientError> =
        errorHandler(clientOptions.jsonMapper)

    private val getTraceHandler: Handler<Trace> =
        jsonHandler<Trace>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    override fun getTrace(params: TelemetryGetTraceParams, requestOptions: RequestOptions): Trace {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("telemetry", "get_trace")
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .replaceAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { getTraceHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val logEventHandler: Handler<Void?> = emptyHandler().withErrorHandler(errorHandler)

    override fun logEvent(params: TelemetryLogEventParams, requestOptions: RequestOptions) {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("telemetry", "log_event")
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .replaceAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response.use { logEventHandler.handle(it) }
        }
    }
}
