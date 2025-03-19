// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.llama.llamastack.core.RequestOptions
import com.llama.llamastack.core.http.HttpResponseFor
import com.llama.llamastack.models.PostTrainingJob
import com.llama.llamastack.models.PostTrainingPreferenceOptimizeParams
import com.llama.llamastack.models.PostTrainingSupervisedFineTuneParams
import com.llama.llamastack.services.blocking.postTraining.JobService

interface PostTrainingService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun job(): JobService

    fun preferenceOptimize(
        params: PostTrainingPreferenceOptimizeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PostTrainingJob

    fun supervisedFineTune(
        params: PostTrainingSupervisedFineTuneParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PostTrainingJob

    /**
     * A view of [PostTrainingService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        fun job(): JobService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/post-training/preference-optimize`, but is
         * otherwise the same as [PostTrainingService.preferenceOptimize].
         */
        @MustBeClosed
        fun preferenceOptimize(
            params: PostTrainingPreferenceOptimizeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PostTrainingJob>

        /**
         * Returns a raw HTTP response for `post /v1/post-training/supervised-fine-tune`, but is
         * otherwise the same as [PostTrainingService.supervisedFineTune].
         */
        @MustBeClosed
        fun supervisedFineTune(
            params: PostTrainingSupervisedFineTuneParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PostTrainingJob>
    }
}
