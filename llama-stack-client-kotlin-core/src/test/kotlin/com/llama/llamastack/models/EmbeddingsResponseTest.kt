// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class EmbeddingsResponseTest {

    @Test
    fun createEmbeddingsResponse() {
        val embeddingsResponse =
            EmbeddingsResponse.builder().embeddings(listOf(listOf(0.0))).build()
        assertThat(embeddingsResponse).isNotNull
        assertThat(embeddingsResponse.embeddings()).containsExactly(listOf(0.0))
    }
}
