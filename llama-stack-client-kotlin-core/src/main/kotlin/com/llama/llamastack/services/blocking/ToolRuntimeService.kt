// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.blocking

import com.llama.llamastack.core.RequestOptions
import com.llama.llamastack.core.http.StreamResponse
import com.llama.llamastack.models.ToolDef
import com.llama.llamastack.models.ToolInvocationResult
import com.llama.llamastack.models.ToolRuntimeInvokeToolParams
import com.llama.llamastack.models.ToolRuntimeListToolsParams
import com.llama.llamastack.services.blocking.toolRuntime.RagToolService

interface ToolRuntimeService {

    fun ragTool(): RagToolService

    /** Run a tool with the given arguments */
    fun invokeTool(
        params: ToolRuntimeInvokeToolParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): ToolInvocationResult

    fun listToolsStreaming(
        params: ToolRuntimeListToolsParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): StreamResponse<ToolDef>
}
