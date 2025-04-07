// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llama.llamastack.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ListVectorDbsResponseTest {

    @Test
    fun create() {
        val listVectorDbsResponse =
            ListVectorDbsResponse.builder()
                .addData(
                    ListVectorDbsResponse.Data.builder()
                        .embeddingDimension(0L)
                        .embeddingModel("embedding_model")
                        .identifier("identifier")
                        .providerId("provider_id")
                        .providerResourceId("provider_resource_id")
                        .build()
                )
                .build()

        assertThat(listVectorDbsResponse.data())
            .containsExactly(
                ListVectorDbsResponse.Data.builder()
                    .embeddingDimension(0L)
                    .embeddingModel("embedding_model")
                    .identifier("identifier")
                    .providerId("provider_id")
                    .providerResourceId("provider_resource_id")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val listVectorDbsResponse =
            ListVectorDbsResponse.builder()
                .addData(
                    ListVectorDbsResponse.Data.builder()
                        .embeddingDimension(0L)
                        .embeddingModel("embedding_model")
                        .identifier("identifier")
                        .providerId("provider_id")
                        .providerResourceId("provider_resource_id")
                        .build()
                )
                .build()

        val roundtrippedListVectorDbsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(listVectorDbsResponse),
                jacksonTypeRef<ListVectorDbsResponse>(),
            )

        assertThat(roundtrippedListVectorDbsResponse).isEqualTo(listVectorDbsResponse)
    }
}
