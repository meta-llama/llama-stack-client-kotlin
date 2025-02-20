// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.llama.llamastack.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ToolRuntimeRagToolInsertParamsTest {

    @Test
    fun create() {
        ToolRuntimeRagToolInsertParams.builder()
            .chunkSizeInTokens(0L)
            .addDocument(
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
            )
            .vectorDbId("vector_db_id")
            .build()
    }

    @Test
    fun body() {
        val params =
            ToolRuntimeRagToolInsertParams.builder()
                .chunkSizeInTokens(0L)
                .addDocument(
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
                )
                .vectorDbId("vector_db_id")
                .build()

        val body = params._body()

        assertThat(body).isNotNull
        assertThat(body.chunkSizeInTokens()).isEqualTo(0L)
        assertThat(body.documents())
            .isEqualTo(
                listOf(
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
                )
            )
        assertThat(body.vectorDbId()).isEqualTo("vector_db_id")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ToolRuntimeRagToolInsertParams.builder()
                .chunkSizeInTokens(0L)
                .addDocument(
                    Document.builder()
                        .content("string")
                        .documentId("document_id")
                        .metadata(
                            Document.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from(true))
                                .build()
                        )
                        .build()
                )
                .vectorDbId("vector_db_id")
                .build()

        val body = params._body()

        assertThat(body).isNotNull
        assertThat(body.chunkSizeInTokens()).isEqualTo(0L)
        assertThat(body.documents())
            .isEqualTo(
                listOf(
                    Document.builder()
                        .content("string")
                        .documentId("document_id")
                        .metadata(
                            Document.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from(true))
                                .build()
                        )
                        .build()
                )
            )
        assertThat(body.vectorDbId()).isEqualTo("vector_db_id")
    }
}
