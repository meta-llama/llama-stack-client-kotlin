// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.llama_stack_client.api.services.async.evaluate

import com.llama_stack_client.api.core.RequestOptions
import com.llama_stack_client.api.models.EvaluateJobCancelParams
import com.llama_stack_client.api.models.EvaluateJobListParams
import com.llama_stack_client.api.models.EvaluationJob
import com.llama_stack_client.api.services.async.evaluate.jobs.ArtifactServiceAsync
import com.llama_stack_client.api.services.async.evaluate.jobs.LogServiceAsync
import com.llama_stack_client.api.services.async.evaluate.jobs.StatusServiceAsync

interface JobServiceAsync {

    fun artifacts(): ArtifactServiceAsync

    fun logs(): LogServiceAsync

    fun status(): StatusServiceAsync

    suspend fun list(
        params: EvaluateJobListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): EvaluationJob

    suspend fun cancel(
        params: EvaluateJobCancelParams,
        requestOptions: RequestOptions = RequestOptions.none()
    )
}
