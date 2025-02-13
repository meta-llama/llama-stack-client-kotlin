// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.blocking

import com.llama.llamastack.TestServerExtension
import com.llama.llamastack.client.okhttp.LlamaStackClientOkHttpClient
import com.llama.llamastack.models.InspectHealthParams
import com.llama.llamastack.models.InspectVersionParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class InspectServiceTest {

    @Test
    fun callHealth() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val inspectService = client.inspect()
        val healthInfo = inspectService.health(InspectHealthParams.builder().build())
        println(healthInfo)
        healthInfo.validate()
    }

    @Test
    fun callVersion() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val inspectService = client.inspect()
        val versionInfo = inspectService.version(InspectVersionParams.builder().build())
        println(versionInfo)
        versionInfo.validate()
    }
}
