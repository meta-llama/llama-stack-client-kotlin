// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.blocking

import com.llama.llamastack.TestServerExtension
import com.llama.llamastack.client.okhttp.LlamaStackClientOkHttpClient
import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.models.ToolRuntimeInvokeToolParams
import com.llama.llamastack.models.ToolRuntimeListToolsParams
import com.llama.llamastack.models.Url
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class ToolRuntimeServiceTest {

    @Test
    fun callInvokeTool() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val toolRuntimeService = client.toolRuntime()
        val toolInvocationResult =
            toolRuntimeService.invokeTool(
                ToolRuntimeInvokeToolParams.builder()
                    .args(
                        ToolRuntimeInvokeToolParams.Args.builder()
                            .putAdditionalProperty("foo", JsonValue.from(true))
                            .build()
                    )
                    .toolName("tool_name")
                    .xLlamaStackClientVersion("X-LlamaStack-Client-Version")
                    .xLlamaStackProviderData("X-LlamaStack-Provider-Data")
                    .build()
            )
        println(toolInvocationResult)
        toolInvocationResult.validate()
    }

    @Disabled(
        "skipped: currently no good way to test endpoints with content type application/jsonl, Prism mock server will fail"
    )
    @Test
    fun callListTools() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val toolRuntimeService = client.toolRuntime()
        val toolDef =
            toolRuntimeService.listTools(
                ToolRuntimeListToolsParams.builder()
                    .mcpEndpoint(Url.builder().uri("uri").build())
                    .toolGroupId("tool_group_id")
                    .xLlamaStackClientVersion("X-LlamaStack-Client-Version")
                    .xLlamaStackProviderData("X-LlamaStack-Provider-Data")
                    .build()
            )
        println(toolDef)
        toolDef.validate()
    }
}
