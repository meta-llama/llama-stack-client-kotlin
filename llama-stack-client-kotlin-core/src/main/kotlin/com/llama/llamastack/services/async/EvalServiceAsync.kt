// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.llama.llamastack.core.ClientOptions
import com.llama.llamastack.core.RequestOptions
import com.llama.llamastack.core.http.HttpResponseFor
import com.llama.llamastack.models.EvalEvaluateRowsAlphaParams
import com.llama.llamastack.models.EvalEvaluateRowsParams
import com.llama.llamastack.models.EvalRunEvalAlphaParams
import com.llama.llamastack.models.EvalRunEvalParams
import com.llama.llamastack.models.EvaluateResponse
import com.llama.llamastack.models.Job
import com.llama.llamastack.services.async.eval.JobServiceAsync

interface EvalServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): EvalServiceAsync

    fun jobs(): JobServiceAsync

    /** Evaluate a list of rows on a benchmark. */
    suspend fun evaluateRows(
        benchmarkId: String,
        params: EvalEvaluateRowsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EvaluateResponse =
        evaluateRows(params.toBuilder().benchmarkId(benchmarkId).build(), requestOptions)

    /** @see [evaluateRows] */
    suspend fun evaluateRows(
        params: EvalEvaluateRowsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EvaluateResponse

    /** Evaluate a list of rows on a benchmark. */
    suspend fun evaluateRowsAlpha(
        benchmarkId: String,
        params: EvalEvaluateRowsAlphaParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EvaluateResponse =
        evaluateRowsAlpha(params.toBuilder().benchmarkId(benchmarkId).build(), requestOptions)

    /** @see [evaluateRowsAlpha] */
    suspend fun evaluateRowsAlpha(
        params: EvalEvaluateRowsAlphaParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EvaluateResponse

    /** Run an evaluation on a benchmark. */
    suspend fun runEval(
        benchmarkId: String,
        params: EvalRunEvalParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Job = runEval(params.toBuilder().benchmarkId(benchmarkId).build(), requestOptions)

    /** @see [runEval] */
    suspend fun runEval(
        params: EvalRunEvalParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Job

    /** Run an evaluation on a benchmark. */
    suspend fun runEvalAlpha(
        benchmarkId: String,
        params: EvalRunEvalAlphaParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Job = runEvalAlpha(params.toBuilder().benchmarkId(benchmarkId).build(), requestOptions)

    /** @see [runEvalAlpha] */
    suspend fun runEvalAlpha(
        params: EvalRunEvalAlphaParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Job

    /** A view of [EvalServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): EvalServiceAsync.WithRawResponse

        fun jobs(): JobServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/eval/benchmarks/{benchmark_id}/evaluations`,
         * but is otherwise the same as [EvalServiceAsync.evaluateRows].
         */
        @MustBeClosed
        suspend fun evaluateRows(
            benchmarkId: String,
            params: EvalEvaluateRowsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EvaluateResponse> =
            evaluateRows(params.toBuilder().benchmarkId(benchmarkId).build(), requestOptions)

        /** @see [evaluateRows] */
        @MustBeClosed
        suspend fun evaluateRows(
            params: EvalEvaluateRowsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EvaluateResponse>

        /**
         * Returns a raw HTTP response for `post /v1/eval/benchmarks/{benchmark_id}/evaluations`,
         * but is otherwise the same as [EvalServiceAsync.evaluateRowsAlpha].
         */
        @MustBeClosed
        suspend fun evaluateRowsAlpha(
            benchmarkId: String,
            params: EvalEvaluateRowsAlphaParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EvaluateResponse> =
            evaluateRowsAlpha(params.toBuilder().benchmarkId(benchmarkId).build(), requestOptions)

        /** @see [evaluateRowsAlpha] */
        @MustBeClosed
        suspend fun evaluateRowsAlpha(
            params: EvalEvaluateRowsAlphaParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EvaluateResponse>

        /**
         * Returns a raw HTTP response for `post /v1/eval/benchmarks/{benchmark_id}/jobs`, but is
         * otherwise the same as [EvalServiceAsync.runEval].
         */
        @MustBeClosed
        suspend fun runEval(
            benchmarkId: String,
            params: EvalRunEvalParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Job> =
            runEval(params.toBuilder().benchmarkId(benchmarkId).build(), requestOptions)

        /** @see [runEval] */
        @MustBeClosed
        suspend fun runEval(
            params: EvalRunEvalParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Job>

        /**
         * Returns a raw HTTP response for `post /v1/eval/benchmarks/{benchmark_id}/jobs`, but is
         * otherwise the same as [EvalServiceAsync.runEvalAlpha].
         */
        @MustBeClosed
        suspend fun runEvalAlpha(
            benchmarkId: String,
            params: EvalRunEvalAlphaParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Job> =
            runEvalAlpha(params.toBuilder().benchmarkId(benchmarkId).build(), requestOptions)

        /** @see [runEvalAlpha] */
        @MustBeClosed
        suspend fun runEvalAlpha(
            params: EvalRunEvalAlphaParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Job>
    }
}
