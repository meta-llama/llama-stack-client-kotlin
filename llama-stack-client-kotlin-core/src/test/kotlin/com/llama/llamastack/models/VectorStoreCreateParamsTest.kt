// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.llama.llamastack.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VectorStoreCreateParamsTest {

    @Test
    fun create() {
        VectorStoreCreateParams.builder()
            .name("name")
            .chunkingStrategy(
                VectorStoreCreateParams.ChunkingStrategy.builder()
                    .putAdditionalProperty("foo", JsonValue.from(true))
                    .build()
            )
            .embeddingDimension(0L)
            .embeddingModel("embedding_model")
            .expiresAfter(
                VectorStoreCreateParams.ExpiresAfter.builder()
                    .putAdditionalProperty("foo", JsonValue.from(true))
                    .build()
            )
            .addFileId("string")
            .metadata(
                VectorStoreCreateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from(true))
                    .build()
            )
            .providerId("provider_id")
            .providerVectorDbId("provider_vector_db_id")
            .build()
    }

    @Test
    fun body() {
        val params =
            VectorStoreCreateParams.builder()
                .name("name")
                .chunkingStrategy(
                    VectorStoreCreateParams.ChunkingStrategy.builder()
                        .putAdditionalProperty("foo", JsonValue.from(true))
                        .build()
                )
                .embeddingDimension(0L)
                .embeddingModel("embedding_model")
                .expiresAfter(
                    VectorStoreCreateParams.ExpiresAfter.builder()
                        .putAdditionalProperty("foo", JsonValue.from(true))
                        .build()
                )
                .addFileId("string")
                .metadata(
                    VectorStoreCreateParams.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from(true))
                        .build()
                )
                .providerId("provider_id")
                .providerVectorDbId("provider_vector_db_id")
                .build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("name")
        assertThat(body.chunkingStrategy())
            .isEqualTo(
                VectorStoreCreateParams.ChunkingStrategy.builder()
                    .putAdditionalProperty("foo", JsonValue.from(true))
                    .build()
            )
        assertThat(body.embeddingDimension()).isEqualTo(0L)
        assertThat(body.embeddingModel()).isEqualTo("embedding_model")
        assertThat(body.expiresAfter())
            .isEqualTo(
                VectorStoreCreateParams.ExpiresAfter.builder()
                    .putAdditionalProperty("foo", JsonValue.from(true))
                    .build()
            )
        assertThat(body.fileIds()).containsExactly("string")
        assertThat(body.metadata())
            .isEqualTo(
                VectorStoreCreateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from(true))
                    .build()
            )
        assertThat(body.providerId()).isEqualTo("provider_id")
        assertThat(body.providerVectorDbId()).isEqualTo("provider_vector_db_id")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = VectorStoreCreateParams.builder().name("name").build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("name")
    }
}
