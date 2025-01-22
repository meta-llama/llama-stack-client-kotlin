// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.blocking

import com.llama.llamastack.TestServerExtension
import com.llama.llamastack.client.okhttp.LlamaStackClientOkHttpClient
import com.llama.llamastack.models.MemoryBankListParams
import com.llama.llamastack.models.MemoryBankRegisterParams
import com.llama.llamastack.models.MemoryBankRetrieveParams
import com.llama.llamastack.models.MemoryBankUnregisterParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class MemoryBankServiceTest {

    @Test
    fun callRetrieve() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val memoryBankService = client.memoryBanks()
        val memoryBankRetrieveResponse =
            memoryBankService.retrieve(
                MemoryBankRetrieveParams.builder()
                    .memoryBankId("memory_bank_id")
                    .xLlamaStackClientVersion("X-LlamaStack-Client-Version")
                    .xLlamaStackProviderData("X-LlamaStack-Provider-Data")
                    .build()
            )
        println(memoryBankRetrieveResponse)
    }

    @Test
    fun callList() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val memoryBankService = client.memoryBanks()
        val listMemoryBanksResponse =
            memoryBankService.list(
                MemoryBankListParams.builder()
                    .xLlamaStackClientVersion("X-LlamaStack-Client-Version")
                    .xLlamaStackProviderData("X-LlamaStack-Provider-Data")
                    .build()
            )
        println(listMemoryBanksResponse)
    }

    @Test
    fun callRegister() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val memoryBankService = client.memoryBanks()
        val memoryBankRegisterResponse =
            memoryBankService.register(
                MemoryBankRegisterParams.builder()
                    .memoryBankId("memory_bank_id")
                    .params(
                        MemoryBankRegisterParams.Params.VectorMemoryBankParams.builder()
                            .chunkSizeInTokens(0L)
                            .embeddingModel("embedding_model")
                            .memoryBankType(
                                MemoryBankRegisterParams.Params.VectorMemoryBankParams
                                    .MemoryBankType
                                    .VECTOR
                            )
                            .overlapSizeInTokens(0L)
                            .build()
                    )
                    .providerId("provider_id")
                    .providerMemoryBankId("provider_memory_bank_id")
                    .xLlamaStackClientVersion("X-LlamaStack-Client-Version")
                    .xLlamaStackProviderData("X-LlamaStack-Provider-Data")
                    .build()
            )
        println(memoryBankRegisterResponse)
    }

    @Test
    fun callUnregister() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val memoryBankService = client.memoryBanks()
        memoryBankService.unregister(
            MemoryBankUnregisterParams.builder()
                .memoryBankId("memory_bank_id")
                .xLlamaStackClientVersion("X-LlamaStack-Client-Version")
                .xLlamaStackProviderData("X-LlamaStack-Provider-Data")
                .build()
        )
    }
}
