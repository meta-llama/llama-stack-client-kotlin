// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class QueryDocumentsResponseTest {

    @Test
    fun createQueryDocumentsResponse() {
        val queryDocumentsResponse =
            QueryDocumentsResponse.builder()
                .addChunk(
                    QueryDocumentsResponse.Chunk.builder()
                        .content("string")
                        .documentId("document_id")
                        .tokenCount(0L)
                        .build()
                )
                .addScore(0.0)
                .build()
        assertThat(queryDocumentsResponse).isNotNull
        assertThat(queryDocumentsResponse.chunks())
            .containsExactly(
                QueryDocumentsResponse.Chunk.builder()
                    .content("string")
                    .documentId("document_id")
                    .tokenCount(0L)
                    .build()
            )
        assertThat(queryDocumentsResponse.scores()).containsExactly(0.0)
    }
}
