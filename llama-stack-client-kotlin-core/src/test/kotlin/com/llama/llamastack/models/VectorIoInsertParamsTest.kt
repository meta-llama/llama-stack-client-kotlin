// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.llama.llamastack.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VectorIoInsertParamsTest {

    @Test
    fun create() {
        VectorIoInsertParams.builder()
            .addChunk(
                VectorIoInsertParams.Chunk.builder()
                    .content("string")
                    .metadata(
                        VectorIoInsertParams.Chunk.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from(true))
                            .build()
                    )
                    .chunkMetadata(
                        VectorIoInsertParams.Chunk.ChunkMetadata.builder()
                            .chunkEmbeddingDimension(0L)
                            .chunkEmbeddingModel("chunk_embedding_model")
                            .chunkId("chunk_id")
                            .chunkTokenizer("chunk_tokenizer")
                            .chunkWindow("chunk_window")
                            .contentTokenCount(0L)
                            .createdTimestamp(0L)
                            .documentId("document_id")
                            .metadataTokenCount(0L)
                            .source("source")
                            .updatedTimestamp(0L)
                            .build()
                    )
                    .addEmbedding(0.0)
                    .storedChunkId("stored_chunk_id")
                    .build()
            )
            .vectorDbId("vector_db_id")
            .ttlSeconds(0L)
            .build()
    }

    @Test
    fun body() {
        val params =
            VectorIoInsertParams.builder()
                .addChunk(
                    VectorIoInsertParams.Chunk.builder()
                        .content("string")
                        .metadata(
                            VectorIoInsertParams.Chunk.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from(true))
                                .build()
                        )
                        .chunkMetadata(
                            VectorIoInsertParams.Chunk.ChunkMetadata.builder()
                                .chunkEmbeddingDimension(0L)
                                .chunkEmbeddingModel("chunk_embedding_model")
                                .chunkId("chunk_id")
                                .chunkTokenizer("chunk_tokenizer")
                                .chunkWindow("chunk_window")
                                .contentTokenCount(0L)
                                .createdTimestamp(0L)
                                .documentId("document_id")
                                .metadataTokenCount(0L)
                                .source("source")
                                .updatedTimestamp(0L)
                                .build()
                        )
                        .addEmbedding(0.0)
                        .storedChunkId("stored_chunk_id")
                        .build()
                )
                .vectorDbId("vector_db_id")
                .ttlSeconds(0L)
                .build()

        val body = params._body()

        assertThat(body.chunks())
            .containsExactly(
                VectorIoInsertParams.Chunk.builder()
                    .content("string")
                    .metadata(
                        VectorIoInsertParams.Chunk.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from(true))
                            .build()
                    )
                    .chunkMetadata(
                        VectorIoInsertParams.Chunk.ChunkMetadata.builder()
                            .chunkEmbeddingDimension(0L)
                            .chunkEmbeddingModel("chunk_embedding_model")
                            .chunkId("chunk_id")
                            .chunkTokenizer("chunk_tokenizer")
                            .chunkWindow("chunk_window")
                            .contentTokenCount(0L)
                            .createdTimestamp(0L)
                            .documentId("document_id")
                            .metadataTokenCount(0L)
                            .source("source")
                            .updatedTimestamp(0L)
                            .build()
                    )
                    .addEmbedding(0.0)
                    .storedChunkId("stored_chunk_id")
                    .build()
            )
        assertThat(body.vectorDbId()).isEqualTo("vector_db_id")
        assertThat(body.ttlSeconds()).isEqualTo(0L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            VectorIoInsertParams.builder()
                .addChunk(
                    VectorIoInsertParams.Chunk.builder()
                        .content("string")
                        .metadata(
                            VectorIoInsertParams.Chunk.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from(true))
                                .build()
                        )
                        .build()
                )
                .vectorDbId("vector_db_id")
                .build()

        val body = params._body()

        assertThat(body.chunks())
            .containsExactly(
                VectorIoInsertParams.Chunk.builder()
                    .content("string")
                    .metadata(
                        VectorIoInsertParams.Chunk.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from(true))
                            .build()
                    )
                    .build()
            )
        assertThat(body.vectorDbId()).isEqualTo("vector_db_id")
    }
}
