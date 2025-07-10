// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.llama.llamastack.core.ClientOptions
import com.llama.llamastack.core.RequestOptions
import com.llama.llamastack.core.http.HttpResponseFor
import com.llama.llamastack.models.Tool
import com.llama.llamastack.models.ToolGetParams
import com.llama.llamastack.models.ToolListParams

interface ToolServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ToolServiceAsync

    /** List tools with optional tool group. */
    suspend fun list(
        params: ToolListParams = ToolListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<Tool>

    /** @see [list] */
    suspend fun list(requestOptions: RequestOptions): List<Tool> =
        list(ToolListParams.none(), requestOptions)

    /** Get a tool by its name. */
    suspend fun get(
        toolName: String,
        params: ToolGetParams = ToolGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Tool = get(params.toBuilder().toolName(toolName).build(), requestOptions)

    /** @see [get] */
    suspend fun get(
        params: ToolGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Tool

    /** @see [get] */
    suspend fun get(toolName: String, requestOptions: RequestOptions): Tool =
        get(toolName, ToolGetParams.none(), requestOptions)

    /** A view of [ToolServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ToolServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/tools`, but is otherwise the same as
         * [ToolServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: ToolListParams = ToolListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<Tool>>

        /** @see [list] */
        @MustBeClosed
        suspend fun list(requestOptions: RequestOptions): HttpResponseFor<List<Tool>> =
            list(ToolListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/tools/{tool_name}`, but is otherwise the same as
         * [ToolServiceAsync.get].
         */
        @MustBeClosed
        suspend fun get(
            toolName: String,
            params: ToolGetParams = ToolGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Tool> =
            get(params.toBuilder().toolName(toolName).build(), requestOptions)

        /** @see [get] */
        @MustBeClosed
        suspend fun get(
            params: ToolGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Tool>

        /** @see [get] */
        @MustBeClosed
        suspend fun get(toolName: String, requestOptions: RequestOptions): HttpResponseFor<Tool> =
            get(toolName, ToolGetParams.none(), requestOptions)
    }
}
