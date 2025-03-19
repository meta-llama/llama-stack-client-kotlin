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
import com.llama.llamastack.core.http.HttpResponse
import com.llama.llamastack.core.http.HttpResponse.Handler
import com.llama.llamastack.core.http.HttpResponseFor
import com.llama.llamastack.core.http.json
import com.llama.llamastack.core.http.parseable
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

    private val withRawResponse: TelemetryServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): TelemetryServiceAsync.WithRawResponse = withRawResponse

    override suspend fun getSpan(
        params: TelemetryGetSpanParams,
        requestOptions: RequestOptions,
    ): TelemetryGetSpanResponse =
        // get /v1/telemetry/traces/{trace_id}/spans/{span_id}
        withRawResponse().getSpan(params, requestOptions).parse()

    override suspend fun getSpanTree(
        params: TelemetryGetSpanTreeParams,
        requestOptions: RequestOptions,
    ): TelemetryGetSpanTreeResponse =
        // post /v1/telemetry/spans/{span_id}/tree
        withRawResponse().getSpanTree(params, requestOptions).parse()

    override suspend fun getTrace(
        params: TelemetryGetTraceParams,
        requestOptions: RequestOptions,
    ): Trace =
        // get /v1/telemetry/traces/{trace_id}
        withRawResponse().getTrace(params, requestOptions).parse()

    override suspend fun logEvent(params: TelemetryLogEventParams, requestOptions: RequestOptions) {
        // post /v1/telemetry/events
        withRawResponse().logEvent(params, requestOptions)
    }

    override suspend fun querySpans(
        params: TelemetryQuerySpansParams,
        requestOptions: RequestOptions,
    ): List<QuerySpansResponse.Data> =
        // post /v1/telemetry/spans
        withRawResponse().querySpans(params, requestOptions).parse()

    override suspend fun queryTraces(
        params: TelemetryQueryTracesParams,
        requestOptions: RequestOptions,
    ): List<Trace> =
        // post /v1/telemetry/traces
        withRawResponse().queryTraces(params, requestOptions).parse()

    override suspend fun saveSpansToDataset(
        params: TelemetrySaveSpansToDatasetParams,
        requestOptions: RequestOptions,
    ) {
        // post /v1/telemetry/spans/export
        withRawResponse().saveSpansToDataset(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        TelemetryServiceAsync.WithRawResponse {

        private val errorHandler: Handler<LlamaStackClientError> =
            errorHandler(clientOptions.jsonMapper)

        private val getSpanHandler: Handler<TelemetryGetSpanResponse> =
            jsonHandler<TelemetryGetSpanResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun getSpan(
            params: TelemetryGetSpanParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TelemetryGetSpanResponse> {
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
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { getSpanHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val getSpanTreeHandler: Handler<DataEnvelope<TelemetryGetSpanTreeResponse>> =
            jsonHandler<DataEnvelope<TelemetryGetSpanTreeResponse>>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun getSpanTree(
            params: TelemetryGetSpanTreeParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TelemetryGetSpanTreeResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("v1", "telemetry", "spans", params.getPathParam(0), "tree")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { getSpanTreeHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .data()
            }
        }

        private val getTraceHandler: Handler<Trace> =
            jsonHandler<Trace>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override suspend fun getTrace(
            params: TelemetryGetTraceParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Trace> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("v1", "telemetry", "traces", params.getPathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { getTraceHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val logEventHandler: Handler<Void?> = emptyHandler().withErrorHandler(errorHandler)

        override suspend fun logEvent(
            params: TelemetryLogEventParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("v1", "telemetry", "events")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable { response.use { logEventHandler.handle(it) } }
        }

        private val querySpansHandler: Handler<DataEnvelope<List<QuerySpansResponse.Data>>> =
            jsonHandler<DataEnvelope<List<QuerySpansResponse.Data>>>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun querySpans(
            params: TelemetryQuerySpansParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<QuerySpansResponse.Data>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("v1", "telemetry", "spans")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { querySpansHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .data()
            }
        }

        private val queryTracesHandler: Handler<DataEnvelope<List<Trace>>> =
            jsonHandler<DataEnvelope<List<Trace>>>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun queryTraces(
            params: TelemetryQueryTracesParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<Trace>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("v1", "telemetry", "traces")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { queryTracesHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .data()
            }
        }

        private val saveSpansToDatasetHandler: Handler<Void?> =
            emptyHandler().withErrorHandler(errorHandler)

        override suspend fun saveSpansToDataset(
            params: TelemetrySaveSpansToDatasetParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("v1", "telemetry", "spans", "export")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable { response.use { saveSpansToDatasetHandler.handle(it) } }
        }
    }
}
