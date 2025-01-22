// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ListMemoryBanksResponseTest {

    @Test
    fun createListMemoryBanksResponse() {
        val listMemoryBanksResponse =
            ListMemoryBanksResponse.builder()
                .addData(
                    ListMemoryBanksResponse.Data.VectorMemoryBank.builder()
                        .chunkSizeInTokens(0L)
                        .embeddingModel("embedding_model")
                        .identifier("identifier")
                        .memoryBankType(
                            ListMemoryBanksResponse.Data.VectorMemoryBank.MemoryBankType.VECTOR
                        )
                        .providerId("provider_id")
                        .providerResourceId("provider_resource_id")
                        .type(ListMemoryBanksResponse.Data.VectorMemoryBank.Type.MEMORY_BANK)
                        .embeddingDimension(0L)
                        .overlapSizeInTokens(0L)
                        .build()
                )
                .build()
        assertThat(listMemoryBanksResponse).isNotNull
        assertThat(listMemoryBanksResponse.data())
            .containsExactly(
                ListMemoryBanksResponse.Data.ofVectorMemoryBank(
                    ListMemoryBanksResponse.Data.VectorMemoryBank.builder()
                        .chunkSizeInTokens(0L)
                        .embeddingModel("embedding_model")
                        .identifier("identifier")
                        .memoryBankType(
                            ListMemoryBanksResponse.Data.VectorMemoryBank.MemoryBankType.VECTOR
                        )
                        .providerId("provider_id")
                        .providerResourceId("provider_resource_id")
                        .type(ListMemoryBanksResponse.Data.VectorMemoryBank.Type.MEMORY_BANK)
                        .embeddingDimension(0L)
                        .overlapSizeInTokens(0L)
                        .build()
                )
            )
    }
}
