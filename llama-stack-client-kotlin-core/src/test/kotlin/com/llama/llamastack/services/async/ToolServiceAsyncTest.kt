// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.async

import com.llama.llamastack.TestServerExtension
import com.llama.llamastack.client.okhttp.LlamaStackClientOkHttpClientAsync
import com.llama.llamastack.models.ToolGetParams
import com.llama.llamastack.models.ToolListParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class ToolServiceAsyncTest {

    @Test
    suspend fun list() {
        val client =
            LlamaStackClientOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .build()
        val toolServiceAsync = client.tools()

        val tools =
            toolServiceAsync.list(ToolListParams.builder().toolgroupId("toolgroup_id").build())

        tools.forEach { it.validate() }
    }

    @Test
    suspend fun get() {
        val client =
            LlamaStackClientOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .build()
        val toolServiceAsync = client.tools()

        val tool = toolServiceAsync.get(ToolGetParams.builder().toolName("tool_name").build())

        tool.validate()
    }
}
