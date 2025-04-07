// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.blocking

import com.google.errorprone.annotations.MustBeClosed
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

    fun getSpan(
        params: TelemetryGetSpanParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TelemetryGetSpanResponse

    fun getSpanTree(
        params: TelemetryGetSpanTreeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TelemetryGetSpanTreeResponse

    fun getTrace(
        params: TelemetryGetTraceParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Trace

    fun logEvent(
        params: TelemetryLogEventParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    fun querySpans(
        params: TelemetryQuerySpansParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<QuerySpansResponse.Data>

    fun queryTraces(
        params: TelemetryQueryTracesParams = TelemetryQueryTracesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<Trace>

    /** @see [queryTraces] */
    fun queryTraces(requestOptions: RequestOptions): List<Trace> =
        queryTraces(TelemetryQueryTracesParams.none(), requestOptions)

    fun saveSpansToDataset(
        params: TelemetrySaveSpansToDatasetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** A view of [TelemetryService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /v1/telemetry/traces/{trace_id}/spans/{span_id}`,
         * but is otherwise the same as [TelemetryService.getSpan].
         */
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
            params: TelemetryGetSpanTreeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TelemetryGetSpanTreeResponse>

        /**
         * Returns a raw HTTP response for `get /v1/telemetry/traces/{trace_id}`, but is otherwise
         * the same as [TelemetryService.getTrace].
         */
        @MustBeClosed
        fun getTrace(
            params: TelemetryGetTraceParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Trace>

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
