// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.llama_stack_client.api.services.async.evaluate.jobs

import com.llama_stack_client.api.core.RequestOptions
import com.llama_stack_client.api.models.EvaluateJobLogListParams
import com.llama_stack_client.api.models.EvaluationJobLogStream

interface LogServiceAsync {

    suspend fun list(
        params: EvaluateJobLogListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): EvaluationJobLogStream
}
