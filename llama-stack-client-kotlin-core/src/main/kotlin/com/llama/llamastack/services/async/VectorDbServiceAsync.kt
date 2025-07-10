// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.llama.llamastack.core.ClientOptions
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

interface VectorDbServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): VectorDbServiceAsync

    /** Get a vector database by its identifier. */
    suspend fun retrieve(
        vectorDbId: String,
        params: VectorDbRetrieveParams = VectorDbRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VectorDbRetrieveResponse =
        retrieve(params.toBuilder().vectorDbId(vectorDbId).build(), requestOptions)

    /** @see [retrieve] */
    suspend fun retrieve(
        params: VectorDbRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VectorDbRetrieveResponse

    /** @see [retrieve] */
    suspend fun retrieve(
        vectorDbId: String,
        requestOptions: RequestOptions,
    ): VectorDbRetrieveResponse =
        retrieve(vectorDbId, VectorDbRetrieveParams.none(), requestOptions)

    /** List all vector databases. */
    suspend fun list(
        params: VectorDbListParams = VectorDbListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<ListVectorDbsResponse.Data>

    /** @see [list] */
    suspend fun list(requestOptions: RequestOptions): List<ListVectorDbsResponse.Data> =
        list(VectorDbListParams.none(), requestOptions)

    /** Register a vector database. */
    suspend fun register(
        params: VectorDbRegisterParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VectorDbRegisterResponse

    /** Unregister a vector database. */
    suspend fun unregister(
        vectorDbId: String,
        params: VectorDbUnregisterParams = VectorDbUnregisterParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = unregister(params.toBuilder().vectorDbId(vectorDbId).build(), requestOptions)

    /** @see [unregister] */
    suspend fun unregister(
        params: VectorDbUnregisterParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see [unregister] */
    suspend fun unregister(vectorDbId: String, requestOptions: RequestOptions) =
        unregister(vectorDbId, VectorDbUnregisterParams.none(), requestOptions)

    /**
     * A view of [VectorDbServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): VectorDbServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/vector-dbs/{vector_db_id}`, but is otherwise the
         * same as [VectorDbServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            vectorDbId: String,
            params: VectorDbRetrieveParams = VectorDbRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VectorDbRetrieveResponse> =
            retrieve(params.toBuilder().vectorDbId(vectorDbId).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        suspend fun retrieve(
            params: VectorDbRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VectorDbRetrieveResponse>

        /** @see [retrieve] */
        @MustBeClosed
        suspend fun retrieve(
            vectorDbId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<VectorDbRetrieveResponse> =
            retrieve(vectorDbId, VectorDbRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/vector-dbs`, but is otherwise the same as
         * [VectorDbServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: VectorDbListParams = VectorDbListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<ListVectorDbsResponse.Data>>

        /** @see [list] */
        @MustBeClosed
        suspend fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<List<ListVectorDbsResponse.Data>> =
            list(VectorDbListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/vector-dbs`, but is otherwise the same as
         * [VectorDbServiceAsync.register].
         */
        @MustBeClosed
        suspend fun register(
            params: VectorDbRegisterParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VectorDbRegisterResponse>

        /**
         * Returns a raw HTTP response for `delete /v1/vector-dbs/{vector_db_id}`, but is otherwise
         * the same as [VectorDbServiceAsync.unregister].
         */
        @MustBeClosed
        suspend fun unregister(
            vectorDbId: String,
            params: VectorDbUnregisterParams = VectorDbUnregisterParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            unregister(params.toBuilder().vectorDbId(vectorDbId).build(), requestOptions)

        /** @see [unregister] */
        @MustBeClosed
        suspend fun unregister(
            params: VectorDbUnregisterParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see [unregister] */
        @MustBeClosed
        suspend fun unregister(vectorDbId: String, requestOptions: RequestOptions): HttpResponse =
            unregister(vectorDbId, VectorDbUnregisterParams.none(), requestOptions)
    }
}
