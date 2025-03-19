// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.llama.llamastack.core.RequestOptions
import com.llama.llamastack.core.http.HttpResponseFor
import com.llama.llamastack.core.http.StreamResponse
import com.llama.llamastack.models.ToolDef
import com.llama.llamastack.models.ToolInvocationResult
import com.llama.llamastack.models.ToolRuntimeInvokeToolParams
import com.llama.llamastack.models.ToolRuntimeListToolsParams
import com.llama.llamastack.services.blocking.toolRuntime.RagToolService

interface ToolRuntimeService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun ragTool(): RagToolService

    /** Run a tool with the given arguments */
    fun invokeTool(
        params: ToolRuntimeInvokeToolParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ToolInvocationResult

    @MustBeClosed
    fun listToolsStreaming(
        params: ToolRuntimeListToolsParams = ToolRuntimeListToolsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): StreamResponse<ToolDef>

    /** @see [listToolsStreaming] */
    @MustBeClosed
    fun listToolsStreaming(requestOptions: RequestOptions): StreamResponse<ToolDef> =
        listToolsStreaming(ToolRuntimeListToolsParams.none(), requestOptions)

    /**
     * A view of [ToolRuntimeService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        fun ragTool(): RagToolService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/tool-runtime/invoke`, but is otherwise the same
         * as [ToolRuntimeService.invokeTool].
         */
        @MustBeClosed
        fun invokeTool(
            params: ToolRuntimeInvokeToolParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ToolInvocationResult>

        /**
         * Returns a raw HTTP response for `get /v1/tool-runtime/list-tools`, but is otherwise the
         * same as [ToolRuntimeService.listToolsStreaming].
         */
        @MustBeClosed
        fun listToolsStreaming(
            params: ToolRuntimeListToolsParams = ToolRuntimeListToolsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<StreamResponse<ToolDef>>

        /** @see [listToolsStreaming] */
        @MustBeClosed
        fun listToolsStreaming(
            requestOptions: RequestOptions
        ): HttpResponseFor<StreamResponse<ToolDef>> =
            listToolsStreaming(ToolRuntimeListToolsParams.none(), requestOptions)
    }
}
