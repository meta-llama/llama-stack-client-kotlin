// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.async

import com.llama.llamastack.core.RequestOptions
import com.llama.llamastack.models.Benchmark
import com.llama.llamastack.models.EvalTaskListParams
import com.llama.llamastack.models.EvalTaskRegisterParams
import com.llama.llamastack.models.EvalTaskRetrieveParams

interface EvalTaskServiceAsync {

    suspend fun retrieve(
        params: EvalTaskRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Benchmark?

    suspend fun list(
        params: EvalTaskListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<Benchmark>

    suspend fun register(
        params: EvalTaskRegisterParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )
}
