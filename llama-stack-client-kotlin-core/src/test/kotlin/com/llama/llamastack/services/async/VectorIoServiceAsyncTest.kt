// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.async

import com.llama.llamastack.TestServerExtension
import com.llama.llamastack.client.okhttp.LlamaStackClientOkHttpClientAsync
import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.models.VectorIoInsertParams
import com.llama.llamastack.models.VectorIoQueryParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class VectorIoServiceAsyncTest {

    @Test
    suspend fun insert() {
        val client =
            LlamaStackClientOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .build()
        val vectorIoServiceAsync = client.vectorIo()

        vectorIoServiceAsync.insert(
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
        )
    }

    @Test
    suspend fun query() {
        val client =
            LlamaStackClientOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .build()
        val vectorIoServiceAsync = client.vectorIo()

        val queryChunksResponse =
            vectorIoServiceAsync.query(
                VectorIoQueryParams.builder()
                    .query("string")
                    .vectorDbId("vector_db_id")
                    .params(
                        VectorIoQueryParams.Params.builder()
                            .putAdditionalProperty("foo", JsonValue.from(true))
                            .build()
                    )
                    .build()
            )

        queryChunksResponse.validate()
    }
}
