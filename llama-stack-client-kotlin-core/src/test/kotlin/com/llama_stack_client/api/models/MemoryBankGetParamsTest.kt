// File generated from our OpenAPI spec by Stainless.

package com.llama_stack_client.api.models

import com.llama_stack_client.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class MemoryBankGetParamsTest {

    @Test
    fun createMemoryBankGetParams() {
        MemoryBankGetParams.builder().bankType(MemoryBankGetParams.BankType.VECTOR).build()
    }

    @Test
    fun getQueryParams() {
        val params =
            MemoryBankGetParams.builder().bankType(MemoryBankGetParams.BankType.VECTOR).build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("bank_type", listOf(MemoryBankGetParams.BankType.VECTOR.toString()))
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params =
            MemoryBankGetParams.builder().bankType(MemoryBankGetParams.BankType.VECTOR).build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("bank_type", listOf(MemoryBankGetParams.BankType.VECTOR.toString()))
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }
}
