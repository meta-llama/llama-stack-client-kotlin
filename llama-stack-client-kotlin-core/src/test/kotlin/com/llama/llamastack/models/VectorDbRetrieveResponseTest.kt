// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class VectorDbRetrieveResponseTest {

    @Test
    fun createVectorDbRetrieveResponse() {
        val vectorDbRetrieveResponse =
            VectorDbRetrieveResponse.builder()
                .embeddingDimension(0L)
                .embeddingModel("embedding_model")
                .identifier("identifier")
                .providerId("provider_id")
                .providerResourceId("provider_resource_id")
                .type(VectorDbRetrieveResponse.Type.VECTOR_DB)
                .build()
        assertThat(vectorDbRetrieveResponse).isNotNull
        assertThat(vectorDbRetrieveResponse.embeddingDimension()).isEqualTo(0L)
        assertThat(vectorDbRetrieveResponse.embeddingModel()).isEqualTo("embedding_model")
        assertThat(vectorDbRetrieveResponse.identifier()).isEqualTo("identifier")
        assertThat(vectorDbRetrieveResponse.providerId()).isEqualTo("provider_id")
        assertThat(vectorDbRetrieveResponse.providerResourceId()).isEqualTo("provider_resource_id")
        assertThat(vectorDbRetrieveResponse.type())
            .isEqualTo(VectorDbRetrieveResponse.Type.VECTOR_DB)
    }
}
