// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.blocking.postTraining

import com.google.errorprone.annotations.MustBeClosed
import com.llama.llamastack.core.ClientOptions
import com.llama.llamastack.core.RequestOptions
import com.llama.llamastack.core.http.HttpResponse
import com.llama.llamastack.core.http.HttpResponseFor
import com.llama.llamastack.models.ListPostTrainingJobsResponse
import com.llama.llamastack.models.PostTrainingJobArtifactsParams
import com.llama.llamastack.models.PostTrainingJobArtifactsResponse
import com.llama.llamastack.models.PostTrainingJobCancelParams
import com.llama.llamastack.models.PostTrainingJobListParams
import com.llama.llamastack.models.PostTrainingJobStatusParams
import com.llama.llamastack.models.PostTrainingJobStatusResponse

interface JobService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): JobService

    /** Get all training jobs. */
    fun list(
        params: PostTrainingJobListParams = PostTrainingJobListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<ListPostTrainingJobsResponse.Data>

    /** @see [list] */
    fun list(requestOptions: RequestOptions): List<ListPostTrainingJobsResponse.Data> =
        list(PostTrainingJobListParams.none(), requestOptions)

    /** Get the artifacts of a training job. */
    fun artifacts(
        params: PostTrainingJobArtifactsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PostTrainingJobArtifactsResponse

    /** Cancel a training job. */
    fun cancel(
        params: PostTrainingJobCancelParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** Get the status of a training job. */
    fun status(
        params: PostTrainingJobStatusParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PostTrainingJobStatusResponse

    /** A view of [JobService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): JobService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/post-training/jobs`, but is otherwise the same
         * as [JobService.list].
         */
        @MustBeClosed
        fun list(
            params: PostTrainingJobListParams = PostTrainingJobListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<ListPostTrainingJobsResponse.Data>>

        /** @see [list] */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<List<ListPostTrainingJobsResponse.Data>> =
            list(PostTrainingJobListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/post-training/job/artifacts`, but is otherwise
         * the same as [JobService.artifacts].
         */
        @MustBeClosed
        fun artifacts(
            params: PostTrainingJobArtifactsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PostTrainingJobArtifactsResponse>

        /**
         * Returns a raw HTTP response for `post /v1/post-training/job/cancel`, but is otherwise the
         * same as [JobService.cancel].
         */
        @MustBeClosed
        fun cancel(
            params: PostTrainingJobCancelParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /v1/post-training/job/status`, but is otherwise the
         * same as [JobService.status].
         */
        @MustBeClosed
        fun status(
            params: PostTrainingJobStatusParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PostTrainingJobStatusResponse>
    }
}
