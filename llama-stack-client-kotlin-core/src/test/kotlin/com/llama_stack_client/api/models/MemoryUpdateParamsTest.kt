// File generated from our OpenAPI spec by Stainless.

package com.llama_stack_client.api.models

import com.llama_stack_client.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class MemoryUpdateParamsTest {

    @Test
    fun createMemoryUpdateParams() {
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
    }

    @Test
    fun getBody() {
        val params =
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
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.bankId()).isEqualTo("bank_id")
        assertThat(body.documents())
            .isEqualTo(
                listOf(
                    MemoryUpdateParams.Document.builder()
                        .content(MemoryUpdateParams.Document.Content.ofString("string"))
                        .documentId("document_id")
                        .metadata(MemoryUpdateParams.Document.Metadata.builder().build())
                        .mimeType("mime_type")
                        .build()
                )
            )
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            MemoryUpdateParams.builder()
                .bankId("bank_id")
                .documents(
                    listOf(
                        MemoryUpdateParams.Document.builder()
                            .content(MemoryUpdateParams.Document.Content.ofString("string"))
                            .documentId("document_id")
                            .metadata(MemoryUpdateParams.Document.Metadata.builder().build())
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
                    MemoryUpdateParams.Document.builder()
                        .content(MemoryUpdateParams.Document.Content.ofString("string"))
                        .documentId("document_id")
                        .metadata(MemoryUpdateParams.Document.Metadata.builder().build())
                        .build()
                )
            )
    }
}
