// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.llama_stack_client.api.services.blocking.evaluate.jobs

import com.llama_stack_client.api.core.RequestOptions
import com.llama_stack_client.api.models.EvaluateJobStatusListParams
import com.llama_stack_client.api.models.EvaluationJobStatus

interface StatusService {

    fun list(
        params: EvaluateJobStatusListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): EvaluationJobStatus
}
