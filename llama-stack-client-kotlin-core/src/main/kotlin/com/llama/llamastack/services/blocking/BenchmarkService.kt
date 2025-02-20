// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.blocking

import com.llama.llamastack.core.RequestOptions
import com.llama.llamastack.models.Benchmark
import com.llama.llamastack.models.BenchmarkListParams
import com.llama.llamastack.models.BenchmarkRegisterParams
import com.llama.llamastack.models.BenchmarkRetrieveParams

interface BenchmarkService {

    fun retrieve(
        params: BenchmarkRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Benchmark?

    fun list(
        params: BenchmarkListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<Benchmark>

    fun register(
        params: BenchmarkRegisterParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )
}
