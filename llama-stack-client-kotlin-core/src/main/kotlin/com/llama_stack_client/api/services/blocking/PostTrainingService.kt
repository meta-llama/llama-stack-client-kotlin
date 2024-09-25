// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.llama_stack_client.api.services.blocking

import com.llama_stack_client.api.core.RequestOptions
import com.llama_stack_client.api.models.PostTrainingJob
import com.llama_stack_client.api.models.PostTrainingPreferenceOptimizeParams
import com.llama_stack_client.api.models.PostTrainingSupervisedFineTuneParams
import com.llama_stack_client.api.services.blocking.postTraining.JobService

interface PostTrainingService {

    fun jobs(): JobService

    fun preferenceOptimize(
        params: PostTrainingPreferenceOptimizeParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): PostTrainingJob

    fun supervisedFineTune(
        params: PostTrainingSupervisedFineTuneParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): PostTrainingJob
}
