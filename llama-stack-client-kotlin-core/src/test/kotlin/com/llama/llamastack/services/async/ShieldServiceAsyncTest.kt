// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.async

import com.llama.llamastack.TestServerExtension
import com.llama.llamastack.client.okhttp.LlamaStackClientOkHttpClientAsync
import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.models.ShieldRegisterParams
import com.llama.llamastack.models.ShieldRetrieveParams
import kotlin.test.assertNotNull
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class ShieldServiceAsyncTest {

    @Test
    suspend fun retrieve() {
        val client =
            LlamaStackClientOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .build()
        val shieldServiceAsync = client.shields()

        val shield =
            shieldServiceAsync.retrieve(
                ShieldRetrieveParams.builder().identifier("identifier").build()
            )

        assertNotNull(shield)
        shield.validate()
    }

    @Test
    suspend fun list() {
        val client =
            LlamaStackClientOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .build()
        val shieldServiceAsync = client.shields()

        val shields = shieldServiceAsync.list()

        shields.forEach { it.validate() }
    }

    @Test
    suspend fun register() {
        val client =
            LlamaStackClientOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .build()
        val shieldServiceAsync = client.shields()

        val shield =
            shieldServiceAsync.register(
                ShieldRegisterParams.builder()
                    .shieldId("shield_id")
                    .params(
                        ShieldRegisterParams.Params.builder()
                            .putAdditionalProperty("foo", JsonValue.from(true))
                            .build()
                    )
                    .providerId("provider_id")
                    .providerShieldId("provider_shield_id")
                    .build()
            )

        shield.validate()
    }
}
