// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.async

import com.llama.llamastack.TestServerExtension
import com.llama.llamastack.client.okhttp.LlamaStackClientOkHttpClientAsync
import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.models.ToolgroupRegisterParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ToolgroupServiceAsyncTest {

    @Test
    suspend fun list() {
        val client =
            LlamaStackClientOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .build()
        val toolgroupServiceAsync = client.toolgroups()

        val toolGroups = toolgroupServiceAsync.list()

        toolGroups.forEach { it.validate() }
    }

    @Test
    suspend fun get() {
        val client =
            LlamaStackClientOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .build()
        val toolgroupServiceAsync = client.toolgroups()

        val toolGroup = toolgroupServiceAsync.get("toolgroup_id")

        toolGroup.validate()
    }

    @Test
    suspend fun register() {
        val client =
            LlamaStackClientOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .build()
        val toolgroupServiceAsync = client.toolgroups()

        toolgroupServiceAsync.register(
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
    suspend fun unregister() {
        val client =
            LlamaStackClientOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .build()
        val toolgroupServiceAsync = client.toolgroups()

        toolgroupServiceAsync.unregister("toolgroup_id")
    }
}
