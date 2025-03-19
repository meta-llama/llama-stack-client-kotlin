// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.async.postTraining

import com.google.errorprone.annotations.MustBeClosed
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

interface JobServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    suspend fun list(
        params: PostTrainingJobListParams = PostTrainingJobListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<ListPostTrainingJobsResponse.Data>

    /** @see [list] */
    suspend fun list(requestOptions: RequestOptions): List<ListPostTrainingJobsResponse.Data> =
        list(PostTrainingJobListParams.none(), requestOptions)

    suspend fun artifacts(
        params: PostTrainingJobArtifactsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PostTrainingJobArtifactsResponse?

    suspend fun cancel(
        params: PostTrainingJobCancelParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    suspend fun status(
        params: PostTrainingJobStatusParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PostTrainingJobStatusResponse?

    /** A view of [JobServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /v1/post-training/jobs`, but is otherwise the same
         * as [JobServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: PostTrainingJobListParams = PostTrainingJobListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<ListPostTrainingJobsResponse.Data>>

        /** @see [list] */
        @MustBeClosed
        suspend fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<List<ListPostTrainingJobsResponse.Data>> =
            list(PostTrainingJobListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/post-training/job/artifacts`, but is otherwise
         * the same as [JobServiceAsync.artifacts].
         */
        @MustBeClosed
        suspend fun artifacts(
            params: PostTrainingJobArtifactsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PostTrainingJobArtifactsResponse?>

        /**
         * Returns a raw HTTP response for `post /v1/post-training/job/cancel`, but is otherwise the
         * same as [JobServiceAsync.cancel].
         */
        @MustBeClosed
        suspend fun cancel(
            params: PostTrainingJobCancelParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /v1/post-training/job/status`, but is otherwise the
         * same as [JobServiceAsync.status].
         */
        @MustBeClosed
        suspend fun status(
            params: PostTrainingJobStatusParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PostTrainingJobStatusResponse?>
    }
}
