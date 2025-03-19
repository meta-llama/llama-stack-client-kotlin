// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.llama.llamastack.core.RequestOptions
import com.llama.llamastack.core.http.HttpResponse
import com.llama.llamastack.core.http.HttpResponseFor
import com.llama.llamastack.models.ToolGroup
import com.llama.llamastack.models.ToolgroupGetParams
import com.llama.llamastack.models.ToolgroupListParams
import com.llama.llamastack.models.ToolgroupRegisterParams
import com.llama.llamastack.models.ToolgroupUnregisterParams

interface ToolgroupServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** List tool groups with optional provider */
    suspend fun list(
        params: ToolgroupListParams = ToolgroupListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<ToolGroup>

    /** @see [list] */
    suspend fun list(requestOptions: RequestOptions): List<ToolGroup> =
        list(ToolgroupListParams.none(), requestOptions)

    suspend fun get(
        params: ToolgroupGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ToolGroup

    /** Register a tool group */
    suspend fun register(
        params: ToolgroupRegisterParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** Unregister a tool group */
    suspend fun unregister(
        params: ToolgroupUnregisterParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * A view of [ToolgroupServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /v1/toolgroups`, but is otherwise the same as
         * [ToolgroupServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: ToolgroupListParams = ToolgroupListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<ToolGroup>>

        /** @see [list] */
        @MustBeClosed
        suspend fun list(requestOptions: RequestOptions): HttpResponseFor<List<ToolGroup>> =
            list(ToolgroupListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/toolgroups/{toolgroup_id}`, but is otherwise the
         * same as [ToolgroupServiceAsync.get].
         */
        @MustBeClosed
        suspend fun get(
            params: ToolgroupGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ToolGroup>

        /**
         * Returns a raw HTTP response for `post /v1/toolgroups`, but is otherwise the same as
         * [ToolgroupServiceAsync.register].
         */
        @MustBeClosed
        suspend fun register(
            params: ToolgroupRegisterParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `delete /v1/toolgroups/{toolgroup_id}`, but is otherwise
         * the same as [ToolgroupServiceAsync.unregister].
         */
        @MustBeClosed
        suspend fun unregister(
            params: ToolgroupUnregisterParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
