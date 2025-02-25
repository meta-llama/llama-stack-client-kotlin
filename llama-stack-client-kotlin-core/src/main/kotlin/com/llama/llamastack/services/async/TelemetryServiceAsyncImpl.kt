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
import com.llama.llamastack.models.QuerySpansResponse
import com.llama.llamastack.models.TelemetryGetSpanParams
import com.llama.llamastack.models.TelemetryGetSpanResponse
import com.llama.llamastack.models.TelemetryGetSpanTreeParams
import com.llama.llamastack.models.TelemetryGetSpanTreeResponse
import com.llama.llamastack.models.TelemetryGetTraceParams
import com.llama.llamastack.models.TelemetryLogEventParams
import com.llama.llamastack.models.TelemetryQuerySpansParams
import com.llama.llamastack.models.TelemetryQueryTracesParams
import com.llama.llamastack.models.TelemetrySaveSpansToDatasetParams
import com.llama.llamastack.models.Trace

class TelemetryServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    TelemetryServiceAsync {

    private val errorHandler: Handler<LlamaStackClientError> =
        errorHandler(clientOptions.jsonMapper)

    private val getSpanHandler: Handler<TelemetryGetSpanResponse> =
        jsonHandler<TelemetryGetSpanResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    override suspend fun getSpan(
        params: TelemetryGetSpanParams,
        requestOptions: RequestOptions,
    ): TelemetryGetSpanResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments(
                    "v1",
                    "telemetry",
                    "traces",
                    params.getPathParam(0),
                    "spans",
                    params.getPathParam(1),
                )
                .build()
                .prepareAsync(clientOptions, params)
        val response = clientOptions.httpClient.executeAsync(request, requestOptions)
        return response
            .use { getSpanHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }

    private val getSpanTreeHandler: Handler<DataEnvelope<TelemetryGetSpanTreeResponse>> =
        jsonHandler<DataEnvelope<TelemetryGetSpanTreeResponse>>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    override suspend fun getSpanTree(
        params: TelemetryGetSpanTreeParams,
        requestOptions: RequestOptions,
    ): TelemetryGetSpanTreeResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "telemetry", "spans", params.getPathParam(0), "tree")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepareAsync(clientOptions, params)
        val response = clientOptions.httpClient.executeAsync(request, requestOptions)
        return response
            .use { getSpanTreeHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
            .data()
    }

    private val getTraceHandler: Handler<Trace> =
        jsonHandler<Trace>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    override suspend fun getTrace(
        params: TelemetryGetTraceParams,
        requestOptions: RequestOptions,
    ): Trace {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("v1", "telemetry", "traces", params.getPathParam(0))
                .build()
                .prepareAsync(clientOptions, params)
        val response = clientOptions.httpClient.executeAsync(request, requestOptions)
        return response
            .use { getTraceHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }

    private val logEventHandler: Handler<Void?> = emptyHandler().withErrorHandler(errorHandler)

    override suspend fun logEvent(params: TelemetryLogEventParams, requestOptions: RequestOptions) {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "telemetry", "events")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepareAsync(clientOptions, params)
        val response = clientOptions.httpClient.executeAsync(request, requestOptions)
        response.use { logEventHandler.handle(it) }
    }

    private val querySpansHandler: Handler<DataEnvelope<List<QuerySpansResponse.Data>>> =
        jsonHandler<DataEnvelope<List<QuerySpansResponse.Data>>>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    override suspend fun querySpans(
        params: TelemetryQuerySpansParams,
        requestOptions: RequestOptions,
    ): List<QuerySpansResponse.Data> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "telemetry", "spans")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepareAsync(clientOptions, params)
        val response = clientOptions.httpClient.executeAsync(request, requestOptions)
        return response
            .use { querySpansHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
            .data()
    }

    private val queryTracesHandler: Handler<DataEnvelope<List<Trace>>> =
        jsonHandler<DataEnvelope<List<Trace>>>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    override suspend fun queryTraces(
        params: TelemetryQueryTracesParams,
        requestOptions: RequestOptions,
    ): List<Trace> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "telemetry", "traces")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepareAsync(clientOptions, params)
        val response = clientOptions.httpClient.executeAsync(request, requestOptions)
        return response
            .use { queryTracesHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
            .data()
    }

    private val saveSpansToDatasetHandler: Handler<Void?> =
        emptyHandler().withErrorHandler(errorHandler)

    override suspend fun saveSpansToDataset(
        params: TelemetrySaveSpansToDatasetParams,
        requestOptions: RequestOptions,
    ) {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "telemetry", "spans", "export")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepareAsync(clientOptions, params)
        val response = clientOptions.httpClient.executeAsync(request, requestOptions)
        response.use { saveSpansToDatasetHandler.handle(it) }
    }
}
