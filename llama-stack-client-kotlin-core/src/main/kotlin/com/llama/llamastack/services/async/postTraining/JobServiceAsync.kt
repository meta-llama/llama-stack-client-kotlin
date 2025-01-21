// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.async.postTraining

import com.llama.llamastack.core.RequestOptions
import com.llama.llamastack.models.PostTrainingJob
import com.llama.llamastack.models.PostTrainingJobArtifactsParams
import com.llama.llamastack.models.PostTrainingJobArtifactsResponse
import com.llama.llamastack.models.PostTrainingJobCancelParams
import com.llama.llamastack.models.PostTrainingJobListParams
import com.llama.llamastack.models.PostTrainingJobStatusParams
import com.llama.llamastack.models.PostTrainingJobStatusResponse

interface JobServiceAsync {

    suspend fun list(
        params: PostTrainingJobListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): PostTrainingJob

    suspend fun artifacts(
        params: PostTrainingJobArtifactsParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): PostTrainingJobArtifactsResponse?

    suspend fun cancel(
        params: PostTrainingJobCancelParams,
        requestOptions: RequestOptions = RequestOptions.none()
    )

    suspend fun status(
        params: PostTrainingJobStatusParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): PostTrainingJobStatusResponse?
}
