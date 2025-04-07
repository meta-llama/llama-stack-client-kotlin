// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llama.llamastack.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EmbeddingsResponseTest {

    @Test
    fun create() {
        val embeddingsResponse = EmbeddingsResponse.builder().addEmbedding(listOf(0.0)).build()

        assertThat(embeddingsResponse.embeddings()).containsExactly(listOf(0.0))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val embeddingsResponse = EmbeddingsResponse.builder().addEmbedding(listOf(0.0)).build()

        val roundtrippedEmbeddingsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(embeddingsResponse),
                jacksonTypeRef<EmbeddingsResponse>(),
            )

        assertThat(roundtrippedEmbeddingsResponse).isEqualTo(embeddingsResponse)
    }
}
