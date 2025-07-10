// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.llama.llamastack.core.ClientOptions
import com.llama.llamastack.core.RequestOptions
import com.llama.llamastack.core.http.HttpResponse
import com.llama.llamastack.core.http.HttpResponseFor
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

interface TelemetryServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): TelemetryServiceAsync

    /** Get a span by its ID. */
    suspend fun getSpan(
        spanId: String,
        params: TelemetryGetSpanParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TelemetryGetSpanResponse = getSpan(params.toBuilder().spanId(spanId).build(), requestOptions)

    /** @see [getSpan] */
    suspend fun getSpan(
        params: TelemetryGetSpanParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TelemetryGetSpanResponse

    /** Get a span tree by its ID. */
    suspend fun getSpanTree(
        spanId: String,
        params: TelemetryGetSpanTreeParams = TelemetryGetSpanTreeParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TelemetryGetSpanTreeResponse =
        getSpanTree(params.toBuilder().spanId(spanId).build(), requestOptions)

    /** @see [getSpanTree] */
    suspend fun getSpanTree(
        params: TelemetryGetSpanTreeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TelemetryGetSpanTreeResponse

    /** @see [getSpanTree] */
    suspend fun getSpanTree(
        spanId: String,
        requestOptions: RequestOptions,
    ): TelemetryGetSpanTreeResponse =
        getSpanTree(spanId, TelemetryGetSpanTreeParams.none(), requestOptions)

    /** Get a trace by its ID. */
    suspend fun getTrace(
        traceId: String,
        params: TelemetryGetTraceParams = TelemetryGetTraceParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Trace = getTrace(params.toBuilder().traceId(traceId).build(), requestOptions)

    /** @see [getTrace] */
    suspend fun getTrace(
        params: TelemetryGetTraceParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Trace

    /** @see [getTrace] */
    suspend fun getTrace(traceId: String, requestOptions: RequestOptions): Trace =
        getTrace(traceId, TelemetryGetTraceParams.none(), requestOptions)

    /** Log an event. */
    suspend fun logEvent(
        params: TelemetryLogEventParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** Query spans. */
    suspend fun querySpans(
        params: TelemetryQuerySpansParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<QuerySpansResponse.Data>

    /** Query traces. */
    suspend fun queryTraces(
        params: TelemetryQueryTracesParams = TelemetryQueryTracesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<Trace>

    /** @see [queryTraces] */
    suspend fun queryTraces(requestOptions: RequestOptions): List<Trace> =
        queryTraces(TelemetryQueryTracesParams.none(), requestOptions)

    /** Save spans to a dataset. */
    suspend fun saveSpansToDataset(
        params: TelemetrySaveSpansToDatasetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * A view of [TelemetryServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): TelemetryServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/telemetry/traces/{trace_id}/spans/{span_id}`,
         * but is otherwise the same as [TelemetryServiceAsync.getSpan].
         */
        @MustBeClosed
        suspend fun getSpan(
            spanId: String,
            params: TelemetryGetSpanParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TelemetryGetSpanResponse> =
            getSpan(params.toBuilder().spanId(spanId).build(), requestOptions)

        /** @see [getSpan] */
        @MustBeClosed
        suspend fun getSpan(
            params: TelemetryGetSpanParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TelemetryGetSpanResponse>

        /**
         * Returns a raw HTTP response for `post /v1/telemetry/spans/{span_id}/tree`, but is
         * otherwise the same as [TelemetryServiceAsync.getSpanTree].
         */
        @MustBeClosed
        suspend fun getSpanTree(
            spanId: String,
            params: TelemetryGetSpanTreeParams = TelemetryGetSpanTreeParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TelemetryGetSpanTreeResponse> =
            getSpanTree(params.toBuilder().spanId(spanId).build(), requestOptions)

        /** @see [getSpanTree] */
        @MustBeClosed
        suspend fun getSpanTree(
            params: TelemetryGetSpanTreeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TelemetryGetSpanTreeResponse>

        /** @see [getSpanTree] */
        @MustBeClosed
        suspend fun getSpanTree(
            spanId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TelemetryGetSpanTreeResponse> =
            getSpanTree(spanId, TelemetryGetSpanTreeParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/telemetry/traces/{trace_id}`, but is otherwise
         * the same as [TelemetryServiceAsync.getTrace].
         */
        @MustBeClosed
        suspend fun getTrace(
            traceId: String,
            params: TelemetryGetTraceParams = TelemetryGetTraceParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Trace> =
            getTrace(params.toBuilder().traceId(traceId).build(), requestOptions)

        /** @see [getTrace] */
        @MustBeClosed
        suspend fun getTrace(
            params: TelemetryGetTraceParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Trace>

        /** @see [getTrace] */
        @MustBeClosed
        suspend fun getTrace(
            traceId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Trace> =
            getTrace(traceId, TelemetryGetTraceParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/telemetry/events`, but is otherwise the same as
         * [TelemetryServiceAsync.logEvent].
         */
        @MustBeClosed
        suspend fun logEvent(
            params: TelemetryLogEventParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `post /v1/telemetry/spans`, but is otherwise the same as
         * [TelemetryServiceAsync.querySpans].
         */
        @MustBeClosed
        suspend fun querySpans(
            params: TelemetryQuerySpansParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<QuerySpansResponse.Data>>

        /**
         * Returns a raw HTTP response for `post /v1/telemetry/traces`, but is otherwise the same as
         * [TelemetryServiceAsync.queryTraces].
         */
        @MustBeClosed
        suspend fun queryTraces(
            params: TelemetryQueryTracesParams = TelemetryQueryTracesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<Trace>>

        /** @see [queryTraces] */
        @MustBeClosed
        suspend fun queryTraces(requestOptions: RequestOptions): HttpResponseFor<List<Trace>> =
            queryTraces(TelemetryQueryTracesParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/telemetry/spans/export`, but is otherwise the
         * same as [TelemetryServiceAsync.saveSpansToDataset].
         */
        @MustBeClosed
        suspend fun saveSpansToDataset(
            params: TelemetrySaveSpansToDatasetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
