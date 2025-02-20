// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.async.eval

import com.llama.llamastack.core.RequestOptions
import com.llama.llamastack.models.EvalJobCancelParams
import com.llama.llamastack.models.EvalJobRetrieveParams
import com.llama.llamastack.models.EvalJobStatusParams
import com.llama.llamastack.models.EvalJobStatusResponse
import com.llama.llamastack.models.EvaluateResponse

interface JobServiceAsync {

    suspend fun retrieve(
        params: EvalJobRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EvaluateResponse

    suspend fun cancel(
        params: EvalJobCancelParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    suspend fun status(
        params: EvalJobStatusParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EvalJobStatusResponse?
}
