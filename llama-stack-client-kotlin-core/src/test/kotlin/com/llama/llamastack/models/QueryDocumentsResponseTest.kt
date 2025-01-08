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
                            .content(InterleavedContent.ofString("string"))
                            .documentId("document_id")
                            .tokenCount(0L)
                            .build()
                    )
                )
                .scores(listOf(0.0))
                .build()
        assertThat(queryDocumentsResponse).isNotNull
        assertThat(queryDocumentsResponse.chunks())
            .containsExactly(
                QueryDocumentsResponse.Chunk.builder()
                    .content(InterleavedContent.ofString("string"))
                    .documentId("document_id")
                    .tokenCount(0L)
                    .build()
            )
        assertThat(queryDocumentsResponse.scores()).containsExactly(0.0)
    }
}
