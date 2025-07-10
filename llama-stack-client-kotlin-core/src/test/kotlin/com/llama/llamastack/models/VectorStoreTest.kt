// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VectorStoreTest {

    @Test
    fun create() {
        val vectorStore =
            VectorStore.builder()
                .id("id")
                .createdAt(0L)
                .fileCounts(
                    VectorStore.FileCounts.builder()
                        .cancelled(0L)
                        .completed(0L)
                        .failed(0L)
                        .inProgress(0L)
                        .total(0L)
                        .build()
                )
                .metadata(
                    VectorStore.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from(true))
                        .build()
                )
                .object_("object")
                .status("status")
                .usageBytes(0L)
                .expiresAfter(
                    VectorStore.ExpiresAfter.builder()
                        .putAdditionalProperty("foo", JsonValue.from(true))
                        .build()
                )
                .expiresAt(0L)
                .lastActiveAt(0L)
                .name("name")
                .build()

        assertThat(vectorStore.id()).isEqualTo("id")
        assertThat(vectorStore.createdAt()).isEqualTo(0L)
        assertThat(vectorStore.fileCounts())
            .isEqualTo(
                VectorStore.FileCounts.builder()
                    .cancelled(0L)
                    .completed(0L)
                    .failed(0L)
                    .inProgress(0L)
                    .total(0L)
                    .build()
            )
        assertThat(vectorStore.metadata())
            .isEqualTo(
                VectorStore.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from(true))
                    .build()
            )
        assertThat(vectorStore.object_()).isEqualTo("object")
        assertThat(vectorStore.status()).isEqualTo("status")
        assertThat(vectorStore.usageBytes()).isEqualTo(0L)
        assertThat(vectorStore.expiresAfter())
            .isEqualTo(
                VectorStore.ExpiresAfter.builder()
                    .putAdditionalProperty("foo", JsonValue.from(true))
                    .build()
            )
        assertThat(vectorStore.expiresAt()).isEqualTo(0L)
        assertThat(vectorStore.lastActiveAt()).isEqualTo(0L)
        assertThat(vectorStore.name()).isEqualTo("name")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val vectorStore =
            VectorStore.builder()
                .id("id")
                .createdAt(0L)
                .fileCounts(
                    VectorStore.FileCounts.builder()
                        .cancelled(0L)
                        .completed(0L)
                        .failed(0L)
                        .inProgress(0L)
                        .total(0L)
                        .build()
                )
                .metadata(
                    VectorStore.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from(true))
                        .build()
                )
                .object_("object")
                .status("status")
                .usageBytes(0L)
                .expiresAfter(
                    VectorStore.ExpiresAfter.builder()
                        .putAdditionalProperty("foo", JsonValue.from(true))
                        .build()
                )
                .expiresAt(0L)
                .lastActiveAt(0L)
                .name("name")
                .build()

        val roundtrippedVectorStore =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(vectorStore),
                jacksonTypeRef<VectorStore>(),
            )

        assertThat(roundtrippedVectorStore).isEqualTo(vectorStore)
    }
}
