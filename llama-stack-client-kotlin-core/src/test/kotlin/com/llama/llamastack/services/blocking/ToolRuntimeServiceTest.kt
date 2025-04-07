// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.blocking

import com.llama.llamastack.TestServerExtension
import com.llama.llamastack.client.okhttp.LlamaStackClientOkHttpClient
import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.models.ToolRuntimeInvokeToolParams
import com.llama.llamastack.models.ToolRuntimeListToolsParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ToolRuntimeServiceTest {

    @Test
    fun invokeTool() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val toolRuntimeService = client.toolRuntime()

        val toolInvocationResult =
            toolRuntimeService.invokeTool(
                ToolRuntimeInvokeToolParams.builder()
                    .kwargs(
                        ToolRuntimeInvokeToolParams.Kwargs.builder()
                            .putAdditionalProperty("foo", JsonValue.from(true))
                            .build()
                    )
                    .toolName("tool_name")
                    .build()
            )

        toolInvocationResult.validate()
    }

    @Test
    fun listTools() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val toolRuntimeService = client.toolRuntime()

        val toolDefs =
            toolRuntimeService.listTools(
                ToolRuntimeListToolsParams.builder()
                    .mcpEndpoint(
                        ToolRuntimeListToolsParams.McpEndpoint.builder().uri("uri").build()
                    )
                    .toolGroupId("tool_group_id")
                    .build()
            )

        toolDefs.forEach { it.validate() }
    }
}
