// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class MemoryBankUnregisterParamsTest {

    @Test
    fun createMemoryBankUnregisterParams() {
        MemoryBankUnregisterParams.builder()
            .memoryBankId("memory_bank_id")
            .xLlamaStackClientVersion("X-LlamaStack-Client-Version")
            .xLlamaStackProviderData("X-LlamaStack-Provider-Data")
            .build()
    }

    @Test
    fun getPathParam() {
        val params = MemoryBankUnregisterParams.builder().memoryBankId("memory_bank_id").build()
        assertThat(params).isNotNull
        // path param "memoryBankId"
        assertThat(params.getPathParam(0)).isEqualTo("memory_bank_id")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
