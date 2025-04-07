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
