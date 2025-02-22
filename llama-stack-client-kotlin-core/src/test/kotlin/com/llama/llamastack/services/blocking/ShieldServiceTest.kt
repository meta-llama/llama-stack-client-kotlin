// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.blocking

import com.llama.llamastack.TestServerExtension
import com.llama.llamastack.client.okhttp.LlamaStackClientOkHttpClient
import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.models.Shield
import com.llama.llamastack.models.ShieldListParams
import com.llama.llamastack.models.ShieldRegisterParams
import com.llama.llamastack.models.ShieldRetrieveParams
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
            shieldService.retrieve(ShieldRetrieveParams.builder().identifier("identifier").build())
        println(shield)
        shield?.validate()
    }

    @Test
    fun callList() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val shieldService = client.shields()
        val listShieldsResponse = shieldService.list(ShieldListParams.builder().build())
        println(listShieldsResponse)
        for (shield: Shield in listShieldsResponse) {
            shield.validate()
        }
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
                    .params(
                        ShieldRegisterParams.Params.builder()
                            .putAdditionalProperty("foo", JsonValue.from(true))
                            .build()
                    )
                    .providerId("provider_id")
                    .providerShieldId("provider_shield_id")
                    .build()
            )
        println(shield)
        shield.validate()
    }
}
