// File generated from our OpenAPI spec by Stainless.

package com.llama_stack_client.api.services.blocking

import com.llama_stack_client.api.TestServerExtension
import com.llama_stack_client.api.client.okhttp.LlamaStackClientOkHttpClient
import com.llama_stack_client.api.models.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class ShieldServiceTest {

    @Test
    fun callList() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val shieldService = client.shields()
        val shieldSpec = shieldService.list(ShieldListParams.builder().build())
        println(shieldSpec)
        shieldSpec.validate()
    }

    @Test
    fun callGet() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val shieldService = client.shields()
        val shieldSpec =
            shieldService.get(ShieldGetParams.builder().shieldType("shield_type").build())
        println(shieldSpec)
        shieldSpec?.validate()
    }
}
