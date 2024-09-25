// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.llama_stack_client.api.services.blocking

import com.llama_stack_client.api.core.RequestOptions
import com.llama_stack_client.api.models.TelemetryGetTraceParams
import com.llama_stack_client.api.models.TelemetryGetTraceResponse
import com.llama_stack_client.api.models.TelemetryLogParams

interface TelemetryService {

    fun getTrace(
        params: TelemetryGetTraceParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): TelemetryGetTraceResponse

    fun log(params: TelemetryLogParams, requestOptions: RequestOptions = RequestOptions.none())
}
