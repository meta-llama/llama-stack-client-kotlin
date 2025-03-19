// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.async

import com.google.errorprone.annotations.MustBeClosed
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

    fun jobs(): JobServiceAsync

    /** Evaluate a list of rows on a benchmark. */
    suspend fun evaluateRows(
        params: EvalEvaluateRowsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EvaluateResponse

    /** Evaluate a list of rows on a benchmark. */
    suspend fun evaluateRowsAlpha(
        params: EvalEvaluateRowsAlphaParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EvaluateResponse

    /** Run an evaluation on a benchmark. */
    suspend fun runEval(
        params: EvalRunEvalParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Job

    /** Run an evaluation on a benchmark. */
    suspend fun runEvalAlpha(
        params: EvalRunEvalAlphaParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Job

    /** A view of [EvalServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        fun jobs(): JobServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/eval/benchmarks/{benchmark_id}/evaluations`,
         * but is otherwise the same as [EvalServiceAsync.evaluateRows].
         */
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
            params: EvalEvaluateRowsAlphaParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EvaluateResponse>

        /**
         * Returns a raw HTTP response for `post /v1/eval/benchmarks/{benchmark_id}/jobs`, but is
         * otherwise the same as [EvalServiceAsync.runEval].
         */
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
            params: EvalRunEvalAlphaParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Job>
    }
}
