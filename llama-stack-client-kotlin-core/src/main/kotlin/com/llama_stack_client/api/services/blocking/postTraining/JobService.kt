// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.llama_stack_client.api.services.blocking.postTraining

import com.llama_stack_client.api.core.RequestOptions
import com.llama_stack_client.api.models.PostTrainingJob
import com.llama_stack_client.api.models.PostTrainingJobArtifacts
import com.llama_stack_client.api.models.PostTrainingJobArtifactsParams
import com.llama_stack_client.api.models.PostTrainingJobCancelParams
import com.llama_stack_client.api.models.PostTrainingJobListParams
import com.llama_stack_client.api.models.PostTrainingJobLogStream
import com.llama_stack_client.api.models.PostTrainingJobLogsParams
import com.llama_stack_client.api.models.PostTrainingJobStatus
import com.llama_stack_client.api.models.PostTrainingJobStatusParams

interface JobService {

    fun list(
        params: PostTrainingJobListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): PostTrainingJob

    fun artifacts(
        params: PostTrainingJobArtifactsParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): PostTrainingJobArtifacts

    fun cancel(
        params: PostTrainingJobCancelParams,
        requestOptions: RequestOptions = RequestOptions.none()
    )

    fun logs(
        params: PostTrainingJobLogsParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): PostTrainingJobLogStream

    fun status(
        params: PostTrainingJobStatusParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): PostTrainingJobStatus
}
