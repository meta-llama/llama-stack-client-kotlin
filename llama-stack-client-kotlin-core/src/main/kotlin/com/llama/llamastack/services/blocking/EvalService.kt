// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.blocking

import com.llama.llamastack.core.RequestOptions
import com.llama.llamastack.models.EvalEvaluateRowsParams
import com.llama.llamastack.models.EvalRunEvalParams
import com.llama.llamastack.models.EvaluateResponse
import com.llama.llamastack.models.Job
import com.llama.llamastack.services.blocking.eval.JobService

interface EvalService {

    fun jobs(): JobService

    fun evaluateRows(
        params: EvalEvaluateRowsParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): EvaluateResponse

    fun runEval(
        params: EvalRunEvalParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): Job
}
