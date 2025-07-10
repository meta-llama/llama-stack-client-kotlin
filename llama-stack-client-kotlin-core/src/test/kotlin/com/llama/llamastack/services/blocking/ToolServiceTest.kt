// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.blocking

import com.llama.llamastack.TestServerExtension
import com.llama.llamastack.client.okhttp.LlamaStackClientOkHttpClient
import com.llama.llamastack.models.ToolListParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ToolServiceTest {

    @Test
    fun list() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val toolService = client.tools()

        val tools = toolService.list(ToolListParams.builder().toolgroupId("toolgroup_id").build())

        tools.forEach { it.validate() }
    }

    @Test
    fun get() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val toolService = client.tools()

        val tool = toolService.get("tool_name")

        tool.validate()
    }
}
