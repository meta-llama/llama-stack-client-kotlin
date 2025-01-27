// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.async

import com.llama.llamastack.core.RequestOptions
import com.llama.llamastack.models.ToolDef
import com.llama.llamastack.models.ToolInvocationResult
import com.llama.llamastack.models.ToolRuntimeInvokeToolParams
import com.llama.llamastack.models.ToolRuntimeListToolsParams
import com.llama.llamastack.services.async.toolRuntime.RagToolServiceAsync

interface ToolRuntimeServiceAsync {

    fun ragTool(): RagToolServiceAsync

    /** Run a tool with the given arguments */
    suspend fun invokeTool(
        params: ToolRuntimeInvokeToolParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): ToolInvocationResult

    suspend fun listTools(
        params: ToolRuntimeListToolsParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): ToolDef
}
