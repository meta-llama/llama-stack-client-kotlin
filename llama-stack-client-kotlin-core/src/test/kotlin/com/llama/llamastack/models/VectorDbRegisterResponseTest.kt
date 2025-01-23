// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class VectorDbRegisterResponseTest {

    @Test
    fun createVectorDbRegisterResponse() {
        val vectorDbRegisterResponse =
            VectorDbRegisterResponse.builder()
                .embeddingDimension(0L)
                .embeddingModel("embedding_model")
                .identifier("identifier")
                .providerId("provider_id")
                .providerResourceId("provider_resource_id")
                .type(VectorDbRegisterResponse.Type.VECTOR_DB)
                .build()
        assertThat(vectorDbRegisterResponse).isNotNull
        assertThat(vectorDbRegisterResponse.embeddingDimension()).isEqualTo(0L)
        assertThat(vectorDbRegisterResponse.embeddingModel()).isEqualTo("embedding_model")
        assertThat(vectorDbRegisterResponse.identifier()).isEqualTo("identifier")
        assertThat(vectorDbRegisterResponse.providerId()).isEqualTo("provider_id")
        assertThat(vectorDbRegisterResponse.providerResourceId()).isEqualTo("provider_resource_id")
        assertThat(vectorDbRegisterResponse.type())
            .isEqualTo(VectorDbRegisterResponse.Type.VECTOR_DB)
    }
}
