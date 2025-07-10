package com.llama.llamastack.client.local.services

import com.llama.llamastack.client.local.LocalClientOptions
import com.llama.llamastack.client.local.services.toolruntime.RagToolServiceLocalImpl
import com.llama.llamastack.core.ClientOptions
import com.llama.llamastack.core.RequestOptions
import com.llama.llamastack.models.ToolDef
import com.llama.llamastack.models.ToolInvocationResult
import com.llama.llamastack.models.ToolRuntimeInvokeToolParams
import com.llama.llamastack.models.ToolRuntimeListToolsParams
import com.llama.llamastack.services.blocking.InferenceService
import com.llama.llamastack.services.blocking.ToolRuntimeService
import com.llama.llamastack.services.blocking.toolRuntime.RagToolService

class ToolRuntimeServiceLocalImpl
constructor(
    private val clientOptions: LocalClientOptions,
    private val inferenceServiceLocalImpl: InferenceService,
) : ToolRuntimeService {
    private val ragTool: RagToolService by lazy {
        RagToolServiceLocalImpl(clientOptions, inferenceServiceLocalImpl)
    }

    override fun withRawResponse(): ToolRuntimeService.WithRawResponse {
        TODO("Not yet implemented")
    }

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ToolRuntimeService {
        TODO("Not yet implemented")
    }

    override fun ragTool(): RagToolService = ragTool

    override fun invokeTool(
        params: ToolRuntimeInvokeToolParams,
        requestOptions: RequestOptions,
    ): ToolInvocationResult {
        TODO("Not yet implemented")
    }

    override fun listTools(
        params: ToolRuntimeListToolsParams,
        requestOptions: RequestOptions,
    ): List<ToolDef> {
        TODO("Not yet implemented")
    }
}
