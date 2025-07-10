// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.blocking

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

interface TelemetryService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): TelemetryService

    /** Get a span by its ID. */
    fun getSpan(
        spanId: String,
        params: TelemetryGetSpanParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TelemetryGetSpanResponse = getSpan(params.toBuilder().spanId(spanId).build(), requestOptions)

    /** @see [getSpan] */
    fun getSpan(
        params: TelemetryGetSpanParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TelemetryGetSpanResponse

    /** Get a span tree by its ID. */
    fun getSpanTree(
        spanId: String,
        params: TelemetryGetSpanTreeParams = TelemetryGetSpanTreeParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TelemetryGetSpanTreeResponse =
        getSpanTree(params.toBuilder().spanId(spanId).build(), requestOptions)

    /** @see [getSpanTree] */
    fun getSpanTree(
        params: TelemetryGetSpanTreeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TelemetryGetSpanTreeResponse

    /** @see [getSpanTree] */
    fun getSpanTree(spanId: String, requestOptions: RequestOptions): TelemetryGetSpanTreeResponse =
        getSpanTree(spanId, TelemetryGetSpanTreeParams.none(), requestOptions)

    /** Get a trace by its ID. */
    fun getTrace(
        traceId: String,
        params: TelemetryGetTraceParams = TelemetryGetTraceParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Trace = getTrace(params.toBuilder().traceId(traceId).build(), requestOptions)

    /** @see [getTrace] */
    fun getTrace(
        params: TelemetryGetTraceParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Trace

    /** @see [getTrace] */
    fun getTrace(traceId: String, requestOptions: RequestOptions): Trace =
        getTrace(traceId, TelemetryGetTraceParams.none(), requestOptions)

    /** Log an event. */
    fun logEvent(
        params: TelemetryLogEventParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** Query spans. */
    fun querySpans(
        params: TelemetryQuerySpansParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<QuerySpansResponse.Data>

    /** Query traces. */
    fun queryTraces(
        params: TelemetryQueryTracesParams = TelemetryQueryTracesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<Trace>

    /** @see [queryTraces] */
    fun queryTraces(requestOptions: RequestOptions): List<Trace> =
        queryTraces(TelemetryQueryTracesParams.none(), requestOptions)

    /** Save spans to a dataset. */
    fun saveSpansToDataset(
        params: TelemetrySaveSpansToDatasetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** A view of [TelemetryService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): TelemetryService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/telemetry/traces/{trace_id}/spans/{span_id}`,
         * but is otherwise the same as [TelemetryService.getSpan].
         */
        @MustBeClosed
        fun getSpan(
            spanId: String,
            params: TelemetryGetSpanParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TelemetryGetSpanResponse> =
            getSpan(params.toBuilder().spanId(spanId).build(), requestOptions)

        /** @see [getSpan] */
        @MustBeClosed
        fun getSpan(
            params: TelemetryGetSpanParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TelemetryGetSpanResponse>

        /**
         * Returns a raw HTTP response for `post /v1/telemetry/spans/{span_id}/tree`, but is
         * otherwise the same as [TelemetryService.getSpanTree].
         */
        @MustBeClosed
        fun getSpanTree(
            spanId: String,
            params: TelemetryGetSpanTreeParams = TelemetryGetSpanTreeParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TelemetryGetSpanTreeResponse> =
            getSpanTree(params.toBuilder().spanId(spanId).build(), requestOptions)

        /** @see [getSpanTree] */
        @MustBeClosed
        fun getSpanTree(
            params: TelemetryGetSpanTreeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TelemetryGetSpanTreeResponse>

        /** @see [getSpanTree] */
        @MustBeClosed
        fun getSpanTree(
            spanId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TelemetryGetSpanTreeResponse> =
            getSpanTree(spanId, TelemetryGetSpanTreeParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/telemetry/traces/{trace_id}`, but is otherwise
         * the same as [TelemetryService.getTrace].
         */
        @MustBeClosed
        fun getTrace(
            traceId: String,
            params: TelemetryGetTraceParams = TelemetryGetTraceParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Trace> =
            getTrace(params.toBuilder().traceId(traceId).build(), requestOptions)

        /** @see [getTrace] */
        @MustBeClosed
        fun getTrace(
            params: TelemetryGetTraceParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Trace>

        /** @see [getTrace] */
        @MustBeClosed
        fun getTrace(traceId: String, requestOptions: RequestOptions): HttpResponseFor<Trace> =
            getTrace(traceId, TelemetryGetTraceParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/telemetry/events`, but is otherwise the same as
         * [TelemetryService.logEvent].
         */
        @MustBeClosed
        fun logEvent(
            params: TelemetryLogEventParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `post /v1/telemetry/spans`, but is otherwise the same as
         * [TelemetryService.querySpans].
         */
        @MustBeClosed
        fun querySpans(
            params: TelemetryQuerySpansParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<QuerySpansResponse.Data>>

        /**
         * Returns a raw HTTP response for `post /v1/telemetry/traces`, but is otherwise the same as
         * [TelemetryService.queryTraces].
         */
        @MustBeClosed
        fun queryTraces(
            params: TelemetryQueryTracesParams = TelemetryQueryTracesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<Trace>>

        /** @see [queryTraces] */
        @MustBeClosed
        fun queryTraces(requestOptions: RequestOptions): HttpResponseFor<List<Trace>> =
            queryTraces(TelemetryQueryTracesParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/telemetry/spans/export`, but is otherwise the
         * same as [TelemetryService.saveSpansToDataset].
         */
        @MustBeClosed
        fun saveSpansToDataset(
            params: TelemetrySaveSpansToDatasetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
