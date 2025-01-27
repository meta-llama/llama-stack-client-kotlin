// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.llama.llamastack.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class DocumentTest {

    @Test
    fun createDocument() {
        val document =
            Document.builder()
                .content("string")
                .documentId("document_id")
                .metadata(
                    Document.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from(true))
                        .build()
                )
                .mimeType("mime_type")
                .build()
        assertThat(document).isNotNull
        assertThat(document.content()).isEqualTo(Document.Content.ofString("string"))
        assertThat(document.documentId()).isEqualTo("document_id")
        assertThat(document.metadata())
            .isEqualTo(
                Document.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from(true))
                    .build()
            )
        assertThat(document.mimeType()).isEqualTo("mime_type")
    }
}
