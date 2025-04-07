// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llama.llamastack.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VectorDbRegisterResponseTest {

    @Test
    fun create() {
        val vectorDbRegisterResponse =
            VectorDbRegisterResponse.builder()
                .embeddingDimension(0L)
                .embeddingModel("embedding_model")
                .identifier("identifier")
                .providerId("provider_id")
                .providerResourceId("provider_resource_id")
                .build()

        assertThat(vectorDbRegisterResponse.embeddingDimension()).isEqualTo(0L)
        assertThat(vectorDbRegisterResponse.embeddingModel()).isEqualTo("embedding_model")
        assertThat(vectorDbRegisterResponse.identifier()).isEqualTo("identifier")
        assertThat(vectorDbRegisterResponse.providerId()).isEqualTo("provider_id")
        assertThat(vectorDbRegisterResponse.providerResourceId()).isEqualTo("provider_resource_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val vectorDbRegisterResponse =
            VectorDbRegisterResponse.builder()
                .embeddingDimension(0L)
                .embeddingModel("embedding_model")
                .identifier("identifier")
                .providerId("provider_id")
                .providerResourceId("provider_resource_id")
                .build()

        val roundtrippedVectorDbRegisterResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(vectorDbRegisterResponse),
                jacksonTypeRef<VectorDbRegisterResponse>(),
            )

        assertThat(roundtrippedVectorDbRegisterResponse).isEqualTo(vectorDbRegisterResponse)
    }
}
