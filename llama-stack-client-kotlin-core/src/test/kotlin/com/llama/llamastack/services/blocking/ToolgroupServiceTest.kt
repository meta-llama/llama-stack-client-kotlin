// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.blocking

import com.llama.llamastack.TestServerExtension
import com.llama.llamastack.client.okhttp.LlamaStackClientOkHttpClient
import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.models.ToolGroup
import com.llama.llamastack.models.ToolgroupGetParams
import com.llama.llamastack.models.ToolgroupListParams
import com.llama.llamastack.models.ToolgroupRegisterParams
import com.llama.llamastack.models.ToolgroupUnregisterParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class ToolgroupServiceTest {

    @Test
    fun callList() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val toolgroupService = client.toolgroups()
        val listToolGroupsResponse = toolgroupService.list(ToolgroupListParams.builder().build())
        println(listToolGroupsResponse)
        for (toolGroup: ToolGroup in listToolGroupsResponse) {
            toolGroup.validate()
        }
    }

    @Test
    fun callGet() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val toolgroupService = client.toolgroups()
        val toolGroup =
            toolgroupService.get(ToolgroupGetParams.builder().toolgroupId("toolgroup_id").build())
        println(toolGroup)
        toolGroup.validate()
    }

    @Test
    fun callRegister() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val toolgroupService = client.toolgroups()
        toolgroupService.register(
            ToolgroupRegisterParams.builder()
                .providerId("provider_id")
                .toolgroupId("toolgroup_id")
                .args(
                    ToolgroupRegisterParams.Args.builder()
                        .putAdditionalProperty("foo", JsonValue.from(true))
                        .build()
                )
                .mcpEndpoint(ToolgroupRegisterParams.McpEndpoint.builder().uri("uri").build())
                .build()
        )
    }

    @Test
    fun callUnregister() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val toolgroupService = client.toolgroups()
        toolgroupService.unregister(
            ToolgroupUnregisterParams.builder().toolgroupId("toolgroup_id").build()
        )
    }
}
