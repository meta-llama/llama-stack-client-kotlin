// File generated from our OpenAPI spec by Stainless.

package com.llama_stack_client.api.services.blocking

import com.llama_stack_client.api.TestServerExtension
import com.llama_stack_client.api.client.okhttp.LlamaStackClientOkHttpClient
import com.llama_stack_client.api.core.JsonValue
import com.llama_stack_client.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class MemoryServiceTest {

    @Test
    fun callCreate() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val memoryService = client.memory()
        val memoryCreateResponse =
            memoryService.create(
                MemoryCreateParams.builder().body(JsonValue.from(mapOf<String, Any>())).build()
            )
        println(memoryCreateResponse)
    }

    @Test
    fun callRetrieve() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val memoryService = client.memory()
        val memoryRetrieveResponse =
            memoryService.retrieve(MemoryRetrieveParams.builder().bankId("bank_id").build())
        println(memoryRetrieveResponse)
    }

    @Test
    fun callUpdate() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val memoryService = client.memory()
        memoryService.update(
            MemoryUpdateParams.builder()
                .bankId("bank_id")
                .documents(
                    listOf(
                        MemoryUpdateParams.Document.builder()
                            .content(MemoryUpdateParams.Document.Content.ofString("string"))
                            .documentId("document_id")
                            .metadata(MemoryUpdateParams.Document.Metadata.builder().build())
                            .mimeType("mime_type")
                            .build()
                    )
                )
                .build()
        )
    }

    @Test
    fun callList() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val memoryService = client.memory()
        val memoryListResponse = memoryService.list(MemoryListParams.builder().build())
        println(memoryListResponse)
    }

    @Test
    fun callDrop() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val memoryService = client.memory()
        val memoryDropResponse =
            memoryService.drop(MemoryDropParams.builder().bankId("bank_id").build())
        println(memoryDropResponse)
        assertThat(memoryDropResponse).isNotBlank()
    }

    @Test
    fun callInsert() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val memoryService = client.memory()
        memoryService.insert(
            MemoryInsertParams.builder()
                .bankId("bank_id")
                .documents(
                    listOf(
                        MemoryInsertParams.Document.builder()
                            .content(MemoryInsertParams.Document.Content.ofString("string"))
                            .documentId("document_id")
                            .metadata(MemoryInsertParams.Document.Metadata.builder().build())
                            .mimeType("mime_type")
                            .build()
                    )
                )
                .ttlSeconds(123L)
                .build()
        )
    }

    @Test
    fun callQuery() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val memoryService = client.memory()
        val queryDocuments =
            memoryService.query(
                MemoryQueryParams.builder()
                    .bankId("bank_id")
                    .query(MemoryQueryParams.Query.ofString("string"))
                    .params(MemoryQueryParams.Params.builder().build())
                    .build()
            )
        println(queryDocuments)
        queryDocuments.validate()
    }
}
