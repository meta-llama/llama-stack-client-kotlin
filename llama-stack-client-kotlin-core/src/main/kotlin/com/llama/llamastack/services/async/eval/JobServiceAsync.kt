// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.async.eval

import com.google.errorprone.annotations.MustBeClosed
import com.llama.llamastack.core.ClientOptions
import com.llama.llamastack.core.RequestOptions
import com.llama.llamastack.core.http.HttpResponse
import com.llama.llamastack.core.http.HttpResponseFor
import com.llama.llamastack.models.EvalJobCancelParams
import com.llama.llamastack.models.EvalJobRetrieveParams
import com.llama.llamastack.models.EvalJobStatusParams
import com.llama.llamastack.models.EvaluateResponse
import com.llama.llamastack.models.Job

interface JobServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): JobServiceAsync

    /** Get the result of a job. */
    suspend fun retrieve(
        jobId: String,
        params: EvalJobRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EvaluateResponse = retrieve(params.toBuilder().jobId(jobId).build(), requestOptions)

    /** @see [retrieve] */
    suspend fun retrieve(
        params: EvalJobRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EvaluateResponse

    /** Cancel a job. */
    suspend fun cancel(
        jobId: String,
        params: EvalJobCancelParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = cancel(params.toBuilder().jobId(jobId).build(), requestOptions)

    /** @see [cancel] */
    suspend fun cancel(
        params: EvalJobCancelParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** Get the status of a job. */
    suspend fun status(
        jobId: String,
        params: EvalJobStatusParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Job = status(params.toBuilder().jobId(jobId).build(), requestOptions)

    /** @see [status] */
    suspend fun status(
        params: EvalJobStatusParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Job

    /** A view of [JobServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): JobServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get
         * /v1/eval/benchmarks/{benchmark_id}/jobs/{job_id}/result`, but is otherwise the same as
         * [JobServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            jobId: String,
            params: EvalJobRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EvaluateResponse> =
            retrieve(params.toBuilder().jobId(jobId).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        suspend fun retrieve(
            params: EvalJobRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EvaluateResponse>

        /**
         * Returns a raw HTTP response for `delete
         * /v1/eval/benchmarks/{benchmark_id}/jobs/{job_id}`, but is otherwise the same as
         * [JobServiceAsync.cancel].
         */
        @MustBeClosed
        suspend fun cancel(
            jobId: String,
            params: EvalJobCancelParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = cancel(params.toBuilder().jobId(jobId).build(), requestOptions)

        /** @see [cancel] */
        @MustBeClosed
        suspend fun cancel(
            params: EvalJobCancelParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /v1/eval/benchmarks/{benchmark_id}/jobs/{job_id}`,
         * but is otherwise the same as [JobServiceAsync.status].
         */
        @MustBeClosed
        suspend fun status(
            jobId: String,
            params: EvalJobStatusParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Job> = status(params.toBuilder().jobId(jobId).build(), requestOptions)

        /** @see [status] */
        @MustBeClosed
        suspend fun status(
            params: EvalJobStatusParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Job>
    }
}
