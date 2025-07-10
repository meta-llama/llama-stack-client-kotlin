// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llama.llamastack.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CreateEmbeddingsResponseTest {

    @Test
    fun create() {
        val createEmbeddingsResponse =
            CreateEmbeddingsResponse.builder()
                .addData(
                    CreateEmbeddingsResponse.Data.builder()
                        .embeddingOfDoubles(listOf(0.0))
                        .index(0L)
                        .build()
                )
                .model("model")
                .usage(
                    CreateEmbeddingsResponse.Usage.builder()
                        .promptTokens(0L)
                        .totalTokens(0L)
                        .build()
                )
                .build()

        assertThat(createEmbeddingsResponse.data())
            .containsExactly(
                CreateEmbeddingsResponse.Data.builder()
                    .embeddingOfDoubles(listOf(0.0))
                    .index(0L)
                    .build()
            )
        assertThat(createEmbeddingsResponse.model()).isEqualTo("model")
        assertThat(createEmbeddingsResponse.usage())
            .isEqualTo(
                CreateEmbeddingsResponse.Usage.builder().promptTokens(0L).totalTokens(0L).build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val createEmbeddingsResponse =
            CreateEmbeddingsResponse.builder()
                .addData(
                    CreateEmbeddingsResponse.Data.builder()
                        .embeddingOfDoubles(listOf(0.0))
                        .index(0L)
                        .build()
                )
                .model("model")
                .usage(
                    CreateEmbeddingsResponse.Usage.builder()
                        .promptTokens(0L)
                        .totalTokens(0L)
                        .build()
                )
                .build()

        val roundtrippedCreateEmbeddingsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(createEmbeddingsResponse),
                jacksonTypeRef<CreateEmbeddingsResponse>(),
            )

        assertThat(roundtrippedCreateEmbeddingsResponse).isEqualTo(createEmbeddingsResponse)
    }
}
