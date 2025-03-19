// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.async

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

interface TelemetryServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    suspend fun getSpan(
        params: TelemetryGetSpanParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TelemetryGetSpanResponse

    suspend fun getSpanTree(
        params: TelemetryGetSpanTreeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TelemetryGetSpanTreeResponse

    suspend fun getTrace(
        params: TelemetryGetTraceParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Trace

    suspend fun logEvent(
        params: TelemetryLogEventParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    suspend fun querySpans(
        params: TelemetryQuerySpansParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<QuerySpansResponse.Data>

    suspend fun queryTraces(
        params: TelemetryQueryTracesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<Trace>

    suspend fun saveSpansToDataset(
        params: TelemetrySaveSpansToDatasetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * A view of [TelemetryServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /v1/telemetry/traces/{trace_id}/spans/{span_id}`,
         * but is otherwise the same as [TelemetryServiceAsync.getSpan].
         */
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
            params: TelemetryGetSpanTreeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TelemetryGetSpanTreeResponse>

        /**
         * Returns a raw HTTP response for `get /v1/telemetry/traces/{trace_id}`, but is otherwise
         * the same as [TelemetryServiceAsync.getTrace].
         */
        @MustBeClosed
        suspend fun getTrace(
            params: TelemetryGetTraceParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Trace>

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
            params: TelemetryQueryTracesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<Trace>>

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
