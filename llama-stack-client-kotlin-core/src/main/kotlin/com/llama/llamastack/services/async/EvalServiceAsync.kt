// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.async

import com.llama.llamastack.core.RequestOptions
import com.llama.llamastack.models.EvalEvaluateRowsAlphaParams
import com.llama.llamastack.models.EvalEvaluateRowsParams
import com.llama.llamastack.models.EvalRunEvalAlphaParams
import com.llama.llamastack.models.EvalRunEvalParams
import com.llama.llamastack.models.EvaluateResponse
import com.llama.llamastack.models.Job
import com.llama.llamastack.services.async.eval.JobServiceAsync

interface EvalServiceAsync {

    fun jobs(): JobServiceAsync

    suspend fun evaluateRows(
        params: EvalEvaluateRowsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EvaluateResponse

    suspend fun evaluateRowsAlpha(
        params: EvalEvaluateRowsAlphaParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EvaluateResponse

    suspend fun runEval(
        params: EvalRunEvalParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Job

    suspend fun runEvalAlpha(
        params: EvalRunEvalAlphaParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Job
}
