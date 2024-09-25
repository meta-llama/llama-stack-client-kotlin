// File generated from our OpenAPI spec by Stainless.

package com.llama_stack_client.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class MemoryBankSpecTest {

    @Test
    fun createMemoryBankSpec() {
        val memoryBankSpec =
            MemoryBankSpec.builder()
                .bankType(MemoryBankSpec.BankType.VECTOR)
                .providerConfig(
                    MemoryBankSpec.ProviderConfig.builder()
                        .config(MemoryBankSpec.ProviderConfig.Config.builder().build())
                        .providerId("provider_id")
                        .build()
                )
                .build()
        assertThat(memoryBankSpec).isNotNull
        assertThat(memoryBankSpec.bankType()).isEqualTo(MemoryBankSpec.BankType.VECTOR)
        assertThat(memoryBankSpec.providerConfig())
            .isEqualTo(
                MemoryBankSpec.ProviderConfig.builder()
                    .config(MemoryBankSpec.ProviderConfig.Config.builder().build())
                    .providerId("provider_id")
                    .build()
            )
    }
}
