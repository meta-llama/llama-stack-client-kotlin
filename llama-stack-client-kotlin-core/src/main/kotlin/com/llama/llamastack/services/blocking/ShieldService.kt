// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.llama.llamastack.core.ClientOptions
import com.llama.llamastack.core.RequestOptions
import com.llama.llamastack.core.http.HttpResponseFor
import com.llama.llamastack.models.Shield
import com.llama.llamastack.models.ShieldListParams
import com.llama.llamastack.models.ShieldRegisterParams
import com.llama.llamastack.models.ShieldRetrieveParams

interface ShieldService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ShieldService

    /** Get a shield by its identifier. */
    fun retrieve(
        identifier: String,
        params: ShieldRetrieveParams = ShieldRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Shield = retrieve(params.toBuilder().identifier(identifier).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        params: ShieldRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Shield

    /** @see [retrieve] */
    fun retrieve(identifier: String, requestOptions: RequestOptions): Shield =
        retrieve(identifier, ShieldRetrieveParams.none(), requestOptions)

    /** List all shields. */
    fun list(
        params: ShieldListParams = ShieldListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<Shield>

    /** @see [list] */
    fun list(requestOptions: RequestOptions): List<Shield> =
        list(ShieldListParams.none(), requestOptions)

    /** Register a shield. */
    fun register(
        params: ShieldRegisterParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Shield

    /** A view of [ShieldService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ShieldService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/shields/{identifier}`, but is otherwise the same
         * as [ShieldService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            identifier: String,
            params: ShieldRetrieveParams = ShieldRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Shield> =
            retrieve(params.toBuilder().identifier(identifier).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: ShieldRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Shield>

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(identifier: String, requestOptions: RequestOptions): HttpResponseFor<Shield> =
            retrieve(identifier, ShieldRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/shields`, but is otherwise the same as
         * [ShieldService.list].
         */
        @MustBeClosed
        fun list(
            params: ShieldListParams = ShieldListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<Shield>>

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<List<Shield>> =
            list(ShieldListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/shields`, but is otherwise the same as
         * [ShieldService.register].
         */
        @MustBeClosed
        fun register(
            params: ShieldRegisterParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Shield>
    }
}
