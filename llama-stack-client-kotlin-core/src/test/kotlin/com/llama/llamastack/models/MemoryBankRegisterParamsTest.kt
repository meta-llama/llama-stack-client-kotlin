// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class MemoryBankRegisterParamsTest {

    @Test
    fun createMemoryBankRegisterParams() {
        MemoryBankRegisterParams.builder()
            .memoryBankId("memory_bank_id")
            .params(
                MemoryBankRegisterParams.Params.ofVectorMemoryBankParams(
                    MemoryBankRegisterParams.Params.VectorMemoryBankParams.builder()
                        .chunkSizeInTokens(0L)
                        .embeddingModel("embedding_model")
                        .memoryBankType(
                            MemoryBankRegisterParams.Params.VectorMemoryBankParams.MemoryBankType
                                .VECTOR
                        )
                        .overlapSizeInTokens(0L)
                        .build()
                )
            )
            .providerId("provider_id")
            .providerMemoryBankId("provider_memory_bank_id")
            .xLlamaStackClientVersion("X-LlamaStack-Client-Version")
            .xLlamaStackProviderData("X-LlamaStack-Provider-Data")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            MemoryBankRegisterParams.builder()
                .memoryBankId("memory_bank_id")
                .params(
                    MemoryBankRegisterParams.Params.ofVectorMemoryBankParams(
                        MemoryBankRegisterParams.Params.VectorMemoryBankParams.builder()
                            .chunkSizeInTokens(0L)
                            .embeddingModel("embedding_model")
                            .memoryBankType(
                                MemoryBankRegisterParams.Params.VectorMemoryBankParams
                                    .MemoryBankType
                                    .VECTOR
                            )
                            .overlapSizeInTokens(0L)
                            .build()
                    )
                )
                .providerId("provider_id")
                .providerMemoryBankId("provider_memory_bank_id")
                .xLlamaStackClientVersion("X-LlamaStack-Client-Version")
                .xLlamaStackProviderData("X-LlamaStack-Provider-Data")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.memoryBankId()).isEqualTo("memory_bank_id")
        assertThat(body.params())
            .isEqualTo(
                MemoryBankRegisterParams.Params.ofVectorMemoryBankParams(
                    MemoryBankRegisterParams.Params.VectorMemoryBankParams.builder()
                        .chunkSizeInTokens(0L)
                        .embeddingModel("embedding_model")
                        .memoryBankType(
                            MemoryBankRegisterParams.Params.VectorMemoryBankParams.MemoryBankType
                                .VECTOR
                        )
                        .overlapSizeInTokens(0L)
                        .build()
                )
            )
        assertThat(body.providerId()).isEqualTo("provider_id")
        assertThat(body.providerMemoryBankId()).isEqualTo("provider_memory_bank_id")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            MemoryBankRegisterParams.builder()
                .memoryBankId("memory_bank_id")
                .params(
                    MemoryBankRegisterParams.Params.ofVectorMemoryBankParams(
                        MemoryBankRegisterParams.Params.VectorMemoryBankParams.builder()
                            .chunkSizeInTokens(0L)
                            .embeddingModel("embedding_model")
                            .memoryBankType(
                                MemoryBankRegisterParams.Params.VectorMemoryBankParams
                                    .MemoryBankType
                                    .VECTOR
                            )
                            .build()
                    )
                )
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.memoryBankId()).isEqualTo("memory_bank_id")
        assertThat(body.params())
            .isEqualTo(
                MemoryBankRegisterParams.Params.ofVectorMemoryBankParams(
                    MemoryBankRegisterParams.Params.VectorMemoryBankParams.builder()
                        .chunkSizeInTokens(0L)
                        .embeddingModel("embedding_model")
                        .memoryBankType(
                            MemoryBankRegisterParams.Params.VectorMemoryBankParams.MemoryBankType
                                .VECTOR
                        )
                        .build()
                )
            )
    }
}
