// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VectorStoreFileTest {

    @Test
    fun create() {
        val vectorStoreFile =
            VectorStoreFile.builder()
                .id("id")
                .attributes(
                    VectorStoreFile.Attributes.builder()
                        .putAdditionalProperty("foo", JsonValue.from(true))
                        .build()
                )
                .chunkingStrategyAuto()
                .createdAt(0L)
                .object_("object")
                .status(VectorStoreFile.Status.COMPLETED)
                .usageBytes(0L)
                .vectorStoreId("vector_store_id")
                .lastError(
                    VectorStoreFile.LastError.builder()
                        .code(VectorStoreFile.LastError.Code.SERVER_ERROR)
                        .message("message")
                        .build()
                )
                .build()

        assertThat(vectorStoreFile.id()).isEqualTo("id")
        assertThat(vectorStoreFile.attributes())
            .isEqualTo(
                VectorStoreFile.Attributes.builder()
                    .putAdditionalProperty("foo", JsonValue.from(true))
                    .build()
            )
        assertThat(vectorStoreFile.chunkingStrategy())
            .isEqualTo(VectorStoreFile.ChunkingStrategy.ofAuto())
        assertThat(vectorStoreFile.createdAt()).isEqualTo(0L)
        assertThat(vectorStoreFile.object_()).isEqualTo("object")
        assertThat(vectorStoreFile.status()).isEqualTo(VectorStoreFile.Status.COMPLETED)
        assertThat(vectorStoreFile.usageBytes()).isEqualTo(0L)
        assertThat(vectorStoreFile.vectorStoreId()).isEqualTo("vector_store_id")
        assertThat(vectorStoreFile.lastError())
            .isEqualTo(
                VectorStoreFile.LastError.builder()
                    .code(VectorStoreFile.LastError.Code.SERVER_ERROR)
                    .message("message")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val vectorStoreFile =
            VectorStoreFile.builder()
                .id("id")
                .attributes(
                    VectorStoreFile.Attributes.builder()
                        .putAdditionalProperty("foo", JsonValue.from(true))
                        .build()
                )
                .chunkingStrategyAuto()
                .createdAt(0L)
                .object_("object")
                .status(VectorStoreFile.Status.COMPLETED)
                .usageBytes(0L)
                .vectorStoreId("vector_store_id")
                .lastError(
                    VectorStoreFile.LastError.builder()
                        .code(VectorStoreFile.LastError.Code.SERVER_ERROR)
                        .message("message")
                        .build()
                )
                .build()

        val roundtrippedVectorStoreFile =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(vectorStoreFile),
                jacksonTypeRef<VectorStoreFile>(),
            )

        assertThat(roundtrippedVectorStoreFile).isEqualTo(vectorStoreFile)
    }
}
