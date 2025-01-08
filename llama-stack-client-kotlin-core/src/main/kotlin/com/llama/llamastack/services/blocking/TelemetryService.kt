// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.blocking

import com.llama.llamastack.core.RequestOptions
import com.llama.llamastack.models.TelemetryGetSpanTreeParams
import com.llama.llamastack.models.TelemetryGetSpanTreeResponse
import com.llama.llamastack.models.TelemetryLogEventParams
import com.llama.llamastack.models.TelemetryQuerySpansParams
import com.llama.llamastack.models.TelemetryQuerySpansResponse
import com.llama.llamastack.models.TelemetryQueryTracesParams
import com.llama.llamastack.models.TelemetrySaveSpansToDatasetParams
import com.llama.llamastack.models.Trace

interface TelemetryService {

    fun getSpanTree(
        params: TelemetryGetSpanTreeParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): TelemetryGetSpanTreeResponse

    fun logEvent(
        params: TelemetryLogEventParams,
        requestOptions: RequestOptions = RequestOptions.none()
    )

    fun querySpans(
        params: TelemetryQuerySpansParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): TelemetryQuerySpansResponse

    fun queryTraces(
        params: TelemetryQueryTracesParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): Trace

    fun saveSpansToDataset(
        params: TelemetrySaveSpansToDatasetParams,
        requestOptions: RequestOptions = RequestOptions.none()
    )
}
