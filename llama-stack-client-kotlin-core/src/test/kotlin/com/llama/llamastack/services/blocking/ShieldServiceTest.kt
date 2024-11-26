// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.blocking

import com.llama.llamastack.TestServerExtension
import com.llama.llamastack.client.okhttp.LlamaStackClientOkHttpClient
import com.llama.llamastack.models.*
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class ShieldServiceTest {

    @Test
    fun callRetrieve() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val shieldService = client.shields()
        val shield =
            shieldService.retrieve(
                ShieldRetrieveParams.builder()
                    .xLlamaStackProviderData("X-LlamaStack-ProviderData")
                    .identifier("identifier")
                    .build()
            )
        println(shield)
        shield?.validate()
    }

    @Disabled(
        "skipped: currently no good way to test endpoints with content type application/jsonl, Prism mock server will fail"
    )
    @Test
    fun callList() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val shieldService = client.shields()
        val shield =
            shieldService.list(
                ShieldListParams.builder()
                    .xLlamaStackProviderData("X-LlamaStack-ProviderData")
                    .build()
            )
        println(shield)
        shield.validate()
    }

    @Test
    fun callRegister() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val shieldService = client.shields()
        val shield =
            shieldService.register(
                ShieldRegisterParams.builder()
                    .shieldId("shield_id")
                    .params(ShieldRegisterParams.Params.builder().build())
                    .providerId("provider_id")
                    .providerShieldId("provider_shield_id")
                    .xLlamaStackProviderData("X-LlamaStack-ProviderData")
                    .build()
            )
        println(shield)
        shield.validate()
    }
}
