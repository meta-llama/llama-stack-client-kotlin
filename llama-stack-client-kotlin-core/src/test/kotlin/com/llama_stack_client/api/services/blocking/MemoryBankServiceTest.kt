// File generated from our OpenAPI spec by Stainless.

package com.llama_stack_client.api.services.blocking

import com.llama_stack_client.api.TestServerExtension
import com.llama_stack_client.api.client.okhttp.LlamaStackClientOkHttpClient
import com.llama_stack_client.api.models.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class MemoryBankServiceTest {

    @Test
    fun callList() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val memoryBankService = client.memoryBanks()
        val memoryBankSpec = memoryBankService.list(MemoryBankListParams.builder().build())
        println(memoryBankSpec)
        memoryBankSpec.validate()
    }

    @Test
    fun callGet() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val memoryBankService = client.memoryBanks()
        val memoryBankSpec =
            memoryBankService.get(
                MemoryBankGetParams.builder().bankType(MemoryBankGetParams.BankType.VECTOR).build()
            )
        println(memoryBankSpec)
        memoryBankSpec?.validate()
    }
}
