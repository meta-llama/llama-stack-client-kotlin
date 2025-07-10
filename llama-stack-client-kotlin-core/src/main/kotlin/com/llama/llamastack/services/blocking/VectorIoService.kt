// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.llama.llamastack.core.ClientOptions
import com.llama.llamastack.core.RequestOptions
import com.llama.llamastack.core.http.HttpResponse
import com.llama.llamastack.core.http.HttpResponseFor
import com.llama.llamastack.models.QueryChunksResponse
import com.llama.llamastack.models.VectorIoInsertParams
import com.llama.llamastack.models.VectorIoQueryParams

interface VectorIoService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): VectorIoService

    /** Insert chunks into a vector database. */
    fun insert(params: VectorIoInsertParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Query chunks from a vector database. */
    fun query(
        params: VectorIoQueryParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): QueryChunksResponse

    /** A view of [VectorIoService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): VectorIoService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/vector-io/insert`, but is otherwise the same as
         * [VectorIoService.insert].
         */
        @MustBeClosed
        fun insert(
            params: VectorIoInsertParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `post /v1/vector-io/query`, but is otherwise the same as
         * [VectorIoService.query].
         */
        @MustBeClosed
        fun query(
            params: VectorIoQueryParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<QueryChunksResponse>
    }
}
