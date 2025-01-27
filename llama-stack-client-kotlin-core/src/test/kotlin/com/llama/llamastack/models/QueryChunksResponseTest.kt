// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.llama.llamastack.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class QueryChunksResponseTest {

    @Test
    fun createQueryChunksResponse() {
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
        assertThat(queryChunksResponse).isNotNull
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
}
