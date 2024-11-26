// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.llama.llamastack.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class MemoryBankUnregisterParamsTest {

    @Test
    fun createMemoryBankUnregisterParams() {
        MemoryBankUnregisterParams.builder()
            .memoryBankId("memory_bank_id")
            .xLlamaStackProviderData("X-LlamaStack-ProviderData")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            MemoryBankUnregisterParams.builder()
                .memoryBankId("memory_bank_id")
                .xLlamaStackProviderData("X-LlamaStack-ProviderData")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.memoryBankId()).isEqualTo("memory_bank_id")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params = MemoryBankUnregisterParams.builder().memoryBankId("memory_bank_id").build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.memoryBankId()).isEqualTo("memory_bank_id")
    }
}
