// File generated from our OpenAPI spec by Stainless.

package com.llama_stack_client.api.services.blocking.memory

import com.llama_stack_client.api.TestServerExtension
import com.llama_stack_client.api.client.okhttp.LlamaStackClientOkHttpClient
import com.llama_stack_client.api.models.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class DocumentServiceTest {

    @Test
    fun callRetrieve() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val documentService = client.memory().documents()
        val memoryDocumentRetrieveResponse =
            documentService.retrieve(
                MemoryDocumentRetrieveParams.builder()
                    .documentIds(listOf("string"))
                    .bankId("bank_id")
                    .build()
            )
        println(memoryDocumentRetrieveResponse)
        memoryDocumentRetrieveResponse.validate()
    }

    @Test
    fun callDelete() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val documentService = client.memory().documents()
        documentService.delete(
            MemoryDocumentDeleteParams.builder()
                .bankId("bank_id")
                .documentIds(listOf("string"))
                .build()
        )
    }
}
