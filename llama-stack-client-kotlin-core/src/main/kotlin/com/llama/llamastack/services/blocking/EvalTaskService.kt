// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.blocking

import com.llama.llamastack.core.RequestOptions
import com.llama.llamastack.models.EvalTask
import com.llama.llamastack.models.EvalTaskListParams
import com.llama.llamastack.models.EvalTaskRegisterParams
import com.llama.llamastack.models.EvalTaskRetrieveParams

interface EvalTaskService {

    fun retrieve(
        params: EvalTaskRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): EvalTask?

    fun list(
        params: EvalTaskListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): EvalTask

    fun register(
        params: EvalTaskRegisterParams,
        requestOptions: RequestOptions = RequestOptions.none()
    )
}
