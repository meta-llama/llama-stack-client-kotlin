// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llama.llamastack.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VectorDbRetrieveResponseTest {

    @Test
    fun create() {
        val vectorDbRetrieveResponse =
            VectorDbRetrieveResponse.builder()
                .embeddingDimension(0L)
                .embeddingModel("embedding_model")
                .identifier("identifier")
                .providerId("provider_id")
                .providerResourceId("provider_resource_id")
                .build()

        assertThat(vectorDbRetrieveResponse.embeddingDimension()).isEqualTo(0L)
        assertThat(vectorDbRetrieveResponse.embeddingModel()).isEqualTo("embedding_model")
        assertThat(vectorDbRetrieveResponse.identifier()).isEqualTo("identifier")
        assertThat(vectorDbRetrieveResponse.providerId()).isEqualTo("provider_id")
        assertThat(vectorDbRetrieveResponse.providerResourceId()).isEqualTo("provider_resource_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val vectorDbRetrieveResponse =
            VectorDbRetrieveResponse.builder()
                .embeddingDimension(0L)
                .embeddingModel("embedding_model")
                .identifier("identifier")
                .providerId("provider_id")
                .providerResourceId("provider_resource_id")
                .build()

        val roundtrippedVectorDbRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(vectorDbRetrieveResponse),
                jacksonTypeRef<VectorDbRetrieveResponse>(),
            )

        assertThat(roundtrippedVectorDbRetrieveResponse).isEqualTo(vectorDbRetrieveResponse)
    }
}
