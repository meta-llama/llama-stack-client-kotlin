// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.blocking

import com.llama.llamastack.TestServerExtension
import com.llama.llamastack.client.okhttp.LlamaStackClientOkHttpClient
import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.models.ToolRuntimeInvokeToolParams
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
                    .kwargs(
                        ToolRuntimeInvokeToolParams.Kwargs.builder()
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
}
