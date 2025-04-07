// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.llama.llamastack.core.RequestOptions
import com.llama.llamastack.core.http.HttpResponse
import com.llama.llamastack.core.http.HttpResponseFor
import com.llama.llamastack.models.Benchmark
import com.llama.llamastack.models.BenchmarkListParams
import com.llama.llamastack.models.BenchmarkRegisterParams
import com.llama.llamastack.models.BenchmarkRetrieveParams

interface BenchmarkServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    suspend fun retrieve(
        params: BenchmarkRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Benchmark

    suspend fun list(
        params: BenchmarkListParams = BenchmarkListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<Benchmark>

    /** @see [list] */
    suspend fun list(requestOptions: RequestOptions): List<Benchmark> =
        list(BenchmarkListParams.none(), requestOptions)

    suspend fun register(
        params: BenchmarkRegisterParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * A view of [BenchmarkServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /v1/eval/benchmarks/{benchmark_id}`, but is
         * otherwise the same as [BenchmarkServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            params: BenchmarkRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Benchmark>

        /**
         * Returns a raw HTTP response for `get /v1/eval/benchmarks`, but is otherwise the same as
         * [BenchmarkServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: BenchmarkListParams = BenchmarkListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<Benchmark>>

        /** @see [list] */
        @MustBeClosed
        suspend fun list(requestOptions: RequestOptions): HttpResponseFor<List<Benchmark>> =
            list(BenchmarkListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/eval/benchmarks`, but is otherwise the same as
         * [BenchmarkServiceAsync.register].
         */
        @MustBeClosed
        suspend fun register(
            params: BenchmarkRegisterParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
