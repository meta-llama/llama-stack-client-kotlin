// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.llama.llamastack.core.http.QueryParams
import com.llama.llamastack.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class MemoryBankRetrieveParamsTest {

    @Test
    fun createMemoryBankRetrieveParams() {
        MemoryBankRetrieveParams.builder().memoryBankId("memory_bank_id").build()
    }

    @Test
    fun getQueryParams() {
        val params = MemoryBankRetrieveParams.builder().memoryBankId("memory_bank_id").build()
        val expected = QueryParams.builder()
        expected.put("memory_bank_id", "memory_bank_id")
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = MemoryBankRetrieveParams.builder().memoryBankId("memory_bank_id").build()
        val expected = QueryParams.builder()
        expected.put("memory_bank_id", "memory_bank_id")
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }
}
