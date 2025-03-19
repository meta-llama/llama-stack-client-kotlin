// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.llama.llamastack.core.RequestOptions
import com.llama.llamastack.core.http.HttpResponseFor
import com.llama.llamastack.models.Tool
import com.llama.llamastack.models.ToolGetParams
import com.llama.llamastack.models.ToolListParams

interface ToolService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** List tools with optional tool group */
    fun list(
        params: ToolListParams = ToolListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<Tool>

    /** @see [list] */
    fun list(requestOptions: RequestOptions): List<Tool> =
        list(ToolListParams.none(), requestOptions)

    fun get(params: ToolGetParams, requestOptions: RequestOptions = RequestOptions.none()): Tool

    /** A view of [ToolService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /v1/tools`, but is otherwise the same as
         * [ToolService.list].
         */
        @MustBeClosed
        fun list(
            params: ToolListParams = ToolListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<Tool>>

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<List<Tool>> =
            list(ToolListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/tools/{tool_name}`, but is otherwise the same as
         * [ToolService.get].
         */
        @MustBeClosed
        fun get(
            params: ToolGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Tool>
    }
}
