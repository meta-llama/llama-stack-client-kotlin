// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.llama.llamastack.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class MemoryInsertParamsTest {

    @Test
    fun createMemoryInsertParams() {
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
            .xLlamaStackProviderData("X-LlamaStack-ProviderData")
            .build()
    }

    @Test
    fun getBody() {
        val params =
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
                .xLlamaStackProviderData("X-LlamaStack-ProviderData")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.bankId()).isEqualTo("bank_id")
        assertThat(body.documents())
            .isEqualTo(
                listOf(
                    MemoryInsertParams.Document.builder()
                        .content(MemoryInsertParams.Document.Content.ofString("string"))
                        .documentId("document_id")
                        .metadata(MemoryInsertParams.Document.Metadata.builder().build())
                        .mimeType("mime_type")
                        .build()
                )
            )
        assertThat(body.ttlSeconds()).isEqualTo(123L)
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            MemoryInsertParams.builder()
                .bankId("bank_id")
                .documents(
                    listOf(
                        MemoryInsertParams.Document.builder()
                            .content(MemoryInsertParams.Document.Content.ofString("string"))
                            .documentId("document_id")
                            .metadata(MemoryInsertParams.Document.Metadata.builder().build())
                            .build()
                    )
                )
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.bankId()).isEqualTo("bank_id")
        assertThat(body.documents())
            .isEqualTo(
                listOf(
                    MemoryInsertParams.Document.builder()
                        .content(MemoryInsertParams.Document.Content.ofString("string"))
                        .documentId("document_id")
                        .metadata(MemoryInsertParams.Document.Metadata.builder().build())
                        .build()
                )
            )
    }
}
