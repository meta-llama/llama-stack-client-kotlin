// File generated from our OpenAPI spec by Stainless.

package com.llama_stack_client.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class MemoryDocumentRetrieveResponseTest {

    @Test
    fun createMemoryDocumentRetrieveResponse() {
        val memoryDocumentRetrieveResponse =
            MemoryDocumentRetrieveResponse.builder()
                .content(MemoryDocumentRetrieveResponse.Content.ofString("string"))
                .documentId("document_id")
                .metadata(MemoryDocumentRetrieveResponse.Metadata.builder().build())
                .mimeType("mime_type")
                .build()
        assertThat(memoryDocumentRetrieveResponse).isNotNull
        assertThat(memoryDocumentRetrieveResponse.content())
            .isEqualTo(MemoryDocumentRetrieveResponse.Content.ofString("string"))
        assertThat(memoryDocumentRetrieveResponse.documentId()).isEqualTo("document_id")
        assertThat(memoryDocumentRetrieveResponse.metadata())
            .isEqualTo(MemoryDocumentRetrieveResponse.Metadata.builder().build())
        assertThat(memoryDocumentRetrieveResponse.mimeType()).isEqualTo("mime_type")
    }
}
