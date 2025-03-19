// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.llama.llamastack.core.RequestOptions
import com.llama.llamastack.core.http.HttpResponseFor
import com.llama.llamastack.models.ToolDef
import com.llama.llamastack.models.ToolInvocationResult
import com.llama.llamastack.models.ToolRuntimeInvokeToolParams
import com.llama.llamastack.models.ToolRuntimeListToolsParams
import com.llama.llamastack.services.async.toolRuntime.RagToolServiceAsync

interface ToolRuntimeServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun ragTool(): RagToolServiceAsync

    /** Run a tool with the given arguments */
    suspend fun invokeTool(
        params: ToolRuntimeInvokeToolParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ToolInvocationResult

    suspend fun listTools(
        params: ToolRuntimeListToolsParams = ToolRuntimeListToolsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ToolDef

    /** @see [listTools] */
    suspend fun listTools(requestOptions: RequestOptions): ToolDef =
        listTools(ToolRuntimeListToolsParams.none(), requestOptions)

    /**
     * A view of [ToolRuntimeServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        fun ragTool(): RagToolServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/tool-runtime/invoke`, but is otherwise the same
         * as [ToolRuntimeServiceAsync.invokeTool].
         */
        @MustBeClosed
        suspend fun invokeTool(
            params: ToolRuntimeInvokeToolParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ToolInvocationResult>

        /**
         * Returns a raw HTTP response for `get /v1/tool-runtime/list-tools`, but is otherwise the
         * same as [ToolRuntimeServiceAsync.listTools].
         */
        @MustBeClosed
        suspend fun listTools(
            params: ToolRuntimeListToolsParams = ToolRuntimeListToolsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ToolDef>

        /** @see [listTools] */
        @MustBeClosed
        suspend fun listTools(requestOptions: RequestOptions): HttpResponseFor<ToolDef> =
            listTools(ToolRuntimeListToolsParams.none(), requestOptions)
    }
}
