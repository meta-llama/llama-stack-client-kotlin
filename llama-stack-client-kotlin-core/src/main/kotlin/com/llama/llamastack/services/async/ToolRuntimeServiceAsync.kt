// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.llama.llamastack.core.ClientOptions
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

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ToolRuntimeServiceAsync

    fun ragTool(): RagToolServiceAsync

    /** Run a tool with the given arguments. */
    suspend fun invokeTool(
        params: ToolRuntimeInvokeToolParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ToolInvocationResult

    /** List all tools in the runtime. */
    suspend fun listTools(
        params: ToolRuntimeListToolsParams = ToolRuntimeListToolsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<ToolDef>

    /** @see [listTools] */
    suspend fun listTools(requestOptions: RequestOptions): List<ToolDef> =
        listTools(ToolRuntimeListToolsParams.none(), requestOptions)

    /**
     * A view of [ToolRuntimeServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): ToolRuntimeServiceAsync.WithRawResponse

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
        ): HttpResponseFor<List<ToolDef>>

        /** @see [listTools] */
        @MustBeClosed
        suspend fun listTools(requestOptions: RequestOptions): HttpResponseFor<List<ToolDef>> =
            listTools(ToolRuntimeListToolsParams.none(), requestOptions)
    }
}
