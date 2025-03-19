// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.blocking

import com.llama.llamastack.TestServerExtension
import com.llama.llamastack.client.okhttp.LlamaStackClientOkHttpClient
import com.llama.llamastack.models.ProviderRetrieveParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class ProviderServiceTest {

    @Test
    fun retrieve() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val providerService = client.providers()

        val providerInfo =
            providerService.retrieve(
                ProviderRetrieveParams.builder().providerId("provider_id").build()
            )

        providerInfo.validate()
    }

    @Test
    fun list() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val providerService = client.providers()

        val providerInfos = providerService.list()

        providerInfos.forEach { it.validate() }
    }
}
