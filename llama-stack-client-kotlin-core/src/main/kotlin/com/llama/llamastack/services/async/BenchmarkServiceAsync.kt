// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.async

import com.llama.llamastack.core.RequestOptions
import com.llama.llamastack.models.Benchmark
import com.llama.llamastack.models.BenchmarkListParams
import com.llama.llamastack.models.BenchmarkRegisterParams
import com.llama.llamastack.models.BenchmarkRetrieveParams

interface BenchmarkServiceAsync {

    suspend fun retrieve(
        params: BenchmarkRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Benchmark?

    suspend fun list(
        params: BenchmarkListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<Benchmark>

    suspend fun register(
        params: BenchmarkRegisterParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )
}
