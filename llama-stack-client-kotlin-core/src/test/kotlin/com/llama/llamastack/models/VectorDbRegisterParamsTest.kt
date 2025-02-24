// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class VectorDbRegisterParamsTest {

    @Test
    fun create() {
        VectorDbRegisterParams.builder()
            .embeddingModel("embedding_model")
            .vectorDbId("vector_db_id")
            .embeddingDimension(0L)
            .providerId("provider_id")
            .providerVectorDbId("provider_vector_db_id")
            .build()
    }

    @Test
    fun body() {
        val params =
            VectorDbRegisterParams.builder()
                .embeddingModel("embedding_model")
                .vectorDbId("vector_db_id")
                .embeddingDimension(0L)
                .providerId("provider_id")
                .providerVectorDbId("provider_vector_db_id")
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.embeddingModel()).isEqualTo("embedding_model")
        assertThat(body.vectorDbId()).isEqualTo("vector_db_id")
        assertThat(body.embeddingDimension()).isEqualTo(0L)
        assertThat(body.providerId()).isEqualTo("provider_id")
        assertThat(body.providerVectorDbId()).isEqualTo("provider_vector_db_id")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            VectorDbRegisterParams.builder()
                .embeddingModel("embedding_model")
                .vectorDbId("vector_db_id")
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.embeddingModel()).isEqualTo("embedding_model")
        assertThat(body.vectorDbId()).isEqualTo("vector_db_id")
    }
}
