// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.async

import com.llama.llamastack.core.RequestOptions
import com.llama.llamastack.models.PostTrainingJob
import com.llama.llamastack.models.PostTrainingPreferenceOptimizeParams
import com.llama.llamastack.models.PostTrainingSupervisedFineTuneParams
import com.llama.llamastack.services.async.postTraining.JobServiceAsync

interface PostTrainingServiceAsync {

    fun job(): JobServiceAsync

    suspend fun preferenceOptimize(
        params: PostTrainingPreferenceOptimizeParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): PostTrainingJob

    suspend fun supervisedFineTune(
        params: PostTrainingSupervisedFineTuneParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): PostTrainingJob
}
