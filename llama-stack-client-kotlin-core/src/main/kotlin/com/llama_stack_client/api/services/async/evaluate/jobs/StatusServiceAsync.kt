// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.llama_stack_client.api.services.async.evaluate.jobs

import com.llama_stack_client.api.core.RequestOptions
import com.llama_stack_client.api.models.EvaluateJobStatusListParams
import com.llama_stack_client.api.models.EvaluationJobStatus

interface StatusServiceAsync {

    suspend fun list(
        params: EvaluateJobStatusListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): EvaluationJobStatus
}
