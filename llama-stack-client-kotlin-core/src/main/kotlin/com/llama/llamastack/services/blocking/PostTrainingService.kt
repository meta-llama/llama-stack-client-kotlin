// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.llama.llamastack.core.ClientOptions
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

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): PostTrainingService

    fun job(): JobService

    /** Run preference optimization of a model. */
    fun preferenceOptimize(
        params: PostTrainingPreferenceOptimizeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PostTrainingJob

    /** Run supervised fine-tuning of a model. */
    fun supervisedFineTune(
        params: PostTrainingSupervisedFineTuneParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PostTrainingJob

    /**
     * A view of [PostTrainingService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): PostTrainingService.WithRawResponse

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
