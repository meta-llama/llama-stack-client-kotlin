// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.llama_stack_client.api.services.blocking.evaluate

import com.llama_stack_client.api.core.RequestOptions
import com.llama_stack_client.api.models.EvaluateJobCancelParams
import com.llama_stack_client.api.models.EvaluateJobListParams
import com.llama_stack_client.api.models.EvaluationJob
import com.llama_stack_client.api.services.blocking.evaluate.jobs.ArtifactService
import com.llama_stack_client.api.services.blocking.evaluate.jobs.LogService
import com.llama_stack_client.api.services.blocking.evaluate.jobs.StatusService

interface JobService {

    fun artifacts(): ArtifactService

    fun logs(): LogService

    fun status(): StatusService

    fun list(
        params: EvaluateJobListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): EvaluationJob

    fun cancel(
        params: EvaluateJobCancelParams,
        requestOptions: RequestOptions = RequestOptions.none()
    )
}
