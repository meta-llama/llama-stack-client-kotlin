// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.llama.llamastack.core.ClientOptions
import com.llama.llamastack.core.RequestOptions
import com.llama.llamastack.core.http.HttpResponse
import com.llama.llamastack.core.http.HttpResponseFor
import com.llama.llamastack.models.Benchmark
import com.llama.llamastack.models.BenchmarkListParams
import com.llama.llamastack.models.BenchmarkRegisterParams
import com.llama.llamastack.models.BenchmarkRetrieveParams

interface BenchmarkService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): BenchmarkService

    /** Get a benchmark by its ID. */
    fun retrieve(
        benchmarkId: String,
        params: BenchmarkRetrieveParams = BenchmarkRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Benchmark = retrieve(params.toBuilder().benchmarkId(benchmarkId).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        params: BenchmarkRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Benchmark

    /** @see [retrieve] */
    fun retrieve(benchmarkId: String, requestOptions: RequestOptions): Benchmark =
        retrieve(benchmarkId, BenchmarkRetrieveParams.none(), requestOptions)

    /** List all benchmarks. */
    fun list(
        params: BenchmarkListParams = BenchmarkListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<Benchmark>

    /** @see [list] */
    fun list(requestOptions: RequestOptions): List<Benchmark> =
        list(BenchmarkListParams.none(), requestOptions)

    /** Register a benchmark. */
    fun register(
        params: BenchmarkRegisterParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** A view of [BenchmarkService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): BenchmarkService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/eval/benchmarks/{benchmark_id}`, but is
         * otherwise the same as [BenchmarkService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            benchmarkId: String,
            params: BenchmarkRetrieveParams = BenchmarkRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Benchmark> =
            retrieve(params.toBuilder().benchmarkId(benchmarkId).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: BenchmarkRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Benchmark>

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            benchmarkId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Benchmark> =
            retrieve(benchmarkId, BenchmarkRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/eval/benchmarks`, but is otherwise the same as
         * [BenchmarkService.list].
         */
        @MustBeClosed
        fun list(
            params: BenchmarkListParams = BenchmarkListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<Benchmark>>

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<List<Benchmark>> =
            list(BenchmarkListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/eval/benchmarks`, but is otherwise the same as
         * [BenchmarkService.register].
         */
        @MustBeClosed
        fun register(
            params: BenchmarkRegisterParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
