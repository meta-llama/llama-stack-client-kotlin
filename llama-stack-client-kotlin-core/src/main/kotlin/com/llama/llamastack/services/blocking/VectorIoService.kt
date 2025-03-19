// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.blocking

import com.google.errorprone.annotations.MustBeClosed
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

    fun insert(params: VectorIoInsertParams, requestOptions: RequestOptions = RequestOptions.none())

    fun query(
        params: VectorIoQueryParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): QueryChunksResponse

    /** A view of [VectorIoService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

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
