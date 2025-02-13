// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.blocking

import com.llama.llamastack.TestServerExtension
import com.llama.llamastack.client.okhttp.LlamaStackClientOkHttpClient
import com.llama.llamastack.models.Tool
import com.llama.llamastack.models.ToolGetParams
import com.llama.llamastack.models.ToolListParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class ToolServiceTest {

    @Test
    fun callList() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val toolService = client.tools()
        val listToolsResponse =
            toolService.list(ToolListParams.builder().toolgroupId("toolgroup_id").build())
        println(listToolsResponse)
        for (tool: Tool in listToolsResponse) {
            tool.validate()
        }
    }

    @Test
    fun callGet() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val toolService = client.tools()
        val tool = toolService.get(ToolGetParams.builder().toolName("tool_name").build())
        println(tool)
        tool.validate()
    }
}
