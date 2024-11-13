// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class EmbeddingsResponseTest {

    @Test
    fun createEmbeddingsResponse() {
        val embeddingsResponse =
            EmbeddingsResponse.builder().embeddings(listOf(listOf(42.23))).build()
        assertThat(embeddingsResponse).isNotNull
        assertThat(embeddingsResponse.embeddings()).containsExactly(listOf(42.23))
    }
}
