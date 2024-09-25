// File generated from our OpenAPI spec by Stainless.

package com.llama_stack_client.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class EmbeddingsTest {

    @Test
    fun createEmbeddings() {
        val embeddings = Embeddings.builder().embeddings(listOf(listOf(42.23))).build()
        assertThat(embeddings).isNotNull
        assertThat(embeddings.embeddings()).containsExactly(listOf(42.23))
    }
}
