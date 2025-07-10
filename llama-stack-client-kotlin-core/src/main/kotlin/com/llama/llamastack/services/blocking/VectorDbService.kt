// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.blocking

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

interface VectorDbService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): VectorDbService

    /** Get a vector database by its identifier. */
    fun retrieve(
        vectorDbId: String,
        params: VectorDbRetrieveParams = VectorDbRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VectorDbRetrieveResponse =
        retrieve(params.toBuilder().vectorDbId(vectorDbId).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        params: VectorDbRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VectorDbRetrieveResponse

    /** @see [retrieve] */
    fun retrieve(vectorDbId: String, requestOptions: RequestOptions): VectorDbRetrieveResponse =
        retrieve(vectorDbId, VectorDbRetrieveParams.none(), requestOptions)

    /** List all vector databases. */
    fun list(
        params: VectorDbListParams = VectorDbListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<ListVectorDbsResponse.Data>

    /** @see [list] */
    fun list(requestOptions: RequestOptions): List<ListVectorDbsResponse.Data> =
        list(VectorDbListParams.none(), requestOptions)

    /** Register a vector database. */
    fun register(
        params: VectorDbRegisterParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VectorDbRegisterResponse

    /** Unregister a vector database. */
    fun unregister(
        vectorDbId: String,
        params: VectorDbUnregisterParams = VectorDbUnregisterParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = unregister(params.toBuilder().vectorDbId(vectorDbId).build(), requestOptions)

    /** @see [unregister] */
    fun unregister(
        params: VectorDbUnregisterParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see [unregister] */
    fun unregister(vectorDbId: String, requestOptions: RequestOptions) =
        unregister(vectorDbId, VectorDbUnregisterParams.none(), requestOptions)

    /** A view of [VectorDbService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): VectorDbService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/vector-dbs/{vector_db_id}`, but is otherwise the
         * same as [VectorDbService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            vectorDbId: String,
            params: VectorDbRetrieveParams = VectorDbRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VectorDbRetrieveResponse> =
            retrieve(params.toBuilder().vectorDbId(vectorDbId).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: VectorDbRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VectorDbRetrieveResponse>

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            vectorDbId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<VectorDbRetrieveResponse> =
            retrieve(vectorDbId, VectorDbRetrieveParams.none(), requestOptions)

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
            vectorDbId: String,
            params: VectorDbUnregisterParams = VectorDbUnregisterParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            unregister(params.toBuilder().vectorDbId(vectorDbId).build(), requestOptions)

        /** @see [unregister] */
        @MustBeClosed
        fun unregister(
            params: VectorDbUnregisterParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see [unregister] */
        @MustBeClosed
        fun unregister(vectorDbId: String, requestOptions: RequestOptions): HttpResponse =
            unregister(vectorDbId, VectorDbUnregisterParams.none(), requestOptions)
    }
}
