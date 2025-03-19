// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.llama.llamastack.core.RequestOptions
import com.llama.llamastack.core.http.HttpResponse
import com.llama.llamastack.core.http.HttpResponseFor
import com.llama.llamastack.models.ListVectorDbsResponse
import com.llama.llamastack.models.VectorDbListParams
import com.llama.llamastack.models.VectorDbRegisterParams
import com.llama.llamastack.models.VectorDbRegisterResponse
import com.llama.llamastack.models.VectorDbRetrieveParams
import com.llama.llamastack.models.VectorDbRetrieveResponse
import com.llama.llamastack.models.VectorDbUnregisterParams

interface VectorDbService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun retrieve(
        params: VectorDbRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VectorDbRetrieveResponse?

    fun list(
        params: VectorDbListParams = VectorDbListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<ListVectorDbsResponse.Data>

    /** @see [list] */
    fun list(requestOptions: RequestOptions): List<ListVectorDbsResponse.Data> =
        list(VectorDbListParams.none(), requestOptions)

    fun register(
        params: VectorDbRegisterParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VectorDbRegisterResponse

    fun unregister(
        params: VectorDbUnregisterParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** A view of [VectorDbService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /v1/vector-dbs/{vector_db_id}`, but is otherwise the
         * same as [VectorDbService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            params: VectorDbRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VectorDbRetrieveResponse?>

        /**
         * Returns a raw HTTP response for `get /v1/vector-dbs`, but is otherwise the same as
         * [VectorDbService.list].
         */
        @MustBeClosed
        fun list(
            params: VectorDbListParams = VectorDbListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<ListVectorDbsResponse.Data>>

        /** @see [list] */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<List<ListVectorDbsResponse.Data>> =
            list(VectorDbListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/vector-dbs`, but is otherwise the same as
         * [VectorDbService.register].
         */
        @MustBeClosed
        fun register(
            params: VectorDbRegisterParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VectorDbRegisterResponse>

        /**
         * Returns a raw HTTP response for `delete /v1/vector-dbs/{vector_db_id}`, but is otherwise
         * the same as [VectorDbService.unregister].
         */
        @MustBeClosed
        fun unregister(
            params: VectorDbUnregisterParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
