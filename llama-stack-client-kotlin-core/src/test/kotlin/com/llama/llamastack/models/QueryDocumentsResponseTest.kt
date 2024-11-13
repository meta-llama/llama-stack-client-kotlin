// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class QueryDocumentsResponseTest {

    @Test
    fun createQueryDocumentsResponse() {
        val queryDocumentsResponse =
            QueryDocumentsResponse.builder()
                .chunks(
                    listOf(
                        QueryDocumentsResponse.Chunk.builder()
                            .content(QueryDocumentsResponse.Chunk.Content.ofString("string"))
                            .documentId("document_id")
                            .tokenCount(123L)
                            .build()
                    )
                )
                .scores(listOf(42.23))
                .build()
        assertThat(queryDocumentsResponse).isNotNull
        assertThat(queryDocumentsResponse.chunks())
            .containsExactly(
                QueryDocumentsResponse.Chunk.builder()
                    .content(QueryDocumentsResponse.Chunk.Content.ofString("string"))
                    .documentId("document_id")
                    .tokenCount(123L)
                    .build()
            )
        assertThat(queryDocumentsResponse.scores()).containsExactly(42.23)
    }
}
