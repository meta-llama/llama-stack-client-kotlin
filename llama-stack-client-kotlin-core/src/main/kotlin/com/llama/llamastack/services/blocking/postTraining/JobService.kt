// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.blocking.postTraining

import com.llama.llamastack.core.RequestOptions
import com.llama.llamastack.models.ListPostTrainingJobsResponse
import com.llama.llamastack.models.PostTrainingJobArtifactsParams
import com.llama.llamastack.models.PostTrainingJobArtifactsResponse
import com.llama.llamastack.models.PostTrainingJobCancelParams
import com.llama.llamastack.models.PostTrainingJobListParams
import com.llama.llamastack.models.PostTrainingJobStatusParams
import com.llama.llamastack.models.PostTrainingJobStatusResponse

interface JobService {

    fun list(
        params: PostTrainingJobListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): List<ListPostTrainingJobsResponse.Data>

    fun artifacts(
        params: PostTrainingJobArtifactsParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): PostTrainingJobArtifactsResponse?

    fun cancel(
        params: PostTrainingJobCancelParams,
        requestOptions: RequestOptions = RequestOptions.none()
    )

    fun status(
        params: PostTrainingJobStatusParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): PostTrainingJobStatusResponse?
}
