// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.async

import com.llama.llamastack.TestServerExtension
import com.llama.llamastack.client.okhttp.LlamaStackClientOkHttpClientAsync
import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.models.ToolRuntimeInvokeToolParams
import com.llama.llamastack.models.ToolRuntimeListToolsParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class ToolRuntimeServiceAsyncTest {

    @Test
    suspend fun invokeTool() {
        val client =
            LlamaStackClientOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .build()
        val toolRuntimeServiceAsync = client.toolRuntime()

        val toolInvocationResult =
            toolRuntimeServiceAsync.invokeTool(
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

    @Disabled("Prism doesn't support JSONL responses yet")
    @Test
    suspend fun listTools() {
        val client =
            LlamaStackClientOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .build()
        val toolRuntimeServiceAsync = client.toolRuntime()

        val toolDef =
            toolRuntimeServiceAsync.listTools(
                ToolRuntimeListToolsParams.builder()
                    .mcpEndpoint(
                        ToolRuntimeListToolsParams.McpEndpoint.builder().uri("uri").build()
                    )
                    .toolGroupId("tool_group_id")
                    .build()
            )

        toolDef.validate()
    }
}
