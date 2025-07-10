// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.llama.llamastack.core.ClientOptions
import com.llama.llamastack.core.RequestOptions
import com.llama.llamastack.core.http.HttpResponse
import com.llama.llamastack.core.http.HttpResponseFor
import com.llama.llamastack.models.ToolGroup
import com.llama.llamastack.models.ToolgroupGetParams
import com.llama.llamastack.models.ToolgroupListParams
import com.llama.llamastack.models.ToolgroupRegisterParams
import com.llama.llamastack.models.ToolgroupUnregisterParams

interface ToolgroupService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ToolgroupService

    /** List tool groups with optional provider. */
    fun list(
        params: ToolgroupListParams = ToolgroupListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<ToolGroup>

    /** @see [list] */
    fun list(requestOptions: RequestOptions): List<ToolGroup> =
        list(ToolgroupListParams.none(), requestOptions)

    /** Get a tool group by its ID. */
    fun get(
        toolgroupId: String,
        params: ToolgroupGetParams = ToolgroupGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ToolGroup = get(params.toBuilder().toolgroupId(toolgroupId).build(), requestOptions)

    /** @see [get] */
    fun get(
        params: ToolgroupGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ToolGroup

    /** @see [get] */
    fun get(toolgroupId: String, requestOptions: RequestOptions): ToolGroup =
        get(toolgroupId, ToolgroupGetParams.none(), requestOptions)

    /** Register a tool group. */
    fun register(
        params: ToolgroupRegisterParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** Unregister a tool group. */
    fun unregister(
        toolgroupId: String,
        params: ToolgroupUnregisterParams = ToolgroupUnregisterParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = unregister(params.toBuilder().toolgroupId(toolgroupId).build(), requestOptions)

    /** @see [unregister] */
    fun unregister(
        params: ToolgroupUnregisterParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see [unregister] */
    fun unregister(toolgroupId: String, requestOptions: RequestOptions) =
        unregister(toolgroupId, ToolgroupUnregisterParams.none(), requestOptions)

    /** A view of [ToolgroupService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ToolgroupService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/toolgroups`, but is otherwise the same as
         * [ToolgroupService.list].
         */
        @MustBeClosed
        fun list(
            params: ToolgroupListParams = ToolgroupListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<ToolGroup>>

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<List<ToolGroup>> =
            list(ToolgroupListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/toolgroups/{toolgroup_id}`, but is otherwise the
         * same as [ToolgroupService.get].
         */
        @MustBeClosed
        fun get(
            toolgroupId: String,
            params: ToolgroupGetParams = ToolgroupGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ToolGroup> =
            get(params.toBuilder().toolgroupId(toolgroupId).build(), requestOptions)

        /** @see [get] */
        @MustBeClosed
        fun get(
            params: ToolgroupGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ToolGroup>

        /** @see [get] */
        @MustBeClosed
        fun get(toolgroupId: String, requestOptions: RequestOptions): HttpResponseFor<ToolGroup> =
            get(toolgroupId, ToolgroupGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/toolgroups`, but is otherwise the same as
         * [ToolgroupService.register].
         */
        @MustBeClosed
        fun register(
            params: ToolgroupRegisterParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `delete /v1/toolgroups/{toolgroup_id}`, but is otherwise
         * the same as [ToolgroupService.unregister].
         */
        @MustBeClosed
        fun unregister(
            toolgroupId: String,
            params: ToolgroupUnregisterParams = ToolgroupUnregisterParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            unregister(params.toBuilder().toolgroupId(toolgroupId).build(), requestOptions)

        /** @see [unregister] */
        @MustBeClosed
        fun unregister(
            params: ToolgroupUnregisterParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see [unregister] */
        @MustBeClosed
        fun unregister(toolgroupId: String, requestOptions: RequestOptions): HttpResponse =
            unregister(toolgroupId, ToolgroupUnregisterParams.none(), requestOptions)
    }
}
