// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class MemoryBankListResponseTest {

    @Test
    fun createMemoryBankListResponse() {
        val memoryBankListResponse =
            MemoryBankListResponse.builder()
                .data(
                    listOf(
                        MemoryBankListResponse.Data.ofVectorMemoryBank(
                            MemoryBankListResponse.Data.VectorMemoryBank.builder()
                                .chunkSizeInTokens(0L)
                                .embeddingModel("embedding_model")
                                .identifier("identifier")
                                .memoryBankType(
                                    MemoryBankListResponse.Data.VectorMemoryBank.MemoryBankType
                                        .VECTOR
                                )
                                .providerId("provider_id")
                                .providerResourceId("provider_resource_id")
                                .type(MemoryBankListResponse.Data.VectorMemoryBank.Type.MEMORY_BANK)
                                .embeddingDimension(0L)
                                .overlapSizeInTokens(0L)
                                .build()
                        )
                    )
                )
                .build()
        assertThat(memoryBankListResponse).isNotNull
        assertThat(memoryBankListResponse.data())
            .containsExactly(
                MemoryBankListResponse.Data.ofVectorMemoryBank(
                    MemoryBankListResponse.Data.VectorMemoryBank.builder()
                        .chunkSizeInTokens(0L)
                        .embeddingModel("embedding_model")
                        .identifier("identifier")
                        .memoryBankType(
                            MemoryBankListResponse.Data.VectorMemoryBank.MemoryBankType.VECTOR
                        )
                        .providerId("provider_id")
                        .providerResourceId("provider_resource_id")
                        .type(MemoryBankListResponse.Data.VectorMemoryBank.Type.MEMORY_BANK)
                        .embeddingDimension(0L)
                        .overlapSizeInTokens(0L)
                        .build()
                )
            )
    }
}
