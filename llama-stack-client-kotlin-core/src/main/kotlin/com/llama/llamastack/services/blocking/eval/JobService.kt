// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.blocking.eval

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

    /** Get the result of a job. */
    fun retrieve(
        jobId: String,
        params: EvalJobRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EvaluateResponse = retrieve(params.toBuilder().jobId(jobId).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        params: EvalJobRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EvaluateResponse

    /** Cancel a job. */
    fun cancel(
        jobId: String,
        params: EvalJobCancelParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = cancel(params.toBuilder().jobId(jobId).build(), requestOptions)

    /** @see [cancel] */
    fun cancel(params: EvalJobCancelParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Get the status of a job. */
    fun status(
        jobId: String,
        params: EvalJobStatusParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Job = status(params.toBuilder().jobId(jobId).build(), requestOptions)

    /** @see [status] */
    fun status(
        params: EvalJobStatusParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Job

    /** A view of [JobService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): JobService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get
         * /v1/eval/benchmarks/{benchmark_id}/jobs/{job_id}/result`, but is otherwise the same as
         * [JobService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            jobId: String,
            params: EvalJobRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EvaluateResponse> =
            retrieve(params.toBuilder().jobId(jobId).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: EvalJobRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EvaluateResponse>

        /**
         * Returns a raw HTTP response for `delete
         * /v1/eval/benchmarks/{benchmark_id}/jobs/{job_id}`, but is otherwise the same as
         * [JobService.cancel].
         */
        @MustBeClosed
        fun cancel(
            jobId: String,
            params: EvalJobCancelParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = cancel(params.toBuilder().jobId(jobId).build(), requestOptions)

        /** @see [cancel] */
        @MustBeClosed
        fun cancel(
            params: EvalJobCancelParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /v1/eval/benchmarks/{benchmark_id}/jobs/{job_id}`,
         * but is otherwise the same as [JobService.status].
         */
        @MustBeClosed
        fun status(
            jobId: String,
            params: EvalJobStatusParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Job> = status(params.toBuilder().jobId(jobId).build(), requestOptions)

        /** @see [status] */
        @MustBeClosed
        fun status(
            params: EvalJobStatusParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Job>
    }
}
