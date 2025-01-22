// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.blocking

import com.llama.llamastack.TestServerExtension
import com.llama.llamastack.client.okhttp.LlamaStackClientOkHttpClient
import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.models.MemoryInsertParams
import com.llama.llamastack.models.MemoryQueryParams
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
                .addDocument(
                    MemoryInsertParams.Document.builder()
                        .content("string")
                        .documentId("document_id")
                        .metadata(
                            MemoryInsertParams.Document.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from(true))
                                .build()
                        )
                        .mimeType("mime_type")
                        .build()
                )
                .ttlSeconds(0L)
                .xLlamaStackClientVersion("X-LlamaStack-Client-Version")
                .xLlamaStackProviderData("X-LlamaStack-Provider-Data")
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
                    .query("string")
                    .params(
                        MemoryQueryParams.Params.builder()
                            .putAdditionalProperty("foo", JsonValue.from(true))
                            .build()
                    )
                    .xLlamaStackClientVersion("X-LlamaStack-Client-Version")
                    .xLlamaStackProviderData("X-LlamaStack-Provider-Data")
                    .build()
            )
        println(queryDocumentsResponse)
        queryDocumentsResponse.validate()
    }
}
