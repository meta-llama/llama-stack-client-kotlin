// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.llama.llamastack.core.RequestOptions
import com.llama.llamastack.core.http.HttpResponse
import com.llama.llamastack.core.http.HttpResponseFor
import com.llama.llamastack.models.QueryChunksResponse
import com.llama.llamastack.models.VectorIoInsertParams
import com.llama.llamastack.models.VectorIoQueryParams

interface VectorIoServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    suspend fun insert(
        params: VectorIoInsertParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    suspend fun query(
        params: VectorIoQueryParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): QueryChunksResponse

    /**
     * A view of [VectorIoServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /v1/vector-io/insert`, but is otherwise the same as
         * [VectorIoServiceAsync.insert].
         */
        @MustBeClosed
        suspend fun insert(
            params: VectorIoInsertParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `post /v1/vector-io/query`, but is otherwise the same as
         * [VectorIoServiceAsync.query].
         */
        @MustBeClosed
        suspend fun query(
            params: VectorIoQueryParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<QueryChunksResponse>
    }
}
