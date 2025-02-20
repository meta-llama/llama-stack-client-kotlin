// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.async

import com.llama.llamastack.core.RequestOptions
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
}
