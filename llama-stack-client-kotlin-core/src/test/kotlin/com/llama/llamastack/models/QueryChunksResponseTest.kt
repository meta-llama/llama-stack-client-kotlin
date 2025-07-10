// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class QueryChunksResponseTest {

    @Test
    fun create() {
        val queryChunksResponse =
            QueryChunksResponse.builder()
                .addChunk(
                    QueryChunksResponse.Chunk.builder()
                        .content("string")
                        .metadata(
                            QueryChunksResponse.Chunk.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from(true))
                                .build()
                        )
                        .chunkMetadata(
                            QueryChunksResponse.Chunk.ChunkMetadata.builder()
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
                .addScore(0.0)
                .build()

        assertThat(queryChunksResponse.chunks())
            .containsExactly(
                QueryChunksResponse.Chunk.builder()
                    .content("string")
                    .metadata(
                        QueryChunksResponse.Chunk.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from(true))
                            .build()
                    )
                    .chunkMetadata(
                        QueryChunksResponse.Chunk.ChunkMetadata.builder()
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
        assertThat(queryChunksResponse.scores()).containsExactly(0.0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val queryChunksResponse =
            QueryChunksResponse.builder()
                .addChunk(
                    QueryChunksResponse.Chunk.builder()
                        .content("string")
                        .metadata(
                            QueryChunksResponse.Chunk.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from(true))
                                .build()
                        )
                        .chunkMetadata(
                            QueryChunksResponse.Chunk.ChunkMetadata.builder()
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
                .addScore(0.0)
                .build()

        val roundtrippedQueryChunksResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(queryChunksResponse),
                jacksonTypeRef<QueryChunksResponse>(),
            )

        assertThat(roundtrippedQueryChunksResponse).isEqualTo(queryChunksResponse)
    }
}
