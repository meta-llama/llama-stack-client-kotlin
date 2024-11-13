// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.blocking

import com.llama.llamastack.TestServerExtension
import com.llama.llamastack.client.okhttp.LlamaStackClientOkHttpClient
import com.llama.llamastack.models.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class MemoryServiceTest {

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
        val queryDocumentsResponse =
            memoryService.query(
                MemoryQueryParams.builder()
                    .bankId("bank_id")
                    .query(MemoryQueryParams.Query.ofString("string"))
                    .params(MemoryQueryParams.Params.builder().build())
                    .build()
            )
        println(queryDocumentsResponse)
        queryDocumentsResponse.validate()
    }
}
