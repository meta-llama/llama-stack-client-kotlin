// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.llama_stack_client.api.services.async

import com.llama_stack_client.api.core.RequestOptions
import com.llama_stack_client.api.models.PostTrainingJob
import com.llama_stack_client.api.models.PostTrainingPreferenceOptimizeParams
import com.llama_stack_client.api.models.PostTrainingSupervisedFineTuneParams
import com.llama_stack_client.api.services.async.postTraining.JobServiceAsync

interface PostTrainingServiceAsync {

    fun jobs(): JobServiceAsync

    suspend fun preferenceOptimize(
        params: PostTrainingPreferenceOptimizeParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): PostTrainingJob

    suspend fun supervisedFineTune(
        params: PostTrainingSupervisedFineTuneParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): PostTrainingJob
}
