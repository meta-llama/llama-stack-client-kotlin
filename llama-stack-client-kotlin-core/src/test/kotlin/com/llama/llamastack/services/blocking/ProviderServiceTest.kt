// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.blocking

import com.llama.llamastack.TestServerExtension
import com.llama.llamastack.client.okhttp.LlamaStackClientOkHttpClient
import com.llama.llamastack.models.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class ProviderServiceTest {

    @Test
    fun callList() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val providerService = client.providers()
        val providerListResponse =
            providerService.list(
                ProviderListParams.builder()
                    .xLlamaStackProviderData("X-LlamaStack-ProviderData")
                    .build()
            )
        println(providerListResponse)
        providerListResponse.validate()
    }
}
