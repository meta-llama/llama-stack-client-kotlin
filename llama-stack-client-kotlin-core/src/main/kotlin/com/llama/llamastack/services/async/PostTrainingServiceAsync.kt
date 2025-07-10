// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.llama.llamastack.core.ClientOptions
import com.llama.llamastack.core.RequestOptions
import com.llama.llamastack.core.http.HttpResponseFor
import com.llama.llamastack.models.PostTrainingJob
import com.llama.llamastack.models.PostTrainingPreferenceOptimizeParams
import com.llama.llamastack.models.PostTrainingSupervisedFineTuneParams
import com.llama.llamastack.services.async.postTraining.JobServiceAsync

interface PostTrainingServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): PostTrainingServiceAsync

    fun job(): JobServiceAsync

    /** Run preference optimization of a model. */
    suspend fun preferenceOptimize(
        params: PostTrainingPreferenceOptimizeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PostTrainingJob

    /** Run supervised fine-tuning of a model. */
    suspend fun supervisedFineTune(
        params: PostTrainingSupervisedFineTuneParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PostTrainingJob

    /**
     * A view of [PostTrainingServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): PostTrainingServiceAsync.WithRawResponse

        fun job(): JobServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/post-training/preference-optimize`, but is
         * otherwise the same as [PostTrainingServiceAsync.preferenceOptimize].
         */
        @MustBeClosed
        suspend fun preferenceOptimize(
            params: PostTrainingPreferenceOptimizeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PostTrainingJob>

        /**
         * Returns a raw HTTP response for `post /v1/post-training/supervised-fine-tune`, but is
         * otherwise the same as [PostTrainingServiceAsync.supervisedFineTune].
         */
        @MustBeClosed
        suspend fun supervisedFineTune(
            params: PostTrainingSupervisedFineTuneParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PostTrainingJob>
    }
}
