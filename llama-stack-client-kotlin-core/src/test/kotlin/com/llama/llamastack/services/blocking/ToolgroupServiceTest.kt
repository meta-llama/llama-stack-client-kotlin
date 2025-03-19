// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.blocking

import com.llama.llamastack.TestServerExtension
import com.llama.llamastack.client.okhttp.LlamaStackClientOkHttpClient
import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.models.ToolgroupGetParams
import com.llama.llamastack.models.ToolgroupRegisterParams
import com.llama.llamastack.models.ToolgroupUnregisterParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class ToolgroupServiceTest {

    @Test
    fun list() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val toolgroupService = client.toolgroups()

        val toolGroups = toolgroupService.list()

        toolGroups.forEach { it.validate() }
    }

    @Test
    fun get() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val toolgroupService = client.toolgroups()

        val toolGroup =
            toolgroupService.get(ToolgroupGetParams.builder().toolgroupId("toolgroup_id").build())

        toolGroup.validate()
    }

    @Test
    fun register() {
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
    fun unregister() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val toolgroupService = client.toolgroups()

        toolgroupService.unregister(
            ToolgroupUnregisterParams.builder().toolgroupId("toolgroup_id").build()
        )
    }
}
