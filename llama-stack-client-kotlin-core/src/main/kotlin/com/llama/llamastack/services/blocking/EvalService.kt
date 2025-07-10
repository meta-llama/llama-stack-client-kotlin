// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.blocking

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
import com.llama.llamastack.services.blocking.eval.JobService

interface EvalService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): EvalService

    fun jobs(): JobService

    /** Evaluate a list of rows on a benchmark. */
    fun evaluateRows(
        benchmarkId: String,
        params: EvalEvaluateRowsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EvaluateResponse =
        evaluateRows(params.toBuilder().benchmarkId(benchmarkId).build(), requestOptions)

    /** @see [evaluateRows] */
    fun evaluateRows(
        params: EvalEvaluateRowsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EvaluateResponse

    /** Evaluate a list of rows on a benchmark. */
    fun evaluateRowsAlpha(
        benchmarkId: String,
        params: EvalEvaluateRowsAlphaParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EvaluateResponse =
        evaluateRowsAlpha(params.toBuilder().benchmarkId(benchmarkId).build(), requestOptions)

    /** @see [evaluateRowsAlpha] */
    fun evaluateRowsAlpha(
        params: EvalEvaluateRowsAlphaParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EvaluateResponse

    /** Run an evaluation on a benchmark. */
    fun runEval(
        benchmarkId: String,
        params: EvalRunEvalParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Job = runEval(params.toBuilder().benchmarkId(benchmarkId).build(), requestOptions)

    /** @see [runEval] */
    fun runEval(
        params: EvalRunEvalParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Job

    /** Run an evaluation on a benchmark. */
    fun runEvalAlpha(
        benchmarkId: String,
        params: EvalRunEvalAlphaParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Job = runEvalAlpha(params.toBuilder().benchmarkId(benchmarkId).build(), requestOptions)

    /** @see [runEvalAlpha] */
    fun runEvalAlpha(
        params: EvalRunEvalAlphaParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Job

    /** A view of [EvalService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): EvalService.WithRawResponse

        fun jobs(): JobService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/eval/benchmarks/{benchmark_id}/evaluations`,
         * but is otherwise the same as [EvalService.evaluateRows].
         */
        @MustBeClosed
        fun evaluateRows(
            benchmarkId: String,
            params: EvalEvaluateRowsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EvaluateResponse> =
            evaluateRows(params.toBuilder().benchmarkId(benchmarkId).build(), requestOptions)

        /** @see [evaluateRows] */
        @MustBeClosed
        fun evaluateRows(
            params: EvalEvaluateRowsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EvaluateResponse>

        /**
         * Returns a raw HTTP response for `post /v1/eval/benchmarks/{benchmark_id}/evaluations`,
         * but is otherwise the same as [EvalService.evaluateRowsAlpha].
         */
        @MustBeClosed
        fun evaluateRowsAlpha(
            benchmarkId: String,
            params: EvalEvaluateRowsAlphaParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EvaluateResponse> =
            evaluateRowsAlpha(params.toBuilder().benchmarkId(benchmarkId).build(), requestOptions)

        /** @see [evaluateRowsAlpha] */
        @MustBeClosed
        fun evaluateRowsAlpha(
            params: EvalEvaluateRowsAlphaParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EvaluateResponse>

        /**
         * Returns a raw HTTP response for `post /v1/eval/benchmarks/{benchmark_id}/jobs`, but is
         * otherwise the same as [EvalService.runEval].
         */
        @MustBeClosed
        fun runEval(
            benchmarkId: String,
            params: EvalRunEvalParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Job> =
            runEval(params.toBuilder().benchmarkId(benchmarkId).build(), requestOptions)

        /** @see [runEval] */
        @MustBeClosed
        fun runEval(
            params: EvalRunEvalParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Job>

        /**
         * Returns a raw HTTP response for `post /v1/eval/benchmarks/{benchmark_id}/jobs`, but is
         * otherwise the same as [EvalService.runEvalAlpha].
         */
        @MustBeClosed
        fun runEvalAlpha(
            benchmarkId: String,
            params: EvalRunEvalAlphaParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Job> =
            runEvalAlpha(params.toBuilder().benchmarkId(benchmarkId).build(), requestOptions)

        /** @see [runEvalAlpha] */
        @MustBeClosed
        fun runEvalAlpha(
            params: EvalRunEvalAlphaParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Job>
    }
}
