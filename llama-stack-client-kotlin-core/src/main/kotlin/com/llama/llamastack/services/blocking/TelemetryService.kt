// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.blocking

import com.llama.llamastack.core.RequestOptions
import com.llama.llamastack.models.TelemetryGetTraceParams
import com.llama.llamastack.models.TelemetryLogEventParams
import com.llama.llamastack.models.Trace

interface TelemetryService {

    fun getTrace(
        params: TelemetryGetTraceParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): Trace

    fun logEvent(
        params: TelemetryLogEventParams,
        requestOptions: RequestOptions = RequestOptions.none()
    )
}
