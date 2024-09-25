// File generated from our OpenAPI spec by Stainless.

package com.llama_stack_client.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class QueryDocumentsTest {

    @Test
    fun createQueryDocuments() {
        val queryDocuments =
            QueryDocuments.builder()
                .chunks(
                    listOf(
                        QueryDocuments.Chunk.builder()
                            .content(QueryDocuments.Chunk.Content.ofString("string"))
                            .documentId("document_id")
                            .tokenCount(123L)
                            .build()
                    )
                )
                .scores(listOf(42.23))
                .build()
        assertThat(queryDocuments).isNotNull
        assertThat(queryDocuments.chunks())
            .containsExactly(
                QueryDocuments.Chunk.builder()
                    .content(QueryDocuments.Chunk.Content.ofString("string"))
                    .documentId("document_id")
                    .tokenCount(123L)
                    .build()
            )
        assertThat(queryDocuments.scores()).containsExactly(42.23)
    }
}
