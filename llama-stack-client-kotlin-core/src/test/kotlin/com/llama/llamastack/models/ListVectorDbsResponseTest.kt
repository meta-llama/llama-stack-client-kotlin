// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ListVectorDbsResponseTest {

    @Test
    fun createListVectorDbsResponse() {
        val listVectorDbsResponse =
            ListVectorDbsResponse.builder()
                .addData(
                    ListVectorDbsResponse.Data.builder()
                        .embeddingDimension(0L)
                        .embeddingModel("embedding_model")
                        .identifier("identifier")
                        .providerId("provider_id")
                        .providerResourceId("provider_resource_id")
                        .type(ListVectorDbsResponse.Data.Type.VECTOR_DB)
                        .build()
                )
                .build()
        assertThat(listVectorDbsResponse).isNotNull
        assertThat(listVectorDbsResponse.data())
            .containsExactly(
                ListVectorDbsResponse.Data.builder()
                    .embeddingDimension(0L)
                    .embeddingModel("embedding_model")
                    .identifier("identifier")
                    .providerId("provider_id")
                    .providerResourceId("provider_resource_id")
                    .type(ListVectorDbsResponse.Data.Type.VECTOR_DB)
                    .build()
            )
    }
}
