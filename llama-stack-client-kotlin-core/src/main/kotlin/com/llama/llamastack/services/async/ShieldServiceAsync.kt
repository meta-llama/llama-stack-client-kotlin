// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.llama.llamastack.core.ClientOptions
import com.llama.llamastack.core.RequestOptions
import com.llama.llamastack.core.http.HttpResponseFor
import com.llama.llamastack.models.Shield
import com.llama.llamastack.models.ShieldListParams
import com.llama.llamastack.models.ShieldRegisterParams
import com.llama.llamastack.models.ShieldRetrieveParams

interface ShieldServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ShieldServiceAsync

    /** Get a shield by its identifier. */
    suspend fun retrieve(
        identifier: String,
        params: ShieldRetrieveParams = ShieldRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Shield = retrieve(params.toBuilder().identifier(identifier).build(), requestOptions)

    /** @see [retrieve] */
    suspend fun retrieve(
        params: ShieldRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Shield

    /** @see [retrieve] */
    suspend fun retrieve(identifier: String, requestOptions: RequestOptions): Shield =
        retrieve(identifier, ShieldRetrieveParams.none(), requestOptions)

    /** List all shields. */
    suspend fun list(
        params: ShieldListParams = ShieldListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<Shield>

    /** @see [list] */
    suspend fun list(requestOptions: RequestOptions): List<Shield> =
        list(ShieldListParams.none(), requestOptions)

    /** Register a shield. */
    suspend fun register(
        params: ShieldRegisterParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Shield

    /**
     * A view of [ShieldServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): ShieldServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/shields/{identifier}`, but is otherwise the same
         * as [ShieldServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            identifier: String,
            params: ShieldRetrieveParams = ShieldRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Shield> =
            retrieve(params.toBuilder().identifier(identifier).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        suspend fun retrieve(
            params: ShieldRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Shield>

        /** @see [retrieve] */
        @MustBeClosed
        suspend fun retrieve(
            identifier: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Shield> =
            retrieve(identifier, ShieldRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/shields`, but is otherwise the same as
         * [ShieldServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: ShieldListParams = ShieldListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<Shield>>

        /** @see [list] */
        @MustBeClosed
        suspend fun list(requestOptions: RequestOptions): HttpResponseFor<List<Shield>> =
            list(ShieldListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/shields`, but is otherwise the same as
         * [ShieldServiceAsync.register].
         */
        @MustBeClosed
        suspend fun register(
            params: ShieldRegisterParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Shield>
    }
}
