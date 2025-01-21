// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.llama.llamastack.core.JsonValue
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
                        .metadata(
                            MemoryInsertParams.Document.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from(true))
                                .build()
                        )
                        .mimeType("mime_type")
                        .build()
                )
            )
            .ttlSeconds(0L)
            .xLlamaStackClientVersion("X-LlamaStack-Client-Version")
            .xLlamaStackProviderData("X-LlamaStack-Provider-Data")
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
                            .metadata(
                                MemoryInsertParams.Document.Metadata.builder()
                                    .putAdditionalProperty("foo", JsonValue.from(true))
                                    .build()
                            )
                            .mimeType("mime_type")
                            .build()
                    )
                )
                .ttlSeconds(0L)
                .xLlamaStackClientVersion("X-LlamaStack-Client-Version")
                .xLlamaStackProviderData("X-LlamaStack-Provider-Data")
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
                        .metadata(
                            MemoryInsertParams.Document.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from(true))
                                .build()
                        )
                        .mimeType("mime_type")
                        .build()
                )
            )
        assertThat(body.ttlSeconds()).isEqualTo(0L)
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
                            .metadata(
                                MemoryInsertParams.Document.Metadata.builder()
                                    .putAdditionalProperty("foo", JsonValue.from(true))
                                    .build()
                            )
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
                        .metadata(
                            MemoryInsertParams.Document.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from(true))
                                .build()
                        )
                        .build()
                )
            )
    }
}
