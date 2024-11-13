// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.blocking.postTraining

import com.llama.llamastack.core.RequestOptions
import com.llama.llamastack.models.PostTrainingJob
import com.llama.llamastack.models.PostTrainingJobArtifactsParams
import com.llama.llamastack.models.PostTrainingJobArtifactsResponse
import com.llama.llamastack.models.PostTrainingJobCancelParams
import com.llama.llamastack.models.PostTrainingJobListParams
import com.llama.llamastack.models.PostTrainingJobLogsParams
import com.llama.llamastack.models.PostTrainingJobLogsResponse
import com.llama.llamastack.models.PostTrainingJobStatusParams
import com.llama.llamastack.models.PostTrainingJobStatusResponse

interface JobService {

    fun list(
        params: PostTrainingJobListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): PostTrainingJob

    fun artifacts(
        params: PostTrainingJobArtifactsParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): PostTrainingJobArtifactsResponse

    fun cancel(
        params: PostTrainingJobCancelParams,
        requestOptions: RequestOptions = RequestOptions.none()
    )

    fun logs(
        params: PostTrainingJobLogsParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): PostTrainingJobLogsResponse

    fun status(
        params: PostTrainingJobStatusParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): PostTrainingJobStatusResponse
}
